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

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/')

WebUI.verifyElementPresent(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Good day TESTLF111emailcom/a_Home'), 
    0)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Good day TESTLF111emailcom/a_Meetings'))

String act_MeetURL = WebUI.getUrl()

WebUI.verifyMatch(act_MeetURL, 'https://meetingmasterdev.azurewebsites.net/meetings', false)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_My meetings/a_Team Workspaces'))

String act_WSURL = WebUI.getUrl()

WebUI.verifyMatch(act_WSURL, 'https://meetingmasterdev.azurewebsites.net/workspaces', false)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Team Workspaces/a_VTO'))

String act_VTOURL = WebUI.getUrl()

WebUI.verifyMatch(act_VTOURL, 'https://meetingmasterdev.azurewebsites.net/vto', false)

WebUI.verifyElementPresent(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_VTO/a_Accountability Chart'), 
    0)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_VTO/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_VTO/div_Manage Users'))

String act_UsersURL = WebUI.getUrl()

WebUI.verifyMatch(act_UsersURL, 'https://meetingmasterdev.azurewebsites.net/users', false)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_VTO/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_Company Profile'))

String act_CompanyProfileURL = WebUI.getUrl()

WebUI.verifyMatch(act_CompanyProfileURL, 'https://meetingmasterdev.azurewebsites.net/company-profile', false)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_VTO/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_Billing'))

String act_BillingURL = WebUI.getUrl()

WebUI.verifyMatch(act_BillingURL, 'https://meetingmasterdev.azurewebsites.net/billing', false)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_VTO/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_Advanced Settings'))

String act_AdvanceSettingsURL = WebUI.getUrl()

WebUI.verifyMatch(act_AdvanceSettingsURL, 'https://meetingmasterdev.azurewebsites.net/advanced-settings', false)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/a_Knowledge  Support'))

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_FAQ'))

WebUI.switchToWindowIndex(1)

String act_FAQURL = WebUI.getUrl()

WebUI.verifyMatch(act_FAQURL, 'https://tractiontools.happyfox.com/home/', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_Youtube Channel'))

WebUI.switchToWindowIndex(1)

String act_YT_ChannelURL = WebUI.getUrl()

WebUI.verifyMatch(act_YT_ChannelURL, 'https://www.youtube.com/channel/UCfM_bMyqs66VZo3Hx8uiepQ', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_Contact Support'))

WebUI.switchToWindowIndex(1)

String act_ContactURL = WebUI.getUrl()

WebUI.verifyMatch(act_ContactURL, 'https://tractiontools.happyfox.com/new', false)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.verifyElementPresent(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Manage Users/div_TESTLF111emailcomAdmin'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Profile/div_Traction ToolsSwitch'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC014_ValidateNavbarOptions/Page_Profile/a_Collapse Menu'), 
    0)

