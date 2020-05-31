package br.edu.fatecmm.campominado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void VizinhoRealDistancia1Esquerda() {
		Campo candidatoVizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(candidatoVizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1Direita() {
		Campo candidatoVizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(candidatoVizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1EmCima() {
		Campo candidatoVizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(candidatoVizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1EmBaixo() {
		Campo candidatoVizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(candidatoVizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia2() {
		Campo candidatoVizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(candidatoVizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoNãoReal() {
		Campo candidatoVizinho = new Campo(1,1);
		boolean resultado = campo.adicionarVizinho(candidatoVizinho);
		assertFalse(resultado);
	}
}
