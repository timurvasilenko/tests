package page;

import Configs.Locators;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Condition.*;

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
        //String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        //return currentUrl.equals(URL);
        System.out.println("true");
        return true;
     }
     public void sidebarListElementClick(SelenideElement element){
         Locators.sideMenu.click();
        element.click();
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
//    public void isElementDisplayed(By elementBy){
//        waitVisibility(elementBy);
//        assertTrue (driver.findElement(elementBy).isDisplayed());
//    }
}
