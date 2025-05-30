
public class EntidadesCosmicas {
	private String nome;
	private String apelido;
	private String localizacaoFisica;
	private String funcao;
	private Multiverso Multiverso;
	public EntidadesCosmicas(Multiverso Multiverso) {
		this.Multiverso=Multiverso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getLocalizacaoFisica() {
		return localizacaoFisica;
	}
	public void setLocalizacaoFisica(String localizacaoFisica) {
		this.localizacaoFisica = localizacaoFisica;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Multiverso getMultiverso() {
		return Multiverso;
	}
	public void setMultiverso(Multiverso multiverso) {
		Multiverso = multiverso;
	}
}