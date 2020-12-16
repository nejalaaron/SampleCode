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

WebUI.navigateToUrl(activationURL)

WebUI.waitForElementVisible(findTestObject('V2/Commons/ActivationPage/input_Email_email'), GlobalVariable.DefaultTimeout)

actual_email = WebUI.getAttribute(findTestObject('Object Repository/V2/Commons/ActivationPage/input_Email_email'), 'value')

WebUI.verifyMatch(actual_email, email, false)

WebUI.setText(findTestObject('V2/Commons/ActivationPage/input_password'), password)

WebUI.setText(findTestObject('Object Repository/V2/Commons/ActivationPage/input__passwordRepeat'), password)

WebUI.click(findTestObject('V2/Commons/ActivationPage/input_termsandconditions'))

WebUI.click(findTestObject('Object Repository/V2/Commons/ActivationPage/div_Create account'))

WebUI.waitForElementPresent(findTestObject('V2/Commons/DasboardPage_SidebarMenu/img_Home_logo-big'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementPresent(findTestObject('V2/Commons/DasboardPage_SidebarMenu/img_Home_logo-big'), 0)

