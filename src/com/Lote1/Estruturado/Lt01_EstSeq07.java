package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq07 {
	public static void main(String args[]) {
		double comprimento, largura, altura, volume;
		comprimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o comprimento do paralelepípedo em cm"));
		largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura do paralelepípedo em cm"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do paralelepípedo em cm"));
		volume = comprimento * altura * largura;
		JOptionPane.showMessageDialog(null, "O Volume é " + volume + "cm³", 
				comprimento+"cm Compr, \n " + largura + "cm larg, " + altura + "cm alt.", JOptionPane.INFORMATION_MESSAGE);
	}
}
