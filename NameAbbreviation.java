package MultiThread;

public class NameAbbreviation {
	static String printInitials(String name) {
		String[] words = name.split(" ");
		/*
		// print each words in separate line - for testing
		for (String str : words) {
			System.out.println(str);
		}
       */
		// find the length of the String array
		// if the name is "Soma Das" - length should be 2
		int length = words.length;

		String abb = "";

		for (int i = 0; i < length; i++) {
			if (i == (length - 1))
				//abb.concat(words[i]);
				abb += words[i];
			else {
				abb += words[i].charAt(0) + "." + " ";

			}

		}
		//System.out.println(abb);
		return abb;
	}
}
