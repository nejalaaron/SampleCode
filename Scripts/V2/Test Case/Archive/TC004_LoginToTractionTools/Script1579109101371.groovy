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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/')

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/img'))

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_Login to your account'))

WebUI.verifyElementClickable(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/button_Login'))

not_run: WebUI.setText(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/input_Email_username'), 
    'test')

not_run: WebUI.click(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_Email'))

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_Invalid email'))

WebUI.sendKeys(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/input_Email_username'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/input_Email_username'), 'leandro75@email.com')

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/i_Password_eye slash icon sc-ifAKCX ekDjTN'))

not_run: WebUI.setText(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/input_Password_password'), 
    'test')

WebUI.click(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/i_Password_eye slash icon sc-ifAKCX ekDjTN'))

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/i_Password_eye icon sc-ifAKCX ekDjTN'))

WebUI.click(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_Password'))

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_Please enter a password not less than 8 characters'))

WebUI.sendKeys(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/input_Password_password'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/input_Password_password'), 'Qwer1234!')

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/label_Keep me signed in'))

WebUI.click(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_Keep me signed in_checkmark'))

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/a_Forgot your password'))

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_New to Traction Tools Register here'))

WebUI.verifyElementVisible(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/span_footer'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Archive/TC004_LoginToTractionTools/Page_Login - Traction Tools/button_Login'))

not_run: WebUI.closeBrowser()

