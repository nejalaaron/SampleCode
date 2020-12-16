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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/V2/Commons/ManageUsersPage/span_Company Settings'))

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/a_Advance Settings'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/AdvanceSettingsPage/Add_Milestone_Toggle'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/AdvanceSettingsPage/Add_Milestone_Toggle'))

String A_validateMilestoneChecked = WebUI.getAttribute(findTestObject('V2/Commons/AdvanceSettingsPage/Verify_Milestone_Toggle'), 
    'checked')

WebUI.verifyMatch(A_validateMilestoneChecked, 'true', false)

WebUI.click(findTestObject('V2/Commons/AdvanceSettingsPage/Save_Rules'))

WebUI.delay(5)

