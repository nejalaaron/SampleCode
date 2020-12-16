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

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToStartMeetingPage'), [('meetingName') : meetingName
        , ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']', ('meetingGoToMeeting_Obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']/ancestor::div[contains(@class,\'ListContainer\')]//div[@class=\'item\']//button[.=\'Go to meeting\']'], 
    FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.WaitForElementVisibleThenClick'(findTestObject('V2/PR-341/Page_Meeting/Start_Meeting'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Segue/WelcomeText'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Segue/WelcomeText'))

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Segue/ShareGoodNewsText'))

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Conclude/ConcludeSection_btn'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Conclude/ConcludeSection_btn'))

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Conclude/ConcludeSection_btn'))

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/Conclude/Conclude_btn'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/Conclude/Conclude_btn'))

WebUI.delay(20)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/MeetingSummaryPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/MeetingSummaryPanelHeader_h2'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/IssuesSolvedText_span'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/IssuesSolvedText_span'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/ToDoCompletionText_span'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/ToDoCompletionText_span'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/AverageRatingText_span'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/AverageRatingText_span'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/LeaveMeeting_btn'))

WebUI.waitForElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/MeetingSummaryPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/MeetingSummaryPanelHeader_h2'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/IssuesSolvedText_span'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/IssuesSolvedText_span'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/ToDoCompletionText_span'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/ToDoCompletionText_span'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/AverageRatingText_span'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementNotPresent(findTestObject('V2/TT-411/RunMeetingPage/MeetingSummary/AverageRatingText_span'), GlobalVariable.DefaultTimeout)

not_run: WebUI.waitForElementVisible(findTestObject('V2/PR-341/Page_Meeting/Traction_Logo'), GlobalVariable.DefaultTimeout)

not_run: WebUI.click(findTestObject('V2/PR-341/Page_Meeting/Traction_Logo'))

not_run: TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

CustomKeywords.'tt_CustomKeywords.CustomKeywords.WaitForElementVisibleThenClick'(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', 
        [('meetingName') : meetingName]), GlobalVariable.DefaultTimeout)

not_run: WebUI.waitForElementVisible(meetingOpt_Obj, GlobalVariable.DefaultTimeout)

not_run: WebUI.click(meetingOpt_Obj)

WebUI.waitForElementVisible(findTestObject('V2/Commons/MeetingListPage/a_Archives'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Archives'))

WebUI.waitForElementVisible(findTestObject('V2/PR-341/Page_Archives/To-Dos'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-341/Page_Archives/To-Dos'))

WebUI.waitForElementVisible(findTestObject('V2/PR-341/Page_Archives/Verify_Admin_User'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementPresent(findTestObject('V2/PR-341/Page_Archives/Verify_Admin_User'), GlobalVariable.DefaultTimeout)

