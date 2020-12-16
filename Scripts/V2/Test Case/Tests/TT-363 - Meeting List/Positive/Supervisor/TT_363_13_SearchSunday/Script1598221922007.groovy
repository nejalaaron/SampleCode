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

WebUI.waitForElementClickable(findTestObject('V2/TT-363/Page_Login/input__username'), 30)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Login/Page_Login/input__username'), username)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Login/Page_Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Login/div_Login'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Dashboard/span_Meetings'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/button_My meetings_BtnIconStyles-k8ghfj-0 gNflgc'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/div_ie MondayMondayTuesdayWednesdayThursday_10cdc7'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/div_Sunday'), 30)

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/div_Sunday'))

TestObject createMeetingRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'('//div[@class="detailscontainer__block item"]/h4[text()=\'%s\']', 
    meetingName, 'xpath')

WebUI.verifyElementPresent(createMeetingRecordObj, GlobalVariable.DefaultTimeout)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Meeting/button_Go to meeting_BtnIconNakedStyles-sc-_e4abf2'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Attendees/Page_Meeting Settings/div_Archive meeting'))

WebUI.delay(5)

