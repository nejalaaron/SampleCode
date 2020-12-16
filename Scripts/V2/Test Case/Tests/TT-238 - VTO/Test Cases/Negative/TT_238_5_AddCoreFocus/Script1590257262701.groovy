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

WebUI.delay(7)

WebUI.waitForElementClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 
    30)

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__username'), 'jeff+011@mytractiontools.com')

WebUI.setText(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/input__password'), 'Skyline69A*')

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Login/div_Login'))

WebUI.click(findTestObject('V2/TT-238/VTO'))

WebUI.click(findTestObject('V2/TT-238/VTO_AddCoreFocus'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus'), '`~!@#$%^&*()-=_+[]{};:\'",<.>/?|')

WebUI.click(findTestObject('V2/TT-238/VTO_AddCoreFocus2'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus2'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus2'), '`~!@#$%^&*()-=_+[]{};:\'",<.>/?|')

WebUI.click(findTestObject('V2/TT-238/VTO_AddCoreFocus3'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus3'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus3'), '`~!@#$%^&*()-=_+[]{};:\'",<.>/?|')

WebUI.click(findTestObject('V2/TT-238/VTO_AddCoreFocus4'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus4'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddCoreFocus4'), '`~!@#$%^&*()-=_+[]{};:\'",<.>/?|')

