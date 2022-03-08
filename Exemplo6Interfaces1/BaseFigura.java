package pooJava.Exemplo6Interfaces1;

public class BaseFigura {//Nome da Super Classe
	
	/*Protected: é um modificador de acesso que serve para limitar o acesso ao Atributo, ou seja apenas a 
	os métodos da minha propria classe e as classes que vão extender a minha classe vão poder usar esse Atributo.
	*/
	protected double lado1;//Atributo 1 da SuperClasse BaseFiguras, que esta sendo inicializada na SuperClasse BaseFigura linha 18
							
	protected double lado2; //Atributo 2 da SuperClasse BaseFiguras, que esta sendo inicializada na SuperClasse BaseFigura linha 19
	protected String nome;//Atributo 3 da SuperClasse BaseFiguras, que esta sendo inicializada na SuperClasse BaseFigura linha 20
	
	protected String nomeClasse;//Atributo 4 da SuperClasse BaseFiguras, que esta sendo inicializada na Classe "Quadrado" linha 12
	
	// Método Especial Construtor
	BaseFigura(double lado1,double lado2,String nome)// Método Especial Construtor com três paramentros
	{
		this.lado1 = lado1;// Inicializando o Atributo lado1
		this.lado2 = lado2;// Inicializando o Atributo lado2
		this.nome = nome;// Inicializando o Atributo nome
	}
	
	
	//Métodos
	public double getArea()//Método getArea que esta na Interface Figuras
	{
		// tem na interface Figuras
		return lado1 * lado2;//Implementação getArea
	}
	
	public double getPerimetro()//Método getPerimetro que esta na Interface Figuras
	{
		// tem na interface Figuras
		return ((lado1+lado2)*2.0);//Implementação getPerimetro
	}
	
	public String getNome()//Método getNome que esta na Interface Figuras
	{
		// tem na interface Figuras
		return nome;//Implementação getNome
	}
		
	public void setNome(String nome)//Método setNome que esta na Interface Figuras
	{
		// tem na interface Figuras
		this.nome = nome;//Implementação setNome
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//Gerando/Criando os Métodos get e set automáticamente
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

}
