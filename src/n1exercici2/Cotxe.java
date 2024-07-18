package n1exercici2;

public class Cotxe {
	
	//Els atributs que són final i static s'han d'inicialitzar en el moment de declarar-los i no es poden reassignar.
	private static final String marca = "Opel";
	private static String model;
	private final int potencia;
	
	static {
		Cotxe.model = "Corsa";
	}

	
	public Cotxe(int potencia) {
		//Els atributs que no són static es poden inicialitzar al constructor de classe
		this.potencia = potencia;
	}
	
	//Els atributs que no són final es poden reassignar
	public void setModel(String model) {
		Cotxe.model = model;
	}
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	@Override
	public String toString() {
		return "Sóc un cotxe de la marca " + Cotxe.marca + " i model " + Cotxe.model
				+ " i la meva potència és de " + this.potencia;
	}
}
