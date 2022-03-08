package pooJava.Exemplo6Interfaces1;


//Configurando Heranças multiplas nome dessa SubClasse(Quadrado)... Extendendo com extends BaseFigura(Super Classe "Classe Pai")... Implementando implements Figuras(Interface)
public class Quadrado extends BaseFigura implements Figuras { //Sintaxe "Implementando a Interface". Obs: se colocado a ',' podemos implementar outra Interfaces
	
	
	//Método Especial Construtor dessa SubClasse "Quadrado"
	Quadrado(double lado, String nome) // Cabeçalho do método Construtor "Quadrado", com paramentros
	{//Inicio do corpo método especial Construtor
		super(lado,lado,nome); //Super: Utilizado para pegar as variaveis/parametros da super classe || Linha 12 BaseFiguras
		nomeClasse = "Quadrado";//Que esta na linha 9 BaseFiguras, ou seja, nesse momento estou inicializando o Atributo 'nomeClasse' que esta na superClasse 
	}//Final do corpo método especial Construtor
	
	
	
	@Override // pois é um método polimorfico, caso não coloque @Override vai ser apenas mais um método comum dessa classe sem a herança de algum lugar
	public double getDiagonal()// Cabeçalho do método getDiagonal
	{//Inicio do corpo método getDiagonal
		return Math.sqrt(2)*lado1; //retornando o valor do cálculo 
	}//Final do corpo método getDiagonal
	
	
}
