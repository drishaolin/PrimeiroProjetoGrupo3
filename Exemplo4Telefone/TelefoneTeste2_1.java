package pooJava.Exemplo4Telefone;

public class TelefoneTeste2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criando os objetos
		Celular2_1 celular = new Celular2_1();//Objeto da SubClasse Celular2_1
		Fixo2_1 fixo = new Fixo2_1();//Objeto da SubClasse Fixo2_1
		Publico2_1 publico = new Publico2_1();//Objeto da SubClasse Publico2_1
		
		Telefone2_1 telefone = null; //Criando uma vari�vel chamada telefone que � do tipo Telefone2_1 e come�a com null
									// Nesse caso eu n�o posso instancia-la, mas posse criar uma vari�vel com o tipo da SuperClasse.

		int n = (int) (Math.random() * 3.0); // Criando uma vari�vel n do tipo int && Math.random da biblioteca java.lang que � um
											 // sistema rondomico, ou seja, pega n�meros aleat�rios...

		System.out.println("\nO n�mero escolhido foi: " + n);

		switch (n) {
		case 0:
			telefone = celular; // celular � o objeto criado na linha 9
			break;
		case 1:
			telefone = fixo; // fixo � o objeto criado na linha 10
			break;
		case 2:
			telefone = publico; // publico � o objeto criado na linha 11
			break;
		default:
			System.out.println("\n Erro inesperado!!!");
		}

		//
		if (telefone != null) { //Se a linha 13 for diferente de null ele executa o bloco
			telefone.disca("92324544");
			telefone.toca(2); // � o n�mero de vezes que queremos que o telefone toque e no caso do Celular2_1 esse mesmo valor vai 
							  // ser uns dos valores do switch case.
		}

	}

}
