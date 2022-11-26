package org.generation.italy.eventi;

import java.util.Collection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ProgrammEventi {

	private String title;
	private List<Evento> eventsList;
	public ProgrammEventi(String title) {
		setTitle(title);
		eventsList = new ArrayList<Evento>();
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public List<Evento> getEventsList() {
		return eventsList;
	}


	public void setEventsList(List<Evento> eventsList) {
		this.eventsList = eventsList;
	}
	public List <Evento> getFilterByDate(LocalDate date){
		List<Evento> response = new ArrayList<>();
		for(Evento e: eventsList ) {
			if(e.getData().isEqual(date))
				response.add(e);
		}
		return response;
		
	} 
	
	public void addEventsList(Evento nuovoEvento) {
		eventsList.add(nuovoEvento);
	}

	public int numberEvents() {
		
		
		return eventsList.size();
	}
	public void clearEvents() {
		
		eventsList.clear();
	}
	
	@Override public String toString(){
		return "\n" + getEventsList();
	}
}


