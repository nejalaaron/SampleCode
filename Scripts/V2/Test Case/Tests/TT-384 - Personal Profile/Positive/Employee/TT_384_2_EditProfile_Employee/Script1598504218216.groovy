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

not_run: WebUI.navigateToUrl(GlobalVariable.V2Url)

not_run: WebUI.maximizeWindow()

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/V2/TT-384/Page_Login/input__username'), GlobalVariable.DefaultTimeout)

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Login/input__username'), GlobalVariable.employee_email)

not_run: WebUI.verifyElementPresent(findTestObject('V2/TT-384/Page_Login/input__password'), GlobalVariable.DefaultTimeout)

not_run: WebUI.setText(findTestObject('V2/TT-384/Page_Login/input__password'), GlobalVariable.password)

not_run: WebUI.click(findTestObject('V2/TT-384/Page_Login/div_Login'))

WebUI.verifyElementPresent(findTestObject('V2/TT-384/Page_Dashboard/button_Aaron Nejal'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Dashboard/button_Aaron Nejal'))

WebUI.verifyElementPresent(findTestObject('V2/TT-384/Page_Dashboard/button_View profile'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Dashboard/button_View profile'))

WebUI.verifyElementPresent(findTestObject('V2/TT-384/Page_Profile/input__firstName'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__firstName'))

WebUI.sendKeys(findTestObject('V2/TT-384/Page_Profile/input__firstName'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__firstName'), 'Employee')

WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'))

WebUI.sendKeys(findTestObject('V2/TT-384/Page_Profile/input__lastName'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.clearText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'))

WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'), 'Traction')

WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__phoneNumber'))

WebUI.sendKeys(findTestObject('V2/TT-384/Page_Profile/input__phoneNumber'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__phoneNumber'), '09222222222')

WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

WebUI.delay(5)

not_run: WebUI.verifyElementPresent(findTestObject('V2/TT-384/Page_Profile/input__firstName'), GlobalVariable.DefaultTimeout)

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__firstName'))

not_run: WebUI.sendKeys(findTestObject('V2/TT-384/Page_Profile/input__firstName'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__firstName'), 'Admin')

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'))

not_run: WebUI.sendKeys(findTestObject('V2/TT-384/Page_Profile/input__lastName'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

not_run: WebUI.clearText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'))

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'), 'Traction')

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__phoneNumber'))

not_run: WebUI.sendKeys(findTestObject('V2/TT-384/Page_Profile/input__phoneNumber'), Keys.chord(Keys.LEFT_CONTROL, 'a', 
        Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__phoneNumber'), '09222222221')

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__firstName'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__lastName'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__phoneNumber'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/span_Receive To-Do email reminders_switchIn_1de98b'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/span_Receive To-Do email reminders_switchIn_ddc8da'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_pm_todoReminderTime'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_ampm1200'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Reminder frequency_todoReminderFrequency'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Every other day'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Reminder frequency_todoReminderFrequency'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Daily'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.click(findTestObject('V2/TT-384/Page_Profile/i_Specify which meetings you would like to 1'))

not_run: WebUI.click(findTestObject('V2/TT-384/Page_Profile/i_Specify which meetings you would like to 1'))

not_run: WebUI.click(findTestObject('V2/TT-384/Page_Profile/i_Specify which meetings you would like to 1'))

not_run: WebUI.click(findTestObject('V2/TT-384/Page_Profile/i_Specify which meetings you would like to 1'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/i_Specify which meetings you would like to _d78c9b'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/i_Specify which meetings you would like to _d78c9b'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/i_Specify which meetings you would like to _d78c9b'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/i_Specify which meetings you would like to _d78c9b'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__timeZone'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_AsiaMakassar'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Date format_dateFormat'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_DDMMYYYY'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Time format_timeFormat'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_24 hour clock'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Number format_numberFormat'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_-100099 Euro'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input__timeZone'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_AsiaManila'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Date format_dateFormat'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_MMDDYYYY'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Time format_timeFormat'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_12 hour clock'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/input_Number format_numberFormat'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_-100099 US'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

not_run: WebUI.setText(findTestObject('Page_Profile/input__currentPassword'), 'Qwer123!')

not_run: WebUI.setText(findTestObject('Page_Profile/input__newPassword'), 'Qwer123!')

not_run: WebUI.setText(findTestObject('Page_Profile/input__newPasswordRepeat'), 'Qwer123!')

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-384/Page_Profile/div_Save'))

