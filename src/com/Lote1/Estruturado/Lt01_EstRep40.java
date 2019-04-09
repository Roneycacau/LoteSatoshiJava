package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba 2 números inteiros. 
 			Verifique e mostre todos os números primos existentes entre eles.
 * Programador: Roney Cacau
 * Data Criação: 26/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep40 {

	public static void main(String[] args) {
		int a, b,p;
		String m;
		p = 0;
		m = "";
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		if(a<b) {
			for(int i=a;i<=b;i++) {
				for(int j=1;j<=i;j++) {
					if(i % j == 0) {
						p++;
					}
				}
				if(p==2) {
					m = m + i + " "; 
					System.out.println(m);
				}		
					p = 0;
			}
		}else {
			for(int i=b;i<=a;i++) {
				for(int j=1;j<=i;j++) {
					if(i % j == 0) {
						p++;
					}
				}
				if(p==2) {
					m = m + i + " "; 
					System.out.println(m);
				}
					p = 0;
			}
		}
		JOptionPane.showMessageDialog(null, "Entre " + a + " e " + b + " temos os número primos: " + m + ".", "PRIMOS", JOptionPane.INFORMATION_MESSAGE);
	}
}
