package pooJava.Exemplo6Interfaces1;


//Configurando Heran�as multiplas nome dessa SubClasse(Retangulo)... extends BaseFigura(Super Classe "Classe Pai")... implements Figuras(Interface)
public class Retangulo extends BaseFigura implements Figuras{//Sintaxe "Implementando a Interface" Obs: se colocado a ',' podemos implementar outra Interfaces
	
	
	//M�todo Especial Construtor dessa SubClasse "Retangulo"
	Retangulo(double lado1,double lado2,String nome) // Cabe�alho do m�todo Construtor "Retangulo", com paramentros
	{//Inicio do corpo m�todo especial Construtor
		super(lado1,lado2,nome);//Super: Utilizado para pegar as variaveis/parametros da super classe || Linha 12 BaseFiguras
		nomeClasse = "Ret�ngulo";//Que esta na linha 9 BaseFiguras, ou seja, nesse momento estou inicializando o Atributo 'nomeClasse' que esta na superClasse 
	}//Final do corpo m�todo especial Construtor

	
	
	@Override // pois � um m�todo polimorfico, caso n�o coloque @Override vai ser apenas mais um m�todo comum dessa classe sem a heran�a de algum lugar
	public double getDiagonal()// Cabe�alho do m�todo getDiagonal
	{//Inicio do corpo m�todo getDiagonal
		return Math.sqrt(Math.pow(lado1,2)+ Math.pow(lado2,2));//retornando o valor do c�lculo 
	}//Final do corpo m�todo getDiagonal
	
}
