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

WebUI.waitForElementClickable(findTestObject('Object Repository/V2/TT-363/Page_Login/input__username'), 30)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Login/input__username'), username)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Dashboard/span_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Create a meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/button_Same Page'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__name'), meetingName)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__acronym'), meetingAcronym)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input_Meeting description (max 100 characte_8187fa'), 
    meetingDescription)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__typeOfMeeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/div_Departmental'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Select a dayMondayTuesdayWednesdayThurs_fcb808-1'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/div_Monday'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/input_ampm_meeting-time'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/div_ampm800'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input_Video conference URL_meetingLink'), videoConference)

WebUI.delay(5)

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/Page_Meeting/div_Create Meeting (1)'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Ill do this later'))

TestObject createMeetingRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'('//div[@class="detailscontainer__block item"]/h4[text()=\'%s\']', 
    meetingName, 'xpath')

WebUI.verifyElementPresent(createMeetingRecordObj, GlobalVariable.DefaultTimeout)

