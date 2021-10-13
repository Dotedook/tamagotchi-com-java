
public class Comer extends Tamagotchi {


	public void querComer() {
		switch (opcaoComer()) {
		case 1:
			comerMuito();
			break;
		case 2:
			comerPouco();
			break;
		case 3:
			naoComer();
			break;
		default:
			InterfaceUsuario.erroSwitch();
		}
	}
	
	
	private int opcaoComer() {
		int opcao;
		InterfaceUsuario.tamagotchiQuerComer();
		InterfaceUsuario.opcaoComer();
		opcao = Teclado.leInt();
		if (opcao != 1 && opcao != 2 && opcao != 3)
			opcao = garantirOpcaoCorreta(opcao);
		return opcao;
	}
	
	
	private int garantirOpcaoCorreta(int opcao) {
			while(opcao != 1 && opcao != 2 && opcao != 3) {
				InterfaceUsuario.opcaoInvalida();
				InterfaceUsuario.opcaoComer();
				opcao = Teclado.leInt();
			}
			return opcao;
	}
	
	

	public void comerMuito() {
		this.peso += 5;
		checkAcimaDoPeso();
		super.dormir.dormir();
	}

	
	public void comerPouco() {
		this.peso += 1;
		checkAcimaDoPeso();
	}
	

	public void naoComer() {
		this.peso -= 2;
		checkAbaixoDoPeso();
	}
	
	
	public void checkAcimaDoPeso() {
		if (super.peso >= 20) {
			InterfaceUsuario.tamagotchiComeuDemais();
			super.morrer();
		}
	}
	
	
	public void checkAbaixoDoPeso() {
		if (super.peso <= 0) {
			InterfaceUsuario.tamagotchiDesnutrido();
			super.morrer();
		}
	}
	
	
}
