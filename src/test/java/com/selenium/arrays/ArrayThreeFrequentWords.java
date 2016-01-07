package com.selenium.arrays;

import java.util.HashMap;
import java.util.Iterator;

public class ArrayThreeFrequentWords {

	public static void main(String[] args) {
		String s = "Shaun Mark Bean (born 17 April 1959), known professionally as Sean Bean, is an English actor. After graduating from the Royal Academy of Dramatic Art, he made his professional debut in a theatre production of Romeo and Juliet in 1983. Retaining his distinctive Yorkshire accent, he first found mainstream success for his portrayal of Richard Sharpe in the ITV series Sharpe. Bean has since garnered further recognition for his performance as Ned Stark in the HBO epic fantasy series Game of Thrones, as well as roles in the BBC anthology series Accused and the ITV historical drama series Henry VIII. His most prominent film role was Boromir in The Lord of the Rings trilogy (2001–2003).Other roles include Alec Trevelyan in the James Bond film GoldenEye (1995) and Odysseus in Troy (2004), as well as roles in Patriot Games (1992), Ronin (1998), National Treasure (2004), North Country (2005), The Island (2005), Silent Hill (2006), Black Death (2010), Jupiter Ascending (2015) and The Martian (2015). As a voice actor, Bean has been featured in the video game The Elder Scrolls IV: Oblivion and the drama The Canterbury Tales, among several others. He has received several awards during his career and won an International Emmy for Best Actor. He has also been nominated for a BAFTA and Saturn Award.";
		System.out.println("The three frequent words are: ");
		threeFrequentWords(s);
	}

	//Time complexity: O(Nlogn)
	//Space complexity: O(n)
	private static void threeFrequentWords(String s) {

		String[] s1 = s.split("\\s");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length; i++) {
			if (map.containsKey(s1[i]))
				map.put(s1[i], map.get(s1[i]) + 1);

			else
				map.put(s1[i], 1);
		}

		for (int i = 0; i < 3; i++) {
			int max = 0;
			String m = null;			
			Iterator keys = map.keySet().iterator();
			while (keys.hasNext()) {
				String key = (String) keys.next();
				if (map.get(key) > max) {
					max = map.get(key);
					m = key;
				}
			}

			System.out.print(m+ " ");
			map.remove(m);
		}
	}
}
