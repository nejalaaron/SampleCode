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

String email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(email_prefix, email_domain, 
    randomTextLength)

GlobalVariable.email = email

String[] adminDetails = CustomKeywords.'tt_CustomKeywords.CustomKeywords.RegisterUserViaAPIAndGenerateActivateURL'(email,
	firstname, lastname, phoneNumber, company, onboardingInfoValue, settingsValue, password, GlobalVariable.V2Url)

String activationURL = adminDetails[0]

String orgID = adminDetails[1]

System.out.println('URL: ' + activationURL)

System.out.println('orgID: ' + orgID)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_ActivateNewUser'), [('activationURL') : activationURL, ('email') : GlobalVariable.email
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_SkipCompanyAndPersonalProfileSetup'), [:], FailureHandling.STOP_ON_FAILURE)

