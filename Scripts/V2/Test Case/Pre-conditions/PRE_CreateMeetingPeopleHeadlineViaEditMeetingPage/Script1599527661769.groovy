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

String accountableOwner_fullname = (firstname + ' ') + lastname

not_run: TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

not_run: WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/AddPeopleHeadlineIcon_btn'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/AddPeopleHeadlineIcon_btn'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/CreateAPeopleHeadlineHeader_h2'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineTitle_input'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineOwner_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineAssignToMeeting_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineShareToTeamMeeting_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/CreateAPeopleHeadlineHeader_h2'))

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineTitle_input'))

WebUI.setText(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineTitle_input'), 
    peopleHeadline_title)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineOwner_dropdown'))

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineAssignToMeeting_dropdown'))

if (!(permission.toString().equalsIgnoreCase('Basic editor'))) {
    WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineOwner_dropdown'))

    TestObject createPHOwnerOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createPeopleHeadlineDropdownOwnerOpt_obj, 
        accountableOwner_fullname, 'xpath')

    WebUI.click(createPHOwnerOption)
}

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineAssignToMeeting_dropdown'))

TestObject createPeopleHeadlineATMOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createPeopleHeadlineDropdownATMOpt_obj, 
    meetingName, 'xpath')

WebUI.click(createPeopleHeadlineATMOption)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineShareToTeamMeeting_dropdown'))

if (!(shared_meetingName) == '') {
    WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineAssignToMeeting_dropdown'))

    TestObject createPeopleHeadlineSTTMOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createPeopleHeadlineDropdownSTTMOpt_obj, 
        shared_meetingName, 'xpath')

    WebUI.click(createPeopleHeadlineSTTMOption)
}

not_run: WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateToDoDrawer/Notes_textArea'), GlobalVariable.DefaultTimeout)

not_run: WebUI.setText(findTestObject('V2/Commons/EditMeetingPage/CreateToDoDrawer/Notes_textArea'), notesText)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/EditMeeting_PeopleHeadlineSave_btn'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/PeopleHeadlineSavedModalText_h3'), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreatePeopleHeadlineDrawer/PeopleHeadlineSavedModalText_h3'), 
    FailureHandling.STOP_ON_FAILURE)

