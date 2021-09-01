package page.DepartmentAndDevices;

import page.PageBase;


public class Workplace extends PageBase {


    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/workplace");
    }
}
