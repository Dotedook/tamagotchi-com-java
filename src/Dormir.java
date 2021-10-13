
public class Dormir extends Tamagotchi {

	
	public void querDormir() {
		if(checkTamagotchiParaDormir()) {
			InterfaceUsuario.tamagotchiDormirDireto();
			dormir();
		} else 
			caseSwitchDormir();
			
	}
	
	
	private boolean checkTamagotchiParaDormir() {
		return (super.quantVezesSemDormir >= 5);
	}
	
	
	private void caseSwitchDormir() {
		if (opcaoDormir() == 1)
			dormir();
		else
			seManterAcordado();
	}
	
	
	private int opcaoDormir() {
		int opcao;
		InterfaceUsuario.tamagotchiQuerDormir();
		InterfaceUsuario.opcaoDormir();
		opcao = Teclado.leInt();
		if (opcao != 1 && opcao != 2)
			opcao = garantirOpcaoCorreta(opcao);
		return opcao;
	}
	
	
	private int garantirOpcaoCorreta(int opcao) {
		while(opcao != 1 && opcao != 2) {
			InterfaceUsuario.opcaoInvalida();
			InterfaceUsuario.opcaoDormir();
			opcao = Teclado.leInt();
		}
		return opcao;
		
	}

	
	public void dormir() {
		super.setQuantVezesSemDormir(0);
		aumentarIdadeAoDormir();
		checkVivoAposDormir();
	}

	
	private void aumentarIdadeAoDormir() {
		super.idade += 1;
	}

	
	private void checkVivoAposDormir() {
		if (super.idade >= 15) {
			InterfaceUsuario.tamagotchiVelhoDemais();
			super.morrer();
		}
	}
		
	
	private void seManterAcordado() {
		super.quantVezesSemDormir += 1;
	}
	
}
