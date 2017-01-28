import java.util.Scanner;

public class prova1
{
	static Scanner userInput = new Scanner(System.in);
	
	static long rec(long N)
	{
		long result = 1;
		
		if (N==0)
			return 1;
		else{
			result = rec(N-1);
			result = N * result;
			return result ;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.print("Ciao Eugenio, sei sempre bello!!! \n");
		
		System.out.print(rec(3));
		
		
	}
}