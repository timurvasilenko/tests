package test;
import Configs.ClientConfigs;
import Configs.Locators;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebElement;
import page.Authorisation;
import page.DepartmentAndDevices.Schedule;
import page.DepartmentAndDevices.Workplace;
import page.MainPage;

import java.util.concurrent.TimeUnit;

import static Configs.ClientConfigs.*;
import static Configs.Locators.workplace_add_row;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

@Tag("DepartmentAndDevices")
@Epic("Отделения и устройства")
@Feature("Рабочие места")
public class TestDepartmentAndDevices extends TestBase {
    MainPage mainPage = new MainPage();
    Authorisation authorisation = new Authorisation();
    Schedule schedule = new Schedule();
    Workplace workplace = new Workplace();

    @BeforeEach
    @Severity(SeverityLevel.CRITICAL)
    @Story("Авторизация")
    public void before() {
        authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
        assert mainPage.checkURL():"Проверка корректности авторизации";
        //System.out.println("Авторизация afterEach before() рабочие места");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Переход на закладку \"Рабочие места\" раздела \"Отделения и устройства\"")
    public void goToWorkplace() {
        //System.out.println("Проверка авторизации assertMainPage()");
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        assert schedule.checkURL():"2. Нажатие на раздел " + "\"Отделения и устройства\"";
        schedule.workplaceTab();
        assert workplace.checkURL():"3. Нажатие на закладку \"Рабочие места";
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Добавление нового рабочего места")
    public void addWorkplace(){
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        schedule.workplaceTab();
        assert workplace.checkURL():"Переход на закладку \"Рабочие места\"";
        workplace.addWorkplaceButton();
        workplace.inputWorkplaceName();
        workplace.selectDepartment(DEPARTMENT_NAME);
        workplace.submit_new_workplace();
        //$(".p-datatable-tbody tr:nth-child(2) label").click();
    }
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Добавление нового рабочего места")
//    public void testbuttons(){
//        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
//        SelenideElement button1=$(byXpath("//*[@id=\"admin_departmentsanddevices_schedule__button--add-row\"]"));
//        button1.click();
//    }
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Переход на страницу Отделения и устройства")
//    public void goToDepartmentAndDevices() {
//        System.out.println("Переход на страницу Отделения и устройства goToDepartmentAndDevices");
//        MainPage.sidebarListElementClick(Locators.departmentsAndDevices);
//        assert DepartmentsAndDevices.checkDepartmentAndDevicesURL();
//    }

}
