package stepdefinition;

import org.openqa.selenium.WebDriver;

import Pages.TaskPage;
//import dev.failsafe.internal.util.Assert;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;



public class TestTask {
	WebDriver driver;
	private TaskPage TP;
	
	@Given("User Opens application")
	public void training_administrator_opens_application() {
		driver = DriverFactory.getdriver();
		TP = new TaskPage(driver);
	}

	@When("User enters a valid username {string}")
	public void the_training_administrator_enters_a_valid_username(String userEmail) {
		TP.EnterUserName(userEmail);
	}

	@When("User enters  valid password {string}")
	public void the_training_administrator_enters_valid_password(String Password) {
		TP.EnterPassword(Password);
	}

	@When("Clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		TP.BtnLogin();

	}
	
    private int initialRecordCount;

	//int initialCount;
	@When("Clicks on Admin tab and gets record")
	public void clicks_on_the_admin() throws InterruptedException {
		Thread.sleep(2000);
		TP.clickOnadmin();
		 initialRecordCount = TP.getRecordCount();
		 
		//initialCount = TP.getRecordCount();
	    System.out.println("Initial Record Count: " + initialRecordCount); // Debugging

	}

	
	@When("Add an Admin and select role and status")
	public void add_admin() throws InterruptedException {
		Thread.sleep(2000);
		TP.Addbtn();
		Thread.sleep(2000);
		TP.Selectrole();
		TP.SelectAdminRole();
		TP.Status();
		TP.SelectStatus();
	}
	@When("enter an employeename {string}")
	public void employeename(String Employeename) throws InterruptedException {
		TP.EnterEmployeeName(Employeename);
		Thread.sleep(2000);
		TP.selectempname();
		
	}
	@When("enter a username {string}")
	public void username(String user) {
		TP.username(user);
	}
	@When("enter a password {string}")
	public void passwordField(String pass) {
		TP.passwordField(pass);
	}
	@When("confirm password {string}")
	public void confirmpassword(String confirmpassword) {
		TP.confirmpassword(confirmpassword);
	}
	@When("Click on save button")
	public void clicks_on_save() throws InterruptedException {
		Thread.sleep(2000);
		TP.btnsave();

	}
    private int updatedRecordCount;


    @Then("the record count should increase by one")
    public void theRecordCountShouldIncreaseBy() throws InterruptedException {
		Thread.sleep(2000);

        int updatedRecordCount = TP.getRecordCount();
	    System.out.println("UpdatedRecordCount: " + updatedRecordCount); // Debugging
	    if (updatedRecordCount == initialRecordCount + 1) {
	        System.out.println("Record count increased by 1. Test passed!");
	    } else {
	        System.out.println("Record count did not increase by 1. Test failed!");
	    }

    }
	//@Then("Assert Record")
	//public void the_record_count_should_increase_by_one() {
	    //int newCount =TP.getRecordCount();
	   // Assert.assertEquals(newCount, initialCount + 1, "Record count did not increase!");
	//}
	@When("Search by username {string}")
	public void search_username(String searchusername) throws InterruptedException {
		Thread.sleep(2000);
		TP.searchusername(searchusername);
		Thread.sleep(2000);
		TP.searchbtn();
		Thread.sleep(2000);
		TP.verifysearchresult();


	}
	@When("Delete user")
	public void delete_User() throws InterruptedException {
		Thread.sleep(2000);
		TP.deletebtn();
		Thread.sleep(2000);
		TP.confirmdelete();
		Thread.sleep(2000);
		TP.resetbtn();

	}
    @Then("the record count should decrease by one")
    public void theRecordCountShouldDecreaseBy() throws InterruptedException {

		Thread.sleep(2000);
        int secondupdatedRecordCount = TP.getRecordCount();
	    System.out.println("SecondUpdatedRecordCount: " + secondupdatedRecordCount); // Debugging
		if (secondupdatedRecordCount == initialRecordCount) {
	        System.out.println("Record count decreased by 1. Test passed!");
	    } else {
	        System.out.println("Record count did not decrease by 1. Test failed!");
	    }

	    }	
}