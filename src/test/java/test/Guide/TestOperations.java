package test.Guide;

import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.Authorisation;
import page.Guide.Operations;
import page.MainPage;
import test.TestBase;

@Tag("Guide")
@Epic("Справочники")
@Feature("Услуги")
public class TestOperations extends TestBase {
    MainPage mainPage = new MainPage();
    Authorisation authorisation = new Authorisation();
    Operations operations = new Operations();

    @BeforeEach
    @Severity(SeverityLevel.CRITICAL)
    @Story("Авторизация")
    public void before() {
        authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
        assert mainPage.checkURL():"Проверка корректности авторизации";
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Переход на закладку \"Услуги\" раздела \"Справочники\"")
    public void goToOperations() {
        mainPage.sidebarListElementClick(Locators.guide);
        assert operations.checkURL():"2. Нажатие на раздел \"Справочники\"";
    }
}
