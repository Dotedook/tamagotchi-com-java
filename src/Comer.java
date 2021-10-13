
public class Comer{

	private Tamagotchi tamagotchi;
	
	
	public Comer(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

	
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}
	public Tamagotchi getTamagotchi() {
		return this.tamagotchi;
	}
	
	
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
		tamagotchi.setPeso(tamagotchi.getPeso() + 5);
		checkAcimaDoPeso();
		tamagotchi.getDormir().dormir();
	}

	
	public void comerPouco() {
		tamagotchi.setPeso(tamagotchi.getPeso() + 1);
		checkAcimaDoPeso();
	}
	

	public void naoComer() {
		tamagotchi.setPeso(tamagotchi.getPeso() - 2);
		checkAbaixoDoPeso();
	}
	
	
	public void checkAcimaDoPeso() {
		if (tamagotchi.getPeso() >= 20) {
			InterfaceUsuario.tamagotchiComeuDemais();
			tamagotchi.morrer();
		}
	}
	
	
	public void checkAbaixoDoPeso() {
		if (tamagotchi.getPeso() <= 0) {
			InterfaceUsuario.tamagotchiDesnutrido();
			tamagotchi.morrer();
		}
	}
	
	
}
