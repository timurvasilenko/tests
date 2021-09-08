package page.preRegister;

import page.PageBase;

import static Configs.Locators.device;
import static Configs.Locators.preRegister;

public class PreRegister extends PageBase {

    public void preRegisterTab() {

        preRegister.click();
    }
    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/PreRegistration/preRegister");
    }
}
