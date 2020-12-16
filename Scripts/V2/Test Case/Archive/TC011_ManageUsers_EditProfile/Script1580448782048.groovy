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

not_run: WebUI.navigateToUrl('http://meetingmasterdev.azurewebsites.net/users/7325b2a9-7e03-4edd-be92-8c878584566b')

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Good day leandro60emailcom/a_Home'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Good day leandro60emailcom/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Good day leandro60emailcom/div_Manage Users'))

WebUI.switchToWindowTitle('Manage Users')

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/button_INVITE SENT_ui icon button option-button'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/button_INVITE SENT_sc-bdVaJa GKMR'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_First Name'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_Last Name'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_Email Address'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_Status'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_Job Title'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_User Type'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_Supervisor'))

WebUI.sendKeys(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_First Name_firstName'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_First Name_firstName'), 
    'TestAdminFirst1Change')

WebUI.sendKeys(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_Last Name_lastName'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_Last Name_lastName'), 
    'TestAdminLast1Change')

WebUI.sendKeys(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_Email Address_email'), Keys.chord(
        Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_Email Address_email'), 
    'testadmin1change@test.com')

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/span_INVITE SENT'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_Job Title_search'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/div_Product Owner'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_UserType_search'))

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/div_Supervisor'))

WebUI.verifyElementPresent(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/input_Supervisor_search'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/button_Cancel'), 
    0)

WebUI.click(findTestObject('Archive/TC011_ManageUsers_EditProfile/Page_Manage Users/button_Save'))

WebUI.delay(5)

