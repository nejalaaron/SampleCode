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

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToURL'), [('URL') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : username
        , ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Dashboard/span_Accountability Chart'))

WebUI.waitForElementVisible(findTestObject('V2/TT-420/Page_Accountability Chart/h1_Accountability Chart Traction Tools'), 
    30)

WebUI.verifyElementVisible(findTestObject('V2/TT-420/Page_Accountability Chart/h1_Accountability Chart Traction Tools'), 
    FailureHandling.STOP_ON_FAILURE)

TestObject newFunction_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(newFunctionPath, newSeatName, 
    'xpath')

TestObject newFunctionMoreOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(newFuncMoreOptPath, 
    newSeatName, 'xpath')

Boolean newFuncExist = WebUI.waitForElementPresent(newFunction_Obj, 30)

if (newFuncExist) {
    WebUI.click(newFunctionMoreOpt_Obj)

    WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Delete'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h1_Delete seat'))

    WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Delete'))

    WebUI.waitForElementPresent(findTestObject('V2/TT-420/Page_Accountability Chart/h3_Seat deleted'), 30)

    WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h3_Seat deleted'))
} else {
    WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Add independent function'))

    WebUI.waitForElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h3_Function created'), 
        30)

    WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h3_Function created'), 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('V2/TT-420/Page_Accountability Chart/ACNewFunction_foreignObject'))

    WebUI.click(findTestObject('V2/TT-420/Page_Accountability Chart/moreOptions_icon'))

    WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/button_Edit'))

    WebUI.waitForElementPresent(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h2_Edit seat'), 30)

    WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h2_Edit seat'), FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('V2/TT-420/Page_Accountability Chart/Seatname_input'), newSeatName)

    WebUI.sendKeys(findTestObject('V2/TT-420/Page_Accountability Chart/Seatname_input'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('V2/TT-420/Page_Accountability Chart/EditSeatEmployee_dropdown'))

    TestObject editSeatEmpOption_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editSeatEmpOptionPath, 
        employeeName, 'xpath')

    WebUI.click(editSeatEmpOption_Obj)

    WebUI.click(findTestObject('V2/TT-420/Page_Accountability Chart/UpdateSeat_Btn'))

    WebUI.waitForElementPresent(findTestObject('V2/TT-420/Page_Accountability Chart/h3_seat_updated'), 30)

    WebUI.verifyElementVisible(findTestObject('V2/TT-420/Page_Accountability Chart/h3_seat_updated'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(newFunction_Obj, FailureHandling.STOP_ON_FAILURE)

    WebUI.click(newFunctionMoreOpt_Obj)

    WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Delete'))

    WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h1_Delete seat'))

    WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Delete'))

    WebUI.waitForElementPresent(findTestObject('V2/TT-420/Page_Accountability Chart/h3_Seat deleted'), 30)

    WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h3_Seat deleted'))
}

