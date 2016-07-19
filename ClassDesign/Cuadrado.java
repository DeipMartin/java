package secondClass;
public class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double lado){this.lado = lado;}
    
    public double getArea(){
    return lado * lado;
    }
    
    
}
