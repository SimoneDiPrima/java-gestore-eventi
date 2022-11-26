package org.generation.italy.eventi;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;



public class Main {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
try {
			
			Evento c = new Evento("Welcome to the jungle",LocalDate.now(), 1000);
			System.out.print(c);
			
			System.out.print("\nVuoi prenotare un biglietto?? y/n");
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				System.out.print("\nquanti biglietti vuoi prenotare??");
				int booking = sc.nextInt();
				c.prenota(booking, c.getPostiTotali());
				System.out.print(c);
				Scanner cancel = new Scanner(System.in);
				System.out.print("\nVuoi disdire una prenotazione?? y/n");
				String negative = cancel.nextLine();
				if(negative.equals("y")){
					System.out.print("\nquanti biglietti vuoi disdire??");
					int cancelled = cancel.nextInt();
					c.disdici(cancelled , c.getPostiTotali());
					System.out.print("i posti disponibili per l evento quindi saranno:" + (c.getPostiTotali() - booking + cancelled))
					;
					Scanner program = new Scanner(System.in);
					System.out.print("\nvuoi vedere il programma di oggi?y/n");
					String newProg = program.nextLine();
					if(newProg.equals("y")) {
					ProgrammEventi Sanremo = new ProgrammEventi("Sanremo");
					Evento a = new Evento("Il leone dorme",LocalDate.now(),200);
					Evento b = new Evento("Welcome to the jungle",LocalDate.now(),200);
					Evento d = new Evento("Bambi",LocalDate.now(),200);
					Evento e = new Evento("The Goodfellas",LocalDate.now(),200);
					Evento f = new Evento("Scarface",LocalDate.now(),200);
					Sanremo.addEventsList(a);
					Sanremo.addEventsList(b);
					Sanremo.addEventsList(c);
					Sanremo.addEventsList(d);
					Sanremo.addEventsList(e);
					Sanremo.addEventsList(f);
					System.out.print("\ngli eventi di sanremo di quest anno in totale saranno:" +Sanremo.numberEvents());
					System.out.println("\nQuesti sono tutti gli eventi di quest anno:\n" + Sanremo.getEventsList());
					Scanner deleteAll = new Scanner(System.in);
					System.out.print("\nVuoi cancellare tutto?? y/n");
					String deletePrograms =  deleteAll.next();
					if(deletePrograms.equals("y")){
						Sanremo.clearEvents();
						System.out.println("Quello che rimane della tua lista di Sanremo:\n" + Sanremo.getEventsList());
						}
					else { System.out.println("Grazie per averci scelto.vuoi creare un nuovo programma??");
					sc.close();
					}}
					else {
						System.out.println("Grazie lo stesso per essere passato di qua!");
					}
					}
					else {
						System.out.print("Perfetto non vediamo l ora che vieni a trovarci!");}
				}
			else {
				System.out.print("Grazie lo stesso per essere passato di qua!");}}
				
			
			

		
		catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
	}
}

	

	


