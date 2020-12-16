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

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/users')

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/a_Home'))

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Good day leandro60emailcom/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Good day leandro60emailcom/div_Manage Users'))

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/button_INVITE SENT_ui icon button option-button'))

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/button_INVITE SENT_sc-bdVaJa GKMR'))

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/div_Archive user'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/img_Archive user_ui circular image'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_TestAdminFirst1Change TestAdminLast1Change'), 
    0)

WebUI.verifyElementText(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_If you wish to archive user and not lo_425487'), 
    'If you wish to archive user and not loose any of their assigned information, reassign their rocks and scorecards to another user.')

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Reassign rocks to'), 
    0)

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/i_Choose a user or choose none_dropdown icon'))

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/div_Item 1'))

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Reassign scorecards to'), 
    0)

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/input_Reassign scorecards to_search'))

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Item 1'))

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/button_Cancel'), 
    0)

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/button_Archive user'))

WebUI.delay(3)

WebUI.click(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/a_Archived users'))

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_First Name'), 
    0)

WebUI.verifyElementText(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_TestAdminFirst1Change'), 
    'TestAdminFirst1Change')

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Last Name'), 
    0)

WebUI.verifyElementText(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_TestAdminLast1Change'), 
    'TestAdminLast1Change')

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Email Address'), 
    0)

WebUI.verifyElementText(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_testadmin1changetestcom'), 
    'testadmin1change@test.com')

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_User Type'), 
    0)

WebUI.verifyElementText(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Supervisor'), 
    'Supervisor')

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Supervisor'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_Status'), 
    0)

WebUI.verifyElementText(findTestObject('Archive/TC013_ManageUsers_ArchiveUser/Page_Manage Users/span_INVITE SENT'), 
    'INVITE SENT')

