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

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/activate')

WebUI.click(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Test Todo 1'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Edit to-do'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/label_Done'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_To-do title'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Assign to team meeting'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Due date'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Notes'))

WebUI.sendKeys(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/input_To-do title_sc-gzVnrw dFiVpR'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/input_To-do title_sc-gzVnrw dFiVpR'), 
    'Test Todo 1 Change')

WebUI.sendKeys(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    '01/30/2020')

WebUI.sendKeys(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/label_This is a personal to-do'))

WebUI.setText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/textarea_Notes_sc-ifAKCX ewnpZx'), 
    'Notes Change 1')

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/label_Add attachment'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/i_Good day leandro43emailcom_close icon sc-_dd4ad9'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/button_Update'))

WebUI.waitForElementPresent(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_ToDoSavedNotification'), 
    0)

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Test Todo 1'), 'Test Todo 1 Change')

WebUI.verifyElementText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_DueDateVal'), '01/30/2020')

WebUI.click(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_doneCheckbox'))

WebUI.verifyElementText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Congrats You completed over 90 of your todos'), 
    'Congrats! You completed over 90% of your todos.')

String strikeThroughStatus = WebUI.getCSSValue(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Test Todo 1'), 
    'text-decoration')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.verifyTextContains'(strikeThroughStatus, 'line-through')

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_To-Dos'), 0)

WebUI.verifyElementText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Test Todo 1'), 'Test Todo 1 Change')

WebUI.verifyElementText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_DueDateVal'), '01/30/2020')

WebUI.click(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_doneCheckbox'))

WebUI.verifyElementText(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Congrats You completed over 90 of your todos'), 
    'Congrats! You completed over 90% of your todos.')

String strikeThroughStatus2 = WebUI.getCSSValue(findTestObject('Archive/TC007_EditToDoRecord/Page_Good day leandro43emailcom/span_Test Todo 1'), 
    'text-decoration')

CustomKeywords.'tt_CustomKeywords.CustomKeywords.verifyTextContains'(strikeThroughStatus2, 'line-through')

