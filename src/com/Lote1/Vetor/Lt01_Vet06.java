package com.Lote1.Vetor;
/*
 *  Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
 *	author: Roney Cacau
 *	Data: 07/04/2019
 */
import javax.swing.JOptionPane;

public class Lt01_Vet06 {
	
	public static void main(String args[]) {
		int[] vetor = new int[20];
		
		int op = 0;
		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada \n"
						+ "[1]Carregar Vetor \n"
						+ "[2]Classificar Vetor \n"
						+ "[3]Mostrar Vetor \n"
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
		for(int i = 0; i<vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
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

}
