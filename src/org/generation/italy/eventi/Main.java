package org.generation.italy.eventi;


import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;



public class Main {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
try {
			
			
			
			Evento e = new Evento("agli uomini piacciono le bionde",200);
			System.out.print(e);
			System.out.print("\nVuoi prenotare un biglietto?? y/n");
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				System.out.print("\nquanti biglietti vuoi prenotare??");
				int booking = sc.nextInt();
				e.prenota(booking );
				System.out.print(e);
				Scanner cancel = new Scanner(System.in);
				System.out.print("\nVuoi disdire una prenotazione?? y/n");
				String negative = cancel.nextLine();
				if(negative.equals("y")){
					System.out.print("\nquanti biglietti vuoi disdire??");
					int cancelled = cancel.nextInt();
					e.disdici(cancelled,booking);
					System.out.print("i posti disponibili per l evento quindi saranno:" + (200 - booking +  cancelled));
					System.out.print("\nquindi i posti prenotati ad oggi sono:" + (booking - cancelled));
			}}}
		
		catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
	}

	

	

}
