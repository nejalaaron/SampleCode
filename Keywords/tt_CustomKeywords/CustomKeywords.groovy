package tt_CustomKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import internal.GlobalVariable;
import java.util.HashMap;

import org.json.JSONObject
import org.json.JSONArray

public class CustomKeywords {


	/* ===========================================================================
	 * Keyword Name: VerifyTextContains
	 * Description: Verify if a certain text contains another text.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 */
	@Keyword
	def VerifyTextContains(String actualText, String expectedText) {
		if (actualText.contains(expectedText)) {
			KeywordUtil.markPassed('Text Matched.')
		} else {
			KeywordUtil.markFailed('Text did not match. \n Actual: ' + actualText + '\n Expected: ' + expectedText)
		}
	}

	/* ===========================================================================
	 * Keyword Name: CreateDynamicElement
	 * Description: Create a dynamic element and return the test object.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def TestObject CreateDynamicElement(String path, String wildCardValue, String selectorType) {
		TestObject to = new TestObject()
		String dynamicPath = String.format(path,wildCardValue)
		try {
			to.addProperty(selectorType, ConditionType.EQUALS, dynamicPath)
			KeywordUtil.markPassed("Successfully created new dynamic object: " + dynamicPath)
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to create dynamic object. \n" + e)
		}

		return to
	}

	/* ===========================================================================
	 * Keyword Name: GenerateRandomEmailAddress
	 * Description: Create a random email address
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def String GenerateRandomEmailAddress(String emailPrefix, String emailDomain, String strLen) {
		String generatedEmail = null;
		String alphaNumericString = "abcdefghijklmnopqrstuvxyz" + "0123456789"
		int emailLen = Integer.parseInt(strLen)
		try {
			StringBuilder sb = new StringBuilder(strLen);

			for (int i = 0; i < emailLen; i++) {
				// generate a random number between
				// 0 to AlphaNumericString variable length
				int index = (int)(alphaNumericString.length() * Math.random());

				// add Character one by one in end of sb
				sb.append(alphaNumericString.charAt(index));
			}

			generatedEmail = emailPrefix + sb.toString() + "@" + emailDomain
			KeywordUtil.markPassed("Successfully generated a random email: " + generatedEmail)
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to generate a random email. \n" + e)
		}

		return generatedEmail
	}

	/* ===========================================================================
	 * Keyword Name: GetTTActivationURL
	 * Description: Get Activation URL from Email
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def String GetTTActivationURL(String emailContent) {
		String from = "<"
		String to = ">"
		String url = "";

		try {
			url = emailContent.substring(emailContent.indexOf(from) + from.length(),emailContent.length());
			url = url.substring(0, url.indexOf(to));
			KeywordUtil.markPassed("Successfully get the E-Mail Activation Link: " + url)
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to get the E-Mail Activation Link. \n" + e)
		}

		return url
	}

	/* ===========================================================================
	 * Keyword Name: ChangeDownloadPath
	 * Description: Change the default download path
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def ChangeDownloadPath() {
		//Generate a File Path for download
		String home = System.getProperty("user.home");
		String DownloadsPath = new File(home+"/Downloads/")
		String Browsername = DriverFactory.getExecutedBrowser().getName()
		KeywordUtil.logInfo("Browsername:  " + Browsername)
		KeywordUtil.logInfo("Downloads Path:  " + DownloadsPath)
		if(Browsername == "CHROME_DRIVER" || Browsername == "HEADLESS_DRIVER") {
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>()

			chromePrefs.put("download.default_directory", DownloadsPath)
			chromePrefs.put("download.directory_upgrade", true)
			chromePrefs.put("browser.set_download_behavior", 'allow')
			chromePrefs.put("download.prompt_for_download", false)

			RunConfiguration.setWebDriverPreferencesProperty("prefs", chromePrefs)

			KeywordUtil.logInfo("-- CHANGED DOWNLOAD PATH TO: " + DownloadsPath)
			KeywordUtil.markPassed("Successfully changed the downloads path to: " + DownloadsPath + "\n")

		} else if(Browsername == "FIREFOX_DRIVER" || Browsername == "FIREFOX_HEADLESS_DRIVER"){

			HashMap<String, Object> profile = new HashMap<String, Object>()

			profile.put("browser.download.dir", DownloadsPath)
			profile.put("browser.download.folderList", 2)
			profile.put("browser.helperApps.neverAsk.saveToDisk", "application/pdf, application/octet-stream")
			profile.put("browser.helperApps.neverAsk.openFile", "application/pdf,application/octet-stream")
			profile.put("browser.download.manager.showWhenStarting",false);
			profile.put("pdfjs.disabled", true);
			profile.put('marionette', true)
			profile.put('browser.helperApps.alwaysAsk.force', false)
			profile.put('browser.download.downloadDir', DownloadsPath)
			profile.put('browser.download.defaultFolder', DownloadsPath)
			profile.put('browser.download.forbid_open_with', true)

			RunConfiguration.setWebDriverPreferencesProperty("firefox_profile", profile)

			KeywordUtil.logInfo("-- CHANGED DOWNLOAD PATH TO: " + DownloadsPath)
			KeywordUtil.markPassed("Successfully changed the downloads path to: " + DownloadsPath + "\n")

		} else{
			KeywordUtil.logInfo("-- CHANGE DOWNLOAD PATH FAILED --")
			KeywordUtil.markFailed("Failed to change the downloads path to: " + DownloadsPath + "\n")
		}
	}

	/* ===========================================================================
	 * Keyword Name: GenerateWindowsPath
	 * Description: Generate a windows string path under Users/<WindowsUsername>
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def GenerateWindowsPath(String path) {
		String home = System.getProperty("user.home");
		String DownloadsPath = new File(home+"/"+ path + "/")
	}

	/* ===========================================================================
	 * Keyword Name: DeleteFile
	 * Description: Delete a file based on a given file path
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def DeleteFile(String FilePath) {
		File fileToDelete = new File(FilePath)

		try {
			if(fileToDelete.exists()) {
				fileToDelete.delete()
				KeywordUtil.markPassed("Successfully deleted the file: " + fileToDelete.getAbsolutePath() + "\n")
			}
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to delete file. \n" + e)
		}
	}

	/* ===========================================================================
	 * Keyword Name: VerifyTextNotContains
	 * Description: Verify if a certain text contains another text.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 */
	@Keyword
	def VerifyTextNotContains(String actualText, String expectedText) {
		if (!actualText.contains(expectedText)) {
			KeywordUtil.markPassed('Text did NOT match. \n Actual: ' + actualText + '\n Expected: ' + expectedText)
		} else {
			KeywordUtil.markFailed('Found the expected text: ' + expectedText + 'in the base text: ' + actualText)
		}
	}

