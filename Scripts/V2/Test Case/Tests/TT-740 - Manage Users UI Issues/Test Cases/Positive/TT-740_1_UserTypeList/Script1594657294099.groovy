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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.setText(findTestObject('V2/TT-740/Page_Login/input__username'), username)

WebUI.setText(findTestObject('V2/TT-740/Page_Login/input__password'), password)

WebUI.click(findTestObject('V2/TT-740/Page_Login/div_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('V2/TT-740/Page_Dashboard/NavBar_CompanySettings'))

WebUI.click(findTestObject('V2/TT-740/Page_Dashboard/NavBar_ManageUsers'))

WebUI.click(findTestObject('V2/TT-740/Page_Manage Users/AddUserButton'))

WebUI.click(findTestObject('V2/TT-740/Page_Manage Users/AddNewUserDrawer_UserTypeDropdown'))

WebUI.verifyElementText(findTestObject('V2/TT-740/Page_Manage Users/AddNewUserDrawer_UserTypeDropdownOption1'), 'Employee')

WebUI.verifyElementText(findTestObject('V2/TT-740/Page_Manage Users/AddNewUserDrawer_UserTypeDropdownOption2'), 'Supervisor')

WebUI.verifyElementText(findTestObject('V2/TT-740/Page_Manage Users/AddNewUserDrawer_UserTypeDropdownOption3'), 'Administrator')

WebUI.click(findTestObject('V2/TT-740/Page_Manage Users/AddNewUserDrawer_CloseButton'))

WebUI.click(findTestObject('V2/TT-740/Page_Manage Users/ShowMenuItems'))

WebUI.click(findTestObject('V2/TT-740/Page_Manage Users/EditUser'))

WebUI.scrollToElement(findTestObject('V2/TT-740/Page_Manage Users/CardUserType'), 0)

WebUI.click(findTestObject('V2/TT-740/Page_Manage Users/CardUserType'))

WebUI.verifyElementText(findTestObject('V2/TT-740/Page_Manage Users/CardUserTypeEmployee'), 'Employee')

WebUI.verifyElementText(findTestObject('V2/TT-740/Page_Manage Users/CardUserTypeSupervisor'), 'Supervisor')

WebUI.verifyElementText(findTestObject('V2/TT-740/Page_Manage Users/CardUserTypeAdmin'), 'Administrator')

WebUI.closeBrowser()

