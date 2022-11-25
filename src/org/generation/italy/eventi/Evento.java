package org.generation.italy.eventi;

import java.time.LocalDate;


public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Evento(String titolo , int postiTotali)throws Exception {
	setTitolo(titolo);
	setData(data);
	this.postiTotali = postiTotali;
	getPostiPrenotati();
	
	}
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		data = LocalDate.now();
	
		this.data = data;
	}

	public int getPostiTotali() {
		int disponible = this.postiTotali;
		return disponible;
		
	}

	
	public int getPostiPrenotati() {
		return this.postiPrenotati;
	}
	
	 public void prenota(int postiPrenotati)throws Exception{
		this.postiPrenotati = postiPrenotati;
		if(postiTotali <= postiPrenotati ) {
			throw new Exception("siamo spiacenti non ci sono piu posti disponibili per l evento!");
		}
	}
		public void disdici(int postiPrenotati)throws Exception{
			this.postiPrenotati = postiPrenotati;
			if(postiPrenotati <=0 ) {
				throw new Exception("siamo spiacenti non ci sono posti prenotati per l evento");
			}
	}
public String toString() {
		
		return "Titolo evento: " + titolo
				+ "\nData evento: " + data
				+ "\nPosti totali per l evento: " + postiTotali
				+ "\nPosti selezionati: " + postiPrenotati
				+ "\nPosti disponibili per l evento: " + (postiTotali - postiPrenotati);
	}
	
	
}
