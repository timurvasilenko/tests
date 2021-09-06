package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class TestBase {
    public static final ChromeDriver driver = new ChromeDriver();
    //public static ChromeDriver driver;

    @BeforeAll
    public static void start(){
        //driver = new ChromeDriver();
        Configuration.browser = "chrome";
        setWebDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        System.out.println("Запуск браузера BeforeAll start()");
    }
//    @AfterEach
//    public void goTOMainPage(){
//
//        $("#sidebar__li--main").click();
//        //System.out.println("Разлогирование afterEach logOut()");
//}

    @AfterEach
    public void logOut(){

        $("#header__div--logout").click();
        System.out.println("Разлогирование afterEach logOut()");
}

//    @AfterAll
//    public static void finish(){
//        driver.quit();
//        System.out.println("Завершение сессии браузера (afterAll finish())");
//    }
}

