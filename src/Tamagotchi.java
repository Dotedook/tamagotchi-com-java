public class Tamagotchi {
	
	protected boolean vivo;
	protected int idade;
	protected int peso;
	private String nome;
	protected int quantVezesSemDormir;
	
	public Tamagotchi() {
		this.vivo = true;
		this.idade = 0;
		this.peso = 1;
		this.nome = "Dudu";
		this.quantVezesSemDormir = 0;
	}
	
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantVezesSemDormir() {
		return quantVezesSemDormir;
	}
	public void setQuantVezesSemDormir(int quantVezesSemDormir) {
		this.quantVezesSemDormir = quantVezesSemDormir;
	}


	
		public void morrer() {
			this.vivo = false;
			System.out.println("\nSeu tamagotchi morreu, para jogar novamente reinicie o programa.");
			System.exit(0);
		}
	

}
