package seleniumglucode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Test extends TestBase{


    @Given("^User is on demo page$")
    public void user_is_on_demo_page() throws Exception {


        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^click on Link$")
    public void click_on_Link() throws Exception {
   homePage.clickOnSecondTitle();
    }

    @Then("^Validate the message$")
    public void validate_the_message() throws Exception {
     Assert.assertTrue("I was not redirected to the automation page", secondPage.isTitleSecondDisplayed());



    }


}