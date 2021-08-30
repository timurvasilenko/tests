package page.DepartmentAndDevices;

import com.codeborne.selenide.SelenideElement;
import page.PageBase;

import static com.codeborne.selenide.Selenide.$;

public class Schedule extends PageBase {
    private static final SelenideElement workplace = $("#tab__button--workplace");

    public static void goToWorkplace(){

        workplace.click();
    }
    public static boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/schedule");
    }



}
