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
import org.openqa.selenium.Keys as Keys

Random random = new Random()
int lenghText = random.nextInt(100)
WebUI.openBrowser("https://www.blindtextgenerator.com/lorem-ipsum")
WebUI.maximizeWindow()
WebUI.takeScreenshotAsCheckpoint('base_line', FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Object Repository/Page_Dummy_Text/input_Number_idInputWords'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Dummy_Text/input_Number_idInputWords'), lenghText.toString())
WebUI.takeScreenshotAsCheckpoint('gen_Text', FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
//WebUI.verify