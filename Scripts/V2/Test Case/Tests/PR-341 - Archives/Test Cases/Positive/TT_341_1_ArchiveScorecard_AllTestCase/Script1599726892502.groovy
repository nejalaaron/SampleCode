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

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-341 - Archives/Test Cases/Positive/Admin/PR_341_1_ArchiveScorecard_Admin'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('measurableTitle') : 'Admin QA Automation Edit Meeting Scorecard', ('goalValue') : 'YES', ('WhosAccountable_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('WhosAccountable') : 'Admin User', ('adminAccess_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('adminAccess') : 'Admin User', ('verifyScorecard') : '//div[@data-test-id=\'measurables\']//descendant::div[text()=\'%s\']'
        , ('Column1') : 'YES', ('Column2') : 'NO', ('Column3') : 'yes', ('Column4') : 'YES', ('Column5') : 'No', ('Column6') : 'YES'
        , ('meetingName_Obj') : '//h2[text()=\'%s\']', ('meetingName') : meetingName, ('editMeasurableName') : 'Updated QA Automation Edit Meeting Scorecard'
        , ('editUnit_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div/span[text()=\'%s\']'
        , ('editUnit') : 'Dollars ($)', ('editGoal') : '1', ('editGoalDescription') : 'USD', ('editAccountable_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAccountable') : 'Admin User', ('editAdminAccess_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAdminAccess') : 'Admin User', ('editAverage_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editCumulative_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editAverage') : '30', ('editCumulative') : '30', ('editColumn2') : '200', ('editColumn3') : '200', ('editColumn4') : '10'
        , ('editColumn5') : '30', ('editColumn6') : '500', ('editColumn7') : '200', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-341 - Archives/Test Cases/Positive/Supervisor/PR_341_1_ArchiveScorecard_Supervisor'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('measurableTitle') : 'Supervisor QA Automation Edit Meeting Scorecard', ('goalValue') : 'YES', ('WhosAccountable_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('WhosAccountable') : 'Supervisor User', ('adminAccess_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('adminAccess') : 'Supervisor User', ('verifyScorecard') : '//div[@data-test-id=\'measurables\']//descendant::div[text()=\'%s\']'
        , ('Column1') : 'YES', ('Column2') : 'NO', ('Column3') : 'yes', ('Column4') : 'YES', ('Column5') : 'No', ('Column6') : 'YES'
        , ('meetingName_Obj') : '//h2[text()=\'%s\']', ('meetingName') : meetingName, ('editMeasurableName') : 'Updated QA Automation Edit Meeting Scorecard'
        , ('editUnit_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div/span[text()=\'%s\']'
        , ('editUnit') : 'Dollars ($)', ('editGoal') : '1', ('editGoalDescription') : 'USD', ('editAccountable_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAccountable') : 'Admin User', ('editAdminAccess_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAdminAccess') : 'Admin User', ('editAverage_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editCumulative_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editAverage') : '30', ('editCumulative') : '30', ('editColumn2') : '200', ('editColumn3') : '200', ('editColumn4') : '10'
        , ('editColumn5') : '30', ('editColumn6') : '500', ('editColumn7') : '200', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('meetingNameS') : ''], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-341 - Archives/Test Cases/Positive/Employee/PR_341_1_ArchiveScorecard_Employee'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('measurableTitle') : 'Employee QA Automation Edit Meeting Scorecard', ('goalValue') : 'YES', ('WhosAccountable_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('WhosAccountable') : 'Employee User', ('adminAccess_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('adminAccess') : 'Employee User', ('verifyScorecard') : '//div[@data-test-id=\'measurables\']//descendant::div[text()=\'%s\']'
        , ('Column1') : 'YES', ('Column2') : 'NO', ('Column3') : 'yes', ('Column4') : 'YES', ('Column5') : 'No', ('Column6') : 'YES'
        , ('meetingName_Obj') : '//h2[text()=\'%s\']', ('meetingName') : meetingName, ('editMeasurableName') : 'Updated QA Automation Edit Meeting Scorecard'
        , ('editUnit_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div/span[text()=\'%s\']'
        , ('editUnit') : 'Dollars ($)', ('editGoal') : '1', ('editGoalDescription') : 'USD', ('editAccountable_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAccountable') : 'Admin User', ('editAdminAccess_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAdminAccess') : 'Admin User', ('editAverage_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editCumulative_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editAverage') : '30', ('editCumulative') : '30', ('editColumn2') : '200', ('editColumn3') : '200', ('editColumn4') : '10'
        , ('editColumn5') : '30', ('editColumn6') : '500', ('editColumn7') : '200', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('meetingNameE') : ''], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-341 - Archives/Test Cases/Positive/Admin/PR_341_1-1_ArchiveScorecard_Admin'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('measurableTitle') : 'Admin QA Automation Edit Meeting Scorecard', ('goalValue') : 'YES', ('WhosAccountable_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('WhosAccountable') : 'Admin User', ('adminAccess_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('adminAccess') : 'Admin User', ('verifyScorecard') : '//div[@data-test-id=\'measurables\']//descendant::div[text()=\'%s\']'
        , ('Column1') : 'YES', ('Column2') : 'NO', ('Column3') : 'yes', ('Column4') : 'YES', ('Column5') : 'No', ('Column6') : 'YES'
        , ('meetingName_Obj') : '//h2[text()=\'%s\']', ('meetingName') : meetingName, ('editMeasurableName') : 'Updated QA Automation Edit Meeting Scorecard'
        , ('editUnit_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div/span[text()=\'%s\']'
        , ('editUnit') : 'Dollars ($)', ('editGoal') : '1', ('editGoalDescription') : 'USD', ('editAccountable_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAccountable') : 'Admin User', ('editAdminAccess_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAdminAccess') : 'Admin User', ('editAverage_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editCumulative_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editAverage') : '30', ('editCumulative') : '30', ('editColumn2') : '200', ('editColumn3') : '200', ('editColumn4') : '10'
        , ('editColumn5') : '30', ('editColumn6') : '500', ('editColumn7') : '200', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-341 - Archives/Test Cases/Positive/Supervisor/PR_341_1-1_ArchiveScorecard_Supervisor'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('measurableTitle') : 'Admin QA Automation Edit Meeting Scorecard', ('goalValue') : 'YES', ('WhosAccountable_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('WhosAccountable') : 'Supervisor User', ('adminAccess_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('adminAccess') : 'Supervisor User', ('verifyScorecard') : '//div[@data-test-id=\'measurables\']//descendant::div[text()=\'%s\']'
        , ('Column1') : 'YES', ('Column2') : 'NO', ('Column3') : 'yes', ('Column4') : 'YES', ('Column5') : 'No', ('Column6') : 'YES'
        , ('meetingName_Obj') : '//h2[text()=\'%s\']', ('meetingName') : meetingName, ('editMeasurableName') : 'Updated QA Automation Edit Meeting Scorecard'
        , ('editUnit_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div/span[text()=\'%s\']'
        , ('editUnit') : 'Dollars ($)', ('editGoal') : '1', ('editGoalDescription') : 'USD', ('editAccountable_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAccountable') : 'Admin User', ('editAdminAccess_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAdminAccess') : 'Admin User', ('editAverage_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editCumulative_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editAverage') : '30', ('editCumulative') : '30', ('editColumn2') : '200', ('editColumn3') : '200', ('editColumn4') : '10'
        , ('editColumn5') : '30', ('editColumn6') : '500', ('editColumn7') : '200', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/PR-341 - Archives/Test Cases/Positive/Employee/PR_341_1-1_ArchiveScorecard_Employee'), 
    [('userName') : 'jeff+075@mytractiontools.com', ('passWord') : 'Skyline69A*', ('meetingRowPosition') : '3', ('editMeetingMenu_Obj') : '//div[@id=\'root\']/div/div[2]/div/div/div/div[2]/div/div[%s]/div[3]/button/i'
        , ('measurableTitle') : 'Admin QA Automation Edit Meeting Scorecard', ('goalValue') : 'YES', ('WhosAccountable_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('WhosAccountable') : 'Employee User', ('adminAccess_Obj') : '//div[contains(@id,\'editMeetingCreateScorecard\')]/div[@data-test-id=\'createMeasurable\']//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('adminAccess') : 'Employee User', ('verifyScorecard') : '//div[@data-test-id=\'measurables\']//descendant::div[text()=\'%s\']'
        , ('Column1') : 'YES', ('Column2') : 'NO', ('Column3') : 'yes', ('Column4') : 'YES', ('Column5') : 'No', ('Column6') : 'YES'
        , ('meetingName_Obj') : '//h2[text()=\'%s\']', ('meetingName') : meetingName, ('editMeasurableName') : 'Updated QA Automation Edit Meeting Scorecard'
        , ('editUnit_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div/span[text()=\'%s\']'
        , ('editUnit') : 'Dollars ($)', ('editGoal') : '1', ('editGoalDescription') : 'USD', ('editAccountable_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@role=\'listbox\'][@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAccountable') : 'Admin User', ('editAdminAccess_Obj') : '//div[contains(@id,\'EDIT_MEASURABLE\')]//div[@class=\'visible menu transition\']/div[contains(@class,\'item\')]/span[text()=\'%s\']'
        , ('editAdminAccess') : 'Admin User', ('editAverage_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editCumulative_Obj') : '(//*[normalize-space(text()) and normalize-space(.)=\'June 2020\'])[1]/following::div[%s]'
        , ('editAverage') : '30', ('editCumulative') : '30', ('editColumn2') : '200', ('editColumn3') : '200', ('editColumn4') : '10'
        , ('editColumn5') : '30', ('editColumn6') : '500', ('editColumn7') : '200', ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver3)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver2)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver1)

