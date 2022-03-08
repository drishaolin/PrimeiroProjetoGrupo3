package pooJava.Exemplo3Pessoa;

public class Pessoa1_3 {

	// Criando Atributos da classe Pessoa1_3
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;

	// M�todo Esprecial Construtor | Utilizado para iniciar os Atributos
	public Pessoa1_3(String nome, String endereco, String cpf, int telefone, int idade) {
		super();
		this.nome = nome; // O primeiro nome � o atributo j� o segundo depois do sinal de igualdade � um
							// parametro
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	// Cria��o dos M�todos da classe
	// Bot�o direito / Source / Generate Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean validarCpf() // M�todo validarCpf
	{
		if (getCpf().length() != 11) // length --> conta a quantidade de caracteres
		{
			// System.out.println("\n----CPF Inv�lido");
			return false;
		} else {
			// System.out.println("\n----CPF V�lido");
			return true;
		}

	}
}
