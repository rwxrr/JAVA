package matematik;

public class Matematik {
	
	private static final boolean True = false;
	private static final boolean False = false;

	public boolean AsalSayi(long sayi)
	{
		for(int i=2;i<sayi;i++)
		{
			if (sayi%i==0)
			{
				return false ;
			}
			
		}
		return true;
		
		
		
	}
	
	public static class Faktoriyel
	
	{
		public static long FakBul(long sayi)
		{
			long faktoriyel=1;
			for(int i=2;i<=sayi;i++)
			{
				faktoriyel=faktoriyel*i;
				
				
			}
			return faktoriyel;
		}
	}

}
