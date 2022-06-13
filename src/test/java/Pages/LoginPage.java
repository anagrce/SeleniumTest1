package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement username;
    WebElement password;
    WebElement loginButton;

    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }


    public WebElement getUsername() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login"));
    }

    //------------------------------

    public void insertUsername(String name) {
        getUsername().clear();
        getUsername().sendKeys(name);
    }

    public void insertPassword(String pass) {
        getPassword().clear();
        getPassword().sendKeys(pass);
    }

    public void clickOnLoginButton() {
        getLoginButton().click();
    }


}
