package org.generation.italy.eventi;

import java.util.HashSet;
import java.util.Set;

public class ProgrammaEventiUnici {
	private String titolounico;
	private Set<Evento> setEvents;
	public ProgrammaEventiUnici(String titolounico) {
		setTitolounico(titolounico);
		Set<Object>eventunique = new HashSet<>();
	}
	public String getTitolounico() {
		return titolounico;
	}
	public void setTitolounico(String titolounico) {
		this.titolounico = titolounico;
	}
	public Set<Evento> getSetEvents() {
		return setEvents;
	}
	public void setSetEvents(Set<Evento> setEvents) {
		this.setEvents = setEvents;
	}
}
