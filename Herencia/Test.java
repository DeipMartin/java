package mx.com.develop.employees;


import mx.com.develop.test.Manager;
public class TestEmploye {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        e1.firstName="ricardo";
        e1.lastName="gomo";
        e1.mail="hola@gmail";
        e1.id=(23);
        m1.firstName="ricardo";
        m1.lastName="yolo";
        m1.mail="hola@gmail";
        m1.id=(23);
        
        //poliformismo
        Employee e2 = new Employee();
        e2 = new Manager();
        e2.age=27;
        e2.mail="fsdfsdffsdf@gmail";
        e2.id=23213;
        e2.firstName="diana";
        e2.lastName="gutierrez";
        
        Manager m3 =(Manager) e2;
        m3.department = "operaciones"; 
        
        //invocacion virtual de metodos!! 
        System.out.println(e2.getDetails());
    }
}
