package com.cc.java;

public class App {

	public static void main(String[] args) {
		
		String str;  // String
		char ch; // Character
		
		try 
		{		
			str = "Irgend eine Zeichenkette";
			System.out.println("Stringlaenge :" + str.length());
			
			ch = str.charAt(0);
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
