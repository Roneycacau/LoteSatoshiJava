package com.Lote1.Vetor;
import java.util.Random;

/*
 *  A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
 *	author: Roney Cacau
 *	Data: 07/04/2019
 */
import javax.swing.JOptionPane;


public class Lt01_Vet07 {
	static Random gerador = new Random();
	public static void main(String args[]) {
		
		String status = "";
		int find;
		int[] vetor = new int[20];
		int op = 0;
		
		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada \n"
						+ "[1]Carregar Vetor \n" 
						+ "[2]Classificar Vetor \n"
						+ "[3]Mostrar Vetor \n"
						+ "[4]Buscar valor \n"
						+ "[9]Finalizar"));
				
				switch(op) {
				case 1:
					vetor = carregarVetor(vetor);
					break;
				case 2:
					vetor = classificar(vetor);
					JOptionPane.showMessageDialog(null, "Vetor organizado de forma crescente", "Ordem E Progresso", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					mostrarVetor(vetor);
					break;
				case 4:
					find = gerador.nextInt(50); //Integer.parseInt(JOptionPane.showInputDialog("Informe um valor a ser encontrado"));
					status = buscaBinaria(vetor, find);
					JOptionPane.showMessageDialog(null, status, "Busca", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "FINALIZADO", "ACABO", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "ERROU!!!", JOptionPane.ERROR_MESSAGE);
					break;
				}
			}catch(java.lang.NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
			}
		}while(op != 9);
	}
	
	public static int[] carregarVetor(int vet[]) {
		Random gerador = new Random();
		for(int i = 0; i<vet.length; i++) {
			//vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
			vet[i] = gerador.nextInt(50);
		}
		JOptionPane.showMessageDialog(null, "Vetor carregado", "DONE", JOptionPane.INFORMATION_MESSAGE);
		return vet;
	}
	
	public static int[] classificar(int vet[]) { 
		boolean repete = true;
		while(repete) {
			repete = false;
			for(int i=0; i < vet.length -1; i++) {
				if(vet[i]>vet[i+1]) {
					int aux = vet[i];
					vet[i] = vet[i+1];
					vet[i+1] = aux;
					repete = true;
				}
			}
		}
		return vet;
	}
	
	public static void mostrarVetor(int vet[]) {
		for(int i : vet) {
			System.out.println(i);
		}
		System.out.println();
	}

	
	public static String buscaBinaria(int vet[], int buscar) {
		int inicio = 0;
		int fim = vet.length - 1;
		int meio;
		
		while(inicio<=fim) {
			meio = (inicio + fim) / 2;
			if(buscar == vet[meio]) {
				inicio = 0;
				fim = vet.length - 1;
				return "Busca finalizada. O item pesquisado, " + buscar + ", se encontra no vetor. No índice  " + meio;
			}else if(buscar>vet[meio]) {
				inicio = meio+1;
			}else if(buscar<vet[meio]) {
				fim = meio -1;
			}
		}
		inicio = 0;
		fim = vet.length - 1;
		return "O item pesquisado, " + buscar + ", não foi encontrado no vetor";
		
	}
	

}