package org.generation.italy.eventi;

import java.time.LocalDate;


public class Evento {
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	private int postiDisponibili;
	
	public int getPostiDisponibili() {
		return postiDisponibili;
	}
	public void setPostiDisponibili(int postiDisponibili) {
		this.postiDisponibili = postiDisponibili;
	}
	public Evento(String titolo , int postiTotali)throws Exception {
	setTitolo(titolo);
	setData(data);
	setPostiTotali(postiTotali);
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

	public void setData(LocalDate data) throws Exception{
		data = LocalDate.now();
		if(data.isBefore(LocalDate.now())) {
		throw new Exception("la data non puo essere precedente al giorno odierno!");
		}
		this.data = data;
	}
	public void setPostiTotali(int postiTotali) {
		this.postiTotali = postiTotali;
	}
	public int getPostiTotali() {
		return this.postiTotali = postiTotali;
		
	}

	
	public int getPostiPrenotati() {
		return this.postiPrenotati;
	}
	
	
	 public void prenota(int postiPrenotati , int postiTotali)throws Exception{
		this.postiPrenotati = postiPrenotati;
		if(postiTotali <= postiPrenotati ) {
			throw new Exception("siamo spiacenti non ci sono abbastanza posti disponibili per l evento!");
		}
		
		
	}
		public void disdici(int postiPrenotati ,int posti)throws Exception{
			if(postiPrenotati <=0 || postiPrenotati> postiTotali ) {
				throw new Exception("siamo spiacenti non ci sono posti prenotati per l evento");
			}
	}
		private String dataFormatter() {
			return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear();
		}
public String toString() {
		
		return "Titolo evento: " + titolo
				+ "\nData evento: " + dataFormatter()
				+ "\nPosti totali per l evento: \n" + postiTotali
				+ "\nPosti selezionati: \n" + postiPrenotati
				+ "\nPosti disponibili per l evento: \n" + (postiTotali - postiPrenotati);
	}
	
	
}
