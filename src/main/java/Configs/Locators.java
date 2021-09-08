package Configs;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class Locators {
    public static final SelenideElement departmentsAndDevices = $("#sidebar__li--departmentAndDevices");
    public static final SelenideElement guide = $("#sidebar__li--guide");
    public static final SelenideElement sideMenu = $("#sidebar__div--show");
    public static final SelenideElement workplace_add_row = $("#admin_departmentsanddevices_workplace__button--add-row");
    public static final SelenideElement input_workplace_name=$("#admin_departmentsanddevices_workplace__input--modal-workplace-nameRu");
    public static final SelenideElement list_of_department=$("#admin_departmentsanddevices_workplace__nz-tree-select--modal-workplace-department");
    public static final SelenideElement new_workplace_submit=$("#admin_departmentsanddevices_workplace__button--modal-workplace-submit");
    public static final SelenideElement new_workplace_cancel=$("#admin_departmentsanddevices_workplace__div--modal-workplace-close");
    public static final SelenideElement first_checkbox=$(".p-datatable-tbody tr:nth-child(2) label");
    //public static final SelenideElement first_checkbox=$("#24");
    public static final SelenideElement delete_button=$("#admin_departmentsanddevices_workplace__button--delete-rows");
    public static final SelenideElement cancel_delete_workplace=$("#modal-delete__button--cancel");
    public static final SelenideElement submit_delete_workplace=$("#modal-delete__button--remove");

    public static final SelenideElement list_all_departments=$("#admin_departmentsanddevices_workplace__nz-tree-select--department");
    public static final SelenideElement edit_workplace=$("#admin_departmentsanddevices_workplace__svg--edit-row0");
    public static final SelenideElement workplace = $("#tab__button--workplace");
    public static final SelenideElement device=$("#tab__button--device");
    public static final SelenideElement schedule=$("#tab__button--schedule");

    public static final SelenideElement preRegister=$("#sidebar__li--preRegister");
    //public static final SelenideElement hh=$("nz-select-item[title='Все отделения']");
}
