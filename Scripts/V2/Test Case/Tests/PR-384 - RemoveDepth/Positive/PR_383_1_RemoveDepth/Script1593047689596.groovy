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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.delay(7)

WebUI.waitForElementClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 
    30)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 'erick+user113@mytractiontools.com')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__password'), 'Qwer123!')

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Dashboard/div_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/div_Create a meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/button_Level 10'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/input__name'), meetingName)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/input__acronym'), 'te101')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/input_Meeting description (max 100 characte_8187fa'), 
    'test employee')

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__typeOfMeeting'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Leadership'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Select a dayMondayTuesdayWednesdayThurs_fcb808'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Monday'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_000'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/span_0800'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/div_Create Meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/div_Ill do this later'))

WebUI.click(findTestObject('V2/TT-363/Attendees/Page_Dashboard/Profile'))

WebUI.click(findTestObject('V2/TT-363/Attendees/Page_Dashboard/Logout'))

WebUI.delay(7)

WebUI.waitForElementClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 
    30)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 'erick+user112@mytractiontools.com')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__password'), 'Qwer123!')

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Dashboard/div_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/div_Create a meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/button_Level 10'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/input__name'), 'test Supervisor')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/input__acronym'), 'ts101')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/input_Meeting description (max 100 characte_8187fa'), 
    'test Employee')

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__typeOfMeeting'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Leadership'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Select a dayMondayTuesdayWednesdayThurs_fcb808'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Monday'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_000'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/span_0800'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/div_Create Meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/div_Ill do this later'))

WebUI.click(findTestObject('V2/TT-363/Attendees/Page_Dashboard/Profile'))

WebUI.click(findTestObject('V2/TT-363/Attendees/Page_Dashboard/Logout'))

WebUI.delay(7)

WebUI.waitForElementClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 
    30)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 'erick+user110@mytractiontools.com')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__password'), 'Qwer123!')

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Dashboard/div_Meetings'))

WebUI.delay(5)

TestObject createMeetingRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'('//div[@class="detailscontainer__block item"]/h4[text()=\'%s\']', 
    meetingName, 'xpath')

WebUI.verifyElementPresent(createMeetingRecordObj, 30)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.closeBrowser()

