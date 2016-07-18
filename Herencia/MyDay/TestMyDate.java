package mx.com.develop.employees;
import mx.com.develop.employees.MyDate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate today = new MyDate(18, 7, 2016);
        
        today.setDay  (31);
        System.out.println("dai"+today.getDay());
    }
}
