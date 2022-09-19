package teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class teste {

	public static String SearchingChallenge(String str) {
		Pattern pattern = Pattern.compile("[0-9/_!@#&*:;.,¨]");
		Matcher match = pattern.matcher(str);

		if (str.length() >= 4 && str.length() <= 25) {
			str = "true";
		}
		if (match.find()) {
			str = "false";
		} else {
			str = "true";

		}
		return str;
	}

	public static void main(String[] args) {
		// keep this function call here
		// Scanner s = new Scanner(System.in);
		System.out.println(SearchingChallenge("Jailson_"));
		// System.out.print(SearchingChallenge(s.nextLine()));

	}

}