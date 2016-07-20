package innerClass;
abstract class HelloWorld{
    public abstract void greet();
}
public class TestHelloWorld {
    char x = 'A';
    HelloWorld englishGreeting = new HelloWorld(){
        public void greet(){
            System.out.println("hello world : " + x);
        }
    };
    public static void main(String[] args) {
        final char z = 'z';
        HelloWorld spanishGreeting = new HelloWorld(){
            @Override
            public void greet(){
                System.out.println("hello world : " + z);
            }
        };
        TestHelloworld t = new TestHelloworld();
        t.englishGreeting.greet();
        spanishGreeting.greet();
        
    }
}
