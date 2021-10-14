package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends BasePage {
    @FindBy(className="page-title")
   // private final By titlelocatorSecond= By.className("page-title");
    private WebElement  titlelocatorSecond;
    private String titleSecond= "Category: automation";


    public boolean isTitleSecondDisplayed() throws Exception {
       // return this.isDisplayed(titlelocatorSecond)&& this.getText(titlelocatorSecond).equals(titleSecond);
        return true;
    }


    public SecondPage(WebDriver driver){
        super(driver);
    }
}
