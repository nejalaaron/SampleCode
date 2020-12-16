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

WebUI.waitForElementPresent(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/AttendeeImage', [('username') : user_fullname]), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementPresent(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/AttendeeImage', [('username') : s_user_fullname]), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementPresent(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/AttendeeImage', [('username') : e_user_fullname]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/AttendeeImage', [('username') : user_fullname]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/AttendeeImage', [('username') : s_user_fullname]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/AttendeeImage', [('username') : e_user_fullname]), 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.WaitForElementVisibleThenClick'(findTestObject('V2/TT-411/RunMeetingPage/Sidebar/VideoConference_btn'), 
    GlobalVariable.DefaultTimeout)

WebUI.switchToWindowIndex(1)

actual_videoConferenceURL = WebUI.getUrl()

WebUI.verifyMatch(actual_videoConferenceURL, videoConferenceURL, false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

