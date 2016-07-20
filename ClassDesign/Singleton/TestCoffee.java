package oxxo;

public class TestCoffee {
    public static void main(String[] args) {
        pedirCafe(Coffee.GRANDE);
    }
    public static void pedirCafe(int tamanio){
    switch(tamanio){
        case Coffee.CHICO:
            System.out.println("sirviendo cafe CHICO");
            break;
        case Coffee.MEDIANO:
            System.out.println("sirviendo cafe MEDIANO");
            break;
        case Coffee.GRANDE:
            System.out.println("sirviendo cafe GRANDE");
            break;
        default: System.out.println("Opcion incorrecta");
        }
    }
}
