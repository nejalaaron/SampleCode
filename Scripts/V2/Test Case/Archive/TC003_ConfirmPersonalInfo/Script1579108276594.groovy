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

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/users')

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/span_Now lets confirm your personal information'))

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/span_Company Logo'))

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/span_First Name'))

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/span_Position'))

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/span_Last Name'))

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/span_Phone number'))

WebUI.setText(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/input_First Name_firstName'), 
    'Leandro')

WebUI.setText(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/input_Last Name_lastName'), 
    'Arellano')

WebUI.click(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/input_Position_search'))

WebUI.click(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/position_softEng_opt'))

WebUI.click(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/input_Phone number_phoneNumber'))

WebUI.sendKeys(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/input_Phone number_phoneNumber'), 
    '9999999999')

WebUI.click(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/button_Next'))

WebUI.verifyElementVisible(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/div_Welcome JohnWe cant wait to show you Tr_6766d2'))

WebUI.click(findTestObject('Archive/TC003_ConfirmPersonalInfo/Page_Manage Users/button_Lets get started'))

not_run: WebUI.closeBrowser()

