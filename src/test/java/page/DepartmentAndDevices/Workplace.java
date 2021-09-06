package page.DepartmentAndDevices;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import page.PageBase;

import static Configs.ClientConfigs.*;
import static Configs.Locators.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;


public class Workplace extends PageBase {



    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/workplace");
    }

    public void addWorkplaceButton(){
        workplace_add_row.shouldBe(clickable).click();
    }

    public void inputWorkplaceName(){

        input_workplace_name.shouldBe(visible).sendKeys(WORKPLACE_NAME);
    }
    public void selectDepartment(String department){
        list_of_department.click();
        SelenideElement selectDep = $("nz-tree-node-title[title='"+department+"']");
        selectDep.click();
    }
    public void submit_new_workplace(){
        new_workplace_submit.click();
    }
}
