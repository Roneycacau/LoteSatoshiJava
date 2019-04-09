package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 * Verifique e mostre a exist�ncia de ra�zes reais e se caso exista, calcule e mostre..
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec20 {

	static int a, b, c;
	static double delta, raiz1, raiz2;
	public static void main(String[] args) {
		capturarInformacoes();
		calcular();
		menssagem();
	}
	static void capturarInformacoes(){
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C"));
		delta = Math.pow(b, 2) - 4 * a * c;
	}

	
	static void calcular(){
		if(delta == 0) {
			raiz1 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println(raiz1);
			JOptionPane.showMessageDialog(null, "A equação possui raizes iguais: " + raiz1 + ".", 
					"Delta Igual 0", JOptionPane.INFORMATION_MESSAGE);
		}else if(delta<0) {
			JOptionPane.showMessageDialog(null, "A equação não possui raizes reais",
					"Delta menor que 0", JOptionPane.INFORMATION_MESSAGE);
		}else {
			raiz1 = (-b + Math.sqrt(delta))/(2*a);
			raiz2 = (-b - Math.sqrt(delta))/(2*a);
		}
	}
	
	static void menssagem(){
		JOptionPane.showMessageDialog(null, "A equação possui 2 raizes: " + raiz1 + " e " + raiz2 + ".",
				"Delta maior que 0", JOptionPane.INFORMATION_MESSAGE);
	}
}
