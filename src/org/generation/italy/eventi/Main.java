package org.generation.italy.eventi;


import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
try {
			
			
			Evento e = new Evento("agli uomini piacciono le bionde", 200);
			System.out.print(e);
			System.out.print("\nVuoi prenotare un biglietto?? y/n");
			String answer = sc.nextLine();
			if(answer.equals("y")) {
				System.out.print("\nquanti biglietti vuoi prenotare??");
				int booking = sc.nextInt();
				e.prenota(booking);
				System.out.print(e);
			}
			System.out.print("\nVuoi disdire una prenotazione?? y/n");
			String negativeAnswer = sc.nextLine();
			if(negativeAnswer.equals("y")){
				System.out.print("\nquanti biglietti vuoi disdire??");
				int cancelled = sc.nextInt();
				e.disdici(cancelled);
				System.out.print(e);
			}
			
			
		} catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
	}

	

	

	

}
