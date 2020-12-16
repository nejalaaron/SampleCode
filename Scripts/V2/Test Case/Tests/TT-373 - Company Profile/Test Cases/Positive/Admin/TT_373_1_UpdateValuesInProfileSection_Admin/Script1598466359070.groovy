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

not_run: WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToURL'), [('URL') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : username
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

String randomText = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomText'(rnd_stringLength)

String newCompanyName = (companyName + ' ') + randomText

WebUI.click(findTestObject('Object Repository/V2/TT-373/Page_Dashboard/div_Company Settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-373/Page_Dashboard/a_Company Profile'))

WebUI.verifyElementVisible(findTestObject('V2/TT-373/Page_Company Profile/h1_Company Profile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/h2_Profile'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Company name'))

WebUI.sendKeys(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/input__name'), Keys.chord(Keys.CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/input__name'), newCompanyName)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Industry'))

WebUI.click(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/input__industry'))

TestObject industryOptions_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(companyIndustry_Obj, 
    companyIndustry, 'xpath')

WebUI.click(industryOptions_Obj)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Company phone number'))

WebUI.sendKeys(findTestObject('V2/TT-373/Page_Company Profile/input__phoneNumber'), Keys.chord(Keys.CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/input__phoneNumber'), companyPhoneNumber)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Number of employees in the company'))

WebUI.click(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Number of employees0-1011-4546-100100-200250'))

TestObject numOfEmp_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(numOfEmployees_Obj, numOfEmployees, 
    'xpath')

WebUI.click(numOfEmp_Obj)

WebUI.verifyElementClickable(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Cancel'))

WebUI.verifyElementClickable(findTestObject('V2/TT-373/Page_Company Profile/div_Save'))

WebUI.click(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Save'))

WebUI.waitForElementPresent(findTestObject('V2/TT-373/Page_Company Profile/CompanyProfileNotifTitle'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementPresent(findTestObject('V2/TT-373/Page_Company Profile/CompanyProfileNotifMessage'), GlobalVariable.DefaultTimeout)

WebUI.refresh()

WebUI.verifyElementAttributeValue(findTestObject('V2/TT-373/Page_Company Profile/input__name'), 'value', newCompanyName, 
    10)

WebUI.verifyElementText(findTestObject('V2/TT-373/Page_Company Profile/input__Industry_valContainer'), companyIndustry)

WebUI.verifyElementAttributeValue(findTestObject('V2/TT-373/Page_Company Profile/input__phoneNumber'), 'value', companyPhoneNumber, 
    10)

WebUI.verifyElementText(findTestObject('V2/TT-373/Page_Company Profile/number_of_employees_val_container'), numOfEmployees)

