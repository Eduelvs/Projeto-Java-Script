
public class EntidadeElementar extends SeresVivos{
	public EntidadeElementar(Multiverso multiverso) {
		super(multiverso);
	}
	private String tipoElemento;
	private int qtdReencarnacao;
	public String getTipoElemento() {
		return tipoElemento;
	}
	public void setTipoElemento(String tipoElemento) {
		this.tipoElemento = tipoElemento;
	}
	public int getQtdReencarnacao() {
		return qtdReencarnacao;
	}
	public void setQtdReencarnacao(int qtdReencarnacao) {
		this.qtdReencarnacao = qtdReencarnacao;
	}
}