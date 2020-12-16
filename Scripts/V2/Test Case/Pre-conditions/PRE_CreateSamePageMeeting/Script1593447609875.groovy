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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

WebUI.click(findTestObject('Object Repository/V2/Commons/MeetingListPage/div_Create a meeting'))

WebUI.click(findTestObject('V2/Commons/MeetingListPage/button_SamePage'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/CreateL10MeetingDrawer/input__name'), GlobalVariable.DefaultTimeout)

WebUI.setText(findTestObject('V2/Commons/CreateL10MeetingDrawer/input__name'), meetingName)

WebUI.setText(findTestObject('V2/Commons/CreateL10MeetingDrawer/input__acronym'), meetingAcronym)

WebUI.click(findTestObject('V2/Commons/CreateL10MeetingDrawer/input__typeOfMeeting'))

TestObject meetingTypeOption_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(dropdownOptions_obj, 
    meetingType, 'xpath')

WebUI.click(meetingTypeOption_Obj)

WebUI.click(findTestObject('V2/Commons/CreateL10MeetingDrawer/div_dayOfMeetingDropdownList'))

TestObject dayOfMeetingOption_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(dropdownOptions_obj, 
    dayOfMeeting, 'xpath')

WebUI.click(dayOfMeetingOption_Obj)

WebUI.click(findTestObject('V2/Commons/CreateL10MeetingDrawer/input_meetingTime'))

WebUI.setText(findTestObject('V2/Commons/CreateL10MeetingDrawer/input_meetingTime'), meetingTime)

WebUI.sendKeys(findTestObject('V2/Commons/CreateL10MeetingDrawer/input_meetingTime'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('V2/Commons/CreateL10MeetingDrawer/div_Create Same Page Meeting'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/Commons/MeetingListPage/div_Ill do this later'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/Commons/MeetingListPage/div_Ill do this later'))

not_run: TestObject meetingRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingRecord_obj, 
    meetingName, 'xpath')

WebUI.waitForElementPresent(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_meetingName_h2', [('meetingName') : meetingName]), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_meetingName_h2', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

