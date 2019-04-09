package com.Lote1.Modular;
/*
 *********************************************
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 * 			Receber o tempo de percurso e a velocidade média.
 * Programador: Roney Cacau
 * Data Criação: 09/02/2019
 *********************************************
 */
import javax.swing.JOptionPane;
public class Lt01_ModSeq17 {

	static int tempo, velocidadeMedia, eficiencia;
	static double distancia,litrosGastos;

	public static void main(String[] args) {
		coletarInformacoes();
		calcular();
		mensagem();
	}
	
	public static void coletarInformacoes() {
		eficiencia = 12;
		tempo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de viagem em horas"));
		velocidadeMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade m�dia em KM/h"));		
	}
	public static void calcular() {
		distancia = tempo*velocidadeMedia;
		litrosGastos = distancia/eficiencia;
	}
	
	public static void mensagem() {
		JOptionPane.showMessageDialog(null, "Se movendo por " + tempo + " horas em " + velocidadeMedia + "Km/h em média, "
		+ "você percorreu " + distancia + "Km. \n"
		+ "Com um gasto de " + eficiencia + "L por Km você gastou " + String.format("%.2f", litrosGastos) + " litros.");
		
		}

}


