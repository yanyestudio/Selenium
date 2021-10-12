package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondPage extends BasePage {
    private final By titlelocatorSecond= By.className("page-title");
    private String titleSecond= "Category: automation";


    public SecondPage(WebDriver driver){
        super(driver);
    }
    public boolean isTitleSecondDisplayed() throws Exception {
        return this.isDisplayed(titlelocatorSecond)&& this.getText(titlelocatorSecond).equals(titleSecond);
    }
}
