package collections;
import java.util.Arrays;
class AlphabeticalOrder {
		public static void main(String[] args)
		{
			int n = 4;
			String names[]= { "Virat", "Dhoni", "Sundar", "Jadeja" };
			Arrays.sort(names);
			System.out.println("The names in alphabetical order are: ");
			for (int i = 0; i < n; i++) {
				System.out.println(names[i]);
			}
		}
	}



