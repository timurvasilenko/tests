package test.DepartmentAndDevices;

import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.Authorisation;
import page.DepartmentAndDevices.Device;
import page.DepartmentAndDevices.Schedule;
import page.MainPage;
import page.preRegister.PreRegister;
import test.TestBase;

@Tag("DepartmentAndDevices")
@Epic("Отделения и устройства")
@Feature("График работы")
public class TestSchedule extends TestBase {
    Authorisation authorisation=new Authorisation();
    MainPage mainPage=new MainPage();
    Schedule schedule=new Schedule();
    Device device=new Device();
    PreRegister preRegister=new PreRegister();

    @BeforeEach
    @Severity(SeverityLevel.CRITICAL)
    @Story("Авторизация")
    public void before() {
        authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
        assert mainPage.checkURL():"Проверка корректности авторизации";
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName(" \"График работы\" - тестирование переходов")
    public void goToSchedule() {
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        assert schedule.checkURL() : "Нажатие на раздел " + "\"Отделения и устройства\"";
        device.deviceTab();
        assert device.checkURL() : "Нажатие на закладку \"Устройства\"";
        schedule.scheduleTab();
        assert schedule.checkURL() : "Нажатие на закладку \"График работы\"";
        preRegister.preRegisterTab();
        assert preRegister.checkURL() : "Нажатие на раздел \"Предварительная запись\"";
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Добавление нового графика работы отделения")
    public void addScheduler() {
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        assert schedule.checkURL() : "Нажатие на раздел " + "\"Отделения и устройства\"";
        schedule.addSchedulerButton();
        schedule.inputScheduleName();
        schedule.daysTab();
        schedule.inputTimetable();
        schedule.submitNewScheduler();
    }
}
