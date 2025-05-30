
public class Mo {
	private String nome;
	private String modelo;
	private int voltagem;
	private int frequencia;
	private int idade;
	private Multiverso multiverso;
	public Mo (Multiverso multiverso){
		this.setMultiverso(multiverso);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Multiverso getMultiverso() {
		return multiverso;
	}
	public void setMultiverso(Multiverso multiverso) {
		this.multiverso = multiverso;
	}
	
}
