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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.setText(findTestObject('V2/PR-369/Page_Login/userName_Field'), 'tractiontools.user001+ta58jzbl@gmail.com')

WebUI.setText(findTestObject('V2/PR-369/Page_Login/passWord_Field'), 'Qwer123!')

WebUI.click(findTestObject('V2/PR-369/Page_Login/Login_Button'))

not_run: WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Collapse_Menu_Button'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, meetingName, 
    'xpath')

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

WebUI.click(verifyMeasurable)

WebUI.delay(10)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Measurable_Title_Field'))

WebUI.sendKeys(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Measurable_Title_Field'), Keys.chord(Keys.LEFT_CONTROL, 
        'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Measurable_Title_Field'), editMeasurableName)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal_Type_Field'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal_Type_Number'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Unit_Field'))

TestObject editUnit = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editUnit_Obj, editUnit, 'xpath')

WebUI.click(editUnit)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal'), editGoal)

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Goal_Description'), editGoalDescription)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Accountable'))

TestObject editAccountable = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAccountable_Obj, 
    editAccountable, 'xpath')

WebUI.click(editAccountable)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Admin_Access'))

TestObject editAdminAccess = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editAdminAccess_Obj, 
    editAdminAccess, 'xpath')

WebUI.click(editAdminAccess)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Show_Advanced_Fields_Button'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Average_DateField'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

WebUI.check(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Average_Checkbox'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Cumulative_DateField'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

WebUI.check(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/Cumulative_Checkbox'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/Edit_Update_Button'))

WebUI.delay(10)

TestObject verifyUpdatedScorecard = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard, 
    editMeasurableName, 'xpath')

WebUI.verifyElementPresent(verifyUpdatedScorecard, GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn2'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn2'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn2'), editColumn2)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn3'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn3'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn3'), editColumn3)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn4'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn4'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn4'), editColumn4)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn5'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn5'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn5'), editColumn5)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn6'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn6'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn6'), editColumn6)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn7'))

WebUI.clearText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn7'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingScorecard/EditColumn7'), editColumn7)

