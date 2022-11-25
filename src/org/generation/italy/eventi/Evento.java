package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Date;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati = 0;
	
	public Evento(String titolo,LocalDate data,int postiTotali )throws Exception {
	setTitolo(titolo);
	setData(data);
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
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	
	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	public void prenota()throws Exception{
		if(postiTotali <= 0 ) {
			throw new Exception("siamo spiacenti non ci sono piu posti disponibili per l evento!");
		}
		
	}
public String toString() {
		
		return "Titolo evento: " + titolo
				+ "\nData evento: " + data
				+ "\nPosti totali per l evento: " + getPostiTotali()
				+ "\nPosti gia prenotati per l evento: " + getPostiPrenotati();
	}
	
	
}
