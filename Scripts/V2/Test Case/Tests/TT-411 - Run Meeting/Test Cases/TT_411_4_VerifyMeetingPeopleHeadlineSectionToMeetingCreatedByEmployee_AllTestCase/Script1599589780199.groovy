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

not_run: DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateL10Meeting'), [('meetingName') : meetingNameE, ('meetingAcronym') : meetingAcronym
        , ('meetingType') : meetingType, ('dropdownOptions_obj') : '//div[@id=\'CREATE_MEETING_L10\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('dayOfMeeting') : dayOfmeeting, ('meetingTime') : meetingTime, ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingNameE
        , ('firstname') : admin_fname, ('lastname') : lastname, ('userOptionObj') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : permission_admin], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingNameE
        , ('firstname') : supervisor_fname, ('lastname') : lastname, ('userOptionObj') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : permission_supervisor], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateMeetingPeopleHeadlineViaEditMeetingPage'), [('meetingName') : meetingNameE
        , ('firstname') : employee_fname, ('lastname') : lastname, ('peopleHeadline_title') : peopleHeadline_title_employee
        , ('shared_meetingName') : shared_meetingName, ('notesText') : notesText, ('permission') : permission_admin, ('createPeopleHeadlineDropdownOwnerOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.owner\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createPeopleHeadlineDropdownATMOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.assignToTeamMeeting\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createPeopleHeadlineDropdownSTTMOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.sharedWithMeetings\']]//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingNameE
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateMeetingPeopleHeadlineViaEditMeetingPage'), [('meetingName') : meetingNameE
        , ('firstname') : supervisor_fname, ('lastname') : lastname, ('peopleHeadline_title') : peopleHeadline_title_supervisor
        , ('shared_meetingName') : shared_meetingName, ('notesText') : notesText, ('permission') : permission_supervisor
        , ('createPeopleHeadlineDropdownOwnerOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.owner\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createPeopleHeadlineDropdownATMOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.assignToTeamMeeting\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createPeopleHeadlineDropdownSTTMOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.sharedWithMeetings\']]//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingNameE
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateMeetingPeopleHeadlineViaEditMeetingPage'), [('meetingName') : meetingNameE
        , ('firstname') : admin_fname, ('lastname') : lastname, ('peopleHeadline_title') : peopleHeadline_title, ('shared_meetingName') : shared_meetingName
        , ('notesText') : notesText, ('permission') : permission_admin, ('createPeopleHeadlineDropdownOwnerOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.owner\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createPeopleHeadlineDropdownATMOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.assignToTeamMeeting\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('createPeopleHeadlineDropdownSTTMOpt_obj') : '//div[@data-test-id=\'createPeopleHeadline\' and contains(@id,\'editMeeting\')]//div[@data-test-id=\'peopleHeadline.sharedWithMeetings\']]//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingNameE
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.click(findTestObject('V2/Commons/StartMeetingPage/runAsMeetingLeader_button'))

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesSection_btn'))

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesSection_btn'))

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Admin/TT_411_4_VerifyMeetingPeopleHeadlineSection_Admin'), 
    [('meetingName') : meetingNameE, ('peopleHeadline_title') : peopleHeadline_title, ('peopleHeadline_title_supervisor') : peopleHeadline_title_supervisor
        , ('peopleHeadline_title_employee') : peopleHeadline_title_employee, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('peopleHeadlineRecord_obj') : '//h2[text()=\'People Headlines\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('peopleHeadline_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware To-Do™\']'
        , ('peopleHeadline_CAI_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware Issue™\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Supervisor/TT_411_4_VerifyMeetingPeopleHeadlineSection_Supervisor'), 
    [('meetingName') : meetingNameE, ('peopleHeadline_title') : peopleHeadline_title, ('peopleHeadline_title_supervisor') : peopleHeadline_title_supervisor
        , ('peopleHeadline_title_employee') : peopleHeadline_title_employee, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('peopleHeadlineRecord_obj') : '//h2[text()=\'People Headlines\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('peopleHeadline_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware To-Do™\']'
        , ('peopleHeadline_CAI_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware Issue™\']'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Employee/TT_411_4_VerifyMeetingPeopleHeadlineSection_Employee'), 
    [('meetingName') : meetingNameE, ('peopleHeadline_title') : peopleHeadline_title, ('peopleHeadline_title_supervisor') : peopleHeadline_title_supervisor
        , ('peopleHeadline_title_employee') : peopleHeadline_title_employee, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('peopleHeadlineRecord_obj') : '//h2[text()=\'People Headlines\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('peopleHeadline_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware To-Do™\']'
        , ('peopleHeadline_CAI_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware Issue™\']'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-411 - Run Meeting/Test Cases/Positive/Supervisor/TT_411_4_VerifyMeetingPeopleHeadlineSection_Supervisor'), 
    [('meetingName') : meetingNameE, ('peopleHeadline_title') : peopleHeadline_title, ('peopleHeadline_title_supervisor') : peopleHeadline_title_supervisor
        , ('peopleHeadline_title_employee') : peopleHeadline_title_employee, ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('peopleHeadlineRecord_obj') : '//h2[text()=\'People Headlines\']/ancestor::div[contains(@class,\'CardStyles\')]//button[.=\'%s\']'
        , ('peopleHeadline_CAT_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware To-Do™\']'
        , ('peopleHeadline_CAI_obj') : '//button[.=\'%s\']/ancestor::div[contains(@class,\'StyledDiv-sc\')]/div/div/div/button[@aria-label=\'Create a Context-Aware Issue™\']'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver3)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver2)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver1)

