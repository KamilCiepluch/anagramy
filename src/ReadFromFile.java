import java.io.*;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class ReadFromFile {


	static void loadDictionary(Set<String> slownik) throws IOException {
		File file = new File("english.txt");


		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;
		while ((str = br.readLine()) != null) {

			// Print the string
			String[] words = str.split(" ");
			for(String w:words)
			{
				if( w.contains(".")) w = w.substring(0, w.length()-1);
				slownik.add(w.toLowerCase());
			}

		}

	}

	static void loadDictionary(Map<String, Histogram> map) throws IOException {
		File file = new File("english.txt");


		BufferedReader br = new BufferedReader(new FileReader(file));

		String str;
		while ((str = br.readLine()) != null) {

			// Print the string
			String[] words = str.split(" ");
			for(String w:words)
			{
				if( w.contains(".")) w = w.substring(0, w.length()-1);
				map.put(w.toLowerCase(), new Histogram(w.toLowerCase()));
			}

		}

	}
}


