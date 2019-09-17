package Pruebas;

import java.util.ArrayList;

public class WhoLikesIt {
	public static String whoLikesIt(String... names) {

		int arguments = 0;
		ArrayList<String> list = new ArrayList<String>();
		String result = "";

		for (String s : names) {

			list.add(s);

		}
		arguments = list.size();

		switch (arguments) {

		case 0: {

			result = "no one likes this";
			break;
		}

		case 1: {
			result = list.get(0) + " likes this";
			break;
		}

		case 2: {

			result = list.get(0) + " and " + list.get(1) + " like this";
			break;
		}

		case 3: {
			result = list.get(0) + ", " + list.get(1) + " and " + list.get(2) + " like this";
			break;
		}

		default: {
			int others = arguments - 2;

			result = list.get(0) + ", " + list.get(1) + " and " + others + " others like this";

			break;
		}

		}

		// Do your magic here
		return result;
	}

}
