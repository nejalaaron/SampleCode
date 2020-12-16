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

WebUI.click(findTestObject('Object Repository/V2/Commons/ManageUsersPage/span_Company Settings'))

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/a_Manage Users'))

TestObject showMenuItemsObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(showMenuItemsPath, 
    user_email, 'xpath')

WebUI.click(showMenuItemsObj)

WebUI.click(findTestObject('Object Repository/V2/Commons/ManageUsersPage/div_Edit user'))

WebUI.verifyElementPresent(findTestObject('V2/Commons/ManageUsersPage/div_PositionTitle'), GlobalVariable.DefaultTimeout)

WebUI.setText(findTestObject('V2/Commons/ManageUsersPage/position_title_input'), position_title)

WebUI.sendKeys(findTestObject('V2/Commons/ManageUsersPage/position_title_input'), Keys.chord(Keys.ENTER))

if(permissionValue == 'Employee') {
	WebUI.verifyElementPresent(findTestObject('V2/Commons/ManageUsersPage/supervisor_input'), GlobalVariable.DefaultTimeout)
	
	WebUI.setText(findTestObject('V2/Commons/ManageUsersPage/supervisor_input'), user_supervisorName)
	
	WebUI.sendKeys(findTestObject('V2/Commons/ManageUsersPage/supervisor_input'), Keys.chord(Keys.ENTER))
}




WebUI.verifyElementPresent(findTestObject('Object Repository/V2/Commons/ManageUsersPage/div_User type'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/Commons/ManageUsersPage/input__orgRole'))

TestObject roleOptionObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(roleOption, permissionValue, 
    'xpath')

WebUI.click(roleOptionObj)

WebUI.click(findTestObject('Object Repository/V2/Commons/ManageUsersPage/div_Save'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/ManageUsersPage/h3_User Saved'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/Commons/ManageUsersPage/h3_User Saved'))

