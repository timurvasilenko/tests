package Configs;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Locators {
    //БОКОВОЕ МЕНЮ
    public static final SelenideElement departmentsAndDevices = $("#sidebar__li--departmentAndDevices");
    public static final SelenideElement guide = $("#sidebar__li--guide");
    public static final SelenideElement sideMenu = $("#sidebar__div--show");
    //ГРАФИК РАБОТЫ
    public static final SelenideElement schedule=$("#tab__button--schedule");
    public static final SelenideElement schedule_add_row=$("#admin_departmentsanddevices_schedule__button--add-row");
    public static final SelenideElement input_schedule_name=$("#admin_departmentsanddevices_schedule__input--modal-schedule-nameRu");
    public static final SelenideElement days_tab=$(".mat-tab-labels div:nth-child(2)");
    public static final SelenideElement checkbox_working_day=$("label[for=\"working0\"]");
    public static final SelenideElement input_start_work_time=$("#admin_departmentsanddevices_schedule__input--modal-schedule-startTime-0");
    public static final SelenideElement input_end_work_time=$("#admin_departmentsanddevices_schedule__input--modal-schedule-endTime-0");
    public static final SelenideElement submit_new_schedule=$("#admin_departmentsanddevices_schedule__button--modal-schedule-submit");
    public static final SelenideElement cancel_new_schedule=$("#admin_departmentsanddevices_schedule__div--modal-schedule-close");
    //РАБОЧИЕ МЕСТА
    public static final SelenideElement workplace_add_row = $("#admin_departmentsanddevices_workplace__button--add-row");
    public static final SelenideElement input_workplace_name_rus=$("#admin_departmentsanddevices_workplace__input--modal-workplace-nameRu");
    public static final SelenideElement input_workplace_name_en_title=$(byXpath("//*[text() = 'Английский']"));
    public static final SelenideElement input_workplace_name_en=$("#admin_departmentsanddevices_workplace__input--modal-workplace-nameEn");
    public static final SelenideElement input_workplace_name_additional_title=$(byXpath("//*[text() = 'Дополнительный язык']"));
    public static final SelenideElement input_workplace_name_additional=$("#admin_departmentsanddevices_workplace__input--modal-workplace-nameCustomLanguage");
    public static final SelenideElement list_of_department=$("#admin_departmentsanddevices_workplace__nz-tree-select--modal-workplace-department");
    public static final SelenideElement new_workplace_submit=$("#admin_departmentsanddevices_workplace__button--modal-workplace-submit");
    public static final SelenideElement new_workplace_cancel=$("#admin_departmentsanddevices_workplace__div--modal-workplace-close");
    public static final SelenideElement first_checkbox_workplace =$(".p-datatable-tbody tr:nth-child(1) label");
    public static final SelenideElement delete_button=$("#admin_departmentsanddevices_workplace__button--delete-rows");
    public static final SelenideElement cancel_delete_workplace=$("#modal-delete__button--cancel");
    public static final SelenideElement submit_delete_workplace=$("#modal-delete__button--remove");
    public static final SelenideElement list_all_departments=$("#admin_departmentsanddevices_workplace__nz-tree-select--department");
    public static final SelenideElement edit_workplace=$("#admin_departmentsanddevices_workplace__svg--edit-row0");
    public static final SelenideElement workplace = $("#tab__button--workplace");

    //УСТРОЙСТВА
    public static final SelenideElement device=$("#tab__button--device");

    //ПРЕДВАРИТЕЛЬНАЯ ЗАПИСЬ
    public static final SelenideElement preRegister=$("#sidebar__li--preRegister");
}
