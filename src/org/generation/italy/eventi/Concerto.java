package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Concerto extends Evento{
	private LocalTime orario;
	private BigDecimal prezzo;
	public Concerto(String titolo,LocalDate data, int postiTotali,LocalTime orario,BigDecimal prezzo) throws Exception {
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
	public BigDecimal getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}
	public String gettransformDateTime() {
		return dataFormatter() + " " + getOrario().format(DateTimeFormatter.ofPattern("HH:mm"));
	}
	public String getSellPrice() {
		DecimalFormat df = new DecimalFormat("###.00€");
		return df.format(getPrezzo());
		
	}
	@Override public String toString(){
		return "Nome Spettacolo:" + getTitolo() + "\n"+
				"Ora e giorno:" + gettransformDateTime() +
				"Prezzo del biglietto" + getSellPrice();
	}
}
