package br.edu.fatecmm.campominado;

import br.edu.fatecmm.campominado.modelo.Tabuleiro;

public class Aplicacao {
	
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6,6,7);
		
		tabuleiro.alternarMarcacao(4, 4);
		tabuleiro.alternarMarcacao(4, 5);
		tabuleiro.abrir(3,3);
		
		
		System.out.println(tabuleiro);
	}
}
