package pooJava.Exemplo6Interfaces1;

public class TesteFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrado fig1 = new Quadrado(10,"Quadrado1");// Objeto: fig1; do Tipo: Quadrado instanciado do Quadrado
		
		Retangulo fig2 = new Retangulo(3,4,"Reatângulo1");// Objeto: fig2; do Tipo: Retangulo instanciado do Retangulo
		
		System.out.println(fig1.getNome()+" : "+fig1.getDiagonal());
		System.out.println(fig2.getNome()+" : "+fig2.getDiagonal());
		
	}

}
