package oxxo.enums;

public class TestShow implements Runnable {
    Show show;
    public void run(){
        show =Show.getInstance();
        int i = 1;
        for (; i <= 3; i++) {
            if (show.tickedAgentBook("A"+i))break;
        }
        if (i >3) {
            System.out.println("Estimado : " +
                    Thread.currentThread().getName()+
                    "no contamos con asientos" );
        }
    }
    public static void main(String[] args) {
        TestShow test = new TestShow();
        new Thread(test, "Juan").start();
        new Thread(test, "Maria").start();
        new Thread(test, "Jose").start();
        new Thread(test, "Fer").start();
        new Thread(test, "Nana").start();
        
        
    }
}
