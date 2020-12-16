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

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Go to meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Start Meeting/div_Run meeting as leader'))

WebUI.click(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/button_2 Scorecard'))

WebUI.verifyElementText(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/AggregateTodoCompletionValue'), '67%', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/AggregateTeamToDo'), '67%', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Run Meeting/button_7 Conclude'))

WebUI.delay(2)

WebUI.click(findTestObject('V2/TT-413/Page_Leadership L10 - Run Meeting/div_Conclude meeting'))

WebUI.delay(5)

WebUI.closeBrowser()

