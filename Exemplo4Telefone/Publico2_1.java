package pooJava.Exemplo4Telefone;

public class Publico2_1 extends Telefone2_1 {

	// M�todo Especial Construtor
	public Publico2_1() {
		super("Telefone p�blico");// Nesse caso temos apenas um �nico Atributo na SuperClasse Telefone2_1, que � o Atributo tipo 
								  //que recebe a String "Telefone p�blico"
	}

	@Override //@Override significa que estou sobrescrevendo um M�TODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando toca com o (par�metro de retorno numToques),  devemos considerar que somento o nome toca 
			 * e o tipo int devem estar iguais ao da SuperClasse j� o par�metro numToques, poderia ser qualquer outro nome.
			 */
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTrimtrimtrim...Trimtrimtrim");
		}
	}

	@Override //@Override significa que estou sobrescrevendo um M�TODO da minha SuperClasse e o tornando em polimorfico.
			  /*Implementando disca com o (par�metro de retorno numero),  devemos considerar que somento o nome disca 
			   * e o tipo String devem estar iguais ao da SuperClasse j� o par�metro numero, poderia ser qualquer outro nome.
			   */
	public void disca(String numero) {
		if (numero.charAt(0) == '9' || numero.charAt(0) == '8') { // charAt vai pegar uma posi��o de um n�mero, ou seja, se � igual a 0(zero)
																  // ele vai pegar a primeira posi��o... como se fosse um vetor.
			System.out.println("\nEste n�mero n�o liga para celular!!!");
		} else {
			System.out.println("\nDiscando: " +numero);
		}
	}

}
