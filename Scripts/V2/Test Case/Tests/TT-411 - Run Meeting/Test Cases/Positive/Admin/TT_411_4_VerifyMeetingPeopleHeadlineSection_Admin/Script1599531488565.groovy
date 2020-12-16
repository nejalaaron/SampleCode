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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesPanelHeader_h2'))

WebUI.delay(15)

String initialTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyNotMatch(finalTimerText, initialTimerText, false)

TestObject peopleHeadlineRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(peopleHeadlineRecord_obj, 
    peopleHeadline_title, 'xpath')

WebUI.waitForElementVisible(peopleHeadlineRecordObj, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(peopleHeadlineRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject peopleHeadlineCATRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(peopleHeadline_CAT_obj, 
    peopleHeadline_title, 'xpath')

WebUI.verifyElementVisible(peopleHeadlineCATRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject peopleHeadlineCAIRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(peopleHeadline_CAI_obj, 
    peopleHeadline_title, 'xpath')

WebUI.verifyElementVisible(peopleHeadlineCAIRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.click(peopleHeadlineRecordObj)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_title_inputCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_owner_dropdownCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_ShareToMeeting_dropdownCont'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_close_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_title_inputCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_owner_dropdownCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_ShareToMeeting_dropdownCont'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_close_btn'))

TestObject peopleHeadlineRecordObj_Supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(peopleHeadlineRecord_obj, 
    peopleHeadline_title_supervisor, 'xpath')

WebUI.waitForElementVisible(peopleHeadlineRecordObj_Supervisor, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(peopleHeadlineRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject peopleHeadlineCATRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
    peopleHeadline_CAT_obj, peopleHeadline_title_supervisor, 'xpath')

WebUI.verifyElementVisible(peopleHeadlineCATRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject peopleHeadlineCAIRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
    peopleHeadline_CAI_obj, peopleHeadline_title_supervisor, 'xpath')

WebUI.verifyElementVisible(peopleHeadlineCAIRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.click(peopleHeadlineRecordObj_Supervisor)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_title_inputCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_owner_dropdownCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_ShareToMeeting_dropdownCont'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_close_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_title_inputCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_owner_dropdownCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_ShareToMeeting_dropdownCont'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_close_btn'))

TestObject peopleHeadlineRecordObj_Employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(peopleHeadlineRecord_obj, 
    peopleHeadline_title_employee, 'xpath')

WebUI.waitForElementVisible(peopleHeadlineRecordObj_Employee, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(peopleHeadlineRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

TestObject peopleHeadlineCATRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
    peopleHeadline_CAT_obj, peopleHeadline_title_employee, 'xpath')

WebUI.verifyElementVisible(peopleHeadlineCATRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

TestObject peopleHeadlineCAIRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
    peopleHeadline_CAI_obj, peopleHeadline_title_employee, 'xpath')

WebUI.verifyElementVisible(peopleHeadlineCAIRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

WebUI.click(peopleHeadlineRecordObj_Employee)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_title_inputCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_owner_dropdownCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_ShareToMeeting_dropdownCont'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_close_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_title_inputCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_owner_dropdownCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_ShareToMeeting_dropdownCont'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/EditPH_close_btn'))

WebUI.delay(5)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesSection_btn'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/People Headlines/PeopleHeadlinesPanelHeader_h2'))

WebUI.verifyElementVisible(peopleHeadlineRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(peopleHeadlineRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(peopleHeadlineRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

