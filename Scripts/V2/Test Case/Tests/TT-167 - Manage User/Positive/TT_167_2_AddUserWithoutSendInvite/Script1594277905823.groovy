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

email = CustomKeywords.'tt_CustomKeywords.CustomKeywords.GenerateRandomEmailAddress'(emailAddress_prefix, emailAddress_domain, 
    emailRandomText_Length)

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Login/input__username'), 'aaron+user301@mytractiontools.com')

WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Login/input__password'), 'Qwer123!')

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Dashboard/div_Company Settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Dashboard/a_Manage Users'))

'view profile'
not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_View profile'))

'back button'
not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_User Profile/div_Go Back'))

'3dots'
not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c2'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Edit user'))

not_run: WebUI.sendKeys(findTestObject('V2/TT-167/Page_Manage Users/input__firstName'), Keys.chord(Keys.LEFT_CONTROL, 'a', 
        Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__firstName'), 'Aaron1')

not_run: WebUI.sendKeys(findTestObject('V2/TT-167/Page_Manage Users/input__lastName'), Keys.chord(Keys.LEFT_CONTROL, 'a', 
        Keys.BACK_SPACE))

not_run: WebUI.clearText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__lastName'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__lastName'), 'Nejal1')

not_run: WebUI.click(findTestObject('V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c21'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_QA'))

not_run: WebUI.click(findTestObject('V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c22'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Administrator'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Save'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c2'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Archive'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Archived users'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Current users'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c2'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Archive'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Archived users'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c2'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Unarchive'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Current users'))

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Add user'))

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__orgRole'))

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Employee'))

WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__firstName_1'), 'John')

WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__lastName_1'), 'Doe')

WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__email'), email)

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__position'))

WebUI.click(findTestObject('V2/TT-167/Page_Manage Users/div_QA2'))

WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Create user'))

not_run: WebUI.delay(5)

'3dots'
not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c2'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Edit user'))

not_run: WebUI.sendKeys(findTestObject('V2/TT-167/Page_Manage Users/input__firstName'), Keys.chord(Keys.LEFT_CONTROL, 'a', 
        Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__firstName'), 'Aaron')

not_run: WebUI.sendKeys(findTestObject('V2/TT-167/Page_Manage Users/input__lastName'), Keys.chord(Keys.LEFT_CONTROL, 'a', 
        Keys.BACK_SPACE))

not_run: WebUI.clearText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__lastName'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.setText(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/input__lastName'), 'Nejal')

not_run: WebUI.click(findTestObject('V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c21'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_QA'))

not_run: WebUI.click(findTestObject('V2/TT-167/Page_Manage Users/button_ACTIVE_BtnIconStyles-k8ghfj-0 blxvyk_8ef6c22'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/div_Administrator'))

not_run: WebUI.click(findTestObject('Object Repository/V2/TT-167/Page_Manage Users/button_Save'))

WebUI.delay(15)

WebUI.closeBrowser()

