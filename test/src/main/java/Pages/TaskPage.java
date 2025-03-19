package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	WebDriver driver;

	/* create constructor to invoke webdriver or page object modle */
	public TaskPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement enterUserName;
	@FindBy(xpath = "//input[@name='password']")
	WebElement enterPassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	@FindBy(xpath = "//*[@href='/web/index.php/admin/viewAdminModule']")
	private WebElement clickOnadmin;
   	@FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div:nth-child(2) > div > span")
    	private WebElement recordCountElement;
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement Addbtn;
	@FindBy(xpath = "//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private WebElement Selectrole;
	@FindBy(xpath = "//*[contains(text(),'Admin')]")
	private WebElement SelectAdminRole;
	@FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(3) > div > div:nth-child(2) > div > div")
	private WebElement Status;
	@FindBy(xpath = "//*[contains(text(),'Enabled')]")
	private WebElement SelectStatus;
	@FindBy(xpath = "//*[@placeholder='Type for hints...']")
	private WebElement EnterEmployeeName;
	@FindBy(xpath = "//*[contains(text(),'Ranga')]")
	private WebElement selectempname;
	@FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > div:nth-child(2) > input")
	private WebElement username;
	@FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div.oxd-grid-item.oxd-grid-item--gutters.user-password-cell > div > div:nth-child(2) > input")
	private WebElement passwordField;
	@FindBy(css = "#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div.oxd-form-row.user-password-row > div > div:nth-child(2) > div > div:nth-child(2) > input")
	private WebElement confirmpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnsave;
	@FindBy(css = "#app div.oxd-layout-container div.oxd-table-filter-area input")
	private WebElement searchusername;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchbtn;
	@FindBy(css = "#app div.oxd-table-body div div:nth-child(2)")
	private WebElement verifysearchresult;
	@FindBy(xpath = "//*[@class='oxd-icon bi-trash']")
	private WebElement deletebtn;
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	private WebElement confirmdelete;
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	private WebElement resetbtn;
	
	
	public void EnterUserName(String userName) {
		enterUserName.sendKeys(userName);

	}

	public void EnterPassword(String password) {
		enterPassword.sendKeys(password);

	}

	public void BtnLogin() {
		btnLogin.click();

	}
	public void clickOnadmin() {
		clickOnadmin.click();
		
	}
    	public int getRecordCount() {
        String text = recordCountElement.getText();
        return extractNumberFromText(text);
    }

    	private int extractNumberFromText(String text) {
        return Integer.parseInt(text.replaceAll("[^0-9]", ""));
    }
    
	public void Addbtn() {
		Addbtn.click();

	}
	public void Selectrole() {
		Selectrole.click();

	}	
	public void SelectAdminRole() {
		SelectAdminRole.click();

	}
	public void Status() {
		Status.click();

	}	public void SelectStatus() {
		SelectStatus.click();

	}
	public void EnterEmployeeName(String userName) {
		EnterEmployeeName.sendKeys(userName);

	}	
	public void selectempname() {
		selectempname.click();

	}
	public void username(String userName) {
		username.sendKeys(userName);

	}
	public void passwordField(String userName) {
		passwordField.sendKeys(userName);

	}	
	public void confirmpassword(String userName) {
		confirmpassword.sendKeys(userName);

	}
	public void btnsave() {
		btnsave.click();

	}
	public void searchusername(String searchuserName) {
		searchusername.sendKeys(searchuserName);

	}
	public void searchbtn() {
		searchbtn.click();

	}
	public void verifysearchresult() {
	    if (verifysearchresult.getText().contains("Salma")) {
	        System.out.println("Search Succeeded!");
	    } else {
	        System.out.println("Not Found");
	    }
	}
	public void deletebtn() {
		deletebtn.click();

	}
	public void confirmdelete() {
		confirmdelete.click();

	}
	public void resetbtn() {
		resetbtn.click();

	}
}
