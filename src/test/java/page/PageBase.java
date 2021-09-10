package page;

import Configs.Locators;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static test.TestBase.driver;

public class PageBase {
    public static final WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), 5,100);
    public static final Condition clickable = and("can be clicked", visible, enabled);

    public boolean checkURL(String URL){
        try{
        wait.until(ExpectedConditions.urlToBe(URL));}
        catch (TimeoutException e)
        {
            System.out.println("false");
            return false;
        }
        System.out.println("true");
        return true;
     }
    public void sidebarListElementClick(SelenideElement element) {
        Locators.sideMenu.click();
        element.click();
    }
    public void isElementDisplayed(SelenideElement element,Condition condition){
        element.shouldBe(condition);
    }

//     public static void waiter(int ms){
//        try{
//            Thread.sleep(ms);
//        }
//        catch (InterruptedException e)
//        {
//            Thread.currentThread().interrupt();
//        }
//     }

//    public PageBase(WebDriver driver) {
//        this.driver = driver;
//        wait=new WebDriverWait(driver,15);
//    }
//    public void waitVisibility(By elementBy){
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
//    }
//    public void click(By elementBy){
//        waitVisibility(elementBy);
//        driver.findElement(elementBy).click();
//    }

}
