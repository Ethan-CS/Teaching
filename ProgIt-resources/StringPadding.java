package examples;

public class StringPadding {

	public static String padding(String original, char delimiter, int length) {
		int originalLength = original.length();
		String finalString = "";
		for (int i = 0; i < length - originalLength; i++) {
			finalString += delimiter;
		}
		finalString += original;
		return finalString;
	}

	public static void main(String[] args) {
		System.out.println(padding("String",'*',20));

	}

}
