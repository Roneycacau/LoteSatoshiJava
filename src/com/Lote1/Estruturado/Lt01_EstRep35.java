package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. 
 Calcule e mostre o resultado da somatória dos números ímpares entre esses valores..
 * Programador: Roney Cacau
 * Data Criação: 21/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep35 {

	public static void main(String[] args) {
		int n1, n2, soma;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro"));
		soma = 0;
		if(n1>n2) {
			for(int i = n2;i<=n1;i++) {
				if(i%2!=0) {
					soma += i;
				}	
			}
			JOptionPane.showMessageDialog(null, "A soma dos números impares entre " + n2 + " e " + n1 + " é: " + soma + ".");
		}else {
			for(int i = n1; i<=n2; i++) {
				if(i%2!=0) {
					soma+=i;
				}
			}
			JOptionPane.showMessageDialog(null, "A soma dos números impares entre " + n1 + " e " + n2 + " é: " + soma + ".");
		}
	}

}
