package Configs;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class Locators {
    public static final SelenideElement departmentsAndDevices = $("#sidebar__li--departmentAndDevices");
    public static final SelenideElement guide = $("#sidebar__li--guide");
    public static final SelenideElement sideMenu = $("#sidebar__div--show");
    public static final SelenideElement workplace_add_row=$(byXpath("//*[@id=\"admin_departmentsanddevices_workplace__button--add-row\"]"));
    public static final SelenideElement input_workplace_name=$(byXpath("//*[@id=\"admin_departmentsanddevices_workplace__input--modal-workplace-nameRu\"]"));
    public static final SelenideElement list_of_department=$(byXpath("//*[@id=\"admin_departmentsanddevices_workplace__nz-tree-select--modal-workplace-department\"]/div"));
    public static final SelenideElement new_workplace_submit=$(byXpath("//*[@id=\"admin_departmentsanddevices_workplace__button--modal-workplace-submit\"]"));

//    public static final SelenideElement input_workplace_name=$("admin_departmentsanddevices_workplace__input--modal-workplace-nameRu");
//    public static final SelenideElement list_of_department=$("admin_departmentsanddevices_workplace__nz-tree-select--modal-workplace-department");
//    public static final SelenideElement new_workplace_submit=$("admin_departmentsanddevices_workplace__button--modal-workplace-submit");
}
