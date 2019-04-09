package com.Lote1.Vetor;
/*
 * Criar e coletar em um vetor [30] real e calcular e exibir:
 * a.	A média do grupo;
 * b.	A quantidade de notas acima do grupo;
 * c.	As posições dos valores abaixo da média do grupo.
 *	author: Roney Cacau
 *	Data: 08/04/2019
 */

import javax.swing.JOptionPane;
public class Lt01_Vet04 {
	
	public static void main(String args[]) {
	double[] vetor = new double[30];
	double media = 0;
	String notas = "";
	int op = 0;
	
	do {
		try {
			op = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n"
					+ "[1]Carregar vetor \n"
					+ "[2]Mostrar vetor \n"
					+ "[3]Calcular média \n"
					+ "[4]Mostas acima da média \n"
					+ "[9]Finalizar"));
					
			switch(op) {
				case 1:
					JOptionPane.showMessageDialog(null, "Informe 30 notas", "Atenção", JOptionPane.WARNING_MESSAGE);
					vetor = carregarVetor(vetor);
					JOptionPane.showMessageDialog(null, "Vetor Carregado", "DONE", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					mostrarVetor(vetor);
					break;
				case 3:
					media = calcularMedia(vetor, media);
					JOptionPane.showMessageDialog(null, media);
					break;
				case 4:
					notas = acimaDaMedia(vetor, media, notas);
					JOptionPane.showMessageDialog(null, notas, "Notas acima da média", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Programa Finalizado", "FIM", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
			}
			
		}catch(java.lang.NumberFormatException exeption) {
			JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
	}while(op != 9);
	
	}
	
	
	public static double[] carregarVetor(double[] vet) {
		for(int i=0; i < vet.length; i++) {
			do{
				vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "ª nota"));
				if(vet[i]<0 || vet[i]>10) {
					JOptionPane.showMessageDialog(null, "Valor Inválido. Notas vão de 0 a 10", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}while(vet[i]<0 || vet[i]>10);
		}
		return vet;
	}
	
	public static void mostrarVetor(double[] vetor) {
		for(double i : vetor) {
			System.out.println(i);
		}
	}
	
	public static double calcularMedia(double[] vetor, double m) {
		int divisor = 0;
		for(double i : vetor) {
			m += i;
			divisor++;
		}
		return m/divisor;
	}
	
	public static String acimaDaMedia(double vet[], double m, String notasAcima) {
		for(double i : vet) {
			if(i>m) {
				notasAcima += i + "\n";
			}
		}
			if(notasAcima == "") {
				notasAcima = "Nenhuma nota acima da média.";
			}
		return notasAcima;
	}
	
}
