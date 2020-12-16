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

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Login/input__username'), username)

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Login/input__password'), password)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Login/div_Login'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Dashboard/div_Meetings'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Create a meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/button_Level 10'))

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Meeting/input__name'), meetingName)

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Meeting/input__acronym'), acronym)

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Meeting/input_Meeting description (max 100 characte_8187fa'), 
    meetingName)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/input__typeOfMeeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Leadership'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/button___StyledButton-sc-9nsd91-0 hrKrVT'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Select a dayMondayTuesdayWednesdayThurs_fcb808'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Monday'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/input_ampm_meeting-time'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_ampm1200'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Create Meeting'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/div_Ill do this later'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Meeting/span_Team Workspaces'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Team Workspaces/div_Open workspace'))

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/button_To-Dos_BtnIconStyles-k8ghfj-0 dRfFyk'))

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/input__task'), todoNameOne)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/div_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/button_To-Dos_BtnIconStyles-k8ghfj-0 dRfFyk'))

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/input__task'), todoNameTwo)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/div_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/button_To-Dos_BtnIconStyles-k8ghfj-0 dRfFyk'))

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/input__task'), todoNameThree)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/div_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/button_To-Dos_BtnIconStyles-k8ghfj-0 dRfFyk'))

WebUI.setText(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/input__task'), todoNameFour)

WebUI.click(findTestObject('Object Repository/V2/TT-413/Page_Leadership L10 - Workspace/div_Save'))

WebUI.delay(1)

WebUI.closeBrowser()

