package pooJava.Exemplo1Automovel;

public class AutomovelTeste1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciando um Objeto da Classe Automovel1_1
		Automovel1_1 auto = new Automovel1_1("Rejane Santos","Celta","RSA2J34",2015); //new esta instanciando Autom�vel1_1 para o Objeto auto.
		
		auto.imprimirInfo();// Chamando o m�todo imprimirInfo que vai imprimir "Rejane Santos","Celta","RSA2J34",2015"
		System.out.println("\n*******************************************");
		System.out.println("\n***Transfer�ncia de Propriet�rio");
		auto.setNomeProprietario("Emily Pellini"); //'set' Esta setando NomeProprietario, ou seja, esta modificando o Atributo NomeProprietario para "Emily Pellini"
		System.out.println("\n*******************************************");
		auto.imprimirInfo();// Chamando o m�todo imprimirInfo que vai imprimir "Emily Pellini","Celta","RSA2J34",2015"
		
	}

}
