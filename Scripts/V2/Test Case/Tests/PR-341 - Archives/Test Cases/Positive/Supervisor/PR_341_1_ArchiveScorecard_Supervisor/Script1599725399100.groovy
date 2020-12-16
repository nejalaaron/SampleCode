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

CustomKeywords.'tt_CustomKeywords.CustomKeywords.WaitForElementVisibleThenClick'(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', 
        [('meetingName') : meetingName]), GlobalVariable.DefaultTimeout)

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

WebUI.delay(10)

TestObject verifyMeasurable = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard, measurableTitle, 
    'xpath')

WebUI.verifyElementPresent(verifyMeasurable, GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(verifyMeasurable, GlobalVariable.DefaultTimeout)

WebUI.click(verifyMeasurable)

WebUI.waitForElementVisible(findTestObject('V2/PR-341/Edit_Meeting/button_Archive'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-341/Edit_Meeting/button_Archive'))

WebUI.verifyElementPresent(findTestObject('V2/PR-341/Edit_Meeting/notifier_ScorecardArchive'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

