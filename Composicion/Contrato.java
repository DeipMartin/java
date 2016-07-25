package Composicion;

import java.util.Date;

public class Contrato {
private double salary;
Date hiraDate;
Date endDate;

    public Contrato(double salary, Date hiraDate, Date endDate) {
        this.salary = salary;
        this.hiraDate = hiraDate;
        this.endDate = endDate;
    }
    
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHiraDate(Date hiraDate) {
        this.hiraDate = hiraDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHiraDate() {
        return hiraDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    
}