	/* ===========================================================================
	 * Keyword Name: CountElementInWebPageByDynamicElement
	 * Description: Count the dynamic element occurences in the webpage.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 */
	@Keyword
	def int CountElementInWebPageByDynamicElement(String path, String wildCardValue, String selectorType) {
		String dynamicPath = String.format(path,wildCardValue)
		int elementCount
		try {
			WebDriver driver = DriverFactory.getWebDriver()
			elementCount = driver.findElements(By.xpath(dynamicPath)).size()
			KeywordUtil.markPassed("Successfully get the element count. \nElement occurences in Webpage: " + elementCount)
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to get the element count. \n" + e)
		}

		return elementCount
	}

	/* ===========================================================================
	 * Keyword Name: CountElementInWebPageByTestObject
	 * Description: Count the testobject occurences in the webpage.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 */
	@Keyword
	def int CountElementInWebPageByTestObject(TestObject path, String selectorType) {
		String elementPath = path.getActiveXpaths().get(0).getValue()
		int elementCount
		System.out.println("ElementPath: " + elementPath)
		try {
			WebDriver driver = DriverFactory.getWebDriver()
			elementCount = driver.findElements(By.xpath(elementPath)).size()
			KeywordUtil.markPassed("Successfully get the element count. \nElement occurences in Webpage: " + elementCount)
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to get the element count. \n" + e)
		}

		return elementCount
	}

