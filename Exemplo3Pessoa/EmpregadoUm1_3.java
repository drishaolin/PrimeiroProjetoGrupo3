package pooJava.Exemplo3Pessoa;

public class EmpregadoUm1_3 extends Pessoa1_3 {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//M�todo Especial Construtor
	public EmpregadoUm1_3(String nome,String endereco,String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome,endereco,cpf,telefone,idade); //Atributos da SuperClasse Pessoa1_3
		this.codigoSetor = codigoSetor; // Atributo da SubClasse empregado1_3
		this.salarioBase = salarioBase;// Atributo da SubClasse empregado1_3
		this.imposto = imposto;// Atributo da SubClasse empregado1_3
	}
	
	//Cria��o dos M�todos da classe
	public int getCodigoSetor() { // get => � utilizado quando por exemplo voc� quer consultar o valor/conte�do de um atributo.
		return codigoSetor;		  //� usado apenas para exibir/return(retornar) valor, nunca pra alterar.
	}

	public void setCodigoSetor(int codigoSetor) { // set => � usado quando voc� quer alterar o valor/conte�do de um atributo do objeto.
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public void imprimirInfo() // M�todo para imprimirInfo
	{
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+"\nTelefone: "+getTelefone()+
				"\nEndere�o: "+getEndereco()+"\nC�digo do Setor: "+codigoSetor+"\nSal�rio base: "+salarioBase+
				"\nValor em porcentagem (sem o %) de imposto a ser retido do sal�rio: "+imposto);
	}
	
	public void calcularSalario() // M�todo para calcularSalario
	{
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO sal�rio total a ser recebido pelo empregado: "+getNome()+
				" � igual a: "+salarioLiquido);
	}
	
}
