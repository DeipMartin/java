package ListaSimple;
public class Nodo{
	private String info;
	Nodo siguiente;
	public Nodo(String i,Nodo s){
		info = i;
		siguiente =s;
	}
	public String getInfo(){
		return info;
	}
	public void setInfo(String info){
		this.info = info;
	}
	public Nodo getSiguiente(){
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
}
