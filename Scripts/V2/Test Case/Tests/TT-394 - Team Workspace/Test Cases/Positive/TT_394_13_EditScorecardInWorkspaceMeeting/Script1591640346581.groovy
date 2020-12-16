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

WebUI.click(findTestObject('V2/TT-394/Scorecard/Create_Scorecard_Button'))

WebUI.delay(10)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Measurable_Title_TextField_Workspace'), measurableName)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Goal_Type_Field_Workspace'))

WebUI.click(findTestObject('V2/TT-394/Scorecard/Goal_Type_Text_Workspace'))

WebUI.click(findTestObject('V2/TT-394/Scorecard/Goal_Direction_TextField_Workspace'))

WebUI.click(findTestObject('V2/TT-394/Scorecard/Goal_direction_Equal_Workspace'))

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Goal_TextField_Workspace'), goalValue)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Whosaccountable_TextField_Workspace'))

TestObject whos_AccountableRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(whosAccountable_Obj, 
    whosAccountable, 'xpath')

WebUI.click(whos_AccountableRecordObj)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Admin_Access_TextField_Workspace'))

TestObject admin_AccessRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(adminAccess_Obj, 
    adminAccess, 'xpath')

WebUI.click(admin_AccessRecordObj)

WebUI.delay(4)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Save_Button'))

WebUI.delay(10)

TestObject scorecard_NameValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard, 
    measurableName, 'xpath')

WebUI.verifyElementPresent(scorecard_NameValObj, GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column1'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column1'), measurableColumn1)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column2'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column2'), measurableColumn2)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column3'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column3'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column3'), measurableColumn3)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column4'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column4'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column4'), measurableColumn4)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column5'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column5'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column5'), measurableColumn5)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column6'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column6'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column6'), measurableColumn6)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column7'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column7'))

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column7'), measurableColumn7)

WebUI.click(scorecard_NameValObj)

WebUI.delay(10)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Measurable_Title'))

WebUI.sendKeys(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Measurable_Title'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Measurable_Title'), editMeasurableName)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Goal_Type_Field_Workspace'))

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Goal_Type_Number_Workspace'))

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Unit_Field'))

TestObject editSelected_UnitValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editUnit_Obj, 
    editUnit, 'xpath')

WebUI.click(editSelected_UnitValObj)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Goal'))

WebUI.clearText(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Goal'))

WebUI.setText(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Goal'), editGoal)

WebUI.setText(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Goal_Description'), editGoalDescription)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/All_Of_My_Scorecard_Data_Radio_Button'))

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Accountable_Workspace'))

TestObject editAccountableValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAccountable_Obj, 
    editAccountable, 'xpath')

WebUI.click(editAccountableValObj)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Admin_Access'))

TestObject editAdmin_AccessValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAdminAccess_Obj, 
    editAdminAccess, 'xpath')

WebUI.click(editAdmin_AccessValObj)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Show_Advanced_Fields_Button'))

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Average_DateField'))

TestObject editAve_DateValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAverage_Obj, 
    editAverage, 'xpath')

WebUI.click(editAve_DateValObj)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Cumulative_DateField'))

TestObject editCum_DateValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editCumulative_Obj, 
    editCumulative, 'xpath')

WebUI.click(editCum_DateValObj)

WebUI.click(findTestObject('V2/TT-394/Edit_Scorecard/Edit_Update_Button'))

WebUI.delay(10)

WebUI.verifyElementPresent(scorecard_NameValObj, GlobalVariable.DefaultTimeout)

/*WebUI.click(findTestObject('V2/TT-394/Scorecard/Column2'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column2'), editMeasurableColumn1)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column3'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column3'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column3'), editMeasurableColumn2)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column4'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column4'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column4'), editMeasurableColumn3)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column5'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column5'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column5'), editMeasurableColumn4)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column6'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column6'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column6'), editMeasurableColumn5)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column7'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column7'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column7'), editMeasurableColumn6)

WebUI.click(findTestObject('V2/TT-394/Scorecard/Column8'))

WebUI.clearText(findTestObject('V2/TT-394/Scorecard/Column8'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/TT-394/Scorecard/Column8'), editMeasurableColumn7)*/

