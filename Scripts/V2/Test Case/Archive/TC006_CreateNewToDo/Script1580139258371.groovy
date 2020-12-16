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

WebUI.click(findTestObject('Archive/TC006_CreateNewToDo/Page_Manage Users/a_Home'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_To-Dos'))

WebUI.click(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/button_To-Dos_sc-gipzik jvqOUy Widget__action'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/label_Done'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/div_Create a To-DoDoneTo-do titleAssign to _14a4fe'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_Create a To-Do'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_To-do title'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_Assign to team meeting'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_Due date'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_Notes'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/Modal_Close_Icon'))

WebUI.setText(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/input_To-do title_sc-gzVnrw dFiVpR'), 
    'Test Todo 1')

WebUI.click(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/textarea_Notes_sc-ifAKCX ewnpZx'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/textarea_Notes_sc-ifAKCX ewnpZx'), 
    'This is a sample todo note.')

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/input_Assign to team meeting_search'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/i_Due date_calendar outline icon sc-EHOje l_68408d'))

WebUI.click(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'))

WebUI.sendKeys(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/input_Due date_sc-dxgOiQ hAAKoR custom-date_b140d6'), 
    '01/28/2020')

WebUI.click(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/label_This is a personal to-do'))

not_run: WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/label_Add attachment'))

WebUI.verifyElementVisible(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/button_Cancel'))

WebUI.click(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/button_Save'))

WebUI.waitForElementPresent(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_ToDoSavedNotification'), 
    0)

WebUI.delay(7)

WebUI.verifyElementText(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_TodoNameRec_Val'), 'Test Todo 1')

WebUI.verifyElementText(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_TodoDueDateRec_Val'), 
    '01/28/2020')

WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_To-Dos'), 0)

WebUI.verifyElementText(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_TodoNameRec_Val'), 'Test Todo 1')

WebUI.verifyElementText(findTestObject('Archive/TC006_CreateNewToDo/Page_Good day leandro42emailcom/span_TodoDueDateRec_Val'), 
    '01/28/2020')

