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
import java.util.regex.Pattern as Pattern
import java.util.regex.Matcher as Matcher

email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(emailAddress_prefix, emailAddress_domain, 
    emailRandomText_Length)

GlobalVariable.email = email

GlobalVariable.password = password

WebUI.click(findTestObject('V2/Commons/LoginPage/a_Register here'))

WebUI.setText(findTestObject('V2/Commons/RegistrationPage/input_Invite code_inviteC0de'), inviteCode)

WebUI.setText(findTestObject('V2/Commons/RegistrationPage/input_First Name_firstName'), firstName)

WebUI.setText(findTestObject('V2/Commons/RegistrationPage/input_Last Name_lastName'), lastName)

WebUI.setText(findTestObject('V2/Commons/RegistrationPage/input_Email_email'), email)

WebUI.setText(findTestObject('V2/Commons/RegistrationPage/input_Phone Number_phoneNumber'), phoneNumber)

WebUI.setText(findTestObject('V2/Commons/RegistrationPage/input_Company Name_companyName'), company)

WebUI.click(findTestObject('V2/Commons/RegistrationPage/input_How did you hear about us_howDidYouHe_d3c5a8'))

TestObject d_howDoyouHearAboutUsObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(howDoYouHearAbtUsOpt_Obj, 
    howDoYouHearAbtUsOpt_Val, 'xpath')

WebUI.click(d_howDoyouHearAboutUsObj)

WebUI.verifyElementClickable(findTestObject('V2/Commons/RegistrationPage/div_Continue'))

WebUI.click(findTestObject('V2/Commons/RegistrationPage/div_Continue'))

WebUI.verifyElementVisibleInViewport(findTestObject('V2/Commons/RegistrationPage/h1_You are on your way to productive meetings'), 
    GlobalVariable.DefaultTimeout)

WebUI.delay(90)

emailContent = CustomKeywords.'com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent'('tractiontools.user001@gmail.com', 
    'Qwer123!', 'Inbox')

String acvitation_url = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GetTTActivationURL'(emailContent)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ActivateNewUser'), [('activationURL') : acvitation_url, ('email') : email
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

