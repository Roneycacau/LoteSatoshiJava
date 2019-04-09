package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX+²BX+C=0). 
 * 			Calcule e mostre as raízes reais (considerar que a equa��o possue2 raízes).
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;

public class Lt01_EstSeq05 {
	public static void main(String args[]) {
		int a, b, c;
		double delta, raiz1, raiz2;
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C"));
		delta = (b*b) - 4 * a * c;
		raiz1 = (-b + Math.sqrt(delta))/2*a;
		raiz2 = (-b - Math.sqrt(delta))/2*a;
		
		JOptionPane.showMessageDialog(null, "A raiz 1 é " + raiz1 + " e a raiz 2 é " + raiz2 + ".",
				a +"x²+" + b + "x+" + c + "=0",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
