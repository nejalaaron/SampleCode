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

WebUI.click(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/a_Home'))

WebUI.click(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Good day leandro60emailcom/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Good day leandro60emailcom/div_Manage Users'))

WebUI.click(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/button_INVITE SENT_ui icon button option-button'))

WebUI.click(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/button_INVITE SENT_sc-bdVaJa GKMR'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/div_Send invite'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/div_Send invite_sc-cIShpX kHRugO'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/div_Send inviteSend an invite directly to t_2fe9ca'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/button_Send Invite'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/button_Copy embedded link'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/button_Cancel'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/i_People Headline_close icon'), 
    0)

WebUI.click(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/button_Send Invite'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Archive/TC012_ManageUsers_SendInvite/Page_Manage Users/span_Invite Sent'), 0)

