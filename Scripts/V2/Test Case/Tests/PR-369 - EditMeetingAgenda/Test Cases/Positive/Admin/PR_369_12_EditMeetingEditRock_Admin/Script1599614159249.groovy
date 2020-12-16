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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl(GlobalVariable.V2Url)

not_run: WebUI.setText(findTestObject('V2/PR-369/Page_Login/userName_Field'), 'tractiontools.user001+ta58jzbl@gmail.com')

not_run: WebUI.setText(findTestObject('V2/PR-369/Page_Login/passWord_Field'), 'Qwer123!')

not_run: WebUI.click(findTestObject('V2/PR-369/Page_Login/Login_Button'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, meetingName, 
    'xpath')

WebUI.waitForElementVisible(meetingOpt_Obj, GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(meetingOpt_Obj, GlobalVariable.DefaultTimeout)

WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Rocks_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Rocks_Menu'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/CreateRocksButton'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Create_New_Rocks'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Rock_Name_Title'), GlobalVariable.DefaultTimeout)

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Rock_Name_Title'), rockName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Status_OffTrack_Rock'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Accountable_Owner_Field'))

TestObject accountableOwner = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(owner_Obj, ownerSelected, 
    'xpath')

WebUI.click(accountableOwner)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Visibility_Level_Field'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Visibility_Level_Company'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Rocks_Due_Date_Field'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

WebUI.verifyElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Notes_Comments'), Notes)

WebUI.sendKeys(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Add_Milestone_Button'), Keys.chord(Keys.PAGE_DOWN))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Add_Milestone_Button'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Milestone_Text_Field'), milestoneName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Milestone_date'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Save_Button'))

WebUI.delay(10)

TestObject verifyRocks = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyRocks_Obj, rockName, 
    'xpath')

WebUI.verifyElementPresent(verifyRocks, GlobalVariable.DefaultTimeout)

TestObject verifyMilestone = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyMilestone_Obj, 
    milestoneName, 'xpath')

WebUI.verifyElementPresent(verifyMilestone, GlobalVariable.DefaultTimeout)

WebUI.click(verifyRocks)

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Rock_Name'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Rock_Name'))

WebUI.sendKeys(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Rock_Name'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Rock_Name'), editRockName)

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Status_Done'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Status_Done'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Accountable_Owner'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Accountable_Owner'))

TestObject editOwner = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editOwner_Obj, editOwner, 
    'xpath')

WebUI.waitForElementVisible(editOwner, GlobalVariable.DefaultTimeout)

WebUI.click(editOwner)

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Visibility_Level'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Visibility_Level'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Visibility_Level_Department'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Visibility_Level_Department'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Milestone'), GlobalVariable.DefaultTimeout)

WebUI.sendKeys(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Milestone'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Edit_Milestone'), editMilestoneName)

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Done_CheckBox'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Done_CheckBox'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Update_Button'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingRocks/Update_Button'))

WebUI.delay(10)

TestObject editverifyRocks = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyRocks_Obj, editRockName, 
    'xpath')

WebUI.verifyElementPresent(editverifyRocks, GlobalVariable.DefaultTimeout)

TestObject editverifyMilestone = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyMilestone_Obj, 
    editMilestoneName, 'xpath')

WebUI.verifyElementPresent(editverifyMilestone, GlobalVariable.DefaultTimeout)

