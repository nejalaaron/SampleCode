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

WebUI.delay(15)

String initialTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyNotMatch(finalTimerText, initialTimerText, false)

TestObject todoRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoRecord_obj, todoName, 
    'xpath')

WebUI.waitForElementVisible(todoRecordObj, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(todoRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject todoRecordObj_Supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoRecord_obj, 
    todoNameSupervisor, 'xpath')

WebUI.waitForElementVisible(todoRecordObj_Supervisor, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(todoRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject todoRecordObj_Employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoRecord_obj, 
    todoNameEmployee, 'xpath')

WebUI.waitForElementVisible(todoRecordObj_Employee, GlobalVariable.DefaultTimeout)

WebUI.verifyElementPresent(todoRecordObj_Employee, GlobalVariable.DefaultTimeout)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosSection_btn'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/To-Dos/ToDosPanelHeader_h2'))

WebUI.verifyElementVisible(todoRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(todoRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(todoRecordObj_Employee, GlobalVariable.DefaultTimeout)

