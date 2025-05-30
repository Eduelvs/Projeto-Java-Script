
public abstract class SeresVivos {
	private String nome;
	private int idade;
	private String genero;
	private String ocupacao;
	private String moradia;
	private String especie;
	private Multiverso multiverso;
	public SeresVivos(Multiverso multiverso) {
		this.setMultiverso(multiverso);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public String getMoradia() {
		return moradia;
	}
	public void setMoradia(String moradia) {
		this.moradia = moradia;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Multiverso getMultiverso() {
		return multiverso;
	}
	public void setMultiverso(Multiverso multiverso) {
		this.multiverso = multiverso;
	}	
}
