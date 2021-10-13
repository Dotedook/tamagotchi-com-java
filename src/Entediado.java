
public class Entediado extends Tamagotchi {
	
	
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
		super.peso -= 4;
		super.comer.comerMuito();
	}
	
	
	public void caminhar() {
		super.peso -= 1;
		super.comer.querComer();
	}
	
	
	
	
	
	
}
