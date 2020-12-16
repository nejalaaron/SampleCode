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

email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(emailAddress_prefix, emailAddress_domain, 
    emailRandomText_Length)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToURL'), [('URL') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/TT-339/Page_Login/a_Register here'))

WebUI.waitForElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/h1_Sign up for your free 30 day trial'), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Invite code'))

WebUI.setText(findTestObject('Object Repository/V2/TT-339/Page_Register/input_Invite code_inviteC0de'), inviteCode)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_First Name'))

WebUI.setText(findTestObject('Object Repository/V2/TT-339/Page_Register/input_First Name_firstName'), firstName)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Last Name'))

WebUI.setText(findTestObject('Object Repository/V2/TT-339/Page_Register/input_Last Name_lastName'), lastName)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Email'))

WebUI.setText(findTestObject('Object Repository/V2/TT-339/Page_Register/input_Email_email'), email)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Phone Number'))

WebUI.setText(findTestObject('Object Repository/V2/TT-339/Page_Register/input_Phone Number_phoneNumber'), phoneNumber)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Company Name'))

WebUI.setText(findTestObject('Object Repository/V2/TT-339/Page_Register/input_Company Name_companyName'), company)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_How did you hear about us'))

WebUI.click(findTestObject('Object Repository/V2/TT-339/Page_Register/input_How did you hear about us_howDidYouHe_d3c5a8'))

TestObject d_howDoyouHearAboutUsObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(howDoYouHearAbtUsOpt_Obj, 
    howDoYouHearAbtUsOpt_Val, 'xpath')

WebUI.click(d_howDoyouHearAboutUsObj)

WebUI.waitForElementVisible(findTestObject('V2/TT-339/Page_Register/div_implementer_label_name'), 10)

WebUI.focus(findTestObject('V2/TT-339/Page_Register/input_implementer_existingTTClient'))

WebUI.setText(findTestObject('V2/TT-339/Page_Register/input_implementer_existingTTClient'), existingTTClient)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Go Back'))

WebUI.verifyElementClickable(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Continue'))

WebUI.click(findTestObject('Object Repository/V2/TT-339/Page_Register/div_Continue'))

WebUI.verifyElementVisibleInViewport(findTestObject('Object Repository/V2/TT-339/Page_Register/h1_You are on your way to productive meetings'), 
    GlobalVariable.DefaultTimeout)

