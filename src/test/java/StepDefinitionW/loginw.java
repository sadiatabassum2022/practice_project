package StepDefinitionW;

import com.winter.utility.baseW_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class loginw extends baseW_class {
	
	@Given("^Launch \"([^\"]*)\" application$")
	public void launch_application(String URLWIN) throws Throwable {//this arg comes because of "<URLWIN>"
		GetURLWIN(URLWIN);// this argument comes for we r giving arg in base case of that method
	}

	@Then("^Click signin button$")
	public void click_signin_button() throws Throwable {
	   
	}

	@Then("^Enter username and password and click signin button$")
	public void enter_username_and_password_and_click_signin_button() throws Throwable {
	    
	}

	@Then("^Verify user signin successfullyy$")
	public void verify_user_signin_successfullyy() throws Throwable {
	   
	}

}
