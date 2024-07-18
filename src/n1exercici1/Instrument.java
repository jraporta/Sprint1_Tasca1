package n1exercici1;

public abstract class Instrument {
	private String nom;
	private int preu;
	private static int contador;
	
	static {
		Instrument.contador = 0;
		System.out.println("La classe Instrument s'ha carregat");
	}
	
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
		Instrument.contador ++;
	}
	
	public abstract void tocar();
	
	public static void numberOfInstruments() {
		System.out.println("S'han creat " + Instrument.contador + " instruments");
	}
	
	@Override
	public String toString() {
		return "Aquest instrument és un " + this.nom + " i té un preu de " + this.preu + "€";
	}
	
	

}
