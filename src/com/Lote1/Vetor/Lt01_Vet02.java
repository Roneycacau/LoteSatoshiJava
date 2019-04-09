package com.Lote1.Vetor;

/*
 * Criar e coletar um vetor [100] inteiro e exibir:
 *	a.	O maior e o menor valor;
 *	b.	A média dos valores.
 *	
 *	author: Roney Cacau
 *	Data: 08/04/2019
 */

import javax.swing.JOptionPane;

public class Lt01_Vet02 {
	static int vetor[] = new int[100];
	public static void main(String[] args) {
		int op = 0;
		String maiorMenor="";
		double media = 0;
		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada \n"
						+ "[1]Carregar Vetor \n"
						+ "[2]Mostrar Vetor \n"
						+ "[3]Maior/Menor \n"
						+ "[4]Média \n"
						+ "[9]Finalizar"));
				
				switch(op) {
				case 1:
					JOptionPane.showMessageDialog(null, "Informe 100 números", "CENZÃO", JOptionPane.INFORMATION_MESSAGE);
					vetor = carregarVetor(vetor);
					break;
				case 2:
					mostrarVetor();
					break;
				case 3:
					maiorMenor = comparar(vetor);
					JOptionPane.showMessageDialog(null, maiorMenor, "><", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:	
					media = calcularMedia(vetor);
					JOptionPane.showMessageDialog(null, "A média é " + media + ".", "Média", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Finalizado", "FIM", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}catch(java.lang.NumberFormatException exception){
				JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
				}
		}while(op!=9);
	}
	
	
	
	public static int[] carregarVetor(int vet[]) {
		for(int i=0; i<vet.length;i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i+1) + "º número"));
		}
		JOptionPane.showMessageDialog(null, "Vetor Carregado", "ACABÔ!!", JOptionPane.INFORMATION_MESSAGE);
		return vet;
	}
	
	
	public static void mostrarVetor() {
		for(int i : vetor) {
			System.out.println(i);
		}
	}
	
	public static String comparar(int vet[]) {
		String menssagem="";
		int mais = vet[0], menos = vet[0];
		for(int i : vet) {
			menos = i < menos? i : menos;
			mais = i > mais ? i : mais ;
			}
		menssagem = "O maoir valor do vetor é " + mais + " e o menor é " + menos + ".";
		return menssagem;
	}
	
	
	public static double calcularMedia(int[] vet) {
		int divisor= 0, soma = 0;
		for(int i: vet) {
			soma += i;
			divisor++;
		}
		return soma/divisor;
	}

}
