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

WebUI.click(findTestObject('V2/TT-394/IssuesCard/Create_New_Issues_Button'))

WebUI.delay(30)

WebUI.setText(findTestObject('V2/TT-394/IssuesCard/Issue_Name_TextField'), issueName)

WebUI.click(findTestObject('V2/TT-394/IssuesCard/Owner_TextField'))

TestObject owner_SelectedValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(owner_Obj, ownerSelected, 
    'xpath')

WebUI.click(owner_SelectedValObj)

WebUI.click(findTestObject('V2/TT-394/IssuesCard/Issues_Assign_To_Team_Meeting_Field'))

TestObject assigned_MeetingValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(assignedMeeting_Obj, 
    assignedMeeting, 'xpath')

WebUI.click(assigned_MeetingValObj)

WebUI.verifyElementVisible(findTestObject('V2/TT-394/Workspace_Dashboard/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/TT-394/Workspace_Dashboard/Notes_Comments'), 'Sample')

WebUI.click(findTestObject('V2/TT-394/IssuesCard/Issues_Save_Button'))

WebUI.delay(5)

TestObject issuesRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(issueVerify_Obj, issueName, 
    'xpath')

WebUI.verifyElementPresent(issuesRecordObj, GlobalVariable.DefaultTimeout)

WebUI.click(issuesRecordObj)

WebUI.delay(30)

WebUI.click(findTestObject('V2/TT-394/Edit_Issue/Edit_Issue_Name_TextField'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('V2/TT-394/Edit_Issue/Edit_Issue_Name_TextField'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.delay(5)

WebUI.setText(findTestObject('V2/TT-394/Edit_Issue/Edit_Issue_Name_TextField'), editIssueName)

WebUI.click(findTestObject('V2/TT-394/Edit_Issue/Move_To_DeptVTO_Checkbox'))

WebUI.click(findTestObject('V2/TT-394/Edit_Issue/Edit_Issue_Owner_Text_Field'))

TestObject edit_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editOwner_Obj, editOwner, 
    'xpath')

WebUI.click(edit_OwnerValObj)

WebUI.click(findTestObject('V2/TT-394/Edit_Issue/Edit_Issue_Assign_To_Team_Meeting_Field'))

TestObject edit_MeetingNameRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAssignedMeeting_Obj, 
    editMeetingName, 'xpath')

WebUI.click(edit_MeetingNameRecordObj)

/*WebUI.click(findTestObject('V2/TT-394/Edit_Issue/Edit_Issue_Selected_Team_Meeting'))*/
WebUI.click(findTestObject('V2/TT-394/Edit_Issue/Issue_Update_Button'))

WebUI.delay(30)

