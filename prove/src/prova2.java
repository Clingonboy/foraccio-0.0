import java.util.ArrayList;
import java.util.List;

public class prova2 {
	
	public static void main(String[] args)
	{
		
		final List<String> lista = new ArrayList<String>();
		
		lista.add("Mario");
		lista.add("Toni");
		lista.add("Menego");
		lista.add("Gino");
		
		for ( String x : lista)
		{
			System.out.println(x);
		}
		

	}

}
