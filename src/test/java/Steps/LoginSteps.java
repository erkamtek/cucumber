package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;


public class LoginSteps {


    @Given("^User navigate to login page$")
    public void userNavigateToLoginPage() {

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

    @And("^User enter the username as \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEnterTheUsernameAsAndPassword(String username, String password)  {

    }

    @Given("^User navigate to EA Website$")
    public void userNavigateToEAWebsite() throws Throwable {

    }

    @And("^User enter following$")
    public void userEnterFollowing(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();
        System.out.println("Value is " + data.get(0).get(0).toString());

    }

    @Then("^Should see the Userdetails page$")
    public void sohuldSeeTheUserdetailsPage() throws Throwable {

    }
}
