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

WebUI.click(findTestObject('Object Repository/Access Category/div_kategori'))

WebUI.click(findTestObject('Object Repository/Access Category/tambahCategory'))

WebUI.setText(findTestObject('Object Repository/Access Category/input_nama_nama'), 'Khusus')

WebUI.setText(findTestObject('Object Repository/Access Category/input_deskripsi_deskripsi'), 'ini adalah kategori khusus')

WebUI.click(findTestObject('Object Repository/Access Category/button_simpan'))

WebUI.click(findTestObject('Object Repository/Access Category/button_action'))

WebUI.click(findTestObject('Object Repository/Access Category/a_ubah'))

WebUI.setText(findTestObject('Object Repository/Access Category/input_deskripsi_deskripsi'), 'ini adalah kategori khusus- edit')

WebUI.click(findTestObject('Object Repository/Access Category/button_simpan'))


