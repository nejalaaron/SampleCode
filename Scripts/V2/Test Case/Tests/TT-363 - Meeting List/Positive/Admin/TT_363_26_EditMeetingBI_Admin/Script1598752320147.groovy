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

WebUI.waitForElementPresent(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__meeting title'), 
    GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_GeneralBasic informationVideo conferenc_ee1ae7'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__meeting title'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input__acronym'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_Meeting description (max 100 characte_8187fa'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_Meeting name Acronym Meeting descriptio_78e662'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/i__IconStyles-sc-181ai5j-0 fspyWU icon-arro_0a3203'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/button___StyledButton-sc-9nsd91-0 hrKrVT'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/div_MondayMondayTuesdayWednesdayThursdayFri_d9280e'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Page_Edit Meeting/input_am_meeting-time'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/V2/TT-363/Page_Meeting/Edit_Meeting/Edit_Meeting2/Page_Edit Meeting/div_Save'))

