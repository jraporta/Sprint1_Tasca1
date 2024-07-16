package n3exercici1;

public class NoticiaDeBasquet extends Noticia{

		private String competicio;
		private String club;
		
		
		public NoticiaDeBasquet(String titular, String[] campsNoticia) {
			super(titular);
			this.competicio = campsNoticia[0];
			this.club = campsNoticia[1];
			}
		
		@Override
		public int calcularPreuNoticia() {
			int preu = 250;
			preu += this.competicio.equalsIgnoreCase("Eurolliga") ? 75 : 0;
			preu += this.club.contentEquals("Barça") || this.club.contentEquals("Madrid") ? 75 : 0;
			return preu;
		}

		@Override
		public int calcularPuntuaciaNoticia() {
			int puntuacio = 4;
			puntuacio += this.competicio.equalsIgnoreCase("Eurolliga") ? 3 : 0;
			puntuacio += this.competicio.equalsIgnoreCase("ACB") ? 2 : 0;
			puntuacio += this.club.contentEquals("Barça") || this.club.contentEquals("Madrid") ? 1 : 0;
			return puntuacio;
		}
}
