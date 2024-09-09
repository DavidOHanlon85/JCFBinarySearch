package slideDeckChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example07BinarySearch {

	public static void main(String[] args) {
		
		String[] countries = {"Italy", "France", "USA", "New Zealand"};
		
		List<String> list = Arrays.asList(countries);
		
		Collections.sort(list);
		System.out.println(list);
		
		int searchIndex = Collections.binarySearch(list, "USA");
		System.out.println(searchIndex);
		
		searchIndex = Collections.binarySearch(list, "England");
		System.out.println(searchIndex);
		
		searchIndex = Collections.binarySearch(list, "Japan");
		System.out.println(searchIndex);
		
	}

}
