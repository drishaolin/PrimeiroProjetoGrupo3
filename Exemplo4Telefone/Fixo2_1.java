package pooJava.Exemplo4Telefone;

public class Fixo2_1 extends Telefone2_1 {

	// M�todo Especial Construtor
	public Fixo2_1() {
		super("Telefone fixo");// Nesse caso temos apenas um �nico Atributo na SuperClasse Telefone2_1, que � o Atributo tipo 
							   //que recebe a String "Telefone fixo"
	}

	@Override //@Override significa que estou sobrescrevendo um M�TODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando toca com o (par�metro de retorno numToques),  devemos considerar que somento o nome toca 
			 * e o tipo int devem estar iguais ao da SuperClasse j� o par�metro numToques, poderia ser qualquer outro nome.
			 */
	public void toca(int numToques) {
		for (int i = 0; i < numToques; i++) {
			System.out.println("\nTrimmmmmmm...trimmmmmm");
		}
	}

	@Override //@Override significa que estou sobrescrevendo um M�TODO da minha SuperClasse e o tornando em polimorfico.
			/*Implementando disca com o (par�metro de retorno numero),  devemos considerar que somento o nome disca 
			 * e o tipo String devem estar iguais ao da SuperClasse j� o par�metro numero, poderia ser qualquer outro nome.
			 */
	public void disca(String numero) {
		System.out.println("\nDiscando: " + numero);
	}

}
