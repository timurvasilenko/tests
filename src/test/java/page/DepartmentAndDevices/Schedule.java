package page.DepartmentAndDevices;

import com.codeborne.selenide.SelenideElement;
import page.PageBase;

import static Configs.ClientConfigs.*;
import static Configs.Locators.*;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Schedule extends PageBase {

    public void scheduleTab() {

        schedule.click();
    }
    public boolean checkURL()
    {
        return checkURL("http://localhost:8080/admin/DepartmentsAndDevices/schedule");
    }

    public void addSchedulerButton(){
        schedule_add_row.shouldBe(clickable).click();
    }

    public void inputScheduleName(){
        input_schedule_name.shouldBe(visible).sendKeys(SCHEDULE_NAME);
    }
    public void daysTab(){
        days_tab.shouldBe(clickable).click();
    }
    public void inputTimetable(){
        checkbox_working_day.click();
        input_start_work_time.shouldBe(visible).sendKeys(START_WORKING_TIME);
        input_end_work_time.shouldBe(visible).sendKeys(END_WORKING_TIME);
    }
    public void submitNewScheduler(){
        submit_new_schedule.shouldBe(clickable).click();
    }
}
