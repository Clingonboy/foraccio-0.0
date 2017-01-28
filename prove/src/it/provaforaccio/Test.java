package it.provaforaccio;

public class Test {
	public static void main(String[] args)
	{
		Mazzo mazzo = new Mazzo();
		
		for(int x=0; x <52; x++)
		{
			System.out.println(mazzo.getCarta(x).toString() + "valore numerico = " + 
					mazzo.getCarta(x).getValore());
		}
		
	}

}
