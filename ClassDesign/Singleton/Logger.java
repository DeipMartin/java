package oxxo.enums;

public class Logger {
    private static Logger myInstance;
    
    private Logger(){}
    // necesitamos implementar synchonized para evitar que las referencias cambien
    public synchronized static Logger getInstance(){
        if(myInstance==null){myInstance = new Logger();}
        return myInstance;
    }
}
