package ListaSimple;
public class Lista{
	Nodo inicio;
	Nodo fin;
	
	public Lista(){
		inicio = null;
		fin = null;
	}
	public void InsertarInicio(String info){
		Nodo nuevo = new Nodo(info,inicio);
		inicio = nuevo;
		if(fin == null)
			fin = inicio;
	}

	public void InsertarFinal(String info){
		Nodo nuevo = new Nodo(info,null);//recuerden q el nodo final apunta a nulo
		if(inicio == null){
			fin = nuevo;
			inicio = fin;
		}else{
			fin.setSiguiente(nuevo);
			fin = nuevo;
		}
	}

	public void EliminarInicio(){
		inicio=inicio.siguiente;
	}

	public String ExtraerInicio(){
		String info = inicio.getInfo();
		inicio = inicio.getSiguiente();
		if(inicio == null){
			fin = null;
		}
		return = null;
	}

	public void Listar(){
		Nodo temp = inicio;
		while(temp != null){
			System.out.println(temp.getInfo());
			temp = temp.siguiente;
		}
	}
}
