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

not_run: WebUI.navigateToUrl('http://meetingmasterdev.azurewebsites.net/users')

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/a_Home'))

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Good day leandro44emailcom/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Good day leandro44emailcom/div_Manage Users'))

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/a_Current users'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/a_Archived users'), 
    0)

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/button_INVITE SENT_ui icon button option-button'))

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/button_INVITE SENT_ViewProfile'))

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/img_Manage Users_ui circular image'))

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_TestAdminFirst1 TestAdminLast1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Software Engineer'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_testadmin1testcom'), 
    0)

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/i_Manage Users_ellipsis vertical icon sc-EH_788eb2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/div_Edit user'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Archive user'), 
    0)

WebUI.click(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Roles'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Roles'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/div_1 LMA 2 Back end developer 3 Front end _a9b2b5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Rocks'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/div_Leadership L10Leadership L10 Lorem ipsu_68ae82'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Meetings'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/div_1 Leadership L10 2 Technology L10'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Scorecard measurables'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/th_Measurable'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/th_weekly goal'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/th_admin'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_Issues'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/div_Leadership L10Lorem ipsum dolor sit ame_25cffa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/span_To-dos'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/div_Technology L10Lorem ipsum dolor sit ame_ff5ce4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC010_ManageUsers/Page_Manage Users/button_View archived rocks'), 
    0)

