package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec18 {

	public static void main(String[] args) {
		int a,b,diferenca;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		if(a>b) {
			diferenca = a-b;
		}else {
			diferenca = b-a;
		}
		JOptionPane.showMessageDialog(null, "A diferença do maior para o menor número informado é " + diferenca + ".");
	}

}
