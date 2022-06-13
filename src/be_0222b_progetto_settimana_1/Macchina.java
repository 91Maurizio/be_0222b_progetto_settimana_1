package be_0222b_progetto_settimana_1;

public class Macchina {
	private String nome;
	private int cilindrata;
	private String targa;
	private int prezzo;
	private String colore;
	private int numeroMarce;
	private boolean motoreAcceso;
	private int marce;
	
	public String getNome() {
		return nome;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public String getTarga() {
		return targa;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public String getColore() {
		return colore;
	}
	public int getNumeroMarce() {
		return numeroMarce;
	}
	public boolean isMotoreAcceso() {
		return motoreAcceso;
	}
	public int getMarce() {
		return marce;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	private void setTarga(String targa) {
		this.targa = targa;
	}
	private void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	private void setColore(String colore) {
		this.colore = colore;
	}
	private void setNumeroMarce(int numeroMarce) {
		this.numeroMarce = numeroMarce;
	}
	private void setMotoreAcceso(boolean motoreAcceso) {
		this.motoreAcceso = motoreAcceso;
	}
	private void setMarce(int marce) {
		this.marce = marce;
	}
	
	public Macchina(String nome,int cilindrata,String targa,int prezzo,String colore,int marce) {
		setNome(nome);
		setCilindrata(cilindrata);
		setTarga(targa);
		setPrezzo(prezzo);
		setColore(colore);
		setMarce(marce);
	}
	
	public void accendiMotore() {
		if(!motoreAcceso) {
			//metto in folle
			cambiaMarcia(0);
			//accendo motore
			setMotoreAcceso(true);
		}
	}
	
	public void spegniMotore() {
		if(motoreAcceso) {
			//se non sono in folle
			if(getMarce() != 0) {
				//metto in folle
				cambiaMarcia(0);
			}setMotoreAcceso(false);
		}
	}
	
	public void cambiaMarcia(int marce) {
		//range di marce
		if(marce >= 0 && marce <= numeroMarce) {
			//se è la marcia giusta
			if(getMarce() != marce) {
				//inserisci marcia
				setMarce(marce);
			}
		}
	}
	
	public void scalaMarcia() {
		int scalaMarcia = getMarce()-1;
		//range di marce
		if(scalaMarcia >= 0 && scalaMarcia <= getNumeroMarce()) {
			setMarce(scalaMarcia);
		}
	}
	
	public void saliDiMarcia() {
		int saliDiMarcia = getMarce()+1;
		//range di marce
		if(saliDiMarcia >= 0 && saliDiMarcia <= getNumeroMarce()) {
			setMarce(saliDiMarcia);
		}
	}
	
	public String stampaInformazioni() {
		if(nome != null && targa != null) {
			return "Modello: " + nome+ "\nCilindrata: " +cilindrata+ "\nTarga: " +targa+ "\nPrezzo: " +prezzo+ "\nColore: " +colore+ "\nNumero di Marce: " +marce;
		}else {
			return "Che modello di Macchina desideravi?";
		}
	}
	
}