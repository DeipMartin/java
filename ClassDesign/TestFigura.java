package secondClass;

/**
 *
 * @author 5
 */
public class TestFigura {
    public static double calcularFigura(Figura figura){
        return figura.getArea();
    }
    public static void main(String[] args){
        Cuadrado cuadrado = new Cuadrado(3);      
        Triangulo triangulo = new Triangulo(3.5,3.9);
        Circulo circulo = new Circulo(3.5);
       
        System.out.println(calcularFigura(circulo));
        System.out.println(calcularFigura(cuadrado));
        System.out.println(calcularFigura(triangulo));
    }
}
