package oxxo.enums;

public class Show {
    private static final Show INSTANCE;
    private String[][] avaibleSeat={
    {"A1","avaible"},{"A2","avaible"},{"A3","avaible"}
    };
    static{
        INSTANCE=new Show();
    }
    private Show(){}
    public synchronized boolean tickedAgentBook(String seat){
    int indice = Integer.parseInt(seat.substring(1))-1;
        if (INSTANCE.avaibleSeat[indice][1].equals("avaible")) {
            INSTANCE.avaibleSeat[indice][1] = "NO Avaible";
            System.out.println("Estimado : " +
                    Thread.currentThread().getName()+
                    "su asiento es "+ INSTANCE.avaibleSeat[indice][0] );
            return true;
        }
        return false;
    }
    public static Show getInstance(){
        return INSTANCE;
    }
    
}
