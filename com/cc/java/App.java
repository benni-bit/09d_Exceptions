package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		String str;  // String
		char ch; // Character
		
		//   Wir wollen nicht das ganze System crashen;))   Bevo rder Fehler auftritt>>>IndexOutOfBounce wird dieser Fehler durch das "catch" weggefangen
		//   Am gebräuchlisten gegen Fehler die während der Laufzeit auftreten können(Laufzeitfehlerbehandlung)
		try 
		{		
			str = "HI";
			System.out.println("Stringlaenge :" + str.length());
			
			ch = str.charAt(20);
			System.out.println("Character :" + ch);	
		} 
		catch (StringIndexOutOfBoundsException e) {
			// Fehlerbehandlung ...
			System.out.println("Index Fehler, bitte Eingabe pruefen!");		
		}
		catch (Exception e) {
			// Weitere Fehler-Routinen ....
		}
		
		
	}

}
