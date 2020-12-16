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

/*WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Assign_To_Meeting_Field'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Selected_Assign_To_Meeting'))*/
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

