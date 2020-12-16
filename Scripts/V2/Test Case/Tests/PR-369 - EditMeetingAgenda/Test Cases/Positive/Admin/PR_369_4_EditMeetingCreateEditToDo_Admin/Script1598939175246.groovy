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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.V2Url)

WebUI.setText(findTestObject('V2/PR-369/Page_Login/userName_Field'), 'tractiontools.user001+ta58jzbl@gmail.com')

WebUI.setText(findTestObject('V2/PR-369/Page_Login/passWord_Field'), 'Qwer123!')

WebUI.click(findTestObject('V2/PR-369/Page_Login/Login_Button'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, meetingName, 
    'xpath')

WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementVisible(findTestObject('V2/PR-369/Edit_Meeting_ToDo/ToDo_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_ToDo/ToDo_Menu'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_ToDo/CreateToDoButton'))

WebUI.delay(10)

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_ToDo/Edit_Todo_TextField'), toDoName)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_ToDo/Accountable_Owner_TextField'))

TestObject accountableOwner = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(accountableOwner_Obj, 
    accountableOwner, 'xpath')

WebUI.click(accountableOwner)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_ToDo/Create_ToDo_Due_Date'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

WebUI.verifyElementVisible(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Verify_Notes_Section'))

WebUI.setText(findTestObject('V2/PR-369/Edit_Meeting_Rocks/Notes_Comments'), Notes)

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_ToDo/Save_Button'))

WebUI.delay(15)

TestObject verifyToDo = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyToDo_Obj, toDoName, 
    'xpath')

WebUI.verifyElementPresent(verifyToDo, GlobalVariable.DefaultTimeout)

WebUI.click(verifyToDo)

WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_ToDo_Name_TextField'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_ToDo_Name_TextField'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.sendKeys(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_ToDo_Name_TextField - Copy'), Keys.chord(Keys.LEFT_CONTROL, 
        'a', Keys.BACK_SPACE))

CustomKeywords.'tt_CustomKeywords.CustomKeywords.ClearElementText'(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_ToDo_Name_TextField'))

WebUI.setText(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_ToDo_Name_TextField'), editToDoName)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_Accountable_Owner'))

TestObject editaccountableOwner = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(editaccountableOwner_Obj, 
    editAccountableOwner, 'xpath')

WebUI.click(editaccountableOwner)

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_Due_Date'))

WebUI.click(findTestObject('V2/PR-369/Edit_Meeting_Scorecard/A_Date29'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Edit_Done_Checkbox'))

WebUI.click(findTestObject('V2/PR-369/UpdateEditMeetingToDo/Update_Button'))

WebUI.delay(5)

TestObject verifyEditTodo = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyToDo_Obj, editToDoName, 
    'xpath')

WebUI.verifyElementPresent(verifyEditTodo, GlobalVariable.DefaultTimeout)

