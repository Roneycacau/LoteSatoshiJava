package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec18 {
	
	static int a,b,diferenca;
	public static void main(String[] args) {
	capturarInformacoes();
	calcular();
	menssagem();
	}
	
	
	static void capturarInformacoes() {
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor inteiro"));	
	}

	
	static void calcular() {
		if(a>b) {
			diferenca = a-b;
		}else {
			diferenca = b-a;
		}		
	}

	
	static void menssagem() {
		JOptionPane.showMessageDialog(null, "A diferença do maior para o menor número informado é " + diferenca + ".");
	}
}
