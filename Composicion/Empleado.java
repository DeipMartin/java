package Composicion;

import java.util.Calendar;
import java.util.Date;

public class Empleado extends Contrato{
    private String firtsName;
    private String lastName;
    private int age;
    private String email;
    private String job;
    private double salary;
    private Contrato contrato;
    
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH,3);
        contrato = new Contrato(5000, new Date(),calendar.getTime());
    
    }

    public Empleado(double salary, Date hiraDate, Date endDate) {
        super(salary, hiraDate, endDate);
    }
    
    
    
    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHiraDate(Date hiraDate) {
        this.hiraDate= hiraDate;
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 3);
        endDate = c.getTime();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getJob() {
        return job;
    }

    public Date getHiraDate() {
        return hiraDate;
    }
    
    public double getSalary() {
        return salary;
    }
    
    
}
