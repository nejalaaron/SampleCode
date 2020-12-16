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

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, meetingName, 
    'xpath')

WebUI.waitForElementVisible(meetingOpt_Obj, GlobalVariable.DefaultTimeout)

WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Scorecard_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Scorecard_Menu'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/CreateScoreCardButton'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Create_New_Measurable'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Measurable_Title_Field'), GlobalVariable.DefaultTimeout)

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Measurable_Title_Field'), measurableTitle)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Goal_Type_Field_Workspace'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Goal_Type_Text_Workspace'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Goal_Direction_TextField'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Goal_Direction_Equal'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Goal_Field'), goalValue)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Whosaccountable_Field'))

TestObject whosAccountableName = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(WhosAccountable_Obj, 
    WhosAccountable, 'xpath')

WebUI.click(whosAccountableName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Admin_Access_TextField'))

TestObject adminAccessName = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(adminAccess_Obj, adminAccess, 
    'xpath')

WebUI.click(adminAccessName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Save_Button'))

TestObject verifyMeasurable = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard, measurableTitle, 
    'xpath')

WebUI.verifyElementPresent(verifyMeasurable, GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column1'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column1'), Column1)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column2'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column2'), Column2)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column3'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column3'), Column3)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column4'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column4'), Column4)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column5'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column5'), Column5)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column6'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Column6'), Column6)

not_run: WebUI.click(verifyMeasurable)

not_run: WebUI.delay(10)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Measurable_Title_Field'))

not_run: WebUI.sendKeys(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Measurable_Title_Field'), Keys.chord(Keys.LEFT_CONTROL, 
        'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Measurable_Title_Field'), editMeasurableName)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal_Type_Field'))

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal_Type_Number'))

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Unit_Field'))

not_run: TestObject editUnit = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editUnit_Obj, editUnit, 
    'xpath')

not_run: WebUI.click(editUnit)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal'), editGoal)

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal_Description'), editGoalDescription)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Accountable'))

not_run: TestObject editAccountable = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAccountable_Obj, 
    editAccountable, 'xpath')

not_run: WebUI.click(editAccountable)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Admin_Access'))

not_run: TestObject editAdminAccess = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAdminAccess_Obj, 
    editAdminAccess, 'xpath')

not_run: WebUI.click(editAdminAccess)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Show_Advanced_Fields_Button'))

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Average_DateField'))

not_run: WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

not_run: WebUI.check(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Average_Checkbox'))

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Cumulative_DateField'))

not_run: WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

not_run: WebUI.check(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Cumulative_Checkbox'))

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Update_Button'))

not_run: WebUI.delay(10)

not_run: TestObject verifyUpdatedScorecard = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard, 
    editMeasurableName, 'xpath')

not_run: WebUI.verifyElementPresent(verifyUpdatedScorecard, GlobalVariable.DefaultTimeout)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn2'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn2'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn2'), editColumn2)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn3'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn3'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn3'), editColumn3)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn4'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn4'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn4'), editColumn4)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn5'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn5'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn5'), editColumn5)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn6'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn6'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn6'), editColumn6)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn7'))

not_run: WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn7'))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn7'), editColumn7)

