import java.util.ArrayList;

public class Histogram {
	ArrayList <Dane>alfabet = new ArrayList<>();
	Histogram(String word)
	{
		for(char i='a'; i<='z'; i++)
		{
			alfabet.add(new Dane(i));
		}
		for(int i=0; i<word.length(); i++)
		{
			char x = word.toLowerCase().charAt(i);
			for (Dane dane : alfabet) {
				if (dane.character == x) {
					dane.increaseCounter();
					break;
				}

			}
		}
	}


	static  boolean compare(Histogram a, Histogram b)
	{
		for(int i=0; i<a.alfabet.size(); i++)
		{
			if(a.alfabet.get(i).character != b.alfabet.get(i).character) return false;
		}
		return true;
	}

}

