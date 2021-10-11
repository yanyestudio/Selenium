package seleniumglucode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//*[@id="menu-item-2007"]/a
import java.util.concurrent.TimeUnit;

public class Test {
    private  ChromeDriver driver;
    //private ChromeDriver driver=Hooks.getDriver();
   static By registerBotonPopular =        By.xpath("//*[@id=\"menu-item-257\"]/a");
   //static By regiterTitle         =        driver.findElement("page-title");
   // static By registerBotonClickme =        By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");

    @Given("^User is on demo page$")
    public void user_is_on_demo_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

        //driver.get("https://www.google.com");
        //driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.get("https://imalittletester.com");
    }

    @When("^click on Alerts and Modals$")
    public void click_on_Alerts_and_Modals() throws Throwable {
        driver.findElement(registerBotonPopular).click();

    }

    @Then("^Validate the message$")
    public void validate_the_message() throws Throwable {
     WebElement titlelocator= driver.findElement(By.className("page-title"));
        Assert.assertTrue("I was not redirected to the automation page",titlelocator.isDisplayed());
        Assert.assertEquals( "Category: automation",titlelocator.getText());

    }
}
