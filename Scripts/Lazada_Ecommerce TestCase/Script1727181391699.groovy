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

WebUI.navigateToUrl('https://www.lazada.com.ph/shop-womens-clothing/?dsource=share&laz_share_info=847165379_1_9300_1518862_847165379_null&laz_token=60e8824b08318f2ec8d94f1310b460df&trafficFrom=17449020_303586&laz_trackid=2:mm_162270686_52651525_2011751634:clkgg5r7n1i8hvlmb2eod6&mkttid=clkgg5r7n1i8hvlmb2eod6')

WebUI.setText(findTestObject('Object Repository/Page_Womens Clothes for sale - Clothes for _339aa3/input_Logout_q'), 'cat toys')

WebUI.sendKeys(findTestObject('Object Repository/Page_Womens Clothes for sale - Clothes for _339aa3/input_Logout_q'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Buy Cat Toys online  Lazada.com.ph/img_product'))

WebUI.click(findTestObject('Object Repository/Page_Cat Teaser Cat toy Imitation Birds Int_d2b2c5/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Cat Teaser Cat toy Imitation Birds Int_d2b2c5/i_(24)_next-icon next-icon-close next-icon-small'))

WebUI.click(findTestObject('Object Repository/Page_Cat Teaser Cat toy Imitation Birds Int_d2b2c5/span_Nice Cup Glass Bottle_cart-icon'))

WebUI.click(findTestObject('Object Repository/Page_Lazada.com.ph Online Shopping Philippi_3562bf/input_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Lazada.com.ph Online Shopping Philippi_3562bf/button_PROCEED TO CHECKOUT(1)'))

WebUI.closeBrowser()

