package com.Lote1.Estruturado;
/*
 *********************************************
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM), 
  			calcular o tempo do jogo em horas e minutos, 
 			sabendo que o tempo máximo é menor que 24 horas e pode começar num dia e terminar noutro.
 * Programador: Roney Cacau
 * Data Criação: 10/02/2019
 *********************************************
 */
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class Lt01_EstDec25 {

	public static void main(String[] args) {
		int horaInicio, minutoInicio, horaFinal, minutoFinal, horaJogo, minutoJogo;
		horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a Hora de início"));
		while (horaInicio <0 || horaInicio >= 24) {
			horaInicio = Integer.parseInt(JOptionPane.showInputDialog("A Hora de início deve ser maior que 0 e menor que 24"));
		}
		minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto de início"));
		while (minutoInicio <0 || minutoInicio >= 60) {
			minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("O minuto de início deve ser maior que 0 e menor que 60"));
		}
		
		horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe a Hora de término"));
		while (horaFinal <0 || horaFinal >= 24) {
			horaFinal = Integer.parseInt(JOptionPane.showInputDialog("A Hora de término deve ser maior que 0 e menor que 24"));
		}
		minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto de término"));
		while (minutoFinal <0 || minutoFinal >=60) {
			minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("O minuto de término deve ser maior que 0 e menor que 60"));
		}
		minutoJogo = minutoFinal >= minutoInicio ? minutoFinal - minutoInicio : (minutoFinal+60) - minutoInicio;
		
		horaJogo = horaFinal >= horaInicio ? horaFinal - horaInicio : (horaFinal + 24) - horaInicio;
		DecimalFormat df = new DecimalFormat("00");
		JOptionPane.showMessageDialog(null, df.format(horaJogo) + ":" + df.format(minutoJogo), "Teste", JOptionPane.INFORMATION_MESSAGE);
	}

}
