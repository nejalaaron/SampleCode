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

WebUI.setText(findTestObject('Object Repository/V2/TT-766/Page_Login/input__username'), username)

WebUI.setText(findTestObject('Object Repository/V2/TT-766/Page_Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Dashboard/div_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Meeting/div_Go to meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Start Meeting/div_Run meeting as leader'))

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/button_5 To-Dos'))

WebUI.waitForElementPresent(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/div_To-do 001'), 
    GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/div_To-do 001'))

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/input_Due date_dueTimestamp-68a62aaa-f3d6-4_4399d4'))

WebUI.waitForElementPresent(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/i_Sa_IconStyles-sc-181ai5j-0 fspyWU icon-ch_b7107a'), 
    10)

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/i_Sa_IconStyles-sc-181ai5j-0 fspyWU icon-ch_b7107a'))

WebUI.waitForElementPresent(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/div_17'), 10)

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/div_17'))

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/CloseTodoInlineEditor'))

WebUI.verifyElementPresent(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo1_LateTag'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo1_LateTag'), 'Late')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDoAgendaCompletion'), '0% completed')

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo1Checkbox'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDoAgendaCompletion'), '25% completed')

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo2Checkbox'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDoAgendaCompletion'), '50% completed')

WebUI.delay(5)

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo4Checkbox'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDoAgendaCompletion'), '75% completed')

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/SidebarToDo'))

WebUI.setText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/CreateTodoDrawer_TodoTitle'), 'To-Do 005')

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/CreateTodoDrawer_SaveButton'))

WebUI.verifyElementPresent(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo005_NewTag'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo005_NewTag'), 'New')

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDo5Checkbox'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/ToDoAgendaCompletion'), '75% completed')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/V2/TT-766/Page_Leadership L10 - Run Meeting/button_7 Conclude'))

WebUI.delay(2)

WebUI.click(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/div_Conclude meeting'))

WebUI.waitForElementPresent(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/MeetingSummaryTodoCompletion'), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementText(findTestObject('V2/TT-766/Page_Leadership L10 - Run Meeting/MeetingSummaryTodoCompletion'), '75%')

WebUI.closeBrowser()

