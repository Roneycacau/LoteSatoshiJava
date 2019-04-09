package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 2 números inteiros. 
 			Verifique e mostre todos os números primos existentes entre eles.
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModRep40 {


	public static void main(String[] args) {
		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		if(a<b) {
			JOptionPane.showMessageDialog(null, "Entre " + a + " e " + b + " temos os número primos: " + primos(a,b) + ".", "PRIMOS", JOptionPane.INFORMATION_MESSAGE);
			;
		}else {
			JOptionPane.showMessageDialog(null, "Entre " + b + " e " + a + " temos os número primos: " + primos(b,a) + ".", "PRIMOS", JOptionPane.INFORMATION_MESSAGE);

			;
		}
	}

	public static String primos(int n1, int n2) {
		int p=0;
		String m="";
		for(int i=n1;i<=n2;i++) {
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					p++;
				}
			}
			if(p==2) {
				m +=i + " "; 
			}		
			p = 0;
		}
		return m;
	}
}
