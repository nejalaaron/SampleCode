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

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/CompanyRocksPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/CompanyRocksPanelHeader_h2'))

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/OurRocksPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/OurRocksPanelHeader_h2'))

WebUI.delay(15)

String initialTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyNotMatch(finalTimerText, initialTimerText, false)

TestObject companyRockRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRockRecord_obj, 
    rock_title, 'xpath')

WebUI.waitForElementVisible(companyRockRecordObj, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(companyRockRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockCATRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRock_CAT_obj, 
    rock_title, 'xpath')

WebUI.verifyElementVisible(companyRockCATRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockCAIRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRock_CAI_obj, 
    rock_title, 'xpath')

WebUI.verifyElementVisible(companyRockCAIRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRockRecord_obj, 
    rock_title_supervisor, 'xpath')

WebUI.waitForElementVisible(companyRockRecordObj_supervisor, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(companyRockRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockCATRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRock_CAT_obj, 
    rock_title_supervisor, 'xpath')

WebUI.verifyElementVisible(companyRockCATRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockCAIRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRock_CAI_obj, 
    rock_title_supervisor, 'xpath')

WebUI.verifyElementVisible(companyRockCAIRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRockRecord_obj, 
    rock_title_employee, 'xpath')

WebUI.waitForElementVisible(companyRockRecordObj_employee, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(companyRockRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockCATRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRock_CAT_obj, 
    rock_title_employee, 'xpath')

WebUI.verifyElementVisible(companyRockCATRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

TestObject companyRockCAIRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyRock_CAI_obj, 
    rock_title_employee, 'xpath')

WebUI.verifyElementVisible(companyRockCAIRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRockRecord_obj, 
    rock_title, 'xpath')

WebUI.verifyElementVisible(ourRockRecordObj)

WebUI.click(ourRockRecordObj)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_close_btn'), GlobalVariable.DefaultTimeout)

not_run: if (permission.toString().equalsIgnoreCase('Basic editor')) {
    editRock_visibility_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_visibility_status, 'true', false)

    editRock_ATM_dropdown_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_ATM_dropdown_status, 'true', false)

    editRock_notes_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_notes_status, 'true', false)

    editRock_DueDate_status = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_DueDate_status, 'true', false)
}

not_run: if (permission.toString().equalsIgnoreCase('Full editor') || permission.toString().equalsIgnoreCase('Meeting Admin')) {
    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_close_btn'), FailureHandling.STOP_ON_FAILURE)

TestObject ourRockRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRockRecord_obj, 
    rock_title_supervisor, 'xpath')

WebUI.verifyElementVisible(ourRockRecordObj_supervisor)

WebUI.click(ourRockRecordObj_supervisor)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_close_btn'), GlobalVariable.DefaultTimeout)

not_run: if (permission.toString().equalsIgnoreCase('Basic editor')) {
    editRock_visibility_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_visibility_status_s, 'true', false)

    editRock_ATM_dropdown_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_ATM_dropdown_status_s, 'true', false)

    editRock_notes_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_notes_status_s, 'true', false)

    editRock_DueDate_status_s = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_DueDate_status_s, 'true', false)
}

not_run: if (permission.toString().equalsIgnoreCase('Full editor') || permission.toString().equalsIgnoreCase('Meeting Admin')) {
    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_close_btn'), FailureHandling.STOP_ON_FAILURE)

TestObject ourRockRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRockRecord_obj, 
    rock_title_employee, 'xpath')

WebUI.verifyElementVisible(ourRockRecordObj_employee)

WebUI.click(ourRockRecordObj_employee)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_close_btn'), GlobalVariable.DefaultTimeout)

not_run: if (permission.toString().equalsIgnoreCase('Basic editor')) {
    editRock_visibility_status_e = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_visibility_status_e, 'true', false)

    editRock_ATM_dropdown_status_e = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_ATM_dropdown_status_e, 'true', false)

    editRock_notes_status_e = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_notes_status_e, 'true', false)

    editRock_DueDate_status_e = WebUI.getAttribute(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), 
        'disabled')

    WebUI.verifyMatch(editRock_DueDate_status_e, 'true', false)
}

not_run: if (permission.toString().equalsIgnoreCase('Full editor') || permission.toString().equalsIgnoreCase('Meeting Admin')) {
    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_notes_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_VisibilityLevel_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_DueDate_divCont'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementClickable(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_AssignToTeamMeetings_divCont'), 
        FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Rocks/EditRock_close_btn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(ourRockRecordObj, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(ourRockRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockCATRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRock_CAT_obj, 
    rock_title, 'xpath')

WebUI.verifyElementVisible(ourRockCATRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockCAIRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRock_CAI_obj, 
    rock_title, 'xpath')

WebUI.verifyElementVisible(ourRockCAIRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(ourRockRecordObj_supervisor, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(ourRockRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockCATRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRock_CAT_obj, 
    rock_title_supervisor, 'xpath')

WebUI.verifyElementVisible(ourRockCATRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockCAIRecordObj_supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRock_CAI_obj, 
    rock_title_supervisor, 'xpath')

WebUI.verifyElementVisible(ourRockCAIRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(ourRockRecordObj_employee, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(ourRockRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockCATRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRock_CAT_obj, 
    rock_title_employee, 'xpath')

WebUI.verifyElementVisible(ourRockCATRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

TestObject ourRockCAIRecordObj_employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ourRock_CAI_obj, 
    rock_title_employee, 'xpath')

WebUI.verifyElementVisible(ourRockCAIRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/RocksSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/RocksSection_btn'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/CompanyRocksPanelHeader_h2'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Rocks/OurRocksPanelHeader_h2'))

WebUI.verifyElementVisible(companyRockRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(companyRockRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(companyRockRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(ourRockRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(ourRockRecordObj_supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(ourRockRecordObj_employee, FailureHandling.STOP_ON_FAILURE)

