public class Pruebas {

    public static void main(String[] args) {
        
        Figura cuadro = new Figura();
        System.out.println(cuadro.color);
        
        int numero = 10;
        String palabra ="Hola";
        System.out.println(palabra);
        Pruebas m1 = new Pruebas();
        m1.cambiarValores(numero, cuadro, palabra);
        System.out.println(numero);
        System.out.println(palabra);
        System.out.println(cuadro.color);
    }

    public void cambiarValores(int valorNumero, Figura cuadro,String palabra){
        valorNumero += 1000;    //paso por parametro
        cuadro.color="Verde";   //paso por referencia
        palabra.toUpperCase();  //paso por referencia pero es inmutable
        
    }

    static class Figura{
        String color = "Gris";
    }
}
/*los String son inmutables
    se crea un objeto mas no se sobrescribe nada:
filosofia java los objetos se creo y se destruyen nunca se transforman.
*/

 /*
        System.out.println("caso 1---------");
        String nombre1 = new String("hola mundo");
        String nombre2 = new String("hola mundo");
        System.out.println("son iguales = "+(nombre1 == nombre2));
        System.out.println("son iguales = "+(nombre1.equals(nombre2)));
        nombre1 = "edgar";
              
        System.out.println("caso 2---------");
        String name1 = "hola mundo";
        String name2 = "hola mundo";
        name1 = "Peres";
        System.out.println(name1+" son iguales = "+(name1 == name2));
        System.out.println(name2+" son iguales = "+(name1.equals(name2)));
        */
