//package test;
//
//import Configs.ClientConfigs;
//import Configs.Locators;
//import io.qameta.allure.*;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import page.Authorisation;
//import page.Guide;
//import page.MainPage;
//
//@Epic("Справочники")
//@Feature("Услуги")
//public class TestGuide extends TestBase{
//    @BeforeEach
//    @Severity(SeverityLevel.CRITICAL)
//    @Story("Авторизация")
//    public void before() {
//        Authorisation.login(ClientConfigs.CA_LOGIN,ClientConfigs.CA_PASSWORD,ClientConfigs.CA_ROLE);
//        System.out.println("Авторизация before() услуги");
//    }
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Проверка авторизации")
//    public void assertMainPage() {
//        System.out.println("Проверка авторизации assertMainPage() услуги");
//        assert MainPage.checkMainURL();
//    }
//
//    @Test
//    @Severity(SeverityLevel.NORMAL)
//    @Story("Переход на страницу Справочники")
//    public void goToGuide() {
//        System.out.println("Переход на страницу Справочники goToGuide()");
//        MainPage.sidebarListElementClick(Locators.guide);
//        assert Guide.checkGuideURL();
//    }
//
//}
