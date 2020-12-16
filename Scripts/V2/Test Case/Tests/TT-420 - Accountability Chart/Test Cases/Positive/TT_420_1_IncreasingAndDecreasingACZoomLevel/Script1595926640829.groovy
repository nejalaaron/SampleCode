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

WebUI.waitForElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h1_Accountability Chart Traction Tools'), 
    30)

WebUI.verifyElementVisible(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/h1_Accountability Chart Traction Tools'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Reset'))

String initial_zoomLevel = WebUI.getText(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomLevel_Span'))

String initial_AC_Scale = WebUI.getAttribute(findTestObject('V2/TT-420/Page_Accountability Chart/ACObjectContainer_g'), 
    'transform')

WebUI.click(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomOut_button'))

WebUI.click(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomOut_button'))

String afterZoomOut_zoomLevel = WebUI.getText(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomLevel_Span'))

String afterZoomOut_AC_Scale = WebUI.getAttribute(findTestObject('V2/TT-420/Page_Accountability Chart/ACObjectContainer_g'), 
    'transform')

WebUI.verifyNotMatch(afterZoomOut_zoomLevel, initial_zoomLevel, false)

WebUI.verifyNotMatch(afterZoomOut_AC_Scale, initial_AC_Scale, false)

WebUI.click(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomIn_button'))

String afterZoomIn_zoomLevel = WebUI.getText(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomLevel_Span'))

String afterZoomIn_AC_Scale = WebUI.getAttribute(findTestObject('V2/TT-420/Page_Accountability Chart/ACObjectContainer_g'), 
    'transform')

WebUI.verifyNotMatch(afterZoomIn_zoomLevel, afterZoomOut_zoomLevel, false)

WebUI.verifyNotMatch(afterZoomIn_zoomLevel, initial_zoomLevel, false)

WebUI.verifyNotMatch(afterZoomIn_AC_Scale, afterZoomOut_AC_Scale, false)

WebUI.verifyNotMatch(afterZoomIn_AC_Scale, initial_AC_Scale, false)

WebUI.click(findTestObject('Object Repository/V2/TT-420/Page_Accountability Chart/div_Reset'))

String afterReset_zoomLevel = WebUI.getText(findTestObject('V2/TT-420/Page_Accountability Chart/ZoomLevel_Span'))

String afterReset_AC_Scale = WebUI.getAttribute(findTestObject('V2/TT-420/Page_Accountability Chart/ACObjectContainer_g'), 
    'transform')

WebUI.verifyMatch(afterReset_zoomLevel, initial_zoomLevel, false)

WebUI.verifyMatch(afterReset_AC_Scale, initial_AC_Scale, false)

