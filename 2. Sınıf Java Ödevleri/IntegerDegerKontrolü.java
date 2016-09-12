package javaapplication1;
import java.util.*;

/**
 *
 * @author z
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        int sayi;
        System.out.println("Sayiyi giriniz");
        
        
        if(scan.hasNextInt())
        {
            sayi=scan.nextInt();
            System.out.println("Sayi Integer bir deger");
            
        }
        
        else
            System.out.println("Sayi integer bir deger degil");
    }
    
}
