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

WebUI.sendKeys(findTestObject('V2/TT-394/Rocks_Card/Verify_Rocks_Card'), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(5)

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Create_New_Rocks_Button'))

WebUI.delay(30)

WebUI.setText(findTestObject('V2/TT-394/Rocks_Card/Rocks_Name_TextField'), rockName)

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Status_OffTrack_Rock'))

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Accountable_Owner_Field_Rocks'))

TestObject accountable_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(owner_Obj, ownerSelected, 'xpath')

WebUI.click(accountable_OwnerValObj)

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Visibility_Level_Field'))

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Visibility_level_Company (Added to VTO)_Rocks'))

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Rocks_Due_Date_Field'))

TestObject date_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(rockDate_Obj, dueDateDay, 
    'xpath')

WebUI.click(date_dayValObj)

WebUI.verifyElementVisible(findTestObject('V2/TT-394/Workspace_Dashboard/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/TT-394/Workspace_Dashboard/Notes_Comments'), 'Sample')

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Add_Milestone_Button'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('V2/TT-394/Rocks_Card/Milestone_Verify'), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(5)

WebUI.setText(findTestObject('V2/TT-394/Rocks_Card/Milestone_Text_Field'), milestoneName)

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Done_Milestone_Checkbox'))

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Milestone_Due_Date'))

TestObject milestone_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(milestoneDate_Obj, 
    milestoneDate, 'xpath')

WebUI.click(milestone_dayValObj)

WebUI.click(findTestObject('V2/TT-394/Rocks_Card/Save_Button_Rocks'))

WebUI.delay(5)

TestObject rockRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyRocks_Obj, rockName, 
    'xpath')

WebUI.verifyElementPresent(rockRecordObj, GlobalVariable.DefaultTimeout)

TestObject milestoneRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyMilestone_Obj, 
    milestoneName, 'xpath')

WebUI.verifyElementPresent(milestoneRecordObj, GlobalVariable.DefaultTimeout)

