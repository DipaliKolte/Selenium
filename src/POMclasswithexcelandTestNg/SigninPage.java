package POMclasswithexcelandTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SigninPage {
	@FindBy(id="u_1_b_uq")
	private  WebElement firstname;
	@FindBy(id="u_1_d_8S")
	private WebElement lastname;
	@FindBy(id="u_1_g_Hr")
	private WebElement mobno;
	@FindBy(id="password_step_input")
	private WebElement newpassword;
	@FindBy(id="day")
	private WebElement date;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(id="u_1_4_NP")
	private WebElement genderfemale;
	@FindBy(id="u_1_5_Vv")
	private WebElement gendermale;
	@FindBy(id="u_1_6_k/")
	private WebElement custom;
	@FindBy(id="u_1_s_VP")
	private WebElement signup;
	
	WebDriver driver;
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setCredentials(String fname,String lname,String mbno,String newpwd)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		mobno.sendKeys(mbno);
		newpassword.sendKeys(newpwd);
		
	}
	public void dateOfBirth(String dt,String mn,String yr)
	{
		Select s=new Select(date);
		
		s.selectByVisibleText(dt);
		date.click();
		
		Select s1=new Select(month);
		s1.selectByVisibleText(mn);
		month.click();
		
		Select s2=new Select(year);
		s.selectByVisibleText(yr);
		year.click();
		
	}
	public void selectFemale() {
		genderfemale.click();
	}
	public void selectMale() {
		gendermale.click();
	}
	public void selectCustom() {
		custom.click();
	}
	public void clickonSignup() {
		signup.click();
	}

}
