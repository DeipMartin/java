package oxxo.enums;

public class TestLogger implements Runnable {
    public void run(){
        System.out.println(
                Thread.currentThread().getName() + " : " + Logger.getInstance()
        );
    }
    public static void main(String[] args) {Logger log = Logger.getInstance();
    new Thread(new TestLogger(),"hilo1").start();
    new Thread(new TestLogger(),"hilo2").start();
    new Thread(new TestLogger(),"hilo3").start();
    new Thread(new TestLogger(),"hilo4").start();
    new Thread(new TestLogger(),"hilo5").start();
    new Thread(new TestLogger(),"hilo6").start();                       
    }
}
