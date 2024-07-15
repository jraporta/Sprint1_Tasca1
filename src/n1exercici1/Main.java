package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstrumentDeVent flauta, oboe;
		InstrumentDePercussio tambor;
		InstrumentDeCorda violi;
		
		
		//Demostració de la càrrega de la classe Instrument provocada per l'accés a un membre estàtic de la Classe
		Instrument.NumberOfInstruments();
		
		//Demostració de la càrrega de la classe InstrumentDeVent per la instanciació de la classe
		flauta = new InstrumentDeVent("flauta", 35);
		//Classe InstrumentDeVent no es carrega una segona vegada al instanciar més objectes
		oboe = new InstrumentDeVent("oboe", 290);
		
		//Execució dels diferents mètodes generals
		tambor = new InstrumentDePercussio("tambor", 99);
		violi = new InstrumentDeCorda("violi", 620);
		System.out.println(tambor);
		System.out.println(violi);
		System.out.println(flauta);
		System.out.println(oboe);
		tambor.tocar();
		violi.tocar();
		flauta.tocar();
		oboe.tocar();
		//Instruments ya estava carregada, no ho fa un 2n cop
		Instrument.NumberOfInstruments();
	

	}

}
