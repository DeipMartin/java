package Static;

public class Rambo {
 public void matarMarciano(){
        if (Marciano.cuentaMarciano>0) {
            Marciano.cuentaMarciano--;
            System.out.println("Rambo mato un marciano");
        }
        System.out.println("quedan"+Marciano.cuentaMarciano+ "marciano(s)");
    }
 public void lanzarGranada(){
     if(Marciano.cuentaMarciano > 0){
            Marciano.cuentaMarciano=
            (Marciano.cuentaMarciano -5 >=0)?
            Marciano.cuentaMarciano -5:0;
         System.out.println("rambo mata muchos marcianos");
     }
      System.out.println("quedan"+Marciano.cuentaMarciano+ "marciano(s)");
 }
}
