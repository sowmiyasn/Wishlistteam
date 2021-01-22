package com.dollardays.testcases;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
//import java.util;

//import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
//import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.CreateWishlistPage;
import com.dollardays.pages.LoginPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class CreateWishlistTestcase extends BaseTest {

	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC2", runmode="Yes")
	@Test(priority = 1,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_02_Validatemandtoryfield1(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException
	{
		CreateWishlistPage c1 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase2: Check the error msg for organization in creation page");
		c1.getwishlistmenu().click();
		
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");
		c1.FindCookiepopup();
		c1.getCreatewishlink().click();
	
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");

		LoginPage lp = new LoginPage(driver);
		lp.invokeLogin();
		ExtentTestManager.getTest().log(Status.INFO, "Step3: Login page should be displayed");
		c1.getwishlistmenu().click();
		c1.getCreatewishlink().click();

		c1.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.INFO, "Step 4 : Dont enter any data for mandatory fields and check the error msg");


		boolean value = c1.compareerrmsg("Error\nOrganization name is required.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");

	}


	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC3", runmode="Yes")
	@Test(priority = 2,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_03_Validatemandtoryfield2(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException
	{
		CreateWishlistPage c2 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase3: Check the error msg for Email field in creation page");
		c2.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");
		
		c2.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");

		ExtentTestManager.getTest().log(Status.INFO, "Step3: Enter invalid email");
		c2.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.PASS, "Step 4 : Dont enter any data for mandatory fields and check the error msg");

		boolean value = c2.compareerrmsg("Error\nEmail is not valid.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");

	}

	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC4", runmode="Yes")
	@Test(priority = 3,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_04_Validatemandtoryfield3(Hashtable<String, String> datatable) throws IOException, InterruptedException, GeneralSecurityException 
	{
		CreateWishlistPage c3 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase4: Check the error msg for Address field in creation page");
		c3.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");
		c3.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");
		
		ExtentTestManager.getTest().log(Status.INFO, "Step3: Dont enter data in address field");

		c3.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.INFO, "Step 4 : Dont enter any data for mandatory fields and check the error msg");

		boolean value = c3.compareerrmsg("Error\nShip Address(Line 1) is required.");
		try {
				Assert.assertTrue(value);
				ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
			}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");
	}


	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC5", runmode="Yes")
	@Test(priority = 4,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_05_Validatemandtoryfield4(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException 
	{

		CreateWishlistPage c4 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase5: Check the error msg for City field in creation page");
		
		c4.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");
		c4.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");
		
		ExtentTestManager.getTest().log(Status.INFO, "Step3: Dont enter data in city field");

		c4.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.INFO, "Step 4 : Dont enter any data for mandatory fields and check the error msg");


		boolean value = c4.compareerrmsg("Error\nShip city is required.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");
	}

	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC6", runmode="Yes")
	@Test(enabled = false,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_06_Validatemandtoryfield5(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException
	{
		CreateWishlistPage c5 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase6: Check the error msg for State field in creation page");
		c5.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");
		
		c5.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");
		
		ExtentTestManager.getTest().log(Status.INFO, "Step3: Dont select state");

		c5.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.INFO, "Step 4 : Dont enter any data for mandatory fields and check the error msg");

		boolean value = c5.compareerrmsg("Error\nShip state is required.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");
	}

	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC7", runmode="Yes")
	@Test(priority = 5,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_07_Validatemandtoryfield6(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException
	{
		CreateWishlistPage c6 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase7: Check the error msg for Zipcode field in creation page");
		c6.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");

		c6.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");

		ExtentTestManager.getTest().log(Status.INFO, "Step3: Dont enter zipcode email");
		c6.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.INFO, "Step 4 : Dont enter any data for mandatory fields and check the error msg");

		boolean value = c6.compareerrmsg("Error\nShip zip code is required.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");	
	}

	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createwishdata", testcaseID="TC8", runmode="Yes")
	@Test(priority = 6,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_08_Validatemandtoryfield7(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException
	{
		CreateWishlistPage c7 = new CreateWishlistPage(driver);
		ExtentTestManager.getTest().log(Status.INFO, "TestCase7: Check the error msg for Phoneno field in creation page");
		c7.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the wishlist menu");

		c7.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: Click on the create wishlist submenu");

		ExtentTestManager.getTest().log(Status.INFO, "Step3: Dont enter data in phoneno");

		c7.createpage1(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));
		ExtentTestManager.getTest().log(Status.INFO, "Step 4 : Dont enter any data for mandatory fields and check the error msg");

		boolean value = c7.compareerrmsg("Error\nPhone is required and must include area code.");
		try {
				Assert.assertTrue(value);
				ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
			}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		ExtentTestManager.getTest().log(Status.PASS, "Step 5: Check the error message is displaying properly");	
	}
	
	@DDDataProvider(datafile="testdata/Createwishdata1.xlsx",sheetName = "Createpage2", testcaseID="TC1", runmode="Yes")
	@Test(priority = 7,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void invokecreatewish(Hashtable<String, String> datatable) throws Throwable
	{

		ExtentTestManager.getTest().log(Status.INFO, "Testcase1: Create the wishlist for new user.");
		CreateWishlistPage Create = new CreateWishlistPage(driver);
		Create.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: click on the wishlist menu and displaying drop down list");
		
		Create.getCreatewishlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2: click on the create a wishlink sub menu");
		String Expectcreateurl = driver.getCurrentUrl();
		String Actualurl = "";
		System.out.println("the URL for create wishlist page" + Expectcreateurl);
		if (Expectcreateurl.equals("Actualurl"))
		{
			Assert.assertEquals(Actualurl, Expectcreateurl);

		}
		
		TestUtil tst = new TestUtil();
		//Hashtable dt;// Hashtable<>();
		Object[][] dt= null;
		dt = tst.getData("testdata/Createwishdata1.xlsx", "Createwishdata", "TC1", "Yes");

		ExtentTestManager.getTest().log(Status.INFO, "Step3: User can enter valid data in all fields");
		Create.createpage1((String)((Hashtable)dt[0][0]).get("orgnname"), (String)((Hashtable)dt[0][0]).get("orgnweb"), (String)((Hashtable)dt[0][0]).get("contname"), (String)((Hashtable)dt[0][0]).get("contemail"), 
				(String)((Hashtable)dt[0][0]).get("emailcopy"),(String)((Hashtable)dt[0][0]).get("address1") ,(String)((Hashtable)dt[0][0]).get("address2") , 
				(String)((Hashtable)dt[0][0]).get("city"),(String)((Hashtable)dt[0][0]).get("state"), (String)((Hashtable)dt[0][0]).get("zip"), (String)((Hashtable)dt[0][0]).get("phno"), (String)((Hashtable)dt[0][0]).get("exten"), 
				(String)((Hashtable)dt[0][0]).get("descorginfo"));
		Thread.sleep(3000);

		Create.createpage2(datatable.get("projname"), datatable.get("projdate"), datatable.get("descproj"), datatable.get("thnkmsg"), datatable.get("yourweb"));
		ExtentTestManager.getTest().log(Status.INFO, "Step4: User can able to create the wishlist successfully.");
	}


}
