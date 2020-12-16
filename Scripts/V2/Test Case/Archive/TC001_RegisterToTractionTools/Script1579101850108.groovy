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

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/a_Register here'))

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__firstName'), 'Leandro')

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__lastName'), 'Arellano2')

'Update this every run.'
WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__email'), 'leandro76@email.com')

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__phoneNumber'))

WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__phoneNumber'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__phoneNumber'), '9999999999')

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__phoneNumber'), 
    Keys.chord(Keys.NUMPAD9, Keys.NUMPAD9, Keys.NUMPAD9, Keys.NUMPAD9, Keys.NUMPAD9, Keys.NUMPAD9, Keys.NUMPAD9, Keys.NUMPAD9, 
        Keys.NUMPAD9, Keys.NUMPAD9))

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__companyName'), 'Traction Tools')

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__search'))

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/div_Coach Implementer'))

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input_Name of coachimplementer_implementer'), 
    'Coach Test')

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/button_Continue'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_We just sent you an email to confirm your email address and create a password'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_You are on your way to productive meetings'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Your 30 day trial will begin today and will expire on'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_February 26 2020'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_pass_asterisk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_confpass_asterisk'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 lower case letter'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 number'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 symbol'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 upper case letter'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_8-32 characters'), 
    0)

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 'Qwer')

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 lower case letter'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 number'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 symbol'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 upper case letter'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_8-32 characters'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is WEAK'))

actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is WEAK'))

WebUI.verifyMatch(actualPassText, 'Password is WEAK', false)

WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 'Qwer1234')

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is GOOD'))

actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is GOOD'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is GOOD', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234"')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234#')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234$')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234%')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234&')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234\'')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234(')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234)')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234*')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234+')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234,')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234-')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234.')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234/')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234:')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234;')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234<')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234=')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234>')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234?')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234@')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234[')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234\\')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234]')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234^')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234_')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234`')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234{')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234|')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234}')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

not_run: WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'Qwer1234~')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

not_run: WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 'Qwer1234!')

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

actualPassText = WebUI.getText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password is STRONG'))

WebUI.verifyMatch(actualPassText, 'Password is STRONG', false)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 lower case letter'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 number'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 symbol'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_1 upper case letter'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_8-32 characters'), 
    0)

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__confirmPassword'), 
    'Qwer1234!A')

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Confirm Password'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password mismatch'))

WebUI.sendKeys(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__confirmPassword'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__confirmPassword'), 
    'Qwer1234!')

WebUI.verifyElementNotPresent(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Password mismatch'), 
    0)

WebUI.check(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Sign me up for Traction Tools emails_checkmark'))

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/a_TERMS  CONDITIONS'))

WebUI.verifyElementVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/span_Terms  conditions'))

WebUI.verifyElementNotVisible(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/img'))

not_run: WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TEST/Page_Login - Traction Tools/button_Accept terms and conditions'))

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/div_Lorem ipsum dolor sit amet consectetur _01c624'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(5)

not_run: WebUI.verifyElementClickable(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/button_Accept terms and conditions'))

tCColor = WebUI.getCSSValue(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/button_Accept terms and conditions'), 
    'background-image')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.verifyTextContains'(tCColor, 'rgb(255, 189, 21)')

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/button_Accept terms and conditions'))

'Update this every run. Same value as Step 7 Test data.'
WebUI.verifyElementAttributeValue(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input_Email_username'), 
    'value', 'leandro76@email.com', 0)

WebUI.verifyElementAttributeValue(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__password'), 
    'value', 'Qwer1234!', 0)

WebUI.verifyElementAttributeValue(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/input__confirmPassword'), 
    'value', 'Qwer1234!', 0)

WebUI.click(findTestObject('Archive/TC001_RegisterToTractionTools/Page_Login - Traction Tools/button_Create account'))

WebUI.delay(7)

