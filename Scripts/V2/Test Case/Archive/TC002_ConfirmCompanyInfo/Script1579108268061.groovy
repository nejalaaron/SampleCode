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

WebUI.verifyElementVisible(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_First lets confirm your company information'))

WebUI.verifyElementVisible(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_Company Logo'))

WebUI.verifyElementVisible(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_Company Name'))

WebUI.verifyElementVisible(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_Industry'))

WebUI.verifyElementVisible(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_Company phone number'))

WebUI.verifyElementVisible(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_Number of employees in the company'))

WebUI.setText(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/input_Company Name_companyName'), 'Traction Tools')

WebUI.click(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/div_Engineering'))

WebUI.click(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/span_IndustryOption_Accomodation'))

WebUI.click(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/input_Company phone number_companyPhone'))

WebUI.sendKeys(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/input_Company phone number_companyPhone'), 
    '9999999999')

WebUI.click(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/input_Number of employees in the company_search'))

WebUI.click(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/div_numberOfEmployees_Option1'))

WebUI.click(findTestObject('Archive/TC002_ConfirmCompanyInfo/Page_Manage Users/button_Next'))

