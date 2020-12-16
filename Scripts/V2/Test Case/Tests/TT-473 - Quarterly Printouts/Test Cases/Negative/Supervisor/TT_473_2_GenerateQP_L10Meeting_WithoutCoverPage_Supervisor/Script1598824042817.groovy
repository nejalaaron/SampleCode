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
import com.kms.katalon.keyword.pdf.PDF as PDF

String full_downloadsPath = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateWindowsPath'(GlobalVariable.downloadsPath)

String QPFile = ((full_downloadsPath + '/L10 Meeting - ') + meetingName) + '.pdf'

CustomKeywords.'tt_CustomKeywords.CustomKeywords.DeleteFile'(QPFile)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.ChangeDownloadPath'()

not_run: TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

not_run: WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/TT-473/Page_Meeting/button_Create printout (pdf)'))

WebUI.waitForElementVisible(findTestObject('V2/TT-473/Page_Meeting/h1_Create Printout'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/h1_Create Printout'))

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/div_Create Quarterly Printout'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/V2/TT-473/Page_Meeting/span_Cover Page'), 30)

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/span_Quarterly Rocks'))

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/span_People Headlines'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-473/Page_Meeting/div_Include past headlines'))

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/span_To-dos'))

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/span_Issues'))

WebUI.verifyElementVisible(findTestObject('V2/TT-473/Page_Meeting/span_Scorecard'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-473/Page_Meeting/div_Cancel'))

WebUI.click(findTestObject('Object Repository/V2/TT-473/Page_Meeting/div_Create My Printout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-473/Page_Meeting/h3_Printout Created'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

String pdfContents = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getTextFromPage'(QPFile, 1)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextNotContains'(pdfContents, 'Quarterly Report')

