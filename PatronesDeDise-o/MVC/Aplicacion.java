class Aplicacion{
	public static void main(String[] args) {
		Modelo modelo =  new Modelo();
		Controlador controlador = new Controlador(modelo);
		Vista1 Vista1 = new Vista1(Controlador);
		Vista2 Vista2 = new Vista2(Controlador);

		Vista1 otraVista1 = new Vista1(Controlador);
		Vista2 otraVista2 = new Vista2(Controlador);

		modelo.añadirObservador(Vista1);
		modelo.añadirObservador(Vista2);
		modelo.añadirObservador(otraVista1);
		modelo.añadirObservador(otraVista2);
		
	}
	
}