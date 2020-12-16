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

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_NavigateToURL'), [('URL') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_LoginToTractionToolsApplication'), [('username') : userName
        , ('password') : passWord], FailureHandling.STOP_ON_FAILURE)
WebUI.waitForElementVisible(findTestObject('V2/TT-407/Page_Dashboard/Collapse_Menu'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Collapse_Menu'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Add_New_Scorecard_Button'))

WebUI.delay(30)

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Measurable_Title_TextField'), measurableName)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Type_Field'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Type_Number'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Direction_TextField'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Goal_Direction_Number_Equal'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Goal_TextField'), goalValue)

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Goal_Description_Field'), goalDescription)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Unit_Field'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Selected_Unit_Field_Hour'))

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Whosaccountable_TextField'))

TestObject accountable_OwnerValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(whosAccountable_Obj, 
    accountableOwner, 'xpath')

WebUI.click(accountable_OwnerValObj)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Admin_Access_TextField'))

TestObject admin_AccessValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(adminAccess_Obj, 
    adminAccess, 'xpath')

WebUI.click(admin_AccessValObj)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Assign_To_Meeting_Field'))

TestObject assigned_MeetingValOBj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(assignedMeeting_Obj, 
    selectedMeeting, 'xpath')

WebUI.click(assigned_MeetingValOBj)

WebUI.delay(4)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Measurable_Title_TextField'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Show_Advanced_Fields_Button'))

/* Calculate Average Start Date */
WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Average_DateField'))

TestObject avedate_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(average_Obj, aveDateDay, 
    'xpath')

WebUI.click(avedate_dayValObj)

/* Calculate Cumulative Start Date */
WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Cumulative_DateField'))

TestObject cumdate_dayValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(cumulative_Obj, cumDateDay, 
    'xpath')

WebUI.click(cumdate_dayValObj)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Save_Button'))

WebUI.delay(10)

TestObject scorecard_NameValObj = CustomKeywords.'tt_CustomKeywords.CustomKeywords.CreateDynamicElement'(verifyScorecard_Obj, 
    measurableName, 'xpath')

WebUI.sendKeys(findTestObject('V2/TT-407/Page_Dashboard/Add_New_Scorecard_Button'), Keys.chord(Keys.PAGE_DOWN))

WebUI.delay(10)

WebUI.verifyElementPresent(scorecard_NameValObj, GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Column1'))

WebUI.clearText(findTestObject('V2/TT-407/Page_Dashboard/Column1'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Column1'), measurableColumn1)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Column2'))

WebUI.clearText(findTestObject('V2/TT-407/Page_Dashboard/Column2'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Column2'), measurableColumn2)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Column3'))

WebUI.clearText(findTestObject('V2/TT-407/Page_Dashboard/Column3'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Column3'), measurableColumn3)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Column4'))

WebUI.clearText(findTestObject('V2/TT-407/Page_Dashboard/Column4'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Column4'), measurableColumn4)

WebUI.click(findTestObject('V2/TT-407/Page_Dashboard/Column5'))

WebUI.clearText(findTestObject('V2/TT-407/Page_Dashboard/Column5'))

WebUI.setText(findTestObject('V2/TT-407/Page_Dashboard/Column5'), measurableColumn5)

