package uygulama1_kup;

import java.util.Scanner;

public class kup {
	
	public static void main (String[] args)
	{
		Scanner oku = new Scanner(System.in);
		
		int x;
		System.out.println("Kupun bir kenarini giriniz...\n");
		x=oku.nextInt();
		
		System.out.println("Hacim : " + x*x*x);
		System.out.println("");
		System.out.println("Alan : " + 6*x*x);
		
		
	}
		
		
		
		
	}
