
public class app {
	public static void main(String[] args) {
		Reino r = new Reino();
		Reino r1 = new Reino();
		
		Humano h = new Humano(r);
		Vilas v = new Vilas();
		Governante g = new Governante(r);
		Eventos e = new Eventos();
		Bolsa b = new Bolsa();
		Pocao p = new Pocao();
		Arma a = new Arma();
		Magico mag = new Magico();
		
		Missao m = new Missao(r);
		
		PovoDoce pd= new PovoDoce(r);
		Encarocado caroco = new Encarocado(r);
		PovoLimao pl = new PovoLimao(r1);
		EntidadeElementar ee = new EntidadeElementar(r);
		
		EntidadesCosmicas ec = new EntidadesCosmicas(v);
		Mo mo = new Mo(v);
		CidadelaAlemDoMultiverso c = CidadelaAlemDoMultiverso.getInstancia();
		//Governante
		g.setNome("Princesa Jujuba");
		g.setEhHumano(false);
		g.setIdade(1000);
		g.setImortalidade(false);
		//Reino Doce
		r.setNome("Reino Doce");
		r.setElemento("Doce");
		r.setDono("Princesa Jujuba");
		r.setQtdHabitantes(2000);
		System.out.println("Reino: "+r.getNome()+"\nMonarca: "+g.getNome());
		//Reino Limão
		r1.setNome("Reino Limao");
		r1.setElemento("Limão");
		r1.setDono("Limão Grab II");
		r1.setQtdHabitantes(50);
		System.out.println("\nReino: "+r1.getNome()+"\nElemento: "+r1.getElemento()+"\nDono: "+r1.getDono()+"\nQuantidade de Habitantes: "+r1.getQtdHabitantes());
		//bolsa
		b.setSer(h);
		//poção
		p.setNome("Poção da Vida");
		p.setEfeito("Renascer");
		p.setMitico(true);
		p.setQtd(3);
		//arma
		a.setNome("Espada de Grama");
		a.setTipo("Espada");
		a.setTamanho(30);
		//magico
		mag.setNome("Enquiridio");
		mag.setIdade(3000);
		mag.setMitico(true);
		//Humano
		h.setNome("Finn o Humano");
		h.setEspecie("Humano");
		h.setIdade(14);
		h.setMoradia("Casa Da Arvore");
		System.out.println("\nNome: "+h.getNome()+"\nEspecie: "+h.getEspecie()+"\nIdade: "+h.getIdade()+"\nMoradia: "+h.getMoradia());
		System.out.println("\nSua bolsa: \n"+p.getNome()+","+p.getEfeito()+"\n"+a.getNome()+","+a.getTipo()+",Tamanho: "+a.getTamanho()+"\n"+mag.getNome()+", Idade: "+mag.getIdade());
		//Vilas
		v.setNome("Vila dos Aldeões");
		v.setQtdDeHabitantes(20);
		v.setTipoHabitantes("Aldeões");
		System.out.println("\n"+v.getNome()+"\nQuantidade de Habitantes: "+v.getQtdDeHabitantes()+"\nTipo de Habitantes: "+v.getTipoHabitantes());
		//Eventos
		e.setNome("Casamento do Canelinha");
		e.setLocalidade(r.getNome());
		e.setTipo("Casamento");
		System.out.println("\nEventos: " + e.getNome()+"\nLocal: " + e.getLocalidade()+"\nTipo de Evento: "+e.getTipo());
		//missão
		m.setNome(h.getNome());
		m.setObjetivo("Encontrar oculos de nerdcon");
		//Povo Doce
		pd.setNome("Canelinha");
		pd.setSabor("Canela");
		pd.setEspecie("Doce");
		pd.setOcupacao("Ajudante principal da Princesa");
		System.out.println("\nPovo doce:"+"\nNome: "+pd.getNome()+"\nSabor: "+pd.getSabor()+"\nEspecie: "+pd.getEspecie()+"\nFunção: "+pd.getOcupacao());
		//Encaroçado
		caroco.setNome("Princesa Caraço");
		caroco.setMoradia("Reino Caroço");
		System.out.println("\nEncaroçados: "+caroco.getNome()+"\nMoradia: "+caroco.getMoradia());
		//Povo Limão
		pl.setNome("Limão Grab");
		pl.setSabeFalar(true);
		pl.setOcupacao("Tomar o trono do Reino Limão");
		pl.setEhLeal(false);
		System.out.println("\nReino: "+r1.getNome());
		System.out.println("Habitante: "+pl.getNome()+"\nLealdade: "+ pl.isEhLeal());
		pl.verificaLealdade();
		//entidade elementar
		ee.setTipoElemento("Fogo");
		ee.setQtdReencarnacao(2);
		ee.setNome("Rei de Fogo");
		System.out.println("\nEntidade Elementar:\nTipo: "+ee.getTipoElemento()+"\nEntidade: "+ee.getNome()+"Quantidade de Reencarnação: "+ee.getQtdReencarnacao());
		//entidade cosmica
		ec.setNome("Lich");
		ec.setFuncao("Último estudioso de GOLB");
		ec.setApelido("Docinho");
		System.out.println("\nEntidade Cósmica: "+ec.getNome()+"\nApelido: "+ec.getApelido()+"\nFunção: "+ec.getFuncao());
		//mo
		mo.setNome("BMO");
		mo.setFrequencia(60);
		mo.setIdade(1000);
		mo.setVoltagem(110);
		mo.setModelo("MO Series Mk. II - Core-System-Ready Kompy-Compatible model" );
		System.out.println("\nNome do Video Game: "+mo.getNome()+"\nFrequencia: "+mo.getFrequencia()+"\nVoltagem: "+mo.getVoltagem()+"\nIdade: "+mo.getIdade()+"\nModelo: "+mo.getModelo());
		//Cidadela
		System.out.println("\nCidadela:");
		c.verificaEntidade();
	}
}