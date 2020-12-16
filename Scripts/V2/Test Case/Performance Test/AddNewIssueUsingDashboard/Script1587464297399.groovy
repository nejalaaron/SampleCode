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

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl(GlobalVariable.V2Url)

not_run: WebUI.setText(findTestObject('V2/Functions/AddNewIssue/Page_Login/input__username'), username)

not_run: WebUI.setText(findTestObject('V2/Functions/AddNewIssue/Page_Login/input__password'), password)

not_run: WebUI.click(findTestObject('V2/Functions/AddNewIssue/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/Functions/AddNewIssue/Page_Dashboard/button_Issue'))

WebUI.delay(20)

WebUI.setText(findTestObject('Object Repository/V2/Functions/AddNewIssue/Page_Dashboard/input__title'), issue_name)

WebUI.click(findTestObject('Object Repository/V2/Functions/AddNewIssue/Page_Dashboard/input__meetingIds'))

WebUI.click(findTestObject('Object Repository/V2/Functions/AddNewIssue/Page_Dashboard/span_Test L10 Meeting'))

WebUI.click(findTestObject('Object Repository/V2/Functions/AddNewIssue/Page_Dashboard/div_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/V2/Functions/AddNewIssue/Page_Dashboard/h3_Issue Saved'), 
    0)

