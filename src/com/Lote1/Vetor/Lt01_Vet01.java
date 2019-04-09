package com.Lote1.Vetor;


/*
 * Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *	a.	A média dos valores entre 10 e 200;
 *	b.	A soma dos números ímpares.
 *	
 *	author: Roney Cacau
 *	Data: 07/04/2019
 */
import javax.swing.JOptionPane;

public class Lt01_Vet01 {

	static int vetor[] = new int[50];
	public static void main(String[] args) {
		
		int op = 0;
		
		do {
			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("Selecione a opção desejada: \n"
						+ "[1]Carregar Vetor \n"
						+ "[2]Media dos valores entre 10 e 200 \n"
						+ "[3]Soma dos números impares \n"
						+ "[4]Mostrar Vetor \n"
						+ "[9]Finalizar"));
				switch(op) {
				case 1:
					vetor = carregarVetor(vetor);
					JOptionPane.showMessageDialog(null, "Vetor Carregado");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "A média dos valores maiores que 10 e menores que 200 é: \n" + media(vetor), "Média", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "A soma dos números impares é: \n" + somaImpar(vetor), "Soma dos Impares", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					mostraVetor();
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Finalizado");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida", "ERROU!!!", JOptionPane.ERROR_MESSAGE);
					break;
				}			
			}catch(java.lang.NumberFormatException exception) {
				JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro!", JOptionPane.ERROR_MESSAGE);
		}
		}while(op!=9);
		
	}
	
	public static int[] carregarVetor(int vet[]) {
		JOptionPane.showMessageDialog(null, "São necessários 50 números para carregar o vetor", "LOADING", JOptionPane.INFORMATION_MESSAGE);
		for(int i = 0; i<vet.length; i++) {
			vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número Inteiro"));
			
		}
		return vet;
	}
	
	public static void mostraVetor() {
		String menssagem = "";
		for (int i : vetor) {
			menssagem += i + " \n";
		}
		JOptionPane.showMessageDialog(null, menssagem, "Vetor Bunito!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static double media(int vet[]) {
		double media = 0;
		int cont = 0;
		for (int i : vet) {
			if(i>10 && i<200) {
				media += i;
				cont++;
			}
		}
		return media/cont;
	}
	
	public static int somaImpar(int vet[]) {
		int soma=0;
		for (int i : vet) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		return soma;
	}
}
