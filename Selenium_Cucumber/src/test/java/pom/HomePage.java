package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage  extends BasePage{



    private String titleHomePage="Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private  By titlelocator= By.id("menu-item-2007");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        System.out.println(".................................................antes de get title en HomePage");
        return this.getTitle().equals(titleHomePage);


    }
    public void clickOnSecondTitle() throws Exception {
        this.click(titlelocator);

    }
}