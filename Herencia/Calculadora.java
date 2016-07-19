
package mx.com.develop.sobrecarga;

public class Calculadora {
    public int sumar(int a, int b){
        System.out.println("suma de enteros");
        return a+b;
    }
    public double sumar(double a, double b){
        return a+b;
    }
    public float sumar(float a, float b){
        return a+b;
    }
    public int sumar(Integer i, Integer j){
       return i+j;
    }
}
