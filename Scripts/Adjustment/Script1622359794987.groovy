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

WebUI.navigateToUrl('http://bor4test/Deployment/UI/Default.aspx')

WebUI.maximizeWindow()

//Credintials
WebUI.setText(findTestObject('Object Repository/Page_Login Page/input_Sign in as a power user_TextBoxUserName'), 'administrator')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page/input_Sign in as a power user_TextBoxPassword'), 
    '/5S6MFFLcE4mlsixtc6/Tg==')

//Navigating to Adjustment
WebUI.click(findTestObject('Object Repository/Page_Login Page/input_Please type your email address_ButtonSignIn'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Data Assessment'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_'))

WebUI.click(findTestObject('Object Repository/Page_Home/span_Adjustment'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/img'))

//Fill the blank
WebUI.setText(findTestObject('Object Repository/Page_Adjustment/input__ctl00ContentPlaceHolderMasterContent_db7577'), 'Adj_test')

WebUI.setText(findTestObject('Object Repository/Page_Adjustment/input_Description_ctl00ContentPlaceHolderMa_1cca1b'), 'Adj_test_desc')

//Pick desired date (FROM)
WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_Open the calendar popup'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/td_May 2021'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_2014'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_Jan'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/input_Calendar_rcMView_OK'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_4'))

//Pick desired date (TO)
WebUI.click(findTestObject('Object Repository/Page_Adjustment/SecondCalender'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/TopClick'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/BakwardClick2'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_2014_2'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_Jan_ffff'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/Ok_2'))

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_4_2'))

//Save and close
WebUI.click(findTestObject('Object Repository/Page_Adjustment/input_Type_ctl00ContentPlaceHolderMasterCon_8f7081'))

//Filter
WebUI.setText(findTestObject('Object Repository/Page_Adjustment/Adjustment_Desc'), 'Adj_test_desc')

WebUI.click(findTestObject('Object Repository/test/Page_Adjustment/input_Adjustment Type_ctl00ContentPlaceHold_2cefbc'))

WebUI.scrollToElement(findTestObject('Page_Adjustment/span_Contains'), 1)

WebUI.click(findTestObject('Object Repository/Page_Adjustment/a_Implemenation'))

//WebUI.selectOptionByLabel(findTestObject('Object Repository/test/Page_Adjustment/span_Contains'), 'Contains', false)
//WebUI.click(findTestObject('Object Repository/Page_Adjustment/Contains'))
//Handling Iframe area
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Adjustment/Ledger'), '2801', true)

WebUI.selectOptionByIndex(findTestObject('Iframe_Handling/Page_Adjustment/newCurr'), '72')

WebUI.selectOptionByIndex(findTestObject('Iframe_Handling/Page_Adjustment/newAcc'), '6')

WebUI.selectOptionByIndex(findTestObject('Iframe_Handling/Page_Adjustment/Iframe_AccKey'), '2')

WebUI.sendKeys(findTestObject('Object Repository/Page_Adjustment/Credit'), 1000)






