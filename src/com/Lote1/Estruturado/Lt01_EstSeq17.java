package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 * 			Receber o tempo de percurso e a velocidade média.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_EstSeq17 {

	public static void main(String[] args) {
		int tempo, velocidadeMedia, eficiencia;
		double distancia,litrosGastos;
		eficiencia = 12;
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de viagem em horas"));
		velocidadeMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade m�dia em KM/h"));
		distancia = tempo*velocidadeMedia;
		litrosGastos = distancia/eficiencia;
		
		JOptionPane.showMessageDialog(null, "Se movendo por " + tempo + " horas em " + velocidadeMedia + "Km/h em média, "
				+ "você percorreu " + distancia + "Km. \n"
				+ "Com um gasto de " + eficiencia + "L por Km você gastou " + litrosGastos + " litros.");
	}

}
