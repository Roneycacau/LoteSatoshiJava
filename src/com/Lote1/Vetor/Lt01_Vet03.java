package com.Lote1.Vetor;
/*
 * Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 * Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6

 *	
 *	author: Roney Cacau
 *	Data: 08/04/2019
 */

import javax.swing.JOptionPane;
public class Lt01_Vet03 {
	public static void main(String argas[]) {
		int vet1[] = new int[3];
		int vet2[] = new int[3];
		int vet3[] = new int[6];
		
		for(int i=0; i<vet1.length;i++) {
			vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Inteiro"));
			vet3[i] = vet1[i];
		}
		for(int i=0; i<vet2.length;i++) {
			vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Inteiro"));
			vet3[i+3] = vet2[i];
		}
		
		for (int i : vet3) {
			System.out.println(i);
		}
	}

}
