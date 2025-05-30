
public class Bolsa {
	private Bolsa primeiro;
	private SeresVivos ser;
	private String tipo;
	private int capacidade;
	private boolean cheia;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public boolean isCheia() {
		return cheia;
	}
	public void setCheia(boolean cheia) {
		this.cheia = cheia;
	}
	public Bolsa getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Bolsa primeiro) {
		this.primeiro = primeiro;
	}
	public SeresVivos getSer() {
		return ser;
	}
	public void setSer(SeresVivos ser) {
		this.ser = ser;
	}
	
}
