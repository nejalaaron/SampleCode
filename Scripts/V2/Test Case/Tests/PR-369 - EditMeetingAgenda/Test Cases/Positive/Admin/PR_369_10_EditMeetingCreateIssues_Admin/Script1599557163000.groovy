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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
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

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Issues/Issues_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Issues/Issues_Menu'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Issues/CreateIssuesButton'))

WebUI.delay(10)

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Issues/Issue_Name_TextField'), issuesName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Issues/Owner_Field'))

TestObject owner = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(owner_Obj, owner, 'xpath')

WebUI.click(owner)

WebUI.verifyElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Verify_Notes_Section'))

WebUI.delay(5)

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Notes_Comments'), Notes)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Issues/Save_Button'))

WebUI.delay(5)

TestObject verifyIssues = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyIssues_Obj, issuesName, 
    'xpath')

WebUI.verifyElementPresent(verifyIssues, GlobalVariable.DefaultTimeout)

not_run: WebUI.click(verifyIssues)

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingIssues/Edit_Issues_Name'))

not_run: WebUI.sendKeys(findTestObject('V2/PR-369/UpdateEditMeetingIssues/Edit_Issues_Name'), Keys.chord(Keys.LEFT_CONTROL, 
        'a', Keys.BACK_SPACE))

not_run: WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingIssues/Edit_Issues_Name'), editIssuesName)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingIssues/Edit_Owner'))

not_run: TestObject editOwner = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editOwner_Obj, editOwner, 
    'xpath')

not_run: WebUI.click(editOwner)

not_run: WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingIssues/Update_Button'))

not_run: WebUI.delay(5)

not_run: TestObject verifyEditIssues = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyIssues_Obj, 
    editIssuesName, 'xpath')

not_run: WebUI.verifyElementPresent(verifyEditIssues, GlobalVariable.DefaultTimeout)

