package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage  extends BasePage{

    public WebElement titleSecondLocator;
    private String titleHomePage="Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private  By titleSecondlocator= By.xpath("//*[@id=\"menu-item-257\"]/a");




    public HomePage(WebDriver driver) {
        super(driver);
    }


    public String getTitleHomePage(){
        return titleHomePage;
    }
    public By getTitleSecondlocator(){
        return titleSecondlocator;
    }

    public boolean homePageIsDisplayed() throws Exception {
        System.out.println(".................................................antes de get title en HomePage");
        return this.getTitle().equals(titleHomePage);
    }
    public void clickOnTitleSecond() throws Exception {
       this.click(getTitleSecondlocator());


    }

}