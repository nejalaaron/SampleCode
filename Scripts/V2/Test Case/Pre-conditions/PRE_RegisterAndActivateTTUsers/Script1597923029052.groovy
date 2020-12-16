import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import java.util.HashMap as HashMap

//Assign Registration emails to global variables
GlobalVariable.email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(admin_email_prefix, 
    admin_email_domain, randomTextLength)

GlobalVariable.supervisor_email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(supervisor_email_prefix, 
    supervisor_email_domain, randomTextLength)

GlobalVariable.employee_email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(employee_email_prefix, 
    employee_email_domain, randomTextLength)

//Register an admin user and get the admin activation email and organization ID
String[] adminDetails = CustomKeywords.'tt_CustomKeywords.CustomKeywords.RegisterUserViaAPIAndGenerateActivateURL'(GlobalVariable.email, 
    admin_fname, lastname, phonenumber, company, '__JSON__{\\"howDidYouHearAboutUs\\":\\"Facebook\\",\\"implementer\\":\\"\\",\\"existingTractionToolsClient\\":\\"\\",\\"other\\":\\"\\"}', 
    '__JSON__{\\"timeZone\\":\\"America/Guatemala\\",\\"brandColor\\":\\"#023047\\",\\"q1Start\\":null,\\"q1End\\":null,\\"q2Start\\":null,\\"q2End\\":null,\\"q3Start\\":null,\\"q3End\\":null,\\"q4Start\\":null,\\"q4End\\":null,\\"quarterDatesSetsRocks\\":false,\\"exportUsers\\":false,\\"exportRocks\\":false,\\"exportRocksIncludesMilestones\\":false,\\"exportScorecards\\":false,\\"exportTodos\\":false,\\"exportTodosIncludesNotes\\":false,\\"exportPeopleHeadlines\\":false,\\"exportPeopleHeadlinesIncludesNotes\\":false,\\"exportIssues\\":false,\\"exportIssuesIncludesNotes\\":false,\\"exportContextAwareTodos\\":false,\\"dateFormat\\":\\"MM/DD/YYYY\\",\\"timeFormat\\":\\"h:mma\\",\\"numberFormat\\":\\"-1,000.99\\",\\"supervisorsArchiveRestoreUsers\\":false,\\"supervisorsEditPositions\\":false,\\"milestonesAvailableToAll\\":false,\\"customMeetingTemplatesEnabled\\":false,\\"receiveTodoReminders\\":false,\\"todoReminderTime\\":\\"13:00\\",\\"todoReminderTimeZone\\":\\"America/Guatemala\\",\\"todoReminderFrequency\\":\\"DAILY\\",\\"vtoMeetingId\\":\\"\\",\\"vtoDisplayMode\\":\\"ALL\\",\\"coreValues\\":[{\\"id\\":\\"1\\",\\"text\\":\\"\\"},{\\"id\\":\\"2\\",\\"text\\":\\"\\"},{\\"id\\":\\"3\\",\\"text\\":\\"\\"}]}', 
    password, GlobalVariable.V2Url)

String activationURL = adminDetails[0]

String orgID = adminDetails[1]

System.out.println('URL: ' + activationURL)

System.out.println('orgID: ' + orgID)

//Supervisor's Full name for employee registration
String supervisorUser_name = (supervisor_fname + ' ') + lastname

WebUI.openBrowser('')

WebUI.maximizeWindow()

//Activate Admin user
WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ActivateNewUser'), [('activationURL') : activationURL, ('email') : GlobalVariable.email
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_SkipCompanyAndPersonalProfileSetup'), [:], FailureHandling.STOP_ON_FAILURE)

//Register the supervisor user via API
String supervisor_activationURL = CustomKeywords.'tt_CustomKeywords.CustomKeywords.RegisterAndActivateSupervisorUserViaAPI'(
    GlobalVariable.V2Url, orgID, GlobalVariable.supervisor_email, password, GlobalVariable.email, password, supervisor_fname, 
    lastname)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ChangeUserPermissionViaManageUser'), [('showMenuItemsPath') : '//div[@class=\'usercard__detail_container\']/div[text()=\'%s\']/ancestor::div[contains(@class,\'usercard__content\')]//button[@aria-label=\'Show Menu Items\']'
        , ('user_email') : GlobalVariable.supervisor_email, ('roleOption') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionValue') : 'Supervisor', ('position_title') : supervisor_positionTitle, ('user_supervisorName') : ''], 
    FailureHandling.STOP_ON_FAILURE)

//Register the employee user via API
String employee_activationURL = CustomKeywords.'tt_CustomKeywords.CustomKeywords.RegisterAndActivateSupervisorUserViaAPI'(
    GlobalVariable.V2Url, orgID, GlobalVariable.employee_email, password, GlobalVariable.email, password, employee_fname, 
    lastname)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ChangeUserPermissionViaManageUser'), [('showMenuItemsPath') : '//div[@class=\'usercard__detail_container\']/div[text()=\'%s\']/ancestor::div[contains(@class,\'usercard__content\')]//button[@aria-label=\'Show Menu Items\']'
        , ('user_email') : GlobalVariable.employee_email, ('roleOption') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionValue') : 'Employee', ('position_title') : 'Quality Assurance', ('user_supervisorName') : supervisorUser_name], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ActivateNewUser'), [('activationURL') : supervisor_activationURL
        , ('email') : GlobalVariable.supervisor_email, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_SkipPersonalProfileSetup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ActivateNewUser'), [('activationURL') : employee_activationURL
        , ('email') : GlobalVariable.employee_email, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_SkipPersonalProfileSetup'), [:], FailureHandling.STOP_ON_FAILURE)

