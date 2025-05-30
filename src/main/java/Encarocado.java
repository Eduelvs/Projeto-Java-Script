
public class Encarocado extends SeresVivos{
	public Encarocado(Multiverso multiverso) {
		super(multiverso);
	}
	private boolean divideCorpo;
	private int qtdCaroco;
	public boolean isDivideCorpo() {
		return divideCorpo;
	}
	public void setDivideCorpo(boolean divideCorpo) {
		this.divideCorpo = divideCorpo;
	}
	public int getQtdCaroco() {
		return qtdCaroco;
	}
	public void setQtdCaroco(int qtdCaroco) {
		this.qtdCaroco = qtdCaroco;
	}
	
}
