package mx.com.develop.test;

import mx.com.develop.employees.Employee;
import mx.com.develop.employees.Employee;

public class Manager extends Employee {
  public String department;
  public int getDepartment(){
    return id;
  }
  public void setDepartment(){
    this.department = department;
    this.firstName = "Edgar";
   // mal hecho -> Employee e = new Employee();
    Manager e = new Manager();
    e.firstName = "Edgar";
  }
  @Override
  public String getDetails(){
      return age + " "+ firstName+" departeamento: "+ department +" "+lastName;
  }
  @Override
  public Manager getThis(){
      return this;
  }

}
