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

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/a_Home'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Rocks'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Rock title'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Status'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/button_Rocks_sc-csuQGl hUqArJ Widget__action'))

WebUI.delay(7)

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Create a Rock'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Rock title_1'))

WebUI.setText(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Rock title_sc-gzVnrw dFiVpR'), 
    'Test Rock 1')

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Status_1'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Status_search'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_On Track'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Accountable Owner'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/div_Select owner'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Visibility level'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Visibility_Level'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Personal'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Visibility_Level'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Departmental (VTO)'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Company (VTO)'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Individual'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Personal'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Due date'))

WebUI.setText(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    '01/28/2020')

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/div_Previous MonthNext MonthJanuary 2020SuM_851074'))

WebUI.sendKeys(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Attach to meetings'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Notes'))

WebUI.setText(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/textarea_TEST'), 
    'TEST')

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Milestones'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/label_Add Milestone'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_Add milestones'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/i_Good day leandro43emailcom_close icon sc-_dd4ad9'))

WebUI.verifyElementVisible(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/button_Cancel'))

WebUI.click(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/button_Save'))

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/a_Rockname_value'), 'Test Rock 1')

WebUI.verifyElementText(findTestObject('Archive/TC008_CreateNewRock/Page_Good day leandro43emailcom/span_RockStatus_value'), 
    'ON TRACK')

