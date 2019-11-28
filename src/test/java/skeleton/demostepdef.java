package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demostepdef {

	@Given("^enduser is on the login page$")
	public void enduser_is_on_the_login_page() throws Throwable {
	    System.out.println("enduser is on the login page");
	   
	}

	@When("^enduser enters the valid credentials and click on submit button$")
	public void enduser_enters_the_valid_credentials_and_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("enter credentials and click submit");
		
	}

	@Then("^user does successfull login$")
	public void user_does_successfull_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("login successful");
	}
}
