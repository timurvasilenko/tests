package test.DepartmentAndDevices;
import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
import org.junit.jupiter.api.*;
import page.Authorisation;
import page.DepartmentAndDevices.Schedule;
import page.DepartmentAndDevices.Workplace;
import page.MainPage;
import test.TestBase;

import static Configs.ClientConfigs.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@Tag("DepartmentAndDevices")
@Epic("Отделения и устройства")
@Feature("Рабочие места")
public class TestWorkplaces extends TestBase {
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

    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Переход на закладку \"Рабочие места\" раздела \"Отделения и устройства\"")
    public void goToWorkplace() {
        //System.out.println("Проверка авторизации assertMainPage()");
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        assert schedule.checkURL():"2. Нажатие на раздел " + "\"Отделения и устройства\"";
        workplace.workplaceTab();
        assert workplace.checkURL():"3. Нажатие на закладку \"Рабочие места";
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Добавление нового рабочего места")
    public void addWorkplace(){
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        workplace.workplaceTab();
        assert workplace.checkURL():"Переход на закладку \"Рабочие места\"";
        workplace.addWorkplaceButton();
        $(".modal").shouldBe(visible);
        workplace.inputWorkplaceName(WORKPLACE_NAME);
        workplace.selectDepartment(DEPARTMENT_NAME);
        //$("#admin_departmentsanddevices_workplace__input--modal-workplace-nameRu").shouldHave(text("Окно 01"));
        workplace.submit_new_workplace();
        assert $(byText("Окно 01")).exists():"В таблице \"Рабочие места\" пояляется новая запись с наименованием \"Окно 01\"";
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Отмена добавления нового рабочего места")
    public void cancelAddingWorkplace(){
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        workplace.workplaceTab();
        assert workplace.checkURL():"Переход на закладку \"Рабочие места\"";
        workplace.addWorkplaceButton();
        $(".modal").shouldBe(visible);
        workplace.inputWorkplaceName(WORKPLACE_NAME);
        workplace.selectDepartment(DEPARTMENT_NAME);
        workplace.cancel_new_workplace();
        $(byText("Окно 01")).shouldNot(exist);//:"В таблице \"Рабочие места\" не появилось новых записей";
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Удаление данных")
    public void deleteWorkplace(){
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        workplace.workplaceTab();
        assert workplace.checkURL():"Переход на закладку \"Рабочие места\"";
        workplace.markCheckBox();
        workplace.clickDeleteButton();
        workplace.cancelDeleteWorkplace();
        workplace.clickDeleteButton();
        workplace.submitDeleteWorkplace();

    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Выпадающий список \"Отделения\"")
    public void dropDownListDepartment() {
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        workplace.workplaceTab();
        assert workplace.checkURL(): "Переход на закладку \"Рабочие места\"";
        workplace.listDepartmentsClick();
        workplace.choiceDepartment(DEPARTMENT_NAME);
        workplace.listDepartmentsClick();
        workplace.listDepartmentsClick();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Редактирование рабочего места")
    public void editWorkplace(){
        mainPage.sidebarListElementClick(Locators.departmentsAndDevices);
        workplace.workplaceTab();
        assert workplace.checkURL():"Переход на закладку \"Рабочие места\"";
        workplace.editWorkplace();
        $(".modal").shouldBe(visible);
        workplace.inputWorkplaceName(" Редактирование");
        workplace.submit_new_workplace();
        assert $(byText("Окно 01 Редактирование")).exists():"В таблице \"Рабочие места\" отображена отредактированная запись";
    }
}
