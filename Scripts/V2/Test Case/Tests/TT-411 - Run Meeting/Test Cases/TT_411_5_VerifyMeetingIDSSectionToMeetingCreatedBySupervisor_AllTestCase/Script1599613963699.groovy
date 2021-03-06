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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.*

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_RegisterAndActivateTTUsers'), [('admin_fname') : admin_fname
        , ('lastname') : lastname, ('phonenumber') : '9999999999', ('company') : 'Traction Tools', ('password') : GlobalVariable.password
        , ('admin_email_prefix') : admin_email_prefix, ('admin_email_domain') : admin_email_domain, ('randomTextLength') : randomTextLength
        , ('supervisor_fname') : supervisor_fname, ('employee_fname') : employee_fname, ('supervisor_email_prefix') : supervisor_email_prefix
        , ('supervisor_email_domain') : supervisor_email_domain, ('supervisor_positionTitle') : supervisor_positionTitle
        , ('employee_email_prefix') : employee_email_prefix, ('employee_email_domain') : employee_email_domain, ('employee_positionTitle') : employee_positionTitle], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

String path = System.getProperty('user.dir')

System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

WebDriver driver1 = new ChromeDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.supervisor_email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebDriver driver3 = new ChromeDriver()

DriverFactory.changeWebDriver(driver3)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.employee_email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateL10Meeting'), [('meetingName') : meetingNameS, ('meetingAcronym') : meetingAcronym
        , ('meetingType') : meetingType, ('dropdownOptions_obj') : '//div[@id=\'CREATE_MEETING_L10\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('dayOfMeeting') : dayOfmeeting, ('meetingTime') : meetingTime, ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingNameS
        , ('firstname') : admin_fname, ('lastname') : lastname, ('userOptionObj') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : permission_admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingNameS
        , ('firstname') : employee_fname, ('lastname') : lastname, ('userOptionObj') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : permission_employee], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateMeetingIDSViaEditMeetingPage'), [('meetingName') : meetingNameS
        , ('firstname') : supervisor_fname, ('lastname') : lastname, ('issue_title') : issue_title_supervisor, ('notesText') : notesText
        , ('permission') : permission_admin, ('createIssueDropdownOwnerOpt_obj') : '//div[@data-test-id=\'createIssue\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'issue.owner\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createIssueDropdownATMOpt_obj') : '//div[@data-test-id=\'createIssue\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'issue.assignToTeamMeeting\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingNameS
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateMeetingIDSViaEditMeetingPage'), [('meetingName') : meetingNameS
        , ('firstname') : admin_fname, ('lastname') : lastname, ('issue_title') : issue_title, ('notesText') : notesText
        , ('permission') : permission_admin, ('createIssueDropdownOwnerOpt_obj') : '//div[@data-test-id=\'createIssue\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'issue.owner\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createIssueDropdownATMOpt_obj') : '//div[@data-test-id=\'createIssue\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'issue.assignToTeamMeeting\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingNameS
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateMeetingIDSViaEditMeetingPage'), [('meetingName') : meetingNameS
        , ('firstname') : employee_fname, ('lastname') : lastname, ('issue_title') : issue_title_employee, ('notesText') : notesText
        , ('permission') : permission_employee, ('createIssueDropdownOwnerOpt_obj') : '//div[@data-test-id=\'createIssue\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'issue.owner\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createIssueDropdownATMOpt_obj') : '//div[@data-test-id=\'createIssue\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'issue.assignToTeamMeeting\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingNameS
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.click(findTestObject('V2/Commons/StartMeetingPage/runAsMeetingLeader_button'))

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSSection_btn'))

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSSection_btn'))

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Supervisor/TT_411_5_VerifyMeetingIDSSection_Supervisor'), 
    [('meetingName') : meetingNameS, ('issue_title') : issue_title, ('issue_title_supervisor') : issue_title_supervisor, ('issue_title_employee') : issue_title_employee
        , ('permission') : permission_supervisor, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('issueRecord_obj') : '//h2[text()=\'Issues\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('issue_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv2\')]/div[4]/button[@aria-label=\'Create a Context-Aware To-Do™\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Admin/TT_411_5_VerifyMeetingIDSSection_Admin'), 
    [('meetingName') : meetingNameS, ('issue_title') : issue_title, ('issue_title_supervisor') : issue_title_supervisor, ('issue_title_employee') : issue_title_employee
        , ('permission') : permission_admin, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('issueRecord_obj') : '//h2[text()=\'Issues\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('issue_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv2\')]/div[4]/button[@aria-label=\'Create a Context-Aware To-Do™\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Employee/TT_411_5_VerifyMeetingIDSSection_Employee'), 
    [('meetingName') : meetingNameS, ('issue_title') : issue_title, ('issue_title_supervisor') : issue_title_supervisor, ('issue_title_employee') : issue_title_employee
        , ('permission') : permission_employee, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('issueRecord_obj') : '//h2[text()=\'Issues\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('issue_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv2\')]/div[4]/button[@aria-label=\'Create a Context-Aware To-Do™\']'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver3)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver2)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver1)

