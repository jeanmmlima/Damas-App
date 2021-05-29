package com.testedamas1.dominio;

import java.util.Vector;

public class Peca {
	//private Casa casa;
	private Jogador jogador;
	private boolean ehDama;
	private Vector<Jogada> jogadas;
	
	public Peca(){
		jogadas = new Vector<Jogada>();
	}
	//private int valor;
	
	
	/*public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}*/
	public boolean isEhDama() {
		return ehDama;
	}
	public void FazerDama() {
		this.ehDama = true;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Vector<Jogada> getJogadas() {
		return jogadas;
	}
	public void setJogada(Vector<Jogada> jogadas) {
		this.jogadas = jogadas;
	}
	
	
	
	/*public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}*/
	
	
}
