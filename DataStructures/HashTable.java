import java.util.HashTable;

public class Aplicacion{
	public static void main(String[] args) {
		Aplicacion miAplicacion = new Aplicacion();
		miAplicacion.iniciar();
	}
	private void iniciar(){
		HashTable<Integer, String> tablaNombres =  new HashTable<Integer,String>();
		tablaNombres.put(123,"cristian");
		tablaNombres.put(124,"cristian");
		tablaNombres.put(125,"cristian");
		tablaNombres.put(126,"cristian");
		tablaNombres.put(127,"cristian");

		tablaNombres.get(123);
		System.out.println(tablaNombres);
		System.out.println(tablaNombres.get(123));

	}
}