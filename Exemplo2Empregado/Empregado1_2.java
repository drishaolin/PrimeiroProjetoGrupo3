package pooJava.Exemplo2Empregado;

import java.text.NumberFormat; // Biblioteca que altera o formato da moeda para configura��o que ja esta o sistema operacional, no nosso caso R$

public class Empregado1_2 {

	//Cria��o dos Atributos
	private String nome;
	private double salario;
	
	// M�todo Especial Construtor
	public Empregado1_2(String n,double s)//O nome do Construtor deve ter o mesmo nome da Minha Classe | Com dois paramentros n e s
	{
		this.setNome(n); // Ja esta iniciando com o paramentro n, pois setNome esta iniciando com paramentro n | set � um modificador
		this.setSalario(s); // Ja esta iniciando com o paramentro s, pois setSalario esta iniciando com paramentro s | set � um modificador
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Criando outros M�todos pr�prios, ou seja, M�todos da propria Classe
	public void aumentaSalario(double percentual)
	{
		salario *= 1 + percentual / 100; //salario = (salario * (1 + percentual / 100))
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); // Coloca a moeda do pa�s de acordo com a configura��o do computador | nf � uma vari�vel
		nf.setMinimumFractionDigits(2);//� um M�todo que indica quantas casas depois da virgula
		String formatoMoeda = nf.format(salario); // formata um valor para uma formata��o monet�ria | salario � o Atributo | formatoMoeda � uma variavel
		return formatoMoeda; // retorna o formatoMoeda
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t" + "Sal�rio: " + this.formatarMoeda());// nome que � o Atributo | this.formatarMoeda() esta comunicando dois M�todos da propria Classe
	}
	
}
