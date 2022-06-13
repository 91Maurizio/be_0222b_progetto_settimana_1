package be_0222b_progetto_settimana_1;

public class Officina {

	public static void main(String[] args) {
		Macchina macchina1 = new Macchina("Panda", 1200, "AA 000 AA", 3500, "verde", 6);
		Macchina macchina2 = new Macchina("X-3", 2000, "BB 000 BB", 20000, "grigia", 7);
		Macchina macchina3 = new Macchina("Scuderia", 4000, "CC 000 CC", 208000 , "rossa", 8);
		Macchina macchina4 = new Macchina("Fiesta", 1200, "DD 000 DD", 15000, "nera", 6);
		Macchina macchina5 = new Macchina("Murcielago", 6200, "EE 000 EE", 150000, "gialla", 6);		
		
		Macchina[] auto = {macchina1,macchina2,macchina3,macchina4,macchina5};
		
		if(auto.length !=0 && auto != null) {
			System.out.println("La macchina più costosa è il " + infoMacchinaPiuCostosa(auto).stampaInformazioni() );
			
			System.out.println("***-----------------------------***");
			
			Macchina targa = infoMacchina(auto, "EE 000 EE");
			if(targa != null);
				System.out.println("La Macchina da lei cercata è il " + targa.stampaInformazioni());
				
				System.out.println("***-----------------------------***");
				
				System.out.println("La Macchina Nera da lei cercata è: " + infoMacchinaColore(auto, "verde").stampaInformazioni());
		}
		else System.out.println("L'officina al momento è chiusa, tornate pure nei giorni lavorativi:");
	}

	static Macchina infoMacchinaPiuCostosa(Macchina[] auto) {
		//setto una macchina a null per il momento
		Macchina a = null;
		int max = 0;
		//se auto esiste
		if(auto != null) {
			for(int i = 0; i < auto.length; i++) {
				//controlla il prezzo
				if(auto[i].getPrezzo() > max) {
					//assegno a Macchina a
					a = auto[i];
					max = a.getPrezzo();
				}
			}
			//restituisco la Macchina temporanea
		}return a;
	}
	
	static Macchina infoMacchina(Macchina[] auto, String targa) {
		Macchina a = null;
		if(auto != null) {
			//per ogni elemento dell'Array
			for (int i = 0; i < auto.length; i++) {
				//controllo se le targhe sono uguali
				if (auto[i].getTarga().equals(targa) ) {
					a = auto[i];
				}
			}
		}return a;
	}
	
	public static Macchina infoMacchinaColore (Macchina[] auto,String colore) {
		Macchina a = null;
		if(auto != null) {
			for (int i = 0; i < auto.length; i++) {
				if(auto[i].getColore().equals(colore) ) {
					a = auto[i];
				}
			}
		}return a;
	}
}
