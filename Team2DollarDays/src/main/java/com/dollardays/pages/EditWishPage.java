package com.dollardays.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditWishPage {

	WebDriver driver;
	WebDriverWait wait;

	public EditWishPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
	}

	@FindBy(xpath="//span[contains(text(),'Wishlist')]")
	WebElement wishlistmenu;
	public WebElement getwishlistmenu()
	{
		return wishlistmenu;
	}

	@FindBy(xpath="//a[contains(text(),'Create a Wishlist')]")
	WebElement Createwishlink;
	public WebElement getCreatewishlink()
	{
		return Createwishlink;
	}

	@FindBy(xpath = "//a[contains(text(),'Click here to manage')] ")
	WebElement Cheremnglink;
	public WebElement getheremnglink()
	{
		return Cheremnglink;
	}

	@FindBy(xpath="//a[@href='wishlistprofile.aspx']")
	WebElement orgneditlink;
	public WebElement getorgneditlink()
	{
		return orgneditlink;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtOrgName']")
	WebElement orgname;
	public WebElement getorgname()
	{
		return orgname;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtOrgWeb']")
	WebElement orgweb;
	public WebElement getorgweb()
	{
		return orgweb;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtContName']")
	WebElement orgcntname;
	public WebElement getcntname()
	{
		return orgcntname;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtEmail']")
	WebElement orgcntemail;
	public WebElement getcntemail()
	{
		return orgcntemail;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtEmailCopy']")
	WebElement orgcntemailcopy;
	public WebElement getcntemailcopy()
	{
		return orgcntemailcopy;
	}


	@FindBy(xpath="//input[@id='ctl00_cphContent_txtAdd1']")
	WebElement editadd1;
	public WebElement geteditadd1()
	{
		return editadd1;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtAdd2']")
	WebElement editadd2;
	public WebElement geteditadd2()
	{
		return editadd2;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtCity']")
	WebElement editcity;
	public WebElement geteditcity()
	{
		return editcity;
	}

	@FindBy(xpath="//select[@id='ctl00_cphContent_ddlstate']")
	WebElement editstate;
	public WebElement geteditstate()
	{
		return editstate;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtZip']")
	WebElement editzip;
	public WebElement geteditzip()
	{
		return editzip;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtPhone']")
	WebElement editphone;
	public WebElement geteditphone()
	{
		return editphone;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtExten']")
	WebElement editexten;
	public WebElement geteditexten()
	{
		return editexten;
	}

	@FindBy(xpath="//textarea[@id='ctl00_cphContent_txtorginfo']")
	WebElement editorginfo;
	public WebElement geteditorginfo()
	{
		return editorginfo;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_btnOrgUpdate']")
	WebElement updateinfobtn;
	public WebElement getupdateinfobtn()
	{
		return updateinfobtn;
	}

	//@FindBy(xpath="//a[@href='wishlistprojectevent.aspx']")
	@FindBy(xpath="//body/div[2]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h5[1]/a[1]")
	WebElement editprojlink;
	public WebElement geteditprojlink()
	{
		return editprojlink;
	}

	@FindBy(xpath="//input[@name='ctl00$cphContent$txtprojectname']")
	WebElement editprojname;
	public WebElement geteditprojname()
	{
		return editprojname;
	}

	@FindBy(xpath="//input[@name='ctl00$cphContent$txteventdate']")
	WebElement editprojdate;
	public WebElement geteditprojdate()
	{
		return editprojdate;
	}

	@FindBy(xpath="//textarea[@name='ctl00$cphContent$txtMission']")
	WebElement editprojdesc;
	public WebElement geteditprojdesc()
	{
		return editprojdesc;
	}

	@FindBy(xpath="//textarea[@name='ctl00$cphContent$txtThankMsg']")
	WebElement editthnkmsg;
	public WebElement geteditthnkmsg()
	{
		return editthnkmsg;
	}

	@FindBy(xpath="//label[normalize-space()='BROWSE']")
	WebElement editbrowserbtn;
	public WebElement geteditbrowserbtn()
	{
		return editbrowserbtn;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_btnOrgUpdate']")
	WebElement updateinfobtn2;
	public WebElement getupdateinfobtn2()
	{
		return updateinfobtn2;
	}


	@FindBy(xpath="//body/div[@id='ui-datepicker-div']/div[1]/a[2]")
	WebElement nextbtn;
	public WebElement getcalnnextbtn()
	{
		return nextbtn;
	}

	@FindBy(xpath="//a[normalize-space()='27']")
	WebElement calnday;
	public WebElement getcalnday()
	{
		return calnday;
	}


	@FindBy(xpath="//body/div[@id='ui-datepicker-div']/div[1]/div[1]")
	WebElement textcaln;
	public WebElement gettextcaln()
	{
		return textcaln;
	}


	@FindBy(xpath="//span[contains(text(),'My Wishlist')]")
	WebElement mywishlistlink;
	public WebElement getmywishlink()
	{
		return mywishlistlink;
	}

	@FindBy(xpath="//a[@href='wishlistproduct.aspx']")
	WebElement editproduct;
	public WebElement geteditproduct()
	{
		return editproduct;
	}

	@FindBy(xpath="//div[@class='alert alert-danger fade in alert-dismissable']")
	WebElement errmsg;
	public WebElement geterrmsg()
	{
		return errmsg;
	}

	@FindBy(xpath="//div[@class='alert alert-success fade in alert-dismissable']")
	WebElement successmsg;
	public WebElement getsuccessmsg()
	{
		return successmsg;
	}

	@FindBy(xpath="//input[@value='Add to Wish List »']")
	WebElement Addwishlistlnk;
	public WebElement getAddwishlistlnk()
	{
		return Addwishlistlnk;
	}

	@FindBy(xpath="//input[@name='ctl00$cphContent$btnClearCart']")
	WebElement clearcart;
	public WebElement getclearcart()
	{
		return clearcart;
	}

	@FindBy(xpath="//input[@name='ctl00$cphContent$btnUpdateCart']")
	WebElement updatecart;
	public WebElement getupdatecart()
	{
		return updatecart;
	}

	@FindBy(linkText = "Update Item")
	WebElement updateitem;
	public WebElement getupdateitem()
	{
		return updateitem;
	}

	@FindBy(linkText = "Remove Item")
	WebElement removeitem;
	public WebElement getremoveitem()
	{
		return removeitem;
	}


	@FindBy(xpath="//a[contains(text(),'View all')]")
	WebElement viewalllnk;
	public WebElement getviewalllnk()
	{
		return viewalllnk;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtStartDate']")
	WebElement startdate;
	public WebElement getstartdate()
	{
		return startdate;
	}

	@FindBy(xpath="//body/div[@id='ui-datepicker-div']/div[1]/a[1]")
	WebElement prevbtn;
	public WebElement getcalnprevbtn()
	{
		return prevbtn;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtEndDate']")
	WebElement enddate;
	public WebElement getenddate()
	{
		return enddate;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_btnFetchOrders']")
	WebElement submitbtn;
	public WebElement getsubmitbtn()
	{
		return submitbtn;
	}
	
	@FindBy(xpath = "/html/body/form/footer/div[2]/div")  
	WebElement Cookiespopup;


	@FindBy(xpath = "/html/body/form/footer/div[2]/div/p/input")  
	WebElement CookiesOkaybutton;
	
	@FindBy(xpath="//div[contains(text(),'Item successfully added to wishlist')]")
	WebElement itemsuccessmsg;
	public WebElement getitemsuccessmsg()
	{
		return itemsuccessmsg;
	}
	
	@FindBy(xpath="//input[@id='inputLoginUsername']")
	WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	
	@FindBy(xpath="//input[@id='inputLoginPassword']")
	WebElement password;
	public WebElement getpwd()
	{
		return password;
	}
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement signinbtn;
	public WebElement getsigninbtn()
	{
		return signinbtn;
	}
	

	public void clearallfield()
	{
		getorgname().clear();
		getorgweb().clear();
		getcntname().clear();
		getcntemail().clear();
		getcntemailcopy().clear();
		geteditadd1().clear();
		geteditadd2().clear();
		geteditcity().clear();
		geteditzip().clear();
		geteditphone().clear();
		geteditexten().clear();
		geteditorginfo().clear();
	}
	public void Editorgpage(String orgnname,String orgnweb,String contname, 
			String contemail, String emailcopy,String address1, String address2, String city, String state,String zip,
			String phno, String exten,String descorginfo) throws InterruptedException 
	{
		getorgname().sendKeys(orgnname);
		getorgweb().sendKeys(orgnweb);
		getcntname().sendKeys(contname);
		getcntemail().sendKeys(contemail);
		getcntemailcopy().sendKeys(emailcopy);
		geteditadd1().sendKeys(address1);
		geteditadd2().sendKeys(address2);
		geteditcity().sendKeys(city);
		geteditstate().click();
		selectvaluefromdropdown(state);
		geteditzip().sendKeys(zip);
		geteditphone().sendKeys(phno);
		geteditexten().sendKeys(exten);
		geteditorginfo().sendKeys(descorginfo);
		getupdateinfobtn().click();
	}


	public void selectvaluefromdropdown (String value)
	{
		//Select stat=new Select(driver.findElement(By.id("status")));
		// stat.selectByVisibleText("active");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_cphContent_ddlstate']")));
		select.selectByVisibleText(value);
	}


	public  void Clearfield2()
	{
		geteditprojname().clear();
		//geteditprojdate().clear();
		geteditprojdesc().clear();
		geteditthnkmsg().clear();
	}

	public void Editprojpage(String projname,String projdate,String descproj, String thnkmsg) throws Exception
	{
		geteditprojname().sendKeys(projname);
		geteditprojdate().click();
		Autodatepicker("March","10","2021");
		geteditprojdesc().sendKeys(descproj);
		geteditthnkmsg().sendKeys(thnkmsg);
		//geteditbrowserbtn().click();
		//FileuploadautoIT();
		getupdateinfobtn2().click();
	}

	public void wishorderhistory() throws Exception
	{
		getstartdate().click();
		Autodatepickstart("January","01", "2018");
		getenddate().click();
		Autodatepickend("December","31", "2019");
		getsubmitbtn().click();
		Thread.sleep(5000);
	}

	public void mousehover()
	{
		Actions act = new Actions(driver);
		WebElement searchimage = driver.findElement(By.xpath("//a[contains(text(),'Premium 75% Alcohol Wipes,​ 40 count pack')]"));
		//WebElement searchimage2 = driver.findElement(By.xpath("//a[contains(text(),'Freshscent Hand Sanitizer - 2 oz')]"));
		act.moveToElement(searchimage).click().build().perform();

	}

	public boolean errmsg(String Expecterr)
	{
		String err = geterrmsg().getText();
		if (Expecterr.equals(err)) {
			System.out.println(err);
			return true;
		}
		else
		{
			return false;
		}
	}
	

	public boolean successmsg(String Expectsuccess)
	{
		String success = getsuccessmsg().getText();
		if (Expectsuccess.equals(success)) {
			System.out.println(success);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean itemsuccessmsg(String Expectsuccess)
	{
		String itemsuccess = getitemsuccessmsg().getText();
		if (Expectsuccess.equals(itemsuccess)) {
			System.out.println(itemsuccess);
			return true;
		}
		else
		{
			return false;
		}
	}

	public void Autodatepicker(String month, String day, String year) throws Exception {

		Thread.sleep(2000);
		//Selecting the month and year.
		while(true) 
		{
			String text = gettextcaln().getText();
			if(text.equals(month+" "+year)) {
				break;
			}
			else
			{
				getcalnnextbtn().click();
			}
		} 
		//Selecting the date://div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a

		List<WebElement> days = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement d:days)
		{ 
			System.out.println(d.getText());
			if(d.getText().equals(day))
			{
				d.click();
				Thread.sleep(10000);
				return;
			}
		} 

	}

	public void Autodatepickstart(String month, String day, String year) throws Exception {

		Thread.sleep(2000);
		//Selecting the month and year.
		while(true) 
		{
			String text = gettextcaln().getText();
			if(text.equals(month+" "+year)) {
				break;
			}
			else
			{
				getcalnprevbtn().click();
			}
		} 
		//Selecting the date://div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a

		List<WebElement> days = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement d:days)
		{ 
			System.out.println(d.getText());
			if(d.getText().equals(day))
			{
				d.click();
				Thread.sleep(10000);
				return;
			}
		} 

	}

	public void Autodatepickend(String month, String day, String year) throws Exception {

		Thread.sleep(2000);
		//Selecting the month and year.
		while(true) 
		{
			String text = gettextcaln().getText();
			if(text.equals(month+" "+year)) {
				break;
			}
			else
			{
				getcalnprevbtn().click();
			}
		} 
		//Selecting the date://div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/div[2]/table/tbody/tr/td/a

		List<WebElement> days = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for (WebElement d:days)
		{ 
			System.out.println(d.getText());
			if(d.getText().equals(day))
			{
				d.click();
				Thread.sleep(10000);
				return;
			}
		} 

	}

	public void FileuploadautoIT() throws IOException
	{
		//getbrowserbtn().click();
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", browserbtn);
	    js.executeScript("arguments[0].click();", browserbtn);*/
		Runtime.getRuntime().exec("C://Users//sowmiya//Desktop//AutoItfiles//file1.exe");
	}
	
	public void waitVisibility(WebElement element) {		
		wait.until(ExpectedConditions.visibilityOf(element));
	}


	public void FindCookiepopup() {
		try {
			waitVisibility(Cookiespopup);
			CookiesOkaybutton.click();
			System.out.println("Cookiespopup Closed");
		}
		catch (Exception e) {
			System.out.println("No popup found"+e);
		}
	}

	public void loginWL()
	{
		getusername().sendKeys("sowmiyasn@gmail.com");
		getpwd().sendKeys("Sowmiyasn");
		getsigninbtn().click();
	}
}

