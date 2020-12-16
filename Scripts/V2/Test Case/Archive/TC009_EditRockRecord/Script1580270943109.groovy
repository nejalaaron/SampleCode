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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/')

WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/a_Test Rock 1'))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Edit Rock'))

WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Rock title'))

not_run: WebUI.setText(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_Rock title_sc-gzVnrw dFiVpR'), 
    'Test Rock 1 Change')

not_run: WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Status'))

not_run: WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_Status_search'))

not_run: WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/div_Off Track'))

not_run: WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Accountable Owner'))

not_run: WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_AccountableOwner'))

not_run: WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Leandro Arellano'))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Visibility level'))

WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_VisibilityLevel'))

WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/div_Individual'))

WebUI.sendKeys(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    '01/30/2020')

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/div_January 2020'))

WebUI.sendKeys(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Attach to meetings'))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Notes'))

WebUI.setText(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/textarea_TEST'), 'Test Rock Note Change')

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Milestones'))

WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/label_Add Milestone'))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Add milestones'))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_Due date'))

WebUI.verifyElementVisible(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/div_CancelUpdating'))

WebUI.click(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/button_Update'))

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/a_Test Rock 1'), 'Test Rock 1 Change')

WebUI.verifyElementText(findTestObject('Archive/TC009_EditRockRecord/Page_Good day leandro45emailcom/span_RockStatus_value'), 
    'OFF TRACK')

