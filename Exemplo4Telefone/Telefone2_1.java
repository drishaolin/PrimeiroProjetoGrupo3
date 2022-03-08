package pooJava.Exemplo4Telefone;

public abstract class Telefone2_1 { // Declarando a Classe abstract Telefone2_1

	// Criando os Atributos da classe
	private String tipo;

	/*
	 * CRIANDO M�TODOS ABSTRATOS N�o se deve implementar os M�todos abstratos na
	 * super classe abstrata quem DEVE implementar s�o as SubClasses que v�o puxar a
	 * heran�a e criar o Polimorfismo para sobrescrever esses M�todos Abstratos.
	 */
	abstract public void disca(String numero);// M�todo abstrato disca com (parametro String numero)

	abstract public void toca(int numToques);// M�todo abstrato toca com (parametro int numToques)

	// Criando M�todo Especial Construtor
	public Telefone2_1(String tipo) {
		this.tipo = tipo; // Recebe "Telefone Celular" de Celular2_1 || "Telefone fixo" de Fixo2_1 || "Telefone p�blico" de Publico2_1,
						  // ou seja, this.tipo = "Telefone Celular" || "Telefone fixo" || "Telefone p�blico"
	}

	// Cria��o dos M�todos da classe Getters and Setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
