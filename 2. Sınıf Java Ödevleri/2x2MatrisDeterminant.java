package matrisDet;
import java.util.*;

// Şimdilik 2x2 kadar matrisin determinantini hesapliyor, 3x3lük formülü eklenecektir.

public class deter {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int n = 0;
		int detA=0;
		
		
		System.out.println("n boyutlu matrisi giriniz");
		
		if(scan.hasNextInt())
		{
			n=scan.nextInt();
			int dizi[][]=new int[n][n];
			if(n<=3) // boyut 3 ten büyük olmamali
			{
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.printf("%d. %d. eleman : ",i,j);
						dizi[i][j]=scan.nextInt();
					}
				}
				
				// Diziyi Yazdirma İşlemi
				
				
				System.out.println("Dizi Yazdiriliyor");
				System.out.println("**************");
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.printf("%d. %d. eleman : %d ",i,j,dizi[i][j]);
						System.out.println("\t");
						
					}
				}
				
				System.out.println("**************");
				
				
				System.out.println("Determinant Hesaplama İşlemi");
				System.out.println("***************");
				
		
				detA=dizi[0][0]*dizi[1][1]-dizi[0][1]*dizi[1][0];
				System.out.println(detA);
				
				
			}
		}
		
		else
			
			System.out.println("?");
		
	}
	
	

}
