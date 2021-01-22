package com.dollardays.pages;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateWishlistPage {

	//private static final String List = null;
	//static final String day = null;
	WebDriver driver;
	public WebDriverWait wait;


	public CreateWishlistPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 30);
	}

	@FindBy(xpath="//span[contains(text(),'Wishlist')] ")
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

	@FindBy(xpath="//a[@href='wishlistproduct.aspx']")
	WebElement prodeditlink;
	public WebElement getprodemaillink()
	{
		return prodeditlink;
	}
	/*@FindBy(xpath="//a[@href='wishlistprofile.aspx']")
	WebElement orgeditlnk;*/

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtorgname'] ")
	WebElement orgname;
	public WebElement getorgname()
	{
		return orgname;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtorgwebsite']")
	WebElement orgweb;
	public WebElement getorgweb()
	{
		return orgweb;
	}
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtcustname']")
	WebElement contname;
	public WebElement getcontname()
	{
		return contname;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtemail']")
	WebElement contemail;
	public WebElement getcontemail()
	{
		return contemail;

	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtemailreceipt']")
	WebElement emailcopy;
	public WebElement getemailcopy()
	{
		return emailcopy;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtshipaddress1']")
	WebElement address1;
	public WebElement getaddress1()
	{
		return address1;
	}

	@FindBy(xpath = "//input[@id='ctl00_cphContent_txtshipaddress2']")
	WebElement address2;
	public WebElement getaddress2()
	{
		return address2;
	}

	@FindBy(xpath ="//input[@id='ctl00_cphContent_txtshipcity']")
	WebElement city;
	public WebElement getcity()
	{
		return city;
	}

	@FindBy(xpath="//select[@id='ctl00_cphContent_drdshipstate'] ")
	WebElement state;
	public WebElement getstate()
	{
		return state;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtshipzipcode']")
	WebElement zipcode;
	public WebElement getzip()
	{
		return zipcode;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtphone']")
	WebElement phoneno;
	public WebElement getphno()
	{
		return phoneno;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtext']")
	WebElement extn;
	public WebElement getexten()
	{
		return extn;
	}

	@FindBy(xpath="//textarea[@id='ctl00_cphContent_txtdescorg']")
	WebElement descorginfo;
	public WebElement getdescorginfo()
	{
		return descorginfo;
	}

	@FindBy(xpath="//button[@id='ctl00_cphContent_btnStep1']")
	WebElement nextstep;
	public WebElement getnextstep()
	{
		return nextstep;
	}

	/*@FindBy(xpath="//input[@name=’ ctl00$cphContent$btnOrgUpdate’]")
	WebElement updateinfo;*/

	@FindBy(xpath="//input[@type='radio']")
	WebElement radiobutton;
	public WebElement radiobutton()
	{
		return radiobutton;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtprojectname']")
	WebElement projname;
	public WebElement getprojectname() 
	{
		return projname;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txteventdate']")
	WebElement projdate;
	public WebElement getprojdate()
	{
		return projdate;
	}

	@FindBy(xpath="//textarea[@id='ctl00_cphContent_txtMission']")
	WebElement descproj;
	public WebElement getdescproj()
	{
		return descproj;
	}

	@FindBy(xpath="//textarea[@id='ctl00_cphContent_txtThanksmsg']")
	WebElement thnkmsg;
	public WebElement getthnkmsg()
	{
		return thnkmsg;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtYourOrg']")
	WebElement yourweb;
	public WebElement getyourweb()
	{
		return yourweb;
	}

	@FindBy(xpath="//label[normalize-space()='BROWSE']")
	WebElement browserbtn;
	public WebElement getbrowserbtn()
	{
		return browserbtn;
	}

	@FindBy(xpath="//input[@id='ctl00_cphContent_txtlogo']")
	WebElement logofld;
	public WebElement getlogofld()
	{
		return logofld;
	}

	@FindBy(xpath="//button[@id='ctl00_cphContent_btnStep2']")
	WebElement nextstep2;
	public WebElement getnextstep2()
	{
		return nextstep2;
	}


	//@FindBy(xpath="//div[@id='ctl00_cphContent_diverrorblock']")
	@FindBy(xpath="//body/form[@id='aspnetForm']/div[3]/div[2]/div[1]")
	WebElement errmsg;
	public WebElement geterrmsg()
	{
		return errmsg;
	}

	@FindBy(xpath = "/html/body/form/footer/div[2]/div")  
	WebElement Cookiespopup;


	@FindBy(xpath = "/html/body/form/footer/div[2]/div/p/input")  
	WebElement CookiesOkaybutton;

	public boolean radiobtn()
	{
		boolean radio = radiobutton.isSelected();
		System.out.println(radio);
		return true;

	}

	public void selectvaluefromdropdown (String value)
	{
		//Select stat=new Select(driver.findElement(By.id("status")));
		// stat.selectByVisibleText("active");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='ctl00_cphContent_drdshipstate']")));
		select.selectByVisibleText(value);
	}



	@FindBy(xpath="//body/div[@id='ui-datepicker-div']/div[1]/div[1]")
	WebElement textcaln;
	public WebElement gettextcaln()
	{
		return textcaln;
	}

	@FindBy(xpath="//body/div[@id='ui-datepicker-div']/div[1]/a[2]")
	WebElement calnnextbtn;
	public WebElement getcalnnextbtn()
	{
		return calnnextbtn;
	}

	@FindBy(xpath="//a[contains(text(),'13')]")
	WebElement calnday;
	public WebElement getcalnday()
	{
		return calnday;
	}



	public void createpage1(String orgnname,String orgnweb,String contname, 
			String contemail, String emailcopy,String address1, String address2, String city, String state,String zip,
			String phno, String exten,String descorginfo) throws InterruptedException 
	{
		Thread.sleep(2000);
		//getwishlistmenu().click();
		//getCreatewishlink().click();
		getorgname().sendKeys(orgnname);
		getorgweb().sendKeys(orgnweb);
		Thread.sleep(2000);
		getcontname().sendKeys(contname);
		getcontemail().sendKeys(contemail);
		getemailcopy().sendKeys(emailcopy);
		Thread.sleep(2000);
		getaddress1().sendKeys(address1);
		getaddress2().sendKeys(address2);
		getcity().sendKeys(city);
		getstate().click();
		selectvaluefromdropdown(state);
		getzip().sendKeys(zip);
		Thread.sleep(2000);
		getphno().sendKeys(phno);
		getexten().sendKeys(exten);
		getdescorginfo().sendKeys(descorginfo);
		Thread.sleep(2000);
		getnextstep().click();
	}


	public void createpage2(String projname,String projdate,String descproj, String thnkmsg, String yourweb) throws Throwable
	{
		Thread.sleep(2000);
		getprojectname().sendKeys(projname);
		Thread.sleep(2000);
		getprojdate().click();
		Autodatepicker("June", "15", "2021");
		//getprojdate().sendKeys(projdate);
		getdescproj().sendKeys(descproj);
		getthnkmsg().sendKeys(thnkmsg);
		getyourweb().sendKeys(yourweb);
		//getbrowserbtn().click();
		//FileuploadautoIT();
		//getnextstep2().click();

	}

	public void Autodatepicker(String month, String day, String year) throws Exception {
		getprojdate().click();
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

	public boolean compareerrmsg(String Expectterr)
	{
		/*String error = geterrmsg().getAttribute("class");
		String error = geterrmsg().getText();
		System.out.println(error);
		return error;*/
		String Error = geterrmsg().getText();
		if(Expectterr.equals(Error))
		{
			System.out.println("Both error message are matching");
			return true;
		}
		else {
			System.out.println("Error message is not matching");
			return false;
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


	//Cookie popup

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



}
