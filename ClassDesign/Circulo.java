package secondClass;

public class Circulo extends Figura{
    private double radio;
    public int var =-9;
    public Circulo(double radio) {
        this.radio = radio;
    }
    @Override
    protected double getArea(){
        return Math.PI * radio * radio;
    }
}
