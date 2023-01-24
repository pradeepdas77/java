package MultiThread;

public class RemConsonants {
	 static boolean isAlphabet(char ch) {
		if (ch >= 'a' && ch <= 'z')
			return true;
		if (ch >= 'A' && ch <= 'Z')
			return true;
		return false;
	}

	static boolean isConsonant(char ch) {
		if (isAlphabet(ch)) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return false;
			default:
				return true;
			}
		}

		return false;
	}

	static String remConsonants(String str) {
		String result = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(!isConsonant(ch))
					result += ch;
		}
		return result;
	}
}