	/* ===========================================================================
	 * Keyword Name: GenerateRandomText
	 * Description: Create a random Text
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def String GenerateRandomText(String strLen) {
		String generatedRandomText = null;
		String alphaNumericString = "abcdefghijklmnopqrstuvxyz" + "0123456789"
		int stringLength = Integer.parseInt(strLen)
		try {
			StringBuilder sb = new StringBuilder(strLen);

			for (int i = 0; i < stringLength; i++) {
				// generate a random number between
				// 0 to AlphaNumericString variable length
				int index = (int)(alphaNumericString.length() * Math.random());

				// add Character one by one in end of sb
				sb.append(alphaNumericString.charAt(index));
			}

			generatedRandomText = sb.toString()
			KeywordUtil.markPassed("Successfully generated a random text: " + generatedRandomText)
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to generate a random text. \n" + e)
		}

		return generatedRandomText
	}

	/* ===========================================================================
	 * Keyword Name: RegisterAndActivateUserViaAPI
	 * Description: Register a traction tools User via API
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def String[] RegisterUserViaAPIAndGenerateActivateURL(String email, String firstname, String lastname, String phonenumber, String companyName,
			String onBoardingInfo, String settings, String password, String baseURL) throws IOException {

		String activationURL = "";

		String activationID = "";
		String userID = "";
		String orgAdminID = "";
		String orgID = "";
		String meetingsID = "";
		String teamsID = "";
		String usersID = "";
		String supervisorsID = "";
		String accountabilityChartID = "";

		try {
			//Request URLs
			String aPIbaseURL = GlobalVariable.APIUrl
			final String registrationBaseURL = aPIbaseURL + '/api/User/register'
			final String getActivationKeyBaseURL = aPIbaseURL + '/api/User/get-activation-key/'
			final String userActivationBaseURL = aPIbaseURL + '/api/User/activate'
			final String XKey = 'tractiontoolsapikey'
			//Request JSON Body
			String registerRequestPayload = '{"firstName": "'+ firstname +'", "lastName": "'+ lastname +'", "email": "'+ email +'", "phoneNumber": "'+ phonenumber +'", "companyName": "'+ companyName +'", "onBoardingInfo": "'+ onBoardingInfo +'", "settings": "'+ settings +'"}'

			//Setting up the Registration POST Request
			URL registerURL = new URL(registrationBaseURL);
			HttpURLConnection registerPOST = (HttpURLConnection) registerURL.openConnection();
			registerPOST.setRequestMethod("POST");
			registerPOST.setRequestProperty("Content-Type", "application/json");
			registerPOST.setRequestProperty("X-Key", XKey)
			registerPOST.setDoOutput(true);

			//Execute the Registration POST Request
			OutputStream os = registerPOST.getOutputStream();
			os.write(registerRequestPayload.getBytes());
			os.flush();
			os.close();

			//Get and print the response code of the Registration POST Request
			int responseCode = registerPOST.getResponseCode();
			System.out.println("POST Response Code :  " + responseCode);
			System.out.println("POST Response Message : " + registerPOST.getResponseMessage());

			//If the response code is 200(HTTP OK), extract the userActivationKey from the response and execute the Activation API
			if(responseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader input = new BufferedReader(new InputStreamReader(registerPOST.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while ((inputLine = input.readLine()) != null){
					response.append(inputLine);
				}
				input.close();
				// Print Registration POST Response
				System.out.println(response.toString());
				JSONObject jsonObject = new JSONObject(response.toString());

				activationID = jsonObject.getString("userActivationKey");
				userID = jsonObject.getString("userId");
				orgAdminID = jsonObject.getString("organizationAdminId");
				orgID = jsonObject.getString("organizationId");
				meetingsID = jsonObject.getString("meetingsId");
				teamsID = jsonObject.getString("teamsId");
				usersID = jsonObject.getString("usersId");
				supervisorsID = jsonObject.getString("supervisorsId");
				accountabilityChartID = jsonObject.getString("accountabilityChartId");

				System.out.println("User Activation Key: " +  activationID);
				System.out.println("User ID: " + userID);
				System.out.println("Org Admin ID: " + orgAdminID);
				System.out.println("Org ID: " + orgID);
				System.out.println("Meetings ID: " + meetingsID);
				System.out.println("Teams ID: " + teamsID);
				System.out.println("Users ID: " + usersID);
				System.out.println("Supervisors ID: " + supervisorsID);
				System.out.println("Accountability Chart ID: " + accountabilityChartID);

				//Generate Activation URL based from Registration response values
				activationURL = baseURL + '/activate?activationKey=' + activationID + '&userId=' + userID + '&orgId=' + orgID + '&email=' + email +
						'&teamsId=' + teamsID + '&meetingsId=' + meetingsID + '&adminsId=' + orgAdminID + '&usersId=' + usersID + '&supervisorsId=' + supervisorsID + '&accountabilityChartId=' +
						accountabilityChartID + '&isCreator=1';

				KeywordUtil.markPassed("SUCCESFFULLY registered a new user via API. \n Generated Activation Link: \n" + activationURL);

			} else { KeywordUtil.markFailed("FAILED register and activate the user via API."); }
		} catch(Exception e) {
			KeywordUtil.markFailed("FAILED register and activate the user via API. \n" + e);
		}

		String[] adminDetails = new String[2];
		adminDetails[0] = activationURL
		adminDetails[1] = orgID

		System.out.println(adminDetails.length)
		System.out.println('URL: ' + adminDetails[0])
		System.out.println('Org ID: ' + adminDetails[1])

		return adminDetails
	}

	/* ===========================================================================
	 * Keyword Name: RegisterAndActivateSupervisorUserViaAPI
	 * Description: Register a traction tools Supervisor User via API
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def String RegisterAndActivateSupervisorUserViaAPI(String baseURL, String orgID, String nonAdminEmail, String nonAdminPass, String adminEmail, String adminPass, String firstname, String lastname) throws IOException {

		String activationURL = "";

		try {
			//Request URLs
			String aPIbaseURL = GlobalVariable.APIUrl
			final String createUserBaseURL = aPIbaseURL + '/api/User/create';
			final String loginBaseURL = aPIbaseURL + '/api/User/login';
			final String XKey = 'tractiontoolsapikey';

			//Request JSON Bodies
			String createUserRequestPayload = '{"email":"'+ nonAdminEmail +'","isAdmin":false,"organizationId":"'+ orgID +'","firstName":"'+ firstname +'","lastName":"' + lastname + '","phoneNumber":"","supervisorId":"","profileUrl":"","status":"INVITE_SENT"}';
			String loginAdminUserRequestPayload = '{ "email": "'+ adminEmail +'", "password": "'+ adminPass + '"}';


			String bearerToken ='';
			String activationKey = '';
			String supervisor_userID = '';
			String admin_userID = '';
			String orgName = '';
			String token = '';

			//Get a bearer token from the admin account
			URL loginUserURL = new URL(loginBaseURL);
			HttpURLConnection loginUserPOST = (HttpURLConnection) loginUserURL.openConnection();
			loginUserPOST.setRequestMethod("POST");
			loginUserPOST.setRequestProperty("Content-Type", "application/json");
			loginUserPOST.setRequestProperty("X-Key", XKey)
			loginUserPOST.setDoOutput(true);

			//Execute the Login User POST Request
			OutputStream login_os = loginUserPOST.getOutputStream();
			login_os.write(loginAdminUserRequestPayload.getBytes());
			login_os.flush();
			login_os.close();

			//Get and print the response code of the Registration POST Request
			int loginUserResponseCode = loginUserPOST.getResponseCode();
			System.out.println("POST Response Code :  " + loginUserResponseCode);
			System.out.println("POST Response Message : " + loginUserPOST.getResponseMessage());

			if(loginUserResponseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader input = new BufferedReader(new InputStreamReader(loginUserPOST.getInputStream()));
				String inputLine;
				StringBuffer loginUserResponse = new StringBuffer();
				while ((inputLine = input.readLine()) != null){
					loginUserResponse.append(inputLine);
				}
				input.close();

				// Print Create User POST Response
				System.out.println(loginUserResponse.toString());
				JSONObject jsonObject = new JSONObject(loginUserResponse.toString());

				token = jsonObject.getString("token");
				admin_userID = jsonObject.getString("userId");

				System.out.println("Access Token: " +  token);
				System.out.println("Admin User ID: " +  supervisor_userID);
			}

			//Setting up the Create User POST Request
			bearerToken = 'Bearer ' + token
			URL createUserURL = new URL(createUserBaseURL);
			HttpURLConnection createUserPOST = (HttpURLConnection) createUserURL.openConnection();
			createUserPOST.setRequestMethod("POST");
			createUserPOST.setRequestProperty("Content-Type", "application/json");
			createUserPOST.setRequestProperty("X-Key", XKey)
			createUserPOST.setRequestProperty("Authorization", bearerToken)
			createUserPOST.setDoOutput(true);

			//Execute the Create User POST Request
			OutputStream os = createUserPOST.getOutputStream();
			os.write(createUserRequestPayload.getBytes());
			os.flush();
			os.close();

			//Get and print the response code of the Registration POST Request
			int createUserResponseCode = createUserPOST.getResponseCode();
			System.out.println("POST Response Code :  " + createUserResponseCode);
			System.out.println("POST Response Message : " + createUserPOST.getResponseMessage());

			//If the response code is 200(HTTP OK), extract the values from the response and generate the activation URL
			if(createUserResponseCode == HttpURLConnection.HTTP_OK) {
				BufferedReader input = new BufferedReader(new InputStreamReader(createUserPOST.getInputStream()));
				String inputLine;
				StringBuffer createUserResponse = new StringBuffer();
				while ((inputLine = input.readLine()) != null){
					createUserResponse.append(inputLine);
				}
				input.close();

				// Print Create User POST Response
				System.out.println(createUserResponse.toString());
				JSONObject jsonObject = new JSONObject(createUserResponse.toString());

				activationKey = jsonObject.getString("userActivationKey");
				supervisor_userID = jsonObject.getString("userId");
				orgName = jsonObject.getString("organizationName");

				System.out.println("User Activation Key: " +  activationKey);
				System.out.println("Supervisor User ID: " +  supervisor_userID);
				System.out.println("Organization Name: " +  orgName);


				//Generate Activation URL based from Registration response values
				activationURL = baseURL + '/activate?activationKey=' + activationKey + '&userId=' + supervisor_userID + '&orgId=' + orgID + '&email=' + nonAdminEmail + '&isCreator=0'

				KeywordUtil.markPassed("SUCCESFFULLY registered a new user via API. \n Generated Activation Link: \n" + activationURL);

			} else { KeywordUtil.markFailed("FAILED register and activate the user via API."); }
		} catch(Exception e) {
			KeywordUtil.markFailed("FAILED register and activate the user via API. \n" + e);
		}

		return activationURL

	}

	/* ===========================================================================
	 * Keyword Name: Close WebDriver
	 * Description: Close a specific WebDriver instance.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 */
	@Keyword
	def CloseWebDriver(WebDriver driver) {
		try {
			driver.close()
			driver.quit()
			if(driver == null){
				KeywordUtil.markPassed('Successfully quit the WebDriver Instance.\n')
			}

		} catch(Exception e) {
			KeywordUtil.markFailed("Failed quit the WebDriver Instance.\n" + e)
		}
	}

