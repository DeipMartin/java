package Static;

/**
 *
 * @author 5
 */
public class TestCounter {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();
        Counter counter5 = new Counter();
        Counter counter6 = new Counter();
        System.out.println("counter1: "+counter1.getSerialNum());
        System.out.println("counter2: "+counter2.getSerialNum());
        System.out.println("counter3: "+counter3.getSerialNum());
        System.out.println("counter4: "+counter4.getSerialNum());
        System.out.println("counter5: "+counter5.getSerialNum());
        System.out.println("counter6: "+counter6.getSerialNum());
        System.out.println(counter1.getCounter());
        System.out.println(counter2.getCounter());
        System.out.println(counter3.getCounter());
        System.out.println(counter4.getCounter());
        System.out.println(counter5.getCounter());
        System.out.println(counter6.getCounter());
        
    }
}
