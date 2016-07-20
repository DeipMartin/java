//Ocupar enums cuando ocupamos listas de productos 
package oxxo.enums;
// patron de diseño singleton 
public enum Cafe {
    CHICO(12.90,400),MEDIANO(15.00,600),GRANDE(27.80,900);
    private double precio;
    private double mililitros;
    
    // los constructores de enum siempre son private
    //al ser un constructor privado no me permite generar instancias " new "
    private Cafe(double precio, double mililitros) {
        this.precio = precio;
        this.mililitros = mililitros;
    }
    
    @Override
    public String toString(){
        return "cafe : "+this.name() + ", precio: "+ precio + ", mililitros: "+mililitros;
    }
}
