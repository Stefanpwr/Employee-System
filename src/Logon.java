import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Logon extends Employee{
    int day;
    int month;
    int hour;
    int minute;
    private int employee_id;
    public Logon(Employee employee){
        Date date = new Date();
        this.employee_id = employee.getId();
        this.day = date.getDay();
        this.month = date.getMonth();
        this.hour = date.getHours();
        this.minute = date.getMinutes();
    }

}
