
public class Humano extends SeresVivos{
	public Humano(Multiverso multiverso) {
		super(multiverso);
	}
	private String habilidadeFisica;
	private String habilidadeMental;
	public String getHabilidadeFisica() {
		return habilidadeFisica;
	}
	public void setHabilidadeFisica(String habilidadeFisica) {
		this.habilidadeFisica = habilidadeFisica;
	}
	public String getHabilidadeMental() {
		return habilidadeMental;
	}
	public void setHabilidadeMental(String habilidadeMental) {
		this.habilidadeMental = habilidadeMental;
	}
}