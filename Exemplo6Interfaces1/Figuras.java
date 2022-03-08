package pooJava.Exemplo6Interfaces1;

//Heran�a M�ltipla
//A interface vai ser uma classe abstata e os m�todos n�o devem ser implementados... Quem vai implementar s�o as subclasses

public interface Figuras { // Essa � a delclara��o da interface
	
	public String nomeInterface = "Figuras";// Um Atributo que pega um nome, nesse caso "Figuras"
	
	abstract public String getNome(); //Cabe�alho do getNome, nesse caso sem paramentros
	abstract public void  setNome(String nome);//Cabe�alho do m�todo setNome, com paramentros
	
	/* O m�todo abstrato � o m�todo de uma classe abstrata que n�o possui implementa��o.Na classe abstrata, 
	 * �  definido o m�todo abstrato com palavra reservada abstract e sua assinatura. 
	 * A sua implementa��o � obrigatoriamente feita nas classes filhas, atrav�s de sobrescrita de m�todo.
	*/
	
	public double getArea();//Cabe�alho do m�todo getArea, nesse caso sem paramentros
	public double getPerimetro();//Cabe�alho do m�todo getPerimetro, nesse caso sem paramentros
	double getDiagonal();	//Cabe�alho do m�todo getDiagonal, nesse caso sem paramentros.Nesse caso esta sm o public, mas quando n�o colocamos
							// o pr�prio java j� entende que o mesmo � public.
	
	//Se o m�todo foi criado na Interface � obrigat�rio a implementa��o dos mesmos nas SubClasses

}
