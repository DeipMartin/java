package Static;

public class Santo {
    public void matarMarciano(){
        if (Marciano.cuentaMarciano>0) {
            Marciano.cuentaMarciano--;
            System.out.println("Santo mato un marciano");
        }
        System.out.println("quedan"+Marciano.cuentaMarciano+ "marciano(s)");
    }
}
