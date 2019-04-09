package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
 Calcule e mostre o resultado da somatória dos números ímpares entre esses valores..
 * Programador: Roney Cacau
 * Data Criação: 21/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep35 {

	public static void main(String[] args) {
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro"));
		if(n1>n2) {
			JOptionPane.showMessageDialog(null, "A soma dos números impares entre " + n2 + " e " + n1 + " é: " + soma1(n1, n2) + ".");
		}else {
			JOptionPane.showMessageDialog(null, "A soma dos números impares entre " + n1 + " e " + n2 + " é: " + soma1(n2, n1) + ".");
		}
	}
	
	public static int soma1(int num1, int num2) {
		int soma=0;
		for(int i = num2;i<=num1;i++) {
			if(i%2!=0) {
				soma += i;
			}	
		}
		return soma;
	}
}
