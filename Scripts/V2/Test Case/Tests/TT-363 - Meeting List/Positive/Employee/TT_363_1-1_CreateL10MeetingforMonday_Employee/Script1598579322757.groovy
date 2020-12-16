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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl(GlobalVariable.V2Url)

not_run: WebUI.delay(7)

not_run: WebUI.waitForElementClickable(findTestObject('V2/TT-363/Page_Login/input__username'), 30)

not_run: WebUI.setText(findTestObject('V2/TT-363/Page_Login/input__username'), username)

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Login/input__password'), password)

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Login/div_Login'))

WebUI.verifyElementPresent(findTestObject('V2/TT-363/Page_Dashboard/span_Meetings'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-363/Page_Dashboard/span_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Create a meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/button_Level 10'))

WebUI.waitForElementVisible(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__name'), GlobalVariable.DefaultTimeout)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__name'), meetingNameE)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__acronym'), meetingAcronym)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input_Meeting description (max 100 characte_8187fa'), 
    meetingDescription)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input__typeOfMeeting'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Leadership'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Select a dayMondayTuesdayWednesdayThurs_fcb808'))

WebUI.click(findTestObject('V2/TT-363/Page_Meeting/div_Monday'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_000'))

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/span_0800'))

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/input_Video conference URL_meetingLink'), videoConference)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Create Meeting'))

WebUI.waitForElementVisible(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Ill do this later'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/div_Ill do this later'))

TestObject createMeetingRecordObjEmployee = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'('//div[@class="container__col detailscontainer__block"]/h2/div[text()=\'%s\']', 
    meetingNameE, 'xpath')

WebUI.verifyElementPresent(createMeetingRecordObjEmployee, GlobalVariable.DefaultTimeout)

WebUI.delay(5)