	/* ===========================================================================
	 * Keyword Name: Clear Text
	 * Description: Clear field text.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 */

	@Keyword
	def ClearElementText(TestObject to) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(to,30)
			WebUI.executeJavaScript("arguments[0].value=''", Arrays.asList(element))
		}
		catch(Exception e) {
			KeywordUtil.markFailed("Failed to Clear Text.\n" + e)
		}
	}

	/* ===========================================================================
	 * Keyword Name: WaitForElementVisibleThenClick
	 * Description: Wait For an Element to be visible then click.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def void WaitForElementVisibleThenClick(TestObject element, int objectTimeout) {
		try {
			WebUI.waitForElementVisible(element, objectTimeout)

			if (WebUI.verifyElementVisible(element)) {
				WebUI.click(element)
			}
			KeywordUtil.markPassed("Successfully verified and clicked the element")
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to verify and click the element \n" + e)
		}
	}

	/* ===========================================================================
	 * Keyword Name: WaitForElementVisibleThenSetText
	 * Description: Wait For an Element to be visible then set text to element.
	 * Author: Aaron Nejal
	 * Email: aaron@mytractiontools.com
	 * ===========================================================================
	 * */
	@Keyword
	def void WaitForElementVisibleThenSetText(TestObject element, int objectTimeout, String textVal) {
		try {
			WebUI.waitForElementVisible(element, objectTimeout)

			if (WebUI.verifyElementVisible(element)) {
				WebUI.setText(element, textVal)
			}
			KeywordUtil.markPassed("Successfully verified and clicked the element")
		} catch(Exception e) {
			KeywordUtil.markFailed("Failed to verify and click the element \n" + e)
		}
	}

}
