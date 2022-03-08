package pooJava.Exemplo7CollectionFramework;

import java.util.ArrayList;//Biblioteca para o ArrayList
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;//Essa é uma API
import java.util.Set;

public class Colecoes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criação do List
		ArrayList<Integer> minhaLista = new ArrayList<Integer>();// Criando objeto minhaLista
		
		//Inserção dos elementos do meu ArrayList --> minhaLista
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);
		
		//Vou percorrer todos os elementos daminhaLista
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();//Limpando o cach de memória
		
		minhaLista.remove(0);//Utilizado para deletar um elemento da minha lista
		
		//Vou percorrer todos os elementos daminhaLista
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		//Vai pegar um elemento da minha lista através do seu índice
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nO primeiro elemento da minha lista é: "+primeiroElemento);
		
		System.out.println();//Limpando o cach de memória
		
		for(int i=0;i<minhaLista.size();i++)
		{
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista);//Vai ordenar os elementos da minha lista em ordem crescente
		System.out.println("\nDepois de ordenada a minha lista, temos: ");
		System.out.println(minhaLista);
		
		System.out.println();//Limpando o cach de memória
		
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(2);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();//Iterator é uma API e não faz parte da Collection, vai ordenar a lista em ordem crescente e não duplica o elemento, ou seja, pega o primeiro.
		
		while(iMeuSet.hasNext())//hasNext --> Vai chamar sempre o próximo elemento
		{
			System.out.println(iMeuSet.next());
		}
		
	}

}
