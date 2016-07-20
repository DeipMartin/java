package innerClass;
    
public class OuterClass {
    int x = 9;
    class InnerClass extends OuterClass {
        final static int var=9;
        int x = 10;
        public void method(){
            System.out.println("x en outerClass: "
                + OuterClass.this.x);
            System.out.println("x en innerClass: "
                + this.x);
        }
    }
    
}
class TestInner{
    public static void main(String[] args){
        OuterClass out = new OuterClass();
        System.out.println(out.x);
        OuterClass.InnerClass inner = out.new InnerClass();
        inner.method();        
    }
}
