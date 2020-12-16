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

WebUI.waitForElementVisible(findTestObject('V2/Commons/RunMeetingPage/Segue/WelcomeText'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/RunMeetingPage/Segue/WelcomeText'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/Commons/RunMeetingPage/Segue/ShareGoodNewsText'), FailureHandling.STOP_ON_FAILURE)

String initialTimerText = WebUI.getText(findTestObject('V2/Commons/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.delay(5)

String finalTimerText = WebUI.getText(findTestObject('V2/Commons/RunMeetingPage/SectionTimerPanel/timerText_h2'))

WebUI.verifyMatch(finalTimerText, initialTimerText, false)

segueTimerText = WebUI.getText(findTestObject('V2/Commons/RunMeetingPage/Segue/SegueTimer'))

WebUI.verifyMatch(segueTimerText, '', false)

WebUI.verifyElementVisible(findTestObject('V2/Commons/RunMeetingPage/SectionTimerPanel/segueTitleText_span'))

