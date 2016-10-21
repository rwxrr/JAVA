import java.util.Random;
import java.util.Scanner;

public class MatrisKare {

	public static void main(String[] args) {
		int num;
		int[][] arr;
		MatrisKare pa=new MatrisKare();
		Random rn = new Random();
		Scanner in=new Scanner(System.in);

		num=in.nextInt();

		arr=new int[num][num];

		for(int i=0; i<num; i++){
			for(int j=0;j<num;j++){
				arr[i][j]=rn.nextInt(50);
			}
		}
		System.out.println("En bÃ¼yÃ¼k toplam = "+pa.enBuyuk(arr));		
	}

	public int enBuyuk(int sayilar[][]){
		int buyukToplam=0, sum;

		int x=sayilar.length;
		int y=sayilar[1].length;

		for(int i=0; i<x-1; i++){
			for(int j=0;j<y-1;j++){
				sum=sayilar[i][j] + sayilar[i+1][j] + sayilar[i][j+1] + sayilar[i+1][j+1];
				if(sum>buyukToplam)
					buyukToplam=sum;
			}
		}

		for(int i=0; i<x; i++){
			for(int j=0;j<y;j++){
				System.out.print(sayilar[i][j]+" ");
			}
			System.out.println();
		}


		return buyukToplam;
	}

}
