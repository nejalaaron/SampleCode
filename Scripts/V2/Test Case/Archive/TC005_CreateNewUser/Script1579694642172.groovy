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

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/users')

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Dashboard/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Dashboard/div_Manage Users'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Manage Users'), 
    0)

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/button_Add user'))

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/div_Add new user'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_User type'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_First name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Last name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Email address'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Position title'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Supervisor'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Attach to team meeting'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/label_Send user an invite'), 
    0)

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/input_search_userType'))

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/div_Admin'))

'Update this every run.'
WebUI.setText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/input__firstName'), 'TestAdminFirst1')

'Update this every run.'
WebUI.setText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/input__lastName'), 'TestAdminLast1')

'Update this every run.'
WebUI.setText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/input__emailAddress'), 'testadmin1@test.com')

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/input_search_positionTitle'))

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/div_Software Engineer'))

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/span_Send user an invite_checkmark'))

WebUI.click(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/button_Save'))

WebUI.delay(7)

String act_FirstNameVal = WebUI.getText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/user_span_FirstNameValue'))

String act_LastNameVal = WebUI.getText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/user_span_LastNameValue'))

String act_EmailVal = WebUI.getText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/user_span_EmailValue'))

String act_UserTypeVal = WebUI.getText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/user_span_UserTypeValue'))

String act_StatusVal = WebUI.getText(findTestObject('Archive/TC005_CreateNewUser/Page_Manage Users/user_span_StatusValue'))

'Update this every run. Same Data as Step 19.'
WebUI.verifyMatch(act_FirstNameVal, 'TestAdminFirst1', false)

'Update this every run. Same Data as Step 20.'
WebUI.verifyMatch(act_LastNameVal, 'TestAdminLast1', false)

'Update this every run. Same Data as Step 21.'
WebUI.verifyMatch(act_EmailVal, 'testadmin1@test.com', false)

WebUI.verifyMatch(act_UserTypeVal, 'Admin', false)

WebUI.verifyMatch(act_StatusVal, 'INVITE SENT', false)

