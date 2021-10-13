
public class Dormir{

	private Tamagotchi tamagotchi;
	
	public Dormir(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}

	
	public void setTamagotchi(Tamagotchi tamagotchi) {
		this.tamagotchi = tamagotchi;
	}
	public Tamagotchi getTamagotchi() {
		return this.tamagotchi;
	}
	

	public void querDormir() {
		if(checkTamagotchiParaDormir()) {
			InterfaceUsuario.tamagotchiDormirDireto();
			dormir();
		} else 
			caseSwitchDormir();
			
	}
	
	
	private boolean checkTamagotchiParaDormir() {
		return (tamagotchi.getQuantVezesSemDormir() >= 5);
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
		tamagotchi.setQuantVezesSemDormir(0);
		aumentarIdadeAoDormir();
		checkVivoAposDormir();
	}

	
	private void aumentarIdadeAoDormir() {
		tamagotchi.setIdade(tamagotchi.getIdade() + 1);
	}

	
	private void checkVivoAposDormir() {
		if (tamagotchi.getIdade() >= 15) {
			InterfaceUsuario.tamagotchiVelhoDemais();
			tamagotchi.morrer();
		}
	}
		
	
	private void seManterAcordado() {
		tamagotchi.setQuantVezesSemDormir(tamagotchi.getQuantVezesSemDormir() + 1);
	}
	
	
}
