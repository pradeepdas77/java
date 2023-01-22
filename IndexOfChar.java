package MultiThread;

public class IndexOfChar {
	static final int NO_OF_CHARS = 26;
	public static void index_of_char(String str) {
		System.out.println(str);
		str= str.toLowerCase();
		// ASCII value of 'a'=97 and 26 letters
		char ch;
		for (int i = 0; i < NO_OF_CHARS; i++) {
			ch = (char) (i + 'a');
			
			System.out.print(ch + "\t");
			System.out.print(str.indexOf(ch));
			System.out.println();
		}

	}
}



