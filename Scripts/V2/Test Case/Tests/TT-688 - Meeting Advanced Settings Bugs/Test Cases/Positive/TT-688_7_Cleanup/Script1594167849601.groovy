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

WebUI.click(findTestObject('V2/TT-413/Page_Meeting Settings/ArchiveMeetingButton'))

WebUI.delay(2)

WebUI.closeBrowser()

