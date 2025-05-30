
public abstract class Objeto {
	private Objeto proximo;
	private String nome;
	private String tipo;
	private boolean mitico;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isMitico() {
		return mitico;
	}
	public void setMitico(boolean mitico) {
		this.mitico = mitico;
	}
	public Objeto getProximo() {
		return proximo;
	}
	public void setProximo(Objeto proximo) {
		this.proximo = proximo;
	}
	
}
