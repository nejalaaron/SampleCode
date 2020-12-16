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

WebUI.waitForElementVisible(findTestObject('V2/TT-238/VTO'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-238/VTO'))

WebUI.waitForElementVisible(findTestObject('V2/TT-238/VTO_3YearPictureTitle'), GlobalVariable.DefaultTimeout)

WebUI.click(findTestObject('V2/TT-238/VTO_3YearPictureTitle'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_3YearPictureTitle'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_3YearPictureTitle'), '3-YEAR PICTURE™')

WebUI.click(findTestObject('V2/TT-238/VTO_FutureDate'))

WebUI.click(findTestObject('V2/TT-238/VTO_SelectFutureDate'))

WebUI.click(findTestObject('V2/TT-238/VTO_DeleteFutureDate'))

WebUI.click(findTestObject('V2/TT-238/VTO_FutureDate'))

WebUI.click(findTestObject('V2/TT-238/VTO_SelectFutureDate'))

WebUI.click(findTestObject('V2/TT-238/VTO_Revenue'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Revenue'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Revenue'), 'Revenue')

WebUI.click(findTestObject('V2/TT-238/VTO_Profit'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Profit'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Profit'), 'Profit')

WebUI.click(findTestObject('V2/TT-238/VTO_Measurable'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Measurable'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Measurable'), 'Measurable')

WebUI.click(findTestObject('V2/TT-238/VTO_AddRevenue'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddRevenue'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddRevenue'), 'Revenue')

WebUI.click(findTestObject('V2/TT-238/VTO_AddProfit'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddProfit'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddProfit'), 'Profit')

WebUI.click(findTestObject('V2/TT-238/VTO_AddMeasurable'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddMeasurable'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddMeasurable'), 'Measurable')

WebUI.click(findTestObject('V2/TT-238/VTO_AddMeasurableButton'))

WebUI.click(findTestObject('V2/TT-238/VTO_Measurable2'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Measurable2'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_Measurable2'), 'Measurable')

WebUI.click(findTestObject('V2/TT-238/VTO_AddMeasurable2'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddMeasurable2'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_AddMeasurable2'), 'Measurable')

WebUI.mouseOver(findTestObject('V2/TT-238/VTO_DeleteMeasurable'))

WebUI.click(findTestObject('V2/TT-238/VTO_DeleteMeasurable'))

WebUI.click(findTestObject('V2/TT-238/VTO_LookLike'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike'), 'Look like 1')

WebUI.click(findTestObject('V2/TT-238/VTO_LookLike2'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike2'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike2'), 'Look like 2')

WebUI.click(findTestObject('V2/TT-238/VTO_LookLike3'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike3'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike3'), 'Look like 3')

WebUI.click(findTestObject('V2/TT-238/VTO_AddLookLikeButton'))

WebUI.click(findTestObject('V2/TT-238/VTO_LookLike4'))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike4'), Keys.chord(Keys.LEFT_CONTROL, 'a', Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('V2/TT-238/VTO_LookLike4'), 'Look like 4')

WebUI.mouseOver(findTestObject('V2/TT-238/VTO_DeleteLookLike'))

WebUI.click(findTestObject('V2/TT-238/VTO_DeleteLookLike'))

WebUI.delay(5)

