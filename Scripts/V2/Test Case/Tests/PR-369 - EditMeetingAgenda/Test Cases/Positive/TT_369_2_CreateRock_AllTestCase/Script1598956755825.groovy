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

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddMilestone_Rocks'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateL10Meeting'), [('meetingName') : meetingName, ('meetingAcronym') : meetingAcronym
        , ('meetingType') : meetingType, ('dropdownOptions_obj') : '//div[@id=\'CREATE_MEETING_L10\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('dayOfMeeting') : dayOfMeeting, ('meetingTime') : meetingTime, ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingName
        , ('firstname') : supervisor_fname, ('lastname') : lastname, ('userOptionObj') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : permissionDropOptObj_FE], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingName
        , ('firstname') : employee_fname, ('lastname') : lastname, ('userOptionObj') : '//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : permissionDropOptObj_BE], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-369 - EditMeetingAgenda/Test Cases/Positive/Admin/PR_369_7_EditMeetingCreateRock_Admin'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('rockName') : 'QA Edit Meeting Automation Rock Test', ('dueDateDay') : '30', ('milestoneName') : 'Milestone 1'
        , ('milestoneDate') : '30', ('ownerSelected') : 'Admin User', ('owner_Obj') : '//div[@data-test-id=\'createRock\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[@role=\'option\'][contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('verifyRocks_Obj') : '//h2[text()=\'Rocks\']/ancestor::div[contains(@class,\'CardStyles\')]/div[2]//div[@data-test-id=\'rock.title\'][contains(@class,\'TextBodyStyles-sc\') and text()=\'%s\']'
        , ('verifyMilestone_Obj') : '//h2[text()=\'Rocks\']/ancestor::div[contains(@class,\'CardStyles\')]/div[2]//div[contains(@class,\'milestoneListItem__name\')]/span[text()=\'%s\']'
        , ('milestoneDate_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('rockDate_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'September 2020\'])[1]/following::div[%s]'
        , ('Notes') : 'Sample Notes', ('editRockName') : 'Updated QA Edit Meeting Automation Rock Test', ('editOwner_Obj') : '//div[@data-test-id=\'editRock\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[@role=\'option\'][@class=\'item\']/span[text()=\'%s\']'
        , ('editOwner') : 'Admin User', ('editMilestoneName') : 'Updated Milestone', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('meetingName') : meetingName], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-369 - EditMeetingAgenda/Test Cases/Positive/Supervisor/PR_369_7_EditMeetingCreateRock_Supervisor'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('rockName') : 'QA Edit Meeting Automation Rock Test', ('dueDateDay') : '30', ('milestoneName') : 'Milestone 1'
        , ('milestoneDate') : '30', ('ownerSelected') : 'Supervisor User', ('owner_Obj') : '//div[@data-test-id=\'createRock\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[@role=\'option\'][contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('verifyRocks_Obj') : '//h2[text()=\'Rocks\']/ancestor::div[contains(@class,\'CardStyles\')]/div[2]//div[@data-test-id=\'rock.title\'][contains(@class,\'TextBodyStyles-sc\') and text()=\'%s\']'
        , ('verifyMilestone_Obj') : '//h2[text()=\'Rocks\']/ancestor::div[contains(@class,\'CardStyles\')]/div[2]//div[contains(@class,\'milestoneListItem__name\')]/span[text()=\'%s\']'
        , ('milestoneDate_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('rockDate_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'September 2020\'])[1]/following::div[%s]'
        , ('Notes') : 'Sample Notes', ('editRockName') : 'Updated QA Edit Meeting Automation Rock Test', ('editOwner_Obj') : '//div[@data-test-id=\'editRock\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[@role=\'option\'][@class=\'item\']/span[text()=\'%s\']'
        , ('editOwner') : 'Supervisor User', ('editMilestoneName') : 'Updated Milestone', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('meetingName') : meetingName], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-369 - EditMeetingAgenda/Test Cases/Positive/Employee/PR_369_7_EditMeetingCreateRock_Employee'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('rockName') : 'QA Edit Meeting Automation Rock Test', ('dueDateDay') : '30', ('milestoneName') : 'Milestone 1'
        , ('milestoneDate') : '30', ('ownerSelected') : 'Employee User', ('owner_Obj') : '//div[@data-test-id=\'createRock\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[@role=\'option\'][contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('verifyRocks_Obj') : '//h2[text()=\'Rocks\']/ancestor::div[contains(@class,\'CardStyles\')]/div[2]//div[@data-test-id=\'rock.title\'][contains(@class,\'TextBodyStyles-sc\') and text()=\'%s\']'
        , ('verifyMilestone_Obj') : '//h2[text()=\'Rocks\']/ancestor::div[contains(@class,\'CardStyles\')]/div[2]//div[contains(@class,\'milestoneListItem__name\')]/span[text()=\'%s\']'
        , ('milestoneDate_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('rockDate_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'September 2020\'])[1]/following::div[%s]'
        , ('Notes') : 'Sample Notes', ('editRockName') : 'Updated QA Edit Meeting Automation Rock Test', ('editOwner_Obj') : '//div[@data-test-id=\'editRock\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[@role=\'option\'][@class=\'item\']/span[text()=\'%s\']'
        , ('editOwner') : 'Employee User', ('editMilestoneName') : 'Updated Milestone', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('meetingName') : meetingName], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver3)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver2)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver1)

