
package mx.com.develop.sobrecarga;

public class TestCalculadora{
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = new Integer(9);
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(3,4));
        System.out.println(calculadora.sumar(a,b));
        System.out.println("---------------------");
        Integer s=4;
        Integer w=128;
        Integer z = new Integer(4);
        System.out.println(s==w);
        System.out.println(s.equals(w));
        SuperCalculadora sp= new SuperCalculadora();
        System.out.println(sp.sumar(1,2,3,4,5,6));
    }
}
class SuperCalculadora extends Calculadora{
    public int sumar(int ... x){
        int suma=0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i];
        }
        System.out.println("sobrecarga");
        return suma;
    }
}
