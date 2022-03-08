package pooJava.Exemplo4Telefone;

public class Celular2_1 extends Telefone2_1 { // A SubClasse Celular2_1 vai estender a Super Classe Telefone2_1, 
											  //ou seja, vai Herdar do Telefone2_1

	//M�todo Especial Construtor
	public Celular2_1() {
		super("Telefone Celular"); // Nesse caso temos apenas um �nico Atributo na SuperClasse Telefone2_1, que � o Atributo tipo 
								   //que recebe a String "Telefone Celular"
	}

	@Override //@Override significa que estou sobrescrevendo um M�TODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando toca com o (par�metro de retorno codigoToque),  devemos considerar que somento o nome toca 
			 * e o tipo int devem estar iguais ao da SuperClasse j� o par�metro codigoToque, poderia ser qualquer outro nome
			 */
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1: 
			System.out.println("\nShalamar...Shalamar");
			break;
			
		case 2:
			System.out.println("\nTananinana...Tananinana...");
			break;
			
		default:
				System.out.println("\nTa...tanana...tanana");
		}
	}
	
	@Override//@Override significa que estou sobrescrevendo(Sobrescrita) um M�TODO da minha SuperClasse e o tornando em polimorfico.
	   		 /*Implementando disca com o (par�metro de retorno numero), devemos considerar que somento o nome disca
	   		  * e o tipo String devem estar iguais ao da SuperClasse j� o par�metro  numero, poderia ser qualquer outro nome
	 		 */
	public void disca(String numero)
	{
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}
	
}