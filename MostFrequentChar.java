package MultiThread;

public class MostFrequentChar {
	static final int NO_OF_CHARS = 128;

	public static void most_frequent_char(String str) {
		System.out.println(str);
		int[] count_array = new int[NO_OF_CHARS];
		int length = str.length();
        int index =0;
		
		char ch = 0;
		for (int i = 0; i < length; i++) {

			ch = str.charAt(i); //a
			index = ch;
			
			count_array[index]++; // count_array[97] = count_array[97] + 1
		}
       
		for (int i = 0; i < NO_OF_CHARS; i++) {

			ch = (char) (i);
			System.out.print(ch + "\t");
			System.out.print(count_array[i]);
			System.out.println();
		}
		/*
		// find max element in an array and it's index is the corresponding character
		int max = count_array[0];

		// Traverse array elements from second and
		// compare every element with current max
		for (int i = 1; i < length; i++)
			if (count_array[i] > max) {
				max = count_array[i];
				ch = (char) i;
			}
		System.out.println(ch + "(ASCII =" + (int)(ch) + ") appeared " + max + " times");
		*/
	}
}
