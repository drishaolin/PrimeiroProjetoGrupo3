package pooJava.Exemplo2Empregado;

public class EmpregadoTeste1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado1_2[] lista = new Empregado1_2[3]; //Criando um vetor com a Classe Empregado1_2 | lista � o Objeto
		
		lista[0] = new Empregado1_2("Ana K�lvia",10000); // Entrada do Sistema
		lista[1] = new Empregado1_2("Lucas Theberge",11000);
		lista[2] = new Empregado1_2("Leticia Toffoli",30000);
		
		for (Empregado1_2 roda:lista) //forIT | A partir da Classe Empregado1_2 qual o objeto que vai "roda" que � uma vari�vel de Loop e l� a lista que � o objeto
		{
			roda.imprimir(); // Vai Imprimir System.out.println(nome+"\t\t" + "Sal�rio: " + this.formatarMoeda());
		}
		
		System.out.println("**************************************************");
		System.out.println("\n\t\tSal�rio Ajustado\n");
		
		for (Empregado1_2 roda:lista)//forIT | A partir da Classe Empregado1_2 qual o objeto que vai "roda" que � uma vari�vel de Loop e l� a lista que � o objeto
		{
			roda.aumentaSalario(10); //Vai pegar o salario e acrescentear 10% | 10 substitui  o parametro percentual do M�todo aumentaSalario da Classe Empregado1_2
			roda.imprimir(); //Imprimi o vetor com as altera��es realizadas
		}
		
	}
	
}
