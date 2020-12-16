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

WebUI.waitForElementVisible(findTestObject('V2/TT-407/Page_Dashboard/Collapse_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Collapse_Menu'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Add_New_Scorecard_Button'))

WebUI.delay(30)

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Measurable_Title_TextField'), measurableName)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Type_Field'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Type_Text'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Direction_TextField'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Direction_Equal'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Goal_TextField'), goalValue)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Whosaccountable_TextField'))

TestObject accountable_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(whosAccountable_Obj, 
    accountableOwner, 'xpath')

WebUI.click(accountable_OwnerValObj)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Admin_Access_TextField'))

TestObject admin_AccessValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(adminAccess_Obj, 
    adminAccess, 'xpath')

WebUI.click(admin_AccessValObj)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Assign_To_Meeting_Field'))

TestObject assigned_MeetingValOBj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(assignedMeeting_Obj, 
    selectedMeeting, 'xpath')

WebUI.click(assigned_MeetingValOBj)

WebUI.delay(4)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Measurable_Title_TextField'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Save_Button'))

WebUI.delay(10)

TestObject scorecard_NameValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard_Obj, 
    measurableName, 'xpath')

WebUI.sendKeys(findTestObject('V2/TT-407/Page_Dashboard/Add_New_Scorecard_Button'), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(10)

WebUI.verifyElementPresent(scorecard_NameValObj, GlobalVariable.DefaultTimeout)

WebUI.delay(5)

WebUI.click(scorecard_NameValObj)

WebUI.delay(10)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Measurable_Title'))

WebUI.sendKeys(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Measurable_Title'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Measurable_Title'), editMeasurableName)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Goal_Type_Field_Workspace'))

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Goal_Type_Number_Workspace'))

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Unit_Field'))

TestObject editSelected_UnitValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editUnit_Obj, 
    editUnit, 'xpath')

WebUI.click(editSelected_UnitValObj)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Goal'))

WebUI.clearText(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Goal'))

WebUI.setText(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Goal'), editGoal)

WebUI.setText(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Goal_Description'), editGoalDescription)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Accountable_Workspace'))

TestObject editAccountableValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAccountable_Obj, 
    editAccountable, 'xpath')

WebUI.click(editAccountableValObj)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Admin_Access'))

TestObject editAdmin_AccessValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAdminAccess_Obj, 
    editAdminAccess, 'xpath')

WebUI.click(editAdmin_AccessValObj)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Show_Advanced_Fields_Button'))

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Average_DateField'))

TestObject editAve_DateValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAverage_Obj, 
    editAverage, 'xpath')

WebUI.click(editAve_DateValObj)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Cumulative_DateField'))

TestObject editCum_DateValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editCumulative_Obj, 
    editCumulative, 'xpath')

WebUI.click(editCum_DateValObj)

WebUI.click(findTestObject('V2/TT-407/Edit_Scorecard/Edit_Update_Button'))

WebUI.delay(10)

WebUI.verifyElementPresent(scorecard_NameValObj, GlobalVariable.DefaultTimeout)

