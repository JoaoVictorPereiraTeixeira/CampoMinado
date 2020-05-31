package br.edu.fatecmm.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {
	
	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo CadidatoDeVizinho) {
		boolean linhaDiferente = linha != CadidatoDeVizinho.linha;
		boolean colunaDiferente = coluna != CadidatoDeVizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - CadidatoDeVizinho.linha);
		int deltaColuna = Math.abs(coluna - CadidatoDeVizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(CadidatoDeVizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(CadidatoDeVizinho);
			return true;
		} else {
			return false;
		}
		
		
		
		
	}
	
	
}
