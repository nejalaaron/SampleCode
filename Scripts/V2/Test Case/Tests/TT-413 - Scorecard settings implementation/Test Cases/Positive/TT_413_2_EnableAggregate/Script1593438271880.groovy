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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Login/input__username'), username)

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Dashboard/div_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/i_Go to meeting_IconStyles-sc-181ai5j-0 fsp_3689c0'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/a_Advanced settings'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting Settings/span_individual To-Do percent completion_sw_5b18fd'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting Settings/span_team To-Do percent completion_switchIn_588b09'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting Settings/div_Save'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting Settings/div_Go Back'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Go to meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Start Meeting/div_Run meeting as leader'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Run Meeting/button_2 Scorecard'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/div_To-Do Completion'), 2)

WebUI.verifyElementPresent(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/div_Team To-Do'), 2)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Run Meeting/button_7 Conclude'))

WebUI.delay(2)

WebUI.click(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/div_Conclude meeting'))

WebUI.delay(5)

WebUI.closeBrowser()

