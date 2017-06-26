package codFisc;

public class CodiceFiscale {
	
	
	private String nome;
	private String cognome;
	private int datadinascita;
	private String sesso;
	private String comuneDiNascita;
	
	public CodiceFiscale(String nome, String cognome, int datadinascita, String sesso, String comuneDiNascita){
		this.nome = nome;
		this.cognome = cognome;
		this.datadinascita= datadinascita;
		this.sesso = sesso;
		this.comuneDiNascita = comuneDiNascita;
	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getDatadinascita() {
		return datadinascita;
	}
	public void setDatadinascita(int datadinascita) {
		this.datadinascita = datadinascita;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	public String getComuneDiNascita() {
		return comuneDiNascita;
	}
	public void setComuneDiNascita(String comuneDiNascita) {
		this.comuneDiNascita = comuneDiNascita;
	}
	@Override
	public String toString() {
		return "CodiceFiscale [nome=" + nome + ", cognome=" + cognome + ", datadinascita=" + datadinascita + ", sesso="
				+ sesso + ", comuneDiNascita=" + comuneDiNascita + "]";
	}
	
	
	
	

}
