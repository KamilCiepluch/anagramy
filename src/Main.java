import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<String> slownik = new HashSet<>();

		try
		{
			ReadFromFile.loadDictionary(slownik);
		}
		catch (IOException e)
		{
			System.out.println("Nie da sie");
		}

		System.out.println(slownik.size());
		/*
		Map<String, Histogram> slownik= new HashMap<>();
		try {
			ReadFromFile.loadDictionary(slownik);
		}
		catch (IOException e)
		{
			System.out.println("Nie da sie");
		}
		System.out.println(slownik.size());

		System.out.println("XD");
	}

		 */
	}
}
