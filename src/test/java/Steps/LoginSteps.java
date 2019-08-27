package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;



public class LoginSteps {


    @Given("^User navigate to login page$")
    public void userNavigateToLoginPage() {

        System.out.println("test 1 ");

    }

    @And("^User enter the username as admin and password  as admin$")
    public void userEnterTheUsernameAsAdminAndPasswordAsAdmin() {

        System.out.println("test 1 ");
    }

    @And("^User click login button$")
    public void userClickLoginButton() {
        System.out.println("test 1 ");
    }

    @Then("^User should see the userform page$")
    public void userShouldSeeTheUserformPage() {
        System.out.println("test 1 ");
    }
}
