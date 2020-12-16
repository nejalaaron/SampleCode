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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://meetingmasterdev.azurewebsites.net/login?redirectUrl=/')

WebUI.click(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Good day leandro74emailcom/a_Company Settings'))

WebUI.click(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Good day leandro74emailcom/div_Company Profile'))

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Company Profile'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Profile'), 0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Company name'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Company name asterisk'), 
    0)

WebUI.setText(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_companyName'), 'Traction Tools Edit')

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Company phone number'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Company phone number asterisk'), 
    0)

WebUI.sendKeys(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_companyPhoneNum'), '9999999998')

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Industry'), 
    0)

WebUI.click(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_industry'))

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS11'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS111'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS112'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS113'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS114'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS115'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS21'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS211'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS212'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS213'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS22'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS23'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS236'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS237'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS238'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS311'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS312'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS313'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS314'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS315'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS316'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS31To33'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS321'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS322'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS323'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS324'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS325'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS326'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS327'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS331'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS332'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS333'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS334'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS335'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS336'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS337'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS339'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS42'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS423'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS424'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS425'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS441'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS442'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS443'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS444'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS446'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS447'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS448'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS44To45'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS451'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS452'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS453'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS454'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS481'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS482'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS483'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS484'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS485'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS486'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS487'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS488'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS48To49'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS491'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS492'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS493'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS51'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS511'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS512'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS515'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS516'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS517'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS518'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS519'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS52'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS521'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS522'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS523'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS524'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS525'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS53'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS531'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS532'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS533'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS54'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS55'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS56'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS561'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS562'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS61'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS62'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS621'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS622'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS623'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS624'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS71'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS711'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS712'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS713'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS72'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS721'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS722'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS81'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS811'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS812'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS813'), 0)

WebUI.verifyElementPresent(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS814'), 0)

WebUI.click(findTestObject('V2/Commons/IndustryOptions/dropdownIndustryOpt_NAICS531'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/span_Number of employees in the company'), 
    0)

WebUI.click(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_numOfEmployees'))

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/dropdownNumEmpOpt_0To10'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/dropdownNumEmpOpt_11To45'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/dropdownNumEmpOpt_46To100'), 
    0)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/dropdownNumEmpOpt_100Plus'), 
    0)

WebUI.click(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/dropdownNumEmpOpt_100Plus'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/button_Cancel'), 
    0)

WebUI.click(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/button_Save'))

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_companyName'), 
    0)

String act_companyName = WebUI.getAttribute(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_companyName'), 
    'value')

WebUI.verifyMatch(act_companyName, 'Traction Tools Edit', false)

WebUI.verifyElementText(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_companyPhoneNum'), 
    '9999999998')

WebUI.verifyElementText(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_industry'), 'Real Estate (NAICS 531)')

WebUI.verifyElementText(findTestObject('Archive/TC015_EditCompanyProfileFormProfile/Page_Company Profile/input_numOfEmployees'), 
    '100+')

