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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.*

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_RegisterAndActivateTTUsers'), [('admin_fname') : admin_fname
        , ('lastname') : lastname, ('phonenumber') : '9999999999', ('company') : 'Traction Tools', ('password') : GlobalVariable.password
        , ('admin_email_prefix') : admin_email_prefix, ('admin_email_domain') : admin_email_domain, ('randomTextLength') : randomTextLength
        , ('supervisor_fname') : supervisor_fname, ('employee_fname') : employee_fname, ('supervisor_email_prefix') : supervisor_email_prefix
        , ('supervisor_email_domain') : supervisor_email_domain, ('supervisor_positionTitle') : supervisor_positionTitle
        , ('employee_email_prefix') : employee_email_prefix, ('employee_email_domain') : employee_email_domain, ('employee_positionTitle') : employee_positionTitle], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

String path = System.getProperty('user.dir')

System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

WebDriver driver1 = new ChromeDriver()

DriverFactory.changeWebDriver(driver1)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebDriver driver2 = new ChromeDriver()

DriverFactory.changeWebDriver(driver2)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.supervisor_email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebDriver driver3 = new ChromeDriver()

DriverFactory.changeWebDriver(driver3)

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.employee_email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver1)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-373 - Company Profile/Test Cases/Positive/Admin/TT_373_1_UpdateValuesInProfileSection_Admin'), 
    [('username') : '', ('password') : '', ('companyName') : companyName, ('companyIndustry') : companyIndustry, ('companyPhoneNumber') : companyPhoneNumber
        , ('numOfEmployees') : numOfEmployees, ('companyIndustry_Obj') : '//div[@aria-label=\'Industry\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('numOfEmployees_Obj') : '//div[@aria-label=\'Number of employees in the company\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('rnd_stringLength') : rnd_stringLength], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver2)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-373 - Company Profile/Test Cases/Positive/Supervisor/TT_373_1_UpdateValuesInProfileSection_Supervisor'), 
    [('username') : '', ('password') : '', ('companyName') : companyName, ('companyIndustry') : companyIndustry, ('companyPhoneNumber') : companyPhoneNumber
        , ('numOfEmployees') : numOfEmployees, ('companyIndustry_Obj') : '//div[@aria-label=\'Industry\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('numOfEmployees_Obj') : '//div[@aria-label=\'Number of employees in the company\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('rnd_stringLength') : rnd_stringLength], FailureHandling.STOP_ON_FAILURE)

DriverFactory.changeWebDriver(driver3)

WebUI.callTestCase(findTestCase('V2/Test Case/Tests/TT-373 - Company Profile/Test Cases/Positive/Employee/TT_373_1_UpdateValuesInProfileSection_Employee'), 
    [('username') : '', ('password') : '', ('companyName') : companyName, ('companyIndustry') : companyIndustry, ('companyPhoneNumber') : companyPhoneNumber
        , ('numOfEmployees') : numOfEmployees, ('companyIndustry_Obj') : '//div[@aria-label=\'Industry\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('numOfEmployees_Obj') : '//div[@aria-label=\'Number of employees in the company\']//span[text()=\'%s\']/parent::div[@role=\'option\']'
        , ('rnd_stringLength') : rnd_stringLength], FailureHandling.STOP_ON_FAILURE)


CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver3)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver2)

CustomKeywords.'tt_CustomKeywords.CustomKeywords.CloseWebDriver'(driver1)