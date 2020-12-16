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

/*
 Create New ToDo with Done Status in the Dashboard Field
*/
WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToURL'), [('URL') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : GlobalVariable.employee_email
        , ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

/* Creating New Todo In the Dashboard Todo Card */
WebUI.waitForElementVisible(findTestObject('V2/TT-408/Page_Dashboard/Collapse_Menu_Button'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/Collapse_Menu_Button'))

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/Create_New_ToDo_Button'))

WebUI.delay(10)

WebUI.setText(findTestObject('V2/TT-408/Page_Dashboard/To-Do_Title_Text_Field'), todoName)

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/This_IsPersonal_ToDo_Checkbox'))

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/Assign_To_Team_Meeting_Field'))

TestObject assigned_MeetingValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(assignedMeeting_Obj, 
    meetingName, 'xpath')

WebUI.click(assigned_MeetingValObj)

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/Create_To-Do_Due_Date'))

date_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(date_Obj, day, 'xpath')

WebUI.click(date_dayValObj)

WebUI.verifyElementVisible(findTestObject('V2/TT-408/Page_Dashboard/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/TT-408/Page_Dashboard/Notes_Comments'), 'Sample Notes Comment')

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/Cancel_Button'))

TestObject todoRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoVerify_Obj, todoName, 
    'xpath')

WebUI.verifyElementNotPresent(todoRecordObj, GlobalVariable.DefaultTimeout)

WebUI.closeBrowser()

