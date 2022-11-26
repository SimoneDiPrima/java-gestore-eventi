package org.generation.italy.eventi;

import java.time.LocalDate;
import java.time.LocalTime;



public class Concerto extends Evento{
	private LocalTime orario;
	private int prezzo;
	public Concerto(String titolo,LocalDate data, int postiTotali,LocalTime orario,int prezzo) throws Exception {
		super(titolo,data,postiTotali);
		setOrario(orario);
		setPrezzo(prezzo);
	}
	public LocalTime getOrario() {
		return orario;
	}
	public void setOrario(LocalTime orario) {
		this.orario = orario;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
}
