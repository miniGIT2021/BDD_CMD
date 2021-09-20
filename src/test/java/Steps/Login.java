package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
    @Given("^user calculated (\\d+)\\+(\\d+)$")
    public void user_calculated(int arg1, int arg2){
        System.out.println(arg1+arg2);

    }

    @When("^user enters valid username and password$")
    public void user_enters_valid_username_and_password(){

    }

    @And("^clicks on login button$")
    public void clicks_on_login_button(){

    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page(){

    }

    @Given("^user is on login page$")
    public void user_is_on_login_page(){

    }

    @When("^user enter invalid username and password$")
    public void user_enter_invalid_username_and_password() {

    }

    @Then("^error message is displayed - Invalid Credentials$")
    public void error_message_is_displayed_Invalid_Credentials()\-{

    }
}
