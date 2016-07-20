package oxxo.enums;

public class Logger {
    private static Logger myInstance;
    
    private Logger(){}
    
    public static Logger getInstance(){
        if(myInstance==null){myInstance = new Logger();}
        return myInstance;
    }
}
