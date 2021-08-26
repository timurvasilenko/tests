package test;

import Configs.ClientConfigs;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Authorisation;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class TestBase {
    private static final ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void start(){
        Configuration.browser = "chrome";
        setWebDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }
//    @AfterEach
    @AfterEach
    public void logOut(){
    $("#header__div--logout").click();
}

    @AfterAll
    public static void finish(){
        driver.quit();
    }
}

