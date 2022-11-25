package org.generation.italy.eventi;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;



public class Main {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
try {
			
			
			
			
			Evento c = new Evento("Welcome to the jungle",1000);
			System.out.print(c);
			System.out.print("\nVuoi prenotare un biglietto?? y/n");
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				System.out.print("\nquanti biglietti vuoi prenotare??");
				int booking = sc.nextInt();
				c.prenota(booking );
				System.out.print(c);
				Scanner cancel = new Scanner(System.in);
				System.out.print("\nVuoi disdire una prenotazione?? y/n");
				String negative = cancel.nextLine();
				if(negative.equals("y")){
					System.out.print("\nquanti biglietti vuoi disdire??");
					int cancelled = cancel.nextInt();
					c.disdici(cancelled);
					System.out.print("i posti disponibili per l evento quindi saranno:" + (c.getPostiTotali() -  cancelled));
					ProgrammEventi Sanremo = new ProgrammEventi("Sanremo");
					Evento a = new Evento("Il leone dorme",200);
					Evento b = new Evento("Welcome to the jungle",200);
					Evento d = new Evento("Bambi",200);
					Evento e = new Evento("The Goodfellas",200);
					Evento f = new Evento("Scarface",200);
					Sanremo.addEventsList(a);
					Sanremo.addEventsList(b);
					Sanremo.addEventsList(c);
					Sanremo.addEventsList(d);
					Sanremo.addEventsList(e);
					Sanremo.addEventsList(f);
					System.out.print("\ngli eventi di sanremo di quest anno in totale saranno:" +Sanremo.numberEvents());
					System.out.println("\nQuesti sono tutti gli eventi di quest anno:\n" + Sanremo.getEventsList());
					
					}
				
			}	
			
}
		
		catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
	}

	

	

}
