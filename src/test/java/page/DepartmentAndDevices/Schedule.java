package page.DepartmentAndDevices;

import com.codeborne.selenide.SelenideElement;
import page.PageBase;

import static Configs.Locators.device;
import static Configs.Locators.schedule;
import static com.codeborne.selenide.Selenide.$;

public class Schedule extends PageBase {

    public void scheduleTab() {

        schedule.click();
    }
    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/schedule");
    }



}
