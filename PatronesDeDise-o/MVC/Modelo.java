public class Modelo extends Observable {
	private int valor; // Datos
	public void setValor(int nuevoValor) {
		valor = nuevoValor;
		this.setChanged();
		this.notifyObservers(new Integer(valor));
	}
}