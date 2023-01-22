package MultiThread;
//https://www.scaler.com/topics/find-second-largest-number-in-array/

public class SecondMostFrequentChar {
	static final int NO_OF_CHARS = 256;

	static int indexOfSecondLargest(int array[]) {
		int lenghth = array.length;

		/*
		 * in our case the array contains all positive values
		 */
		int max = -1;

		/*
		 * The first loop will find the first_largest element present in the array.
		 */
		for (int i = 0; i < lenghth; i++) {
			/*
			 * Update the value of first_largest if the current element is larger than the
			 * first_largest value till now.
			 */
			if (max < array[i]) {
				max = array[i];
			}
		}

		int idx_second_largest = -1, second_largest = Integer.MIN_VALUE;
		

		/*
		 Now find the largest element present in the array which is smaller than the max
		 */

		for (int i = 0; i < lenghth; i++) {
			if (array[i] > second_largest && array[i] < max) {
				second_largest = array[i];
				idx_second_largest = i;
			}
		}

		return idx_second_largest;
	}

	static int findIndexOfSecondLargest_better(int array[]) {
		int lenghth = array.length;

		/*
		 * Initialize the variable idx_first_largest with the value 0 and
		 * idx_second_largest with the value -1.
		 */
		int idx_first_largest = 0;
		int idx_second_largest = -1;

		/*
		 * Now update the values of idx_first_largest and idx_second_largest in each
		 * iteration as per the approach.
		 */
		for (int i = 0; i < lenghth; i++) {
			if (array[i] > array[idx_first_largest]) {
				idx_second_largest = idx_first_largest;
				idx_first_largest = i;
			} else if (array[i] < array[idx_first_largest]) {
				if (idx_second_largest == -1 || array[idx_second_largest] < array[i])
					idx_second_largest = i;
			}
		}

		return idx_second_largest;
	}

	public static void second_most_frequent_char(String str) {
		System.out.println(str);
		int[] count_array = new int[NO_OF_CHARS];
		int length = str.length();

		char ch;
		for (int i = 0; i < length; i++) {

			ch = str.charAt(i);
			count_array[ch]++;
		}
		
		// index is the ASCII value of the character
		// if index is 65 char is 'A'
		//ch = (char) indexOfSecondLargest(count_array);

		//System.out.println(ch);

	}
}
