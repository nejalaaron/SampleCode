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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.verifyElementPresent(findTestObject('V2/TT-311/Page_Login/img'), 0)

WebUI.setText(findTestObject('V2/TT-311/Page_Login/input__username'), username)

WebUI.setText(findTestObject('V2/TT-311/Page_Login/input__password'), password)

objPassword_Attr_Act = WebUI.getAttribute(findTestObject('V2/TT-311/Page_Login/input__password'), objPassword_Attr)

WebUI.verifyMatch(objPassword_Attr_Act, objPassword_Attr_Exp1, false)

not_run: objLoginBtn_Attr_Act = WebUI.getAttribute(findTestObject('V2/TT-311/Page_Login/div_Login'), objLoginBtn_Attr)

not_run: CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(objLoginBtn_Attr_Act, objLoginBtnAttr_Exp)

WebUI.verifyElementClickable(findTestObject('V2/TT-311/Page_Login/div_Login'))

WebUI.click(findTestObject('V2/TT-311/Page_Login/div_Login'))

WebUI.waitForElementPresent(findTestObject('V2/TT-311/Page_Login/h5_Invalid credentials'), GlobalVariable.DefaultTimeout)

passwordError_Actual = WebUI.getText(findTestObject('V2/TT-311/Page_Login/h5_Invalid credentials'))

WebUI.verifyMatch(passwordError_Actual, passwordError_Exp, false)

