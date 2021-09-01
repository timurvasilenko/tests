package page;
import Configs.Locators;
import com.codeborne.selenide.Selenide;

public class MainPage extends PageBase{


    public boolean checkURL()
    {

        return checkURL("http://localhost:8080/admin/main");
    }

//    public static void goTo(){
//
//        departmentsAndDevices.click();
//    }

}
