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

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

not_run: TestObject meetingGTM_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingGoToMeeting_Obj, 
    meetingName, 'xpath')

not_run: WebUI.click(meetingGTM_Obj)

WebUI.waitForElementVisible(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_GoToMeeting_btn', [('meetingName') : meetingName]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_GoToMeeting_btn', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_GoToMeeting_btn', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/Commons/StartMeetingPage/startMeeting_pageTitle_h1'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/StartMeetingPage/startMeeting_pageTitle_h1'))

