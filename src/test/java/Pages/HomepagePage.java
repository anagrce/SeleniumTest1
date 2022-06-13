package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepagePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public WebElement cardBookStore;

    public HomepagePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getCardBookStore() {
        return driver.findElement(By.className("card-body"));
    }



    //-----------------

    public void clickOnCard() {
        this.getCardBookStore().click();
    }

}
