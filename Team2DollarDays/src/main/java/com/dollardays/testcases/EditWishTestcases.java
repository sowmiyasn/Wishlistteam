package com.dollardays.testcases;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.EditWishPage;
//import com.dollardays.pages.LoginPage;
import com.dollardays.pages.SearchPage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class EditWishTestcases extends BaseTest {

	@DDDataProvider(datafile="testdata/Editorgdata.xlsx",sheetName = "Editorgdata", testcaseID="TC1", runmode="Yes")
	@Test(priority = 8,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_01_editorgpage(Hashtable<String, String> datatable) throws UnsupportedEncodingException, InterruptedException, GeneralSecurityException
	{
		ExtentTestManager.getTest().log(Status.INFO, "Testcase1: Check whether user can able to edit the organization information");
		EditWishPage editorg = new EditWishPage(driver);
		editorg.getwishlistmenu().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step1: Click on the create a wishlist sub menu");
		editorg.getCreatewishlink().click();

		ExtentTestManager.getTest().log(Status.INFO, "Step2: User should login with valid credentials");
		//LoginPage lgn = new LoginPage(driver);
		//lgn.invokeLogin();
		editorg.loginWL();

		Thread.sleep(2000);
		editorg.getwishlistmenu().click();
		editorg.getCreatewishlink().click();

		Thread.sleep(2000);
		editorg.FindCookiepopup();

		editorg.getheremnglink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step3: Click on the click here to manager");
		editorg.getorgneditlink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step4: Click on the organization edit link");



		editorg.clearallfield();
		ExtentTestManager.getTest().log(Status.INFO, "Step5: Check whether all fields are cleared");
		Thread.sleep(3000);

		ExtentTestManager.getTest().log(Status.PASS, "Step6: check whether the data is loading from datatable");
		editorg.Editorgpage(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"),datatable.get("address1") ,datatable.get("address2"), 
				datatable.get("city"),datatable.get("state") ,datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), 
				datatable.get("descorginfo"));

		ExtentTestManager.getTest().log(Status.PASS, "Step7: Check the successful message");
		boolean value = editorg.successmsg("×\nAlert! Update successful !");
		try {
			if(value == true) {
				Assert.assertTrue(true);
				ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
			}else {
				ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		driver.navigate().back();
		editorg.getmywishlink().click();

	}
	@DDDataProvider(datafile="testdata/Editorgdata.xlsx",sheetName = "editprojdata", testcaseID="TC1", runmode="Yes")
	@Test(priority = 9,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_02_projpage(Hashtable<String, String> datatable) throws Exception
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase2: Check whether the user can able to edit the project information");
		EditWishPage editproj = new EditWishPage(driver);

		ExtentTestManager.getTest().log(Status.PASS, "Step1: Click on the project edit link");
		editproj.geteditprojlink().click();

		editproj.Clearfield2();
		ExtentTestManager.getTest().log(Status.PASS, "Step2: Check whether fields are getting clear");
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step3: check whether the data is loading from datatable");
		editproj.Editprojpage(datatable.get("projname"), datatable.get("projdate"), datatable.get("descproj"), datatable.get("thnkmsg"));
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step4: Check the successful message");
		boolean value = editproj.successmsg("×\nAlert! Update successful!");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		driver.navigate().back();

	}

	@Test(priority = 10)
	public void TC_03_editproduct() throws Throwable
	{
		ExtentTestManager.getTest().log(Status.PASS, "Testcase3: check whether user can able to add/remove the item");
		EditWishPage editprod = new EditWishPage(driver);

		ExtentTestManager.getTest().log(Status.PASS, "Step1: Click on the My wishlist link on the panel");
		editprod.getmywishlink().click();

		ExtentTestManager.getTest().log(Status.PASS, "Step2: Click on the wishlist product edit link");
		editprod.geteditproduct().click();
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step3: Click on the search bar");
		SearchPage sp = new SearchPage(driver);
		sp.getSearchBar().click();
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step4: Search any product in search bar fields");

		sp.getSearchBar().sendKeys("wipes");	
		//sp.getSearchBar().sendKeys("sanitizer");

		ExtentTestManager.getTest().log(Status.PASS, "Step5: Click on the search button");
		sp.getsearchBtn().click();

		ExtentTestManager.getTest().log(Status.PASS, "Step6: Click on the any prodcut link which is displaying");
		editprod.mousehover();
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step7: add the items for wishlist cart");
		editprod.getAddwishlistlnk().click();
		Thread.sleep(2000);
		boolean value = editprod.itemsuccessmsg("Item successfully added to wishlist");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the success msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the success msg is displaying as per expected");
		}

		editprod.getwishlistmenu().click();
		editprod.getCreatewishlink().click();
		editprod.getheremnglink().click();
		editprod.geteditproduct().click();
		ExtentTestManager.getTest().log(Status.PASS, "Step8: Check whether the items are added successfully");

		driver.navigate().back();

	}
	@Test(enabled = false)
	public void wishorder() throws Exception
	{
		EditWishPage editorder = new EditWishPage(driver);
		editorder.getmywishlink().click();
		Thread.sleep(2000);
		editorder.getviewalllnk().click();
		Thread.sleep(2000);
		//editorder.getstartdate().click();
		editorder.wishorderhistory();

	}
	@DDDataProvider(datafile="testdata/Editorgdata.xlsx",sheetName = "Editorgdata", testcaseID="TC2", runmode="Yes")
	@Test(priority = 11,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_04_orgnpage(Hashtable<String, String> datatable) throws IOException, InterruptedException, GeneralSecurityException
	{
		ExtentTestManager.getTest().log(Status.PASS, "TestCases4: Check the error message is displaying for the mandatory fields");
		EditWishPage e1 = new EditWishPage(driver);

		ExtentTestManager.getTest().log(Status.PASS,"Step1: Click on the edit link for organization page");
		e1.getorgneditlink().click();

		e1.clearallfield();
		ExtentTestManager.getTest().log(Status.PASS, "Step2: Check whether all fields are cleared");
		Thread.sleep(3000);

		ExtentTestManager.getTest().log(Status.PASS, "Step3: check whether the data is loading from datatable");
		e1.Editorgpage(datatable.get("orgnname"), datatable.get("orgnweb"), datatable.get("contname"), datatable.get("contemail"), 
				datatable.get("emailcopy"), datatable.get("address1"), datatable.get("address2"), datatable.get("city"), 
				datatable.get("state"), datatable.get("zip"), datatable.get("phno"), datatable.get("exten"), datatable.get("descorginfo"));


		ExtentTestManager.getTest().log(Status.PASS, "Step4: Check the error message");
		boolean value = e1.errmsg("×\nAlert! Organization name is required.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the error msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the error msg is displaying as per expected");
		}
		driver.navigate().back();
		e1.getmywishlink().click();


	}

	@DDDataProvider(datafile="testdata/Editorgdata.xlsx",sheetName = "editprojdata", testcaseID="TC2", runmode="Yes")
	@Test(priority = 12,dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void TC_05_projpage(Hashtable<String, String> datatable) throws Exception
	{
		ExtentTestManager.getTest().log(Status.PASS, "TestCases4: Check the error message is displaying for the mandatory fields");
		EditWishPage e2 = new EditWishPage(driver);

		ExtentTestManager.getTest().log(Status.PASS,"Step1: Click on the edit link for organization page");
		e2.geteditprojlink().click();

		e2.Clearfield2();
		ExtentTestManager.getTest().log(Status.PASS, "Step2: Check whether all fields are cleared");
		Thread.sleep(3000);

		ExtentTestManager.getTest().log(Status.PASS, "Step3: check whether the data is loading from datatable");
		e2.Editprojpage(datatable.get("projname"), datatable.get("projdate"), datatable.get("descproj"), datatable.get("thnkmsg"));
		Thread.sleep(2000);

		ExtentTestManager.getTest().log(Status.PASS, "Step4: Check the error message");
		boolean value = e2.errmsg("×\nAlert! Project name is required.");
		try {
			Assert.assertTrue(value);
			ExtentTestManager.getTest().log(Status.PASS, "Check the error msg is displaying as per expected");
		}
		catch(Exception e)
		{
			ExtentTestManager.getTest().log(Status.FAIL, "Check the error msg is displaying as per expected");
		}
		driver.navigate().back();


	}
}
