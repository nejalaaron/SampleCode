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

CustomKeywords.'tt_CustomKeywords.CustomKeywords.WaitForElementVisibleThenClick'(findTestObject('V2/Commons/MeetingListPage/D_meetingRecord_3DotsOption_div', 
        [('meetingName') : meetingName]), GlobalVariable.DefaultTimeout)

WebUI.waitForElementVisible(findTestObject('V2/Commons/MeetingListPage/a_Archives'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/Commons/MeetingListPage/a_Archives'))

WebUI.waitForElementVisible(findTestObject('V2/PR-341/Page_Archives/Scorecard'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/PR-341/Page_Archives/Scorecard'))

WebUI.waitForElementVisible(findTestObject('V2/PR-341/Page_Archives/Verify_Admin_User_Scorecard'), GlobalVariable.DefaultTimeout)

WebUI.verifyElementPresent(findTestObject('V2/PR-341/Page_Archives/Verify_Admin_User_Scorecard'), GlobalVariable.DefaultTimeout)

