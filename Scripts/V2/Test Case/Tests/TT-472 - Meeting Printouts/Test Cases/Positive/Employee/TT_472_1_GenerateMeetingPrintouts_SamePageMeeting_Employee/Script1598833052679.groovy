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

String full_downloadsPath = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateWindowsPath'(GlobalVariable.downloadsPath)

String MPFile = ((full_downloadsPath + '/Same Page Meeting - ') + meetingName) + '.pdf'

CustomKeywords.'tt_CustomKeywords.CustomKeywords.DeleteFile'(MPFile)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.ChangeDownloadPath'()

not_run: WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_CreateSamePageMeeting'), [('meetingName') : meetingName
        , ('meetingAcronym') : meetingAcronym, ('meetingType') : meetingType, ('dropdownOptions_obj') : '//div[@id=\'CREATE_MEETING_SAME_PAGE\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('dayOfMeeting') : dayOfmeeting, ('meetingTime') : meetingTime, ('meetingRecord_obj') : '//div[@class=\'detailscontainer__block item\']/h4[text()=\'%s\']'], 
    FailureHandling.STOP_ON_FAILURE)

not_run: TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

not_run: WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/TT-472/Page_Meeting/button_Create printout (pdf)'))

WebUI.waitForElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/h1_Create Printout'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/h1_Create Printout'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/V2/TT-472/Page_Meeting/div_Create Quarterly Printout'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/V2/TT-472/Page_Meeting/span_Cover Page'), 30)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/V2/TT-472/Page_Meeting/span_Quarterly Rocks'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/span_People Headlines'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/div_Include past headlines'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/span_To-dos'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/span_Issues'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/V2/TT-472/Page_Meeting/span_Scorecard'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/div_Cancel'))

WebUI.click(findTestObject('Object Repository/V2/TT-472/Page_Meeting/div_Create My Printout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-472/Page_Meeting/h3_Printout Created'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

String fullPDFContents = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getAllText'(MPFile)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextNotContains'(fullPDFContents, 'Scorecard')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextNotContains'(fullPDFContents, 'Rocks')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(fullPDFContents, 'People Headlines')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(fullPDFContents, 'Issues')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(fullPDFContents, 'To-dos')

String pdfContentsCoverPage = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getTextFromPage'(MPFile, 1)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextNotContains'(pdfContentsCoverPage, 'Quarterly Report')

