package oxxo.enums;
// patron de diseño singleton 
public enum Cafe {
    CHICO(12.90,400),MEDIANO(15.00,600),GRANDE(27.80,900);
    private double precio;
    private double mililitros;
    // los constructores de enum siempre son private
    private Cafe(double precio, double mililitros) {
        this.precio = precio;
        this.mililitros = mililitros;
    }
    
}