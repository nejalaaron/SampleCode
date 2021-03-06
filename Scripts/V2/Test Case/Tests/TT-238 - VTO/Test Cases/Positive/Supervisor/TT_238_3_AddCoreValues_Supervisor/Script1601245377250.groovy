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

WebUI.waitForElementVisible(findTestObject('V2/TT-238/VTO'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-238/VTO'))

WebUI.waitForElementVisible(findTestObject('V2/TT-238/VTO_AddCoreValues'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/TT-238/VTO_AddCoreValues'), GlobalVariable.DefaultTimeout)

String A_addcoreValues = WebUI.getAttribute(findTestObject('V2/TT-238/VTO_AddCoreValues'), 'contenteditable')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(A_addcoreValues, 'false')

String A_addcoreValues2 = WebUI.getAttribute(findTestObject('V2/TT-238/VTO_AddCoreValues2'), 'contenteditable')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(A_addcoreValues2, 'false')

String A_addcoreValues3 = WebUI.getAttribute(findTestObject('V2/TT-238/VTO_AddCoreValues3'), 'contenteditable')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.VerifyTextContains'(A_addcoreValues3, 'false')

WebUI.delay(5)

