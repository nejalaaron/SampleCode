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

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

CustomKeywords.'tt_CustomKeywords.CustomKeywords.WaitForElementVisibleThenClick'(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', 
        [('meetingName') : meetingName]), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/People_Headline_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/People_Headline_Menu'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/CreateHeadlineButton'))

WebUI.delay(10)

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/People_Headline_TextField'), headlineName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/People_Headline_Owner_TextField'))

TestObject ownerSelected = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(ownerObj, ownerName, 'xpath')

WebUI.click(ownerSelected)

not_run: WebUI.verifyElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Verify_Notes_Section'))

not_run: WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Notes_Comments'), Notes)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/Save_Button'))

WebUI.delay(10)

TestObject VerifyHeadline = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(headlineVerify_Obj, headlineName, 
    'xpath')

WebUI.verifyElementPresent(VerifyHeadline, GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/Edit_Headline'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_People_Headlines/Edit_Headline'))

WebUI.waitForElementVisible(findTestObject('V2/PR-341/Edit_Meeting/button_Archive'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-341/Edit_Meeting/button_Archive'))

WebUI.verifyElementPresent(findTestObject('V2/PR-341/Edit_Meeting/notifier_HeadlineArchive'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

