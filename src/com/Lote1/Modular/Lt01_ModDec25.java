package com.Lote1.Modular;
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
public class Lt01_ModDec25 {

	static int horaInicio, minutoInicio, horaFinal, minutoFinal, horaJogo, minutoJogo;
	static String horarioInicio, horarioFinal;
	public static void main(String[] args) {
		capturarInformacao();
		calcularExibir();
	}


	static void capturarInformacao(){
		do {
		horarioInicio = JOptionPane.showInputDialog("Informe a Hora de início[HH:MM]");
		horaInicio = Integer.parseInt(horarioInicio.substring(0, 2));
		minutoInicio = Integer.parseInt(horarioInicio.substring(3,5));
		if(horaInicio <0 || horaInicio >= 24 || minutoInicio <0 || minutoInicio >= 60) {
			JOptionPane.showMessageDialog(null, "Horário Inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		}while (horaInicio <0 || horaInicio >= 24 || minutoInicio <0 || minutoInicio >= 60);
		System.out.println(horaInicio +":"+minutoInicio);
		do {
		horarioFinal = JOptionPane.showInputDialog("Informe a Hora de término");
		horaFinal = Integer.parseInt(horarioFinal.substring(0, 2));
		minutoFinal = Integer.parseInt(horarioFinal.substring(3,5));
		if(horaFinal<0 || horaFinal>= 24 || minutoFinal <0 || minutoFinal >= 60) {
			JOptionPane.showMessageDialog(null, "Horário Inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		}while (horaFinal <0 || horaFinal >= 24 || minutoFinal <0 || minutoFinal >=60);
		System.out.println(horaFinal+":"+minutoFinal);
	}
	
	static void calcularExibir() {
		if(minutoFinal >= minutoInicio ) {
			minutoJogo = minutoFinal - minutoInicio;
		}else {
			horaFinal--;
			minutoJogo = (minutoFinal+60) - minutoInicio;
		}
		
		horaJogo = horaFinal >= horaInicio ? horaFinal - horaInicio : (horaFinal + 24) - horaInicio;
		DecimalFormat df = new DecimalFormat("00");
		JOptionPane.showMessageDialog(null, df.format(horaJogo) + ":" + df.format(minutoJogo), "Tempo De Jogo", JOptionPane.INFORMATION_MESSAGE);
	}
}
