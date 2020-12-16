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

WebUI.verifyElementNotClickable(findTestObject('V2/TT-373/Page_Company Profile/input__name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Industry'))

WebUI.verifyElementNotClickable(findTestObject('V2/TT-373/Page_Company Profile/input__industry_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Company phone number'))

WebUI.verifyElementNotClickable(findTestObject('V2/TT-373/Page_Company Profile/input__phoneNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Number of employees in the company'))

String numEmployeeClickStatus = WebUI.getAttribute(findTestObject('Object Repository/V2/TT-373/Page_Company Profile/div_Number of employees0-1011-4546-100100-200250'), 
    'disabled')

WebUI.verifyMatch(numEmployeeClickStatus, 'true', false)

String saveBtnClickStatus = WebUI.getAttribute(findTestObject('V2/TT-373/Page_Company Profile/div_Save'), 'class')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(saveBtnClickStatus, 'disabled')

