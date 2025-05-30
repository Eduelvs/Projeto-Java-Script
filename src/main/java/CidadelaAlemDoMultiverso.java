
public class CidadelaAlemDoMultiverso{
	private String nomeAssino;
	private String entidadeMorta;
	private static CidadelaAlemDoMultiverso instancia = new  CidadelaAlemDoMultiverso();
	private CidadelaAlemDoMultiverso() {}
	public static CidadelaAlemDoMultiverso getInstancia() {
		return instancia;
	}
	public void setNomeAssino(String nomeAssino) {
		this.nomeAssino = nomeAssino;
	}
	public void setEntidadeMorta(String entidadeMorta) {
		this.entidadeMorta = entidadeMorta;
	}
	public void verificaEntidade() {
		nomeAssino="Pai do Finn";
		entidadeMorta="Lich";
		System.out.println("\nNome Assassino:"+nomeAssino);
		System.out.println("Entidade Morta:"+entidadeMorta);
		
	}
	public String getNomeAssino() {
		return nomeAssino;
	}
	public String getEntidadeMorta() {
		return entidadeMorta;
	}
	
	

}
