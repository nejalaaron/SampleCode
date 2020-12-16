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

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Scorecard/ScorecardPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Scorecard/ScorecardPanelHeader_h2'))

WebUI.delay(15)

String initialTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/TT-411/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyNotMatch(finalTimerText, initialTimerText, false)

TestObject scorecardRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(scorecardRecord_obj, 
    scorecard_title, 'xpath')

WebUI.waitForElementVisible(scorecardRecordObj, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(scorecardRecordObj, FailureHandling.STOP_ON_FAILURE)

TestObject scorecardRecordObj_Supervisor = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(scorecardRecord_obj, 
    scorecard_title_supervisor, 'xpath')

WebUI.waitForElementVisible(scorecardRecordObj_Supervisor, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(scorecardRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

TestObject scorecardRecordObj_Employee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(scorecardRecord_obj, 
    scorecard_title_employee, 'xpath')

WebUI.waitForElementVisible(scorecardRecordObj_Employee, GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(scorecardRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Scorecard/ScorecardSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Scorecard/ScorecardSection_btn'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Scorecard/ScorecardPanelHeader_h2'))

WebUI.verifyElementVisible(scorecardRecordObj, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(scorecardRecordObj_Supervisor, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(scorecardRecordObj_Employee, FailureHandling.STOP_ON_FAILURE)

