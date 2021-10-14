package seleniumglucode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test extends TestBase{
    private static ChromeDriver  driver;

    @Given("^User is on demo page$")
    public void user_is_on_demo_page() throws Exception {
        System.out.println("Ingrese a Given ");
        System.setProperty("webdriver.chrome.driver", "C:\\Projects//Selenium\\Selenium_Cucumber\\src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://imalittletester.com/");
        driver.manage().window().maximize();

    }

    @When("^click on Link$")
    public void click_on_Link() throws Exception {
  //............................................................................ homePage.clickOnSecondTitle();
        WebElement titleTalk = driver.findElement(By.id("menu-item-2007"));
        titleTalk.click();
    }

    @Then("^Validate the message$")
    public void validate_the_message() throws Exception {


   // WebElement pageAutoLocator=driver.findElement(By.className("page-title"));

    //Assert.assertTrue("I was not redirected to the automation page", homePage.homePageIsDisplayed());
        //Assert.assertEquals("Tutorials and trainings", homePage.getTitleSecondlocator());
        WebElement titleTalk = driver.findElement(By.id("menu-item-2008"));
        titleTalk.click();


    }


}