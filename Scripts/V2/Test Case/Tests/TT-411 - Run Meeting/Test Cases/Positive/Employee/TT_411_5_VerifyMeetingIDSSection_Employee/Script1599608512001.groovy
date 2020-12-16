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

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSPanelHeader_h2'))

WebUI.delay(15)

String initialTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyNotMatch(finalTimerText, initialTimerText, false)

TestObject iDSRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issueRecord_obj, issue_title, 
    'xpath')

WebUI.waitForElementVisible(iDSRecordObj, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(iDSRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject iDSCATRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issue_CAT_obj, issue_title, 
    'xpath')

WebUI.verifyElementVisible(iDSCATRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.click(iDSRecordObj)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_close_btn'), GlobalVariable.DefaultTimeout)

if (permission.toString().equalsIgnoreCase('Basic editor')) {
    editIDS_title_input_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), 
        'disabled')

    WebUI.verifyMatch(editIDS_title_input_status, 'true', false)

    editIDS_owner_dropdown_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), 
        'disabled')

    WebUI.verifyMatch(editIDS_owner_dropdown_status, 'true', false)

    editIDS_notes_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), 'disabled')

    WebUI.verifyMatch(editIDS_notes_status, 'true', false)
}

if (permission.toString().equalsIgnoreCase('Full editor') || permission.toString().equalsIgnoreCase('Meeting Admin')) {
    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_close_btn'))

TestObject iDSRecordObj_Supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issueRecord_obj, 
    issue_title_supervisor, 'xpath')

WebUI.waitForElementVisible(iDSRecordObj_Supervisor, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(iDSRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject iDSCATRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issue_CAT_obj, 
    issue_title_supervisor, 'xpath')

WebUI.verifyElementVisible(iDSCATRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.click(iDSRecordObj_Supervisor)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_close_btn'), GlobalVariable.DefaultTimeout)

if (permission.toString().equalsIgnoreCase('Basic editor')) {
    editIDS_title_input_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), 
        'disabled')

    WebUI.verifyMatch(editIDS_title_input_status_s, 'true', false)

    editIDS_owner_dropdown_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), 
        'disabled')

    WebUI.verifyMatch(editIDS_owner_dropdown_status_s, 'true', false)

    editIDS_notes_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), 
        'disabled')

    WebUI.verifyMatch(editIDS_notes_status_s, 'true', false)
}

if (permission.toString().equalsIgnoreCase('Full editor') || permission.toString().equalsIgnoreCase('Meeting Admin')) {
    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_close_btn'))

TestObject iDSRecordObj_Employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issueRecord_obj, 
    issue_title_employee, 'xpath')

WebUI.waitForElementVisible(iDSRecordObj_Employee, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(iDSRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

TestObject iDSCATRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issue_CAT_obj, 
    issue_title_employee, 'xpath')

WebUI.verifyElementVisible(iDSCATRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

WebUI.click(iDSRecordObj_Employee)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_close_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_title_inputCont'), FailureHandling.STOP_ON_FAILURE)

if (permission.toString().equalsIgnoreCase('Basic editor')) {
    editIDS_owner_dropdown_status_e = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), 
        'disabled')

    WebUI.verifyMatch(editIDS_owner_dropdown_status_e, 'true', false)
}

if (permission.toString().equalsIgnoreCase('Full editor') || permission.toString().equalsIgnoreCase('Meeting Admin')) {
    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_owner_dropdownCont'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Issues/EditIDS_close_btn'))

WebUI.delay(5)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSSection_btn'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Issues/IDSPanelHeader_h2'))

WebUI.verifyElementVisible(iDSRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(iDSRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(iDSRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

