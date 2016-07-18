package mx.com.develop.employees;

public class Employee {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String mail;
    protected int age;

    public int getId(){
      return id;
    }
    public String getFirstName(){
      return firstName;
    }
    public void setFirstName(){
      this.firstName = firstName;
    }
    public String getLastName(){
      return lastName;
    }
    public void setLastName(){
      this.lastName = lastName;
    }
    public String getMail(){
      return mail;
    }
    public void setMail(){
      this.mail = mail;
    }
    public int getAge(){
      return age;
    }
    public void setAge(){
      this.age = age;
    }
    public String getDetails(){
        return id + " "+ firstName+""+lastName;
    }
    
    public Object getThis(){
      return null;
  }
}
