package pooJava.Exemplo1Automovel;

public class Automovel1_1 {

		//Declara��o dos Atributos da classe Autom�vel1_1
		private String nomeProprietario; // Atributo= [modificador] Tipo nome
		private String modelo; // Atributo= [modificador] Tipo nome
		private String placa; // Atributo= [modificador] Tipo nome
		private int ano; // Atributo= [modificador] Tipo nome
		//private => Garante a seguran�a dessas informa��es pois somente est� classe tem acesso a essas informa��es
		
		//Cria��o do M�todo Especial Construtor
		public Automovel1_1(String nomeProprietario,String modelo,String placa,int ano) //M�todo => [modificador] nome(parametros separados por ,)
		{
			super(); // Idica que s�o Atributos da Super Classe
			this.nomeProprietario = nomeProprietario; // this.nomeProprietario(se refere a voc� mesmo, � o pr�prio Atributo)
			this.modelo = modelo; // this.modelo(se refere a voc� mesmo, � o pr�prio Atributo)
			this.placa = placa; // this.placa(se refere a voc� mesmo, � o pr�prio Atributo)
			this.ano = ano; // this.ano(se refere a voc� mesmo, � o pr�prio Atributo)
		}
		
		//Cria��o dos M�todos da classe
		//Bot�o direito / Source / Generate Getters and Setters
		public String getNomeProprietario() { // get => � utilizado quando por exemplo voc� quer consultar o valor/conte�do de um atributo. 
			return nomeProprietario;		  //� usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setNomeProprietario(String nomeProprietario) {// set => � usado quando voc� quer alterar o valor/conte�do de um atributo do objeto.
			this.nomeProprietario = nomeProprietario;
		}
		public String getModelo() {// get => � utilizado quando por exemplo voc� quer consultar o valor/conte�do de um atributo.
			return modelo;		   //� usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setModelo(String modelo) { // set => � usado quando voc� quer alterar o valor/conte�do de um atributo do objeto.
			this.modelo = modelo;
		}
		public String getPlaca() { // get => � utilizado quando por exemplo voc� quer consultar o valor/conte�do de um atributo.
			return placa;		   //� usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setPlaca(String placa) {// set => � usado quando voc� quer alterar o valor/conte�do de um atributo do objeto.
			this.placa = placa;
		}
		public int getAno() { // get => � utilizado quando por exemplo voc� quer consultar o valor/conte�do de um atributo.
			return ano;		  //� usado apenas para exibir/return(retornar) valor, nunca pra alterar.
		}
		public void setAno(int ano) {// set => � usado quando voc� quer alterar o valor/conte�do de um atributo do objeto.
			this.ano = ano;
		}

		
		
		public void imprimirInfo() // Criando um m�todo independente, para realizaer o que eu acho necessario. Void, pois ser� sem retorno
		{
			System.out.println(nomeProprietario+ " possui um(a) "+modelo+" com placa: "+placa+" e ano: "+ano);
		}
	
}
