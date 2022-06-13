package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement logOutButton;


    public ProfilePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getProfileName() {
        return driver.findElement(By.id("userName-value"));
    }

    //--------------------------


}
