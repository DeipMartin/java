public class Pacha {
    public static void main(String[] args) {
        Flor margarita = new Flor();
        Flor[] arregloFloral = new Flor[10];
        
        arregloFloral[0] = new Flor();
        arregloFloral[2] = new Flor();
        arregloFloral[1] = margarita;
        
        margarita.color = "blanco";
        arregloFloral[2].color="verde";
        
        for (int aux = 0; aux < arregloFloral.length; aux++) {
            arregloFloral[aux]= new Flor();
            System.out.println("Flor en indide: "+aux+" asignada");
        }
        System.out.println("Listo!!! ");
        for(Flor flor: arregloFloral){
            System.out.println(flor);
        }
    }
}
class Flor {
   String color = "vino";
}


