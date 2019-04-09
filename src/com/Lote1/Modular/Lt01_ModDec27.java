package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
  			Calcule e mostre a velocidade média em km/h.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModDec27 {

	static int numeroDeVoltas, tempoDeDuracao;
	static double extensao, velocidadeMedia;
	
	public static void main(String[] args) {
		capturarInformacao();
		calcular();
		exibir();
	}
	
	static void capturarInformacao() {
		numeroDeVoltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de voltas"));
		extensao = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito em metros"));
		tempoDeDuracao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de duração em minutos"));
	}
	
	static void calcular() {
		extensao /=1000;
		tempoDeDuracao /= 60;
		velocidadeMedia = (extensao * numeroDeVoltas)/tempoDeDuracao;
	}
	
	static void exibir() {
		JOptionPane.showMessageDialog(null, "Distância percorrida: " + (extensao*numeroDeVoltas) + "Km \n Velocidade Média: " + velocidadeMedia + "Km/h", "Ligeirinho?Papa-Léguas?", JOptionPane.INFORMATION_MESSAGE);
	}

}
