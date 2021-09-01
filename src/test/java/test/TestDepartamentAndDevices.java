package test;
import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.Before;
import page.Authorisation;
import page.DepartmentAndDevices.Schedule;
import page.DepartmentAndDevices.Workplace;
import page.MainPage;


@Epic("Отделения и устройства")
@Feature("Рабочие места")
public class TestDepartamentAndDevices  extends TestBase {
    MainPage mainPage=new MainPage();
    Schedule schedule=new Schedule();
    Workplace workplace=new Workplace();
    Authorisation authorisation=new Authorisation();


    @Before
    @Severity(SeverityLevel.CRITICAL)
    @Story("Авторизация")
    public void before() {
        authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
        assert mainPage.checkURL():"Проверка корректности авторизации";
        //System.out.println("Авторизация afterEach before() рабочие места");
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Переход на закладку \"Рабочие места\" раздела \"Отделения и устройства\"")
    public void goToWorkplace() {
        //System.out.println("Проверка авторизации assertMainPage()");
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        assert schedule.checkURL():"2. Нажатие на раздел " + "\"Отделения и устройства\"";
        schedule.workplaceTab();
        assert workplace.checkURL():"3. Нажатие на закладку \"Рабочие места";
    }

//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Переход на страницу Отделения и устройства")
//    public void goToDepartmentAndDevices() {
//        System.out.println("Переход на страницу Отделения и устройства goToDepartmentAndDevices");
//        MainPage.sidebarListElementClick(Locators.departmentsAndDevices);
//        assert DepartmentsAndDevices.checkDepartmentAndDevicesURL();
//    }

}
