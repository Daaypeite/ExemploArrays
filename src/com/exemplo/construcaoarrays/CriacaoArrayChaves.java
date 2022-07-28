package com.exemplo.construcaoarrays;

public class CriacaoArrayChaves {

	public static void main(String[] args) {
		//definicao do array
		int numero = 5;
		
		//criando o array
		int codigo[] = {0, 1, 2, 3, 4, numero, 15, 85, 102};
		
		//estabelecendo o loop
		for(int i = 0; i < codigo.length; i++) {
			//exibindo os valores
			System.out.println(codigo[i] + " ");
			
		}

	}

}
