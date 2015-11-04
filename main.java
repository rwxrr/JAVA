package main;
import java.util.*;



import matematik.Matematik;
import matematik.Matematik.Faktoriyel;

public class Main {

	
	public static void main(String[] args) 
	{
		long sayi;
		Scanner oku = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		sayi=oku.nextLong();
		
		Matematik mat=new Matematik();
		if(mat.AsalSayi(sayi))
		{
			System.out.println("Asal Sayi");
		}
		
		else
			System.out.println("Asal Sayi Değil");
		
		Matematik.Faktoriyel fak=new Matematik.Faktoriyel();
		long sonuc=0;
		sonuc=Faktoriyel.FakBul(sayi);
		System.out.println("Sayinin faktoriyeli : " + sonuc);
		
	}

}
