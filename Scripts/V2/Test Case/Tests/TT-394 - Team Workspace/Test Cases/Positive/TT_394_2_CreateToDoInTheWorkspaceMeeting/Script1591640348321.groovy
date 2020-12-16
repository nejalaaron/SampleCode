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

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : userName
        , ('password') : passWord], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/TT-408/Page_Dashboard/Collapse_Menu_Button'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-408/Page_Dashboard/Collapse_Menu_Button'))

WebUI.click(findTestObject('V2/TT-394/Workspace_Dashboard/Team_Workspaces_Menu_Button'))

TestObject meeting_NameRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingNameWorkspace_Obj, 
    meetingName, 'xpath')

WebUI.verifyElementPresent(meeting_NameRecordObj, GlobalVariable.DefaultTimeout)

TestObject workspace_MeetingRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(workSpace, 
    meetingName, 'xpath')

WebUI.click(workspace_MeetingRecordObj)

WebUI.delay(10)

WebUI.sendKeys(findTestObject('V2/TT-394/Workspace_Dashboard/Button_ToDo_Location'), Keys.chord(Keys.PAGE_UP))

WebUI.delay(5)

WebUI.click(findTestObject('V2/TT-394/Workspace_Dashboard/Create_New_ToDo_Button'))

WebUI.delay(30)

WebUI.click(findTestObject('V2/TT-394/Workspace_Dashboard/To-Do_Title_Text_Field'))

WebUI.setText(findTestObject('V2/TT-394/Workspace_Dashboard/Todo_TextField'), todoName)

WebUI.click(findTestObject('V2/TT-394/Workspace_Dashboard/Accountable_Owner_FieldButton'))

TestObject accountable_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(accountableOwner_Obj, 
    accountableOwner, 'xpath')

WebUI.click(accountable_OwnerValObj)

WebUI.click(findTestObject('V2/TT-394/Workspace_Dashboard/Create_ToDo_Due_Date'))

TestObject date_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoDueDate_Obj, day, 
    'xpath')

WebUI.click(date_dayValObj)

WebUI.verifyElementVisible(findTestObject('V2/TT-394/Workspace_Dashboard/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/TT-394/Workspace_Dashboard/Notes_Comments'), 'Sample')

WebUI.click(findTestObject('V2/TT-394/Workspace_Dashboard/Save_Button'))

WebUI.delay(5)

TestObject todoRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(todoVerify_Obj, todoName, 
    'xpath')

WebUI.verifyElementPresent(todoRecordObj, GlobalVariable.DefaultTimeout)

