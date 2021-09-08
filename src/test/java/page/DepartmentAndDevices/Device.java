package page.DepartmentAndDevices;

import page.PageBase;

import static Configs.Locators.device;
import static Configs.Locators.workplace;

public class Device extends PageBase {

    public void deviceTab() {

        device.click();
    }
    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/device");
    }
}
