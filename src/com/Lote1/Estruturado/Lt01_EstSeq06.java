package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq06 {
	public static void main(String args[]) {
		int a,b,x;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro para A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro para B"));
		x = a;
		a = b;
		b = x;
		JOptionPane.showMessageDialog(null, "B=" + b + " \n A=" + a, "Informado A=" + b + " e B=" + a, 
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
