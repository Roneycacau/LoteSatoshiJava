package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
  			Calcule e mostre a velocidade média em km/h.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec27 {

	public static void main(String[] args) {
		int numeroDeVoltas, tempoDeDuracao;
		double extensao, velocidadeMedia;
		
		numeroDeVoltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de voltas"));
		extensao = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito em metros"))/1000;
		tempoDeDuracao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de duração em minutos"))/60;
		velocidadeMedia = (extensao * numeroDeVoltas)/tempoDeDuracao;
		
		JOptionPane.showMessageDialog(null, "Distância percorrida: " + (extensao*numeroDeVoltas) + "Km \n Velocidade Média: " + velocidadeMedia + "Km/h", "Ligeirinho?Papa-Léguas?", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
