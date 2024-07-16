package n3exercici1;

public class NoticiaDeFutbol extends Noticia{
	
	private String competicio;
	private String club;
	private String jugador;
	
	public NoticiaDeFutbol(String titular, String[] campsNoticia) {
		super(titular);
		this.competicio = campsNoticia[0];
		this.club = campsNoticia[1];
		this.jugador = campsNoticia[2];
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularPreuNoticia() {
		int preu = 200;
		preu += this.competicio.equalsIgnoreCase("Liga de Campions") ? 100 : 0;
		preu += this.club.contentEquals("Barça") || this.club.contentEquals("Madrid") ? 100 : 0;
		preu += this.jugador.contentEquals("Ferran Torres") || this.jugador.contentEquals("Benzema") ? 100 : 0;
		return preu;
	}

	@Override
	public int calcularPuntuaciaNoticia() {
		int puntuacio = 5;
		puntuacio += this.competicio.equalsIgnoreCase("Liga de Campions") ? 3 : 0;
		puntuacio += this.competicio.equalsIgnoreCase("Lliga") ? 2 : 0;
		puntuacio += this.club.contentEquals("Barça") || this.club.contentEquals("Madrid") ? 1 : 0;
		puntuacio += this.jugador.contentEquals("Ferran Torres") || this.jugador.contentEquals("Benzema") ? 1 : 0;
		return puntuacio;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Competició: " + this.competicio + " Club: " + this.club + " jugador: " + this.jugador;
	}

}
