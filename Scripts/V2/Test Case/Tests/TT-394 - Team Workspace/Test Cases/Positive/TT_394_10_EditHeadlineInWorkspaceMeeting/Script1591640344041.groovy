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
/* Feature is not yet available in the environment */
WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.setText(findTestObject('V2/TT-394/Page_Login/userName_Field'), userName)

WebUI.setText(findTestObject('V2/TT-394/Page_Login/passWord_Field'), passWord)

WebUI.click(findTestObject('V2/TT-394/Page_Login/Login_Button'))

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

WebUI.sendKeys(findTestObject('V2/TT-394/People_Headline_Card/Verify_People_Headline_Card'), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('V2/TT-394/People_Headline_Card/Create_New_People_Headline_Button'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-394/People_Headline_Card/Create_New_People_Headline_Button'))

WebUI.delay(20)

WebUI.setText(findTestObject('V2/TT-394/People_Headline_Card/People_Headline_Name_TextField'), peopleHeadlineName)

WebUI.click(findTestObject('V2/TT-394/People_Headline_Card/People_Headline_Owner_TextField'))

TestObject selected_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(owner_Obj, ownerSelected, 
    'xpath')

WebUI.click(selected_OwnerValObj)

/*WebUI.click(findTestObject('V2/TT-394/People_Headline_Card/People_Headline_Assign_To_Team_Meeting'))

TestObject assigned_MeetingValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(assignedMeeting_Obj, 
    assignedMeeting, 'xpath')

WebUI.click(assigned_MeetingValOb)*/
WebUI.verifyElementVisible(findTestObject('V2/TT-394/People_Headline_Card/Verify_Headline_Notes'))

WebUI.setText(findTestObject('V2/TT-394/Workspace_Dashboard/Notes_Comments'), 'Sample')

WebUI.click(findTestObject('V2/TT-394/People_Headline_Card/People_Headline_Save_Button'))

WebUI.delay(5)

TestObject peopleHeadlineRecordObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(headlineVerify_Obj, 
    peopleHeadlineName, 'xpath')

WebUI.verifyElementPresent(peopleHeadlineRecordObj, GlobalVariable.DefaultTimeout)

