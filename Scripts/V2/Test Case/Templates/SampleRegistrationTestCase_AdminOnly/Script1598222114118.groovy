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

WebUI.callTestCase(findTestCase('V2/Test Case/Pre-conditions/PRE_RegisterNewAdminUserViaAPI'), [('email') : '', ('password') : GlobalVariable.password
        , ('firstname') : admin_fname, ('lastname') : lastname, ('phoneNumber') : '9999999999', ('company') : 'Traction Tools'
        , ('onboardingInfoValue') : '__JSON__{\\"howDidYouHearAboutUs\\":\\"Facebook\\",\\"implementer\\":\\"\\",\\"existingTractionToolsClient\\":\\"\\",\\"other\\":\\"\\"}'
        , ('settingsValue') : '__JSON__{\\"timeZone\\":\\"America/Guatemala\\",\\"brandColor\\":\\"#023047\\",\\"q1Start\\":null,\\"q1End\\":null,\\"q2Start\\":null,\\"q2End\\":null,\\"q3Start\\":null,\\"q3End\\":null,\\"q4Start\\":null,\\"q4End\\":null,\\"quarterDatesSetsRocks\\":false,\\"exportUsers\\":false,\\"exportRocks\\":false,\\"exportRocksIncludesMilestones\\":false,\\"exportScorecards\\":false,\\"exportTodos\\":false,\\"exportTodosIncludesNotes\\":false,\\"exportPeopleHeadlines\\":false,\\"exportPeopleHeadlinesIncludesNotes\\":false,\\"exportIssues\\":false,\\"exportIssuesIncludesNotes\\":false,\\"exportContextAwareTodos\\":false,\\"dateFormat\\":\\"MM/DD/YYYY\\",\\"timeFormat\\":\\"h:mma\\",\\"numberFormat\\":\\"-1,000.99\\",\\"supervisorsArchiveRestoreUsers\\":false,\\"supervisorsEditPositions\\":false,\\"milestonesAvailableToAll\\":false,\\"customMeetingTemplatesEnabled\\":false,\\"receiveTodoReminders\\":false,\\"todoReminderTime\\":\\"13:00\\",\\"todoReminderTimeZone\\":\\"America/Guatemala\\",\\"todoReminderFrequency\\":\\"DAILY\\",\\"vtoMeetingId\\":\\"\\",\\"vtoDisplayMode\\":\\"ALL\\",\\"coreValues\\":[{\\"id\\":\\"1\\",\\"text\\":\\"\\"},{\\"id\\":\\"2\\",\\"text\\":\\"\\"},{\\"id\\":\\"3\\",\\"text\\":\\"\\"}]}'
        , ('email_prefix') : admin_email_prefix, ('email_domain') : admin_email_domain, ('randomTextLength') : randomTextLength], 
    FailureHandling.STOP_ON_FAILURE)

