
public class PovoLimao extends SeresVivos{
	public PovoLimao(Multiverso multiverso) {
		super(multiverso);
	}
	private boolean ehLeal;
	private boolean sabeFalar;
	public boolean isEhLeal() {
		return ehLeal;
	}
	public void setEhLeal(boolean ehLeal) {
		this.ehLeal = ehLeal;
	}
	public boolean isSabeFalar() {
		return sabeFalar;
	}
	public void setSabeFalar(boolean sabeFalar) {
		this.sabeFalar = sabeFalar;
	}
	//private boolean ehLeal l;
	public void verificaLealdade() {
		if(isEhLeal()== false) {
			System.out.println("Sentenciado a Morte, Porque não é Leal");
		}
	}
}