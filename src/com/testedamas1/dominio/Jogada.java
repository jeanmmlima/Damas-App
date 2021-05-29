package com.testedamas1.dominio;

import java.util.Vector;

public class Jogada {
	private Casa casaAtacada;
	private Casa casaDestino;
	//Dama pode atacar mais de uma casa
	
	public Casa getCasaDestino() {
		return casaDestino;
	}
	public void setCasaDestino(Casa casaDestino) {
		this.casaDestino = casaDestino;
	}
	public Casa getCasaAtacada() {
		return casaAtacada;
	}
	public void setCasaAtacada(Casa casaAtacada) {
		this.casaAtacada = casaAtacada;
	}

}
