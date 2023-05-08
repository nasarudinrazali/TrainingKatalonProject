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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Page_DEMOQA/input_Name_firstName', [('firstName') : firstName]), firstName)

WebUI.setText(findTestObject('Page_DEMOQA/input_Name_lastName', [('lastName') : lastName]), 'colo')

WebUI.setText(findTestObject('Page_DEMOQA/input_Email_userEmail', [('email') : email]), email)

WebUI.click(findTestObject('Page_DEMOQA/label_Male', [('male') : gender]))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_(10 Digits)_userNumber'), '0111234567')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '08 May 2023')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2008', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2008', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_6'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'TestA')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Sports'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Sports'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Reading'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Reading'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Music'))

WebUI.switchToWindowTitle('dummy image - Google Zoeken')

WebUI.switchToWindowTitle('DEMOQA')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Pluto 909')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/img'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Uttar Pradesh'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Lucknow'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Close'))

WebUI.closeBrowser()

