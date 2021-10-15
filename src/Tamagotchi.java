public class Tamagotchi {
	
	
	private boolean vivo;
	private int idade, peso, quantVezesSemDormir;
	private String nome;
	private Comer comer;
	private Dormir dormir;
	private Entediado entediado;
	
	
	public Tamagotchi(String nome) {
		this.vivo = true;
		this.idade = 0;
		this.peso = 1;
		this.nome = nome;
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
	public Comer getComer() {
		return comer;
	}
	public void setComer(Comer comer) {
		this.comer = comer;
	}
	public Dormir getDormir() {
		return dormir;
	}
	public void setDormir(Dormir dormir) {
		this.dormir = dormir;
	}
	public Entediado getEntediado() {
		return entediado;
	}
	public void setEntediado(Entediado entediado) {
		this.entediado = entediado;
	}

	
	public void morrer() {
		this.vivo = false;
		InterfaceUsuario.tamagotchiMorreu();
		System.exit(0);
	}
	
	public String toString() {
		String retorno = String.format("O %s é o seu Tamagotchi.\nEl@ tem %d dias de idade.\nEl@ está com %d kg.", nome, idade, peso);
		return retorno;
	}
	
	
	
	

}
