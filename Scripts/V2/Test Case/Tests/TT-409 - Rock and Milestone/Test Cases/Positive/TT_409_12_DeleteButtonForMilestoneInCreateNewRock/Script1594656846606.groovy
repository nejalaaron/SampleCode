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
 Create New Rock and Milestones in the Dashboard Field
*/
WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToURL'), [('URL') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : userName
        , ('password') : passWord], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('V2/TT-409/Page_Dashboard/Collapse_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Collapse_Menu'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Create_New_Rock_Button'))

WebUI.delay(15)

WebUI.setText(findTestObject('V2/TT-409/Page_Dashboard/Rock_Title_Text_Field'), rockName)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Status_OnTrack'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Accountable_Owner_Field'))

TestObject accountable_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(accountableOwner_Obj, 
    accountableOwner, 'xpath')

WebUI.click(accountable_OwnerValObj)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Visibility_Level_Button'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Visibility_level_Company (Added to VTO)'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Rock_Due_Date_Field'))

TestObject rockdate_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(rockdate_Obj, dueDateDay, 
    'xpath')

WebUI.click(rockdate_dayValObj)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Assign_Team_Meeting_Field'))

TestObject meeting_NameValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(assignedMeeting_Obj, 
    meetingName, 'xpath')

WebUI.click(meeting_NameValObj)

WebUI.verifyElementVisible(findTestObject('V2/TT-409/Page_Dashboard/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/TT-409/Page_Dashboard/Notes_Comments'), 'Sample Notes Comment')

/*
 Add Milestone to Rock
 */
WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Add_Milestone_Button'))

WebUI.setText(findTestObject('V2/TT-409/Page_Dashboard/Milestone_Name_TextField'), milestoneName)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Milestone_Due_Date'))

TestObject milestonedate_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(milestoneDate_Obj, 
    milestoneDate, 'xpath')

WebUI.click(milestonedate_dayValObj)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Done_Milestone_Checkbox'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Delete_Milestone_Button'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Add_Milestone_Button'))

WebUI.setText(findTestObject('V2/TT-409/Page_Dashboard/Milestone_Name_TextField'), milestoneName)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Milestone_Due_Date'))

TestObject milestone2date_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(milestoneDate_Obj, 
    milestoneDate, 'xpath')

WebUI.click(milestone2date_dayValObj)

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Done_Milestone_Checkbox'))

WebUI.click(findTestObject('V2/TT-409/Page_Dashboard/Save_Button'))

TestObject rock_recordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyRock_Obj, rockName, 
    'xpath')

WebUI.verifyElementPresent(rock_recordObj, GlobalVariable.DefaultTimeout)

TestObject milestone_recordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyMilestone_Obj, 
    milestoneName, 'xpath')

WebUI.verifyElementPresent(milestone_recordObj, GlobalVariable.DefaultTimeout)

