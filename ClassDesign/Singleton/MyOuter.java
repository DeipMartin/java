package innerClass;

public class MyOuter {
    char c = 'C';
    public class A{
        public void innerMethod(){
            System.out.println("BBBBBBBBBB");
        }
    }
    public void otherMethod(){ 
        final char d = 'D';
        class A{
            char e = 'E';
            public void innerMethod(){
            System.out.println("e: " + e);
            System.out.println("d: " + d);
            System.out.println("AAAAAAAAAAAAAAAAAA");
            }
        }
        A a= new A();
        a.innerMethod();
        System.out.println("*************************");
        MyOuter.A a2 = new MyOuter.A();
        a2.innerMethod();
   }
}

class App{
    public static void main(String[] args) {
        MyOuter m = new MyOuter();
        m.otherMethod();
    }
}
