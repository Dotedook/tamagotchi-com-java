
public class Entediado{
	

	private Tamagotchi tamagotchi;
	
	
	public Entediado(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}
	
	
	
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}
	public Tamagotchi getTamagotchi() {
		return this.tamagotchi;
	}
	

	
	public void ficarEntediado() {
		if (opcaoEntediado() == 1)
			correr();
		else
			caminhar();
	}

	
	private int opcaoEntediado() {
		int opcao;
		InterfaceUsuario.tamagotchiEntediado();
		InterfaceUsuario.opcaoEntediado();
		opcao = Teclado.leInt();
		if (opcao != 1 && opcao != 2)
			opcao = garantirOpcaoCorreta(opcao);
		return opcao;
	}
	
	
	private int garantirOpcaoCorreta(int opcao) {
		while(opcao != 1 && opcao != 2) {
			InterfaceUsuario.opcaoInvalida();
			InterfaceUsuario.opcaoEntediado();
			opcao = Teclado.leInt();
		}
		return opcao;
	}
	
	
	public void correr() {
		tamagotchi.setPeso(tamagotchi.getPeso() - 4);
		tamagotchi.getComer().checkAbaixoDoPeso();
		tamagotchi.getComer().comerMuito();
	}
	
	
	public void caminhar() {
		tamagotchi.setPeso(tamagotchi.getPeso() - 1);
		tamagotchi.getComer().checkAbaixoDoPeso();
		tamagotchi.getComer().querComer();
	}

	
}
