package pooJava.Exemplo6Interfaces1;

//Herança Múltipla
//A interface vai ser uma classe abstata e os métodos não devem ser implementados... Quem vai implementar são as subclasses

public interface Figuras { // Essa é a delclaração da interface
	
	public String nomeInterface = "Figuras";// Um Atributo que pega um nome, nesse caso "Figuras"
	
	abstract public String getNome(); //Cabeçalho do getNome, nesse caso sem paramentros
	abstract public void  setNome(String nome);//Cabeçalho do método setNome, com paramentros
	
	/* O método abstrato é o método de uma classe abstrata que não possui implementação.Na classe abstrata, 
	 * é  definido o método abstrato com palavra reservada abstract e sua assinatura. 
	 * A sua implementação é obrigatoriamente feita nas classes filhas, através de sobrescrita de método.
	*/
	
	public double getArea();//Cabeçalho do método getArea, nesse caso sem paramentros
	public double getPerimetro();//Cabeçalho do método getPerimetro, nesse caso sem paramentros
	double getDiagonal();	//Cabeçalho do método getDiagonal, nesse caso sem paramentros.Nesse caso esta sm o public, mas quando não colocamos
							// o próprio java já entende que o mesmo é public.
	
	//Se o método foi criado na Interface é obrigatório a implementação dos mesmos nas SubClasses

}
