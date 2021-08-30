package test;

import Configs.ClientConfigs;
import Configs.Locators;
import io.qameta.allure.*;
import org.junit.Before;
import org.junit.Test;
import page.Authorisation;
import page.Guide.Operations;
import page.MainPage;

@Epic("Справочники")
@Feature("Услуги")
public class TestGuide extends TestBase{
    @Before
    @Severity(SeverityLevel.CRITICAL)
    @Story("Авторизация")
    public void before() {
        Authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
        //System.out.println("Авторизация before() услуги");
        assert MainPage.checkMainURL():"Проверка корректности авторизации";
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Story("Переход на закладку \"Услуги\" раздела \"Справочники\"")
    public void goToOperations() {
        //System.out.println("Проверка авторизации assertMainPage() услуги");
        MainPage.sidebarListElementClick(Locators.guide);
        assert Operations.checkURL():"2. Нажатие на раздел \"Справочники\"";
    }

//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Переход на страницу Справочники")
//    public void goToGuide() {
//        System.out.println("Переход на страницу Справочники goToGuide()");
//        MainPage.sidebarListElementClick(Locators.guide);
//        assert Guide.checkGuideURL();
//    }

}
