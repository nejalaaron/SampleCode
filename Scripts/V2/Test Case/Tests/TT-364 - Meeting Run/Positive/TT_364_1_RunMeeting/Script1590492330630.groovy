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

WebUI.navigateToUrl('http://localhost:5000/')

WebUI.setText(findTestObject('Object Repository/V2/TT-364/Page_Login/input__username'), 'jeff+020@mytractiontools.com')

WebUI.setEncryptedText(findTestObject('Object Repository/V2/TT-364/Page_Login/input__password'), 'pB4+8iIXiKX8SOL7p0f9pg==')

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Dashboard/div_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Meeting/div_Go to meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Start Meeting/div_Run meeting as leader'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_2 Scorecard'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_3 Rocks'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_4 People Headlines'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_5 To-Dos'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_6 IDS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_7 Conclude'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/input_Rate your meeting in a scale from 1-1_ced1f9'), 
    '10')

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/div_Conclude meeting'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/div_Leave meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-364/Page_Friday - Run Meeting/button_EveryFridayat800am(AsiaManila)_BtnIc_39c7c1'))

WebUI.closeBrowser()

