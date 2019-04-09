package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba os 2 n�meros inteiros. Calcule e mostre a soma dos quadrados.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq09 {
	public static void main(String args[]) {
		int a, b, soma;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro"));
		soma = (a*a) + (b*b);
		JOptionPane.showMessageDialog(null, "A soma do quadrado de " + a + " com o quadrado de " + b + " é " + soma + ".", 
				(a*a)+"+"+(b*b), JOptionPane.INFORMATION_MESSAGE);
	}
}
