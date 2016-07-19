//si la calse tiene un metodo abstracto la clase tambien tiene que ser abstracta
package secondClass;
public abstract class Figura {
    
    public int var =9000;
    protected abstract double getArea();
    //no puede ser final ni private ni static devido a que no permten la sobreescritura
}
