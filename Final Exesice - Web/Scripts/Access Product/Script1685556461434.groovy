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

WebUI.click(findTestObject('Object Repository/Login/button_login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login/h3_kasirAja'))

WebUI.click(findTestObject('Object Repository/Access Product/div_produk'))

WebUI.click(findTestObject('Object Repository/Access Product/tambahProduct'))

WebUI.setText(findTestObject('Object Repository/Access Product/input_nama_nama'), 'tas')

WebUI.setText(findTestObject('Object Repository/Access Product/input_deskripsi_deskripsi'), 'tas ini berbahan')

WebUI.setText(findTestObject('Object Repository/Access Product/input_harga beli_harga beli'), '100.000')

WebUI.setText(findTestObject('Object Repository/Access Product/input_harga jual_harga jual'), '150.000')

WebUI.setText(findTestObject('Object Repository/Access Product/input_stok_stok'), '10')

WebUI.click(findTestObject('Object Repository/Access Product/input_kategori_kategori'))

WebUI.click(findTestObject('Object Repository/Access Product/td_Umum'))

WebUI.click(findTestObject('Object Repository/Access Product/button_simpan'))

