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

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosPanelHeader_h2'))

WebUI.delay(5)

String initialTimerText = WebUI.getText(findTestObject('V2/Commons/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/Commons/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyMatch(finalTimerText, initialTimerText, false)

segueTimerText = WebUI.getText(findTestObject('V2/Commons/RunMeetingPage/Segue/SegueTimer'))

WebUI.verifyMatch(segueTimerText, '', false)

WebUI.verifyElementVisible(findTestObject('V2/Commons/RunMeetingPage/SectionTimerPanel/toDoTitleText_span'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoName]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoName]), 
    FailureHandling.STOP_ON_FAILURE)

not_run: TestObject todoRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoRecord_obj, 
    todoName, 'xpath')

not_run: WebUI.waitForElementVisible(todoRecordObj, GlobalVariable.DefaultTimeout)

not_run: WebUI.verifyElementVisible(todoRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoNameSupervisor]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoNameSupervisor]), 
    FailureHandling.STOP_ON_FAILURE)

not_run: TestObject todoRecordObj_Supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoRecord_obj, 
    todoNameSupervisor, 'xpath')

not_run: WebUI.waitForElementVisible(todoRecordObj_Supervisor, GlobalVariable.DefaultTimeout)

not_run: WebUI.verifyElementVisible(todoRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoNameEmployee]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoNameEmployee]), 
    FailureHandling.STOP_ON_FAILURE)

not_run: TestObject todoRecordObj_Employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoRecord_obj, 
    todoNameEmployee, 'xpath')

not_run: WebUI.waitForElementVisible(todoRecordObj_Employee, GlobalVariable.DefaultTimeout)

not_run: WebUI.verifyElementVisible(todoRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosSection_btn'))

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosSection_btn'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosPanelHeader_h2'))

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoNameSupervisor]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingPreviewPage/ToDo/D_todoRecord_nameText_div', [('todoName') : todoNameEmployee]), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(todoRecordObj, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(todoRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementVisible(todoRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

