
public class Governante extends SeresVivos {
	public Governante(Multiverso multiverso) {
		super(multiverso);
	}
	private String habilidade;
	private boolean imortalidade;
	private boolean ehHumano;
	private Vilas dono;
	private Reino monarca;
	public Vilas getDono() {
		return dono;
	}
	public void setDono(Vilas dono) {
		this.dono = dono;
	}
	public Reino getMonarca() {
		return monarca;
	}
	public void setMonarca(Reino monarca) {
		this.monarca = monarca;
	}
	public String getHabilidade() {
		return habilidade;
	}
	public void setHabilidade(String habilidade) {
		this.habilidade = habilidade;
	}
	public boolean isImortalidade() {
		return imortalidade;
	}
	public void setImortalidade(boolean imortalidade) {
		this.imortalidade = imortalidade;
	}
	public boolean isEhHumano() {
		return ehHumano;
	}
	public void setEhHumano(boolean ehHumano) {
		this.ehHumano = ehHumano;
	}
	
}
