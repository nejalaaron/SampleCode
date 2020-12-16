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

WebUI.click(findTestObject('V2/Commons/DasboardPage_SidebarMenu/MeetingsMenu'))

String whosAccountable_fullname = (firstname + ' ') + lastname

//Goal Direction Constants
String GD_Equal = 'Equal (=)'

String GD_GreaterThanEql = 'Greater Than Equal (≥)'

String GD_GreaterThan = 'Greater Than (>)'

String GD_LessThanEql = 'Less Than Equal (≤)'

String GD_LessThan = 'Less Than (<)'

String GD_Between = 'Between (⇔)'

//Unit Constants
String Unit_Dollars = 'Dollars ($)'

String Unit_Pounds = 'Pounds (£)'

String Unit_AUD = 'AUD (A$)'

String Unit_Euro = 'Euro (€)'

String Unit_Yen = 'Yen (¥)'

String Unit_Percent = 'Percent (%)'

String Unit_Hours = 'Hours (hr)'

String Unit_Minutes = 'Minutes (min)'

not_run: TestObject meetingOpt_Obj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(meetingOptions_obj, 
    meetingName, 'xpath')

not_run: WebUI.click(meetingOpt_Obj)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', [('meetingName') : meetingName]), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Edit meeting'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/AddScorecardIcon_btn'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/AddScorecardIcon_btn'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/CreateNewMeasurable_btn'), 
    GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/CreateNewMeasurable_btn'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/CreateAMeasurableHeader_h2'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_MeasurableTitle_input'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalType_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalDirection_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_Unit_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_Goal_input'), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalDescription_input'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_WhosAccountable_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_AssignToMeeting_dropdown'), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/CreateAMeasurableHeader_h2'))

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_MeasurableTitle_input'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_MeasurableTitle_input'), scorecard_title)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalType_dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalType_dropdown'), FailureHandling.STOP_ON_FAILURE)

TestObject createScorecardGoalTypeOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardGoalTypeOpt_obj, 
    scorecard_goalType, 'xpath')

WebUI.click(createScorecardGoalTypeOption, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalDirection_dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalDirection_dropdown'), FailureHandling.STOP_ON_FAILURE)

if (scorecard_goalDirection.toString().equalsIgnoreCase('E')) {
    TestObject createScorecardGoalDirectionOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
        createScorecardGoalDirectionOpt_obj, GD_Equal, 'xpath')

    WebUI.click(createScorecardGoalDirectionOption, FailureHandling.STOP_ON_FAILURE)
}

if (scorecard_goalDirection.toString().equalsIgnoreCase('GTE')) {
    TestObject createScorecardGoalDirectionOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
        createScorecardGoalDirectionOpt_obj, GD_GreaterThanEql, 'xpath')

    WebUI.click(createScorecardGoalDirectionOption, FailureHandling.STOP_ON_FAILURE)
}

if (scorecard_goalDirection.toString().equalsIgnoreCase('GT')) {
    TestObject createScorecardGoalDirectionOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
        createScorecardGoalDirectionOpt_obj, GD_GreaterThan, 'xpath')

    WebUI.click(createScorecardGoalDirectionOption, FailureHandling.STOP_ON_FAILURE)
}

if (scorecard_goalDirection.toString().equalsIgnoreCase('LTE')) {
    TestObject createScorecardGoalDirectionOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
        createScorecardGoalDirectionOpt_obj, GD_LessThanEql, 'xpath')

    WebUI.click(createScorecardGoalDirectionOption, FailureHandling.STOP_ON_FAILURE)
}

if (scorecard_goalDirection.toString().equalsIgnoreCase('LT')) {
    TestObject createScorecardGoalDirectionOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
        createScorecardGoalDirectionOpt_obj, GD_LessThan, 'xpath')

    WebUI.click(createScorecardGoalDirectionOption, FailureHandling.STOP_ON_FAILURE)
}

if (scorecard_goalDirection.toString().equalsIgnoreCase('B')) {
    TestObject createScorecardGoalDirectionOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(
        createScorecardGoalDirectionOpt_obj, GD_Between, 'xpath')

    WebUI.click(createScorecardGoalDirectionOption, FailureHandling.STOP_ON_FAILURE)
}

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_Unit_dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

if (!(scorecard_unit) == '') {
    WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_Unit_dropdown'), FailureHandling.STOP_ON_FAILURE)

    if (scorecard_unit.toString.equalsIgnoreCase('dollars')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Dollars, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('pounds')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Pounds, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('aud')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_AUD, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('euro')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Euro, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('yen')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Yen, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('percent')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Percent, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('hours')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Hours, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
    
    if (scorecard_unit.toString.equalsIgnoreCase('minutes')) {
        TestObject createScorecardUnitOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardUnitOpt_obj, 
            Unit_Minutes, 'xpath')

        WebUI.click(createScorecardUnitOption, FailureHandling.STOP_ON_FAILURE)
    }
}

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_Goal_input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_Goal_input'), scorecard_goal_val)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalDescription_input'), 
    FailureHandling.STOP_ON_FAILURE)

if (!(scorecard_goalDescription) == '') {
    WebUI.setText(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_GoalDescription_input'), 
        scorecard_goalDescription)
}

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_WhosAccountable_dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_WhosAccountable_dropdown'), FailureHandling.STOP_ON_FAILURE)

TestObject createScorecardWAOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardWAOpt_obj, 
    whosAccountable_fullname, 'xpath')

WebUI.click(createScorecardWAOption, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_AssignToMeeting_dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_AssignToMeeting_dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: TestObject createScorecardATMOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createScorecardDropdownATMOpt_obj, 
    meetingName, 'xpath')

not_run: WebUI.click(createScorecardATMOption, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/EditMeeting_CreateMeasurableSave_btn'))

WebUI.waitForElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/MeasurableSavedModalText_h3'), 
    GlobalVariable.DefaultTimeout)

WebUI.verifyElementVisible(findTestObject('V2/Commons/EditMeetingPage/CreateScorecardDrawer/MeasurableSavedModalText_h3'))

not_run: if (!(permission) == 'Basic editor') {
    WebUI.click(findTestObject('V2/Commons/EditMeetingPage/CreateToDoDrawer/EditMeeting_AccountableOwnerDropdown'))

    TestObject createToDoAOwnerOption = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(createTodoDropdownAOwnerOpt_obj, 
        accountableOwner_fullname, 'xpath')

    WebUI.click(createToDoAOwnerOption)
}

