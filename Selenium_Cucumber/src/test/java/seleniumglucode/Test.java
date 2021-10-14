package seleniumglucode;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.SecondPage;

import java.util.concurrent.TimeUnit;


public class Test extends TestBase {
    private static ChromeDriver driver;

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
        //homePage.clickOnTitleSecond();
       WebElement titleTalk = driver.findElement(By.id("menu-item-2007"));
       titleTalk.click();
    }

    @Then("^Validate the message$")
    public void validate_the_message() throws Exception {
        WebElement automaticbBoton = driver.findElement(By.id("menu-item-2007"));
        automaticbBoton.click();
        System.out.println("I find the text................" +secondPage.getContributionText().toString());
    }

}
