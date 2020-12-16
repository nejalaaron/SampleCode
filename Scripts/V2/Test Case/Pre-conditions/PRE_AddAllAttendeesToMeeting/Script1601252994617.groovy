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
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

String attendee_fullname = (firstname + ' ') + lastname

not_run: TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

not_run: WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementPresent(findTestObject('V2/Commons/EditMeetingPage/div_Add users'), GlobalVariable.DefaultTimeout)

WebUI.delay(5)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/div_Add users'))

WebUI.delay(5)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/AddAttendeeUserDropdown'))

TestObject attendeeOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(userOptionObj, attendee_fullname, 
    'xpath')

int attendeeObjCount = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CountElementInWebPageByDynamicElement'(userOptionObj, 
    attendee_fullname, 'xpath')

String attendeeOptSCount = attendeeObjCount.toString()

System.out.println(attendeeOptSCount)

String attendeeObj_Xpath = attendeeOpt_Obj.findPropertyValue('xpath')

String newAttendeeOpt = ('(' + attendeeObj_Xpath) + ')[%s]'

System.out.println(newAttendeeOpt)

TestObject newAttendeeOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(newAttendeeOpt, attendeeOptSCount, 
    'xpath')

WebUI.click(newAttendeeOpt_Obj)

WebUI.waitForElementPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeeSuccessNotif'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeeSuccessNotif'), GlobalVariable.DefaultTimeout)

WebUI.delay(5)

TestObject permissionDrop_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(permissionDropObj, 
    attendee_fullname, 'xpath')

WebUI.click(permissionDrop_Obj)

TestObject permissionDropOpt_Obj_MA = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(permissionDropOptObj_MA, 
    attendee_fullname, 'xpath')

TestObject permissionDropOpt_Obj_FE = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(permissionDropOptObj_FE, 
    attendee_fullname, 'xpath')

TestObject permissionDropOpt_Obj_BE = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(permissionDropOptObj_BE, 
    attendee_fullname, 'xpath')

if (permission == 'Meeting Admin') {

    if (!(firstname) == 'Admin') {
        WebUI.click(permissionDropOpt_Obj_MA)

        WebUI.waitForElementPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeePermSuccessNotif'), GlobalVariable.DefaultTimeout)

        WebUI.verifyElementPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeePermSuccessNotif'), GlobalVariable.DefaultTimeout)
    }
}

if (permission == 'Full editor') {

    WebUI.click(permissionDropOpt_Obj_FE)
}

if (permission == 'Basic editor') {

    WebUI.click(permissionDropOpt_Obj_BE)

    WebUI.waitForElementPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeePermSuccessNotif'), GlobalVariable.DefaultTimeout)

    WebUI.verifyElementPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeePermSuccessNotif'), GlobalVariable.DefaultTimeout)
}

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.waitForElementNotPresent(findTestObject('V2/Commons/EditMeetingPage/AddAttendeeSuccessNotif'), GlobalVariable.DefaultTimeout)