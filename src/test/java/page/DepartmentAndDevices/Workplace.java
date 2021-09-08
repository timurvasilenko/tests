package page.DepartmentAndDevices;
import com.codeborne.selenide.SelenideElement;
import page.PageBase;

import static Configs.Locators.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class Workplace extends PageBase {


    public void workplaceTab(){

        workplace.click();
    }

    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/workplace");
    }

    public void addWorkplaceButton(){
        workplace_add_row.shouldBe(clickable).click();
    }

    public void inputWorkplaceName(String name){

        input_workplace_name.shouldBe(visible).sendKeys(name);
        //input_workplace_name.shouldHave(text(WORKPLACE_NAME));
    }
    public void selectDepartment(String department){
        list_of_department.click();
        SelenideElement selectDep = $("nz-tree-node-title[title='"+department+"']");
        selectDep.click();
    }
    public void submit_new_workplace(){
        new_workplace_submit.click();
    }

    public void cancel_new_workplace(){
        new_workplace_cancel.click();
    }

    public void markCheckBox(){
        first_checkbox_workplace.click();
    }
    public void clickDeleteButton(){
        delete_button.shouldBe(clickable).click();
    }

    public void cancelDeleteWorkplace(){
        cancel_delete_workplace.shouldBe(clickable).click();
    }
    public void submitDeleteWorkplace(){
        submit_delete_workplace.shouldBe(clickable).click();
    }

    public void listDepartmentsClick(){
        list_all_departments.shouldBe(clickable).click();
    }
     public void choiceDepartment(String department){
         SelenideElement list=$("nz-tree-node-title[title='"+department+"']");
         list.click();
     }
     public void editWorkplace(){
        edit_workplace.click();
     }

}
