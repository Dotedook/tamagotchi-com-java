
public class Principal {
	
	public static void main(String[] args) {
		Tamagotchi tamagotchi = new Tamagotchi(Teclado.leString("Qual o nome do seu Tamagotchi?"));
		
		Comer comer = new Comer(tamagotchi);
		Dormir dormir = new Dormir(tamagotchi);
		Entediado entediado = new Entediado(tamagotchi);
		
		tamagotchi.setComer(comer);
		tamagotchi.setDormir(dormir);
		tamagotchi.setEntediado(entediado);
		
		
		int opcao;
		
		
		while (true) {
			System.out.println(tamagotchi);
			opcao = (int)(Math.random() * 3 ) + 1;
			
			switch (opcao) {
			case 1:
				dormir.querDormir();
				break;
			case 2:
				entediado.ficarEntediado();
				break;
			case 3:
				comer.querComer();
				break;
			default:
				System.out.println("ERRO: O CÓDIGO NÃO DEVERIA CHEGAR AQUI");
			}
		}
		

		
		
		
	}

}
