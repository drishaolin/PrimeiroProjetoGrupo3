package pooJava.Exemplo6Interfaces1;


//Configurando Heranças multiplas nome dessa SubClasse(Retangulo)... extends BaseFigura(Super Classe "Classe Pai")... implements Figuras(Interface)
public class Retangulo extends BaseFigura implements Figuras{//Sintaxe "Implementando a Interface" Obs: se colocado a ',' podemos implementar outra Interfaces
	
	
	//Método Especial Construtor dessa SubClasse "Retangulo"
	Retangulo(double lado1,double lado2,String nome) // Cabeçalho do método Construtor "Retangulo", com paramentros
	{//Inicio do corpo método especial Construtor
		super(lado1,lado2,nome);//Super: Utilizado para pegar as variaveis/parametros da super classe || Linha 12 BaseFiguras
		nomeClasse = "Retângulo";//Que esta na linha 9 BaseFiguras, ou seja, nesse momento estou inicializando o Atributo 'nomeClasse' que esta na superClasse 
	}//Final do corpo método especial Construtor

	
	
	@Override // pois é um método polimorfico, caso não coloque @Override vai ser apenas mais um método comum dessa classe sem a herança de algum lugar
	public double getDiagonal()// Cabeçalho do método getDiagonal
	{//Inicio do corpo método getDiagonal
		return Math.sqrt(Math.pow(lado1,2)+ Math.pow(lado2,2));//retornando o valor do cálculo 
	}//Final do corpo método getDiagonal
	
}
