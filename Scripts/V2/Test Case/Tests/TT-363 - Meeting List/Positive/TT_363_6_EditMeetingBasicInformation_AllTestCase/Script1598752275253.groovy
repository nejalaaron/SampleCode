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
        , ('firstname') : employee_fname, ('lastname') : lastname, ('userOptionObj') : '(//span[text()=\'%s\']/parent::div[@role=\'option\'])[2]'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : meetingPermission_Employee], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_AddAllAttendeesToMeeting'), [('meetingName') : meetingName
        , ('firstname') : supervisor_fname, ('lastname') : lastname, ('userOptionObj') : '(//span[text()=\'%s\']/parent::div[@role=\'option\'])[3]'
        , ('permissionDropObj') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//button[contains(@aria-label,\'assign\')]/parent::div'
        , ('permissionDropOptObj_MA') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Meeting Admin\']/parent::div'
        , ('permissionDropOptObj_FE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Full editor\']/parent::div'
        , ('permissionDropOptObj_BE') : '//div[@role=\'alert\' and text()=\'%s\']/ancestor::div[@class=\'editAttendees__item\']//span[text()=\'Basic editor\']/parent::div'
        , ('meetingOptions_obj') : '//h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]/div[@class=\'listcontainer__options\']/button'
        , ('permission') : meetingPermission_Supervisor], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.waitForElementPresent(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_meetingName_h2', [('meetingName') : meetingName]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_meetingName_h2', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__meeting title'), 
    GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_GeneralBasic informationVideo conferenc_ee1ae7'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__meeting title'), 
    FailureHandling.STOP_ON_FAILURE)

String A_meetingAcronymBI = WebUI.getAttribute(findTestObject('V2/TT-363/Page_Meeting/Edit_Meeting/input_acronym_1'), 'disabled')

WebUI.verifyMatch(A_meetingAcronymBI, 'true', false)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_Meeting description (max 100 characte_8187fa'))

String LeadershipDropdown = WebUI.getAttribute(findTestObject('V2/TT-363/Page_Meeting/Edit_Meeting/Leadership_Disabled'), 
    'disabled')

WebUI.verifyMatch(LeadershipDropdown, 'true', false)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/button___StyledButton-sc-9nsd91-0 hrKrVT'))

String A_dayOfMeetingDropdown = WebUI.getAttribute(findTestObject('V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_MondayMondayTuesdayWednesdayThursdayFri_d9280e'), 
    'disabled')

WebUI.verifyMatch(A_dayOfMeetingDropdown, 'true', false)

String A_Time1200 = WebUI.getAttribute(findTestObject('V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_am_meeting-time'), 
    'disabled')

WebUI.verifyMatch(A_Time1200, 'true', false)

String A_saveBtnClickBI = WebUI.getAttribute(findTestObject('V2/TT-363/Page_Meeting/Edit_Meeting/Edit_Meeting2/Page_Edit Meeting/div_Save'), 
    'class')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(A_saveBtnClickBI, 'disabled')

DriverFactory.changeWebDriver(driver2)

not_run: WebUI.refresh()

not_run: WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

TestObject A_meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

WebUI.click(A_meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementPresent(findTestObject('V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_GeneralBasic informationVideo conferenc_ee1ae7'), 
    GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_GeneralBasic informationVideo conferenc_ee1ae7'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__meeting title'), 
    meetingTitleS)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__acronym'), 
    meetingAcronym)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_Meeting description (max 100 characte_8187fa'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_Meeting name Acronym Meeting descriptio_78e662'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_Meeting description (max 100 characte_8187fa'), 
    meetingDescription)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/i__IconStyles-sc-181ai5j-0 fspyWU icon-arro_0a3203'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_Departmental'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/button___StyledButton-sc-9nsd91-0 hrKrVT'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_MondayMondayTuesdayWednesdayThursdayFri_d9280e'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_Tuesday'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_am_meeting-time'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_ampm700'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Edit_Meeting2/Page_Edit Meeting/div_Save'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Dashboard/span_Meetings'))

WebUI.delay(5)

TestObject A_editMeetingSupervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'('//div[@class="detailscontainer__block item"]/h4[text()=\'%s\']', 
    meetingTitleS, 'xpath')

WebUI.verifyElementPresent(A_editMeetingSupervisor, GlobalVariable.DefaultTimeout)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver3)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver2)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver1)

