package org.generation.italy.eventi;

import java.util.Collection;
import java.beans.EventSetDescriptor;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEventi {

	private String title;
	private ArrayList Events;
	public ProgrammEventi(String title) {
		setTitle(title);
		
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public ArrayList getEvents() {
		return Events;
	}


	public void setEvents(ArrayList events) {
		List<String> eventsList = new ArrayList<>();
		eventsList.add(title);
		System.out.println(eventsList);
		
	}
	@Override public String toString(){
		return "la lista di eventi:" + Events;
	}

}
