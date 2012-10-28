package eliza;

public class response {

	private response() {
		System.out.println(hoge("No I don't"));
	}

	private String hoge(String str) {
		String[] strAry = str.split(" ");

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equalsIgnoreCase("hello")) {
				return "";
			}
			if (strAry[i].equals("why")) {
				if (strAry[i + 1].equals("don't")) {
					if (strAry[i + 2].equals("you")) {
						return "Should you"+connect(strAry,i) +"yourself?";
					}
				}
			}
			if (strAry[i].equalsIgnoreCase("yes")) {
				return "You seem quite positive";
			}
			if (strAry[i].equalsIgnoreCase("no")) {
				return "Why not?";
			}
			if (strAry[i].equals("someone")) {
				return "Can you be more specific?";
			}
			if (strAry[i].equals("everyone")) {
				return "surely not everyone";
			}
			if (strAry[i].equals("always")) {
				return "Can you think of a specific example";
			}
			if (strAry[i].equals("what")) {
				return "Why do you ask?";
			}
			if (strAry[i].equals("perhaps")) {
				return "You do not seem quite certain";
			}
			if (strAry[i].equals("are")) {
				return "Did you think they might not be"+ connect(strAry,i);
			}
		}
		return "I don't know.";
	}

	private String connect(String[] str, int n) {
		String str2 = "";

		for (int i = n; i < str.length; i++) {
			str2 = str2 + " " + str[i];
		}

		return str2;
	}

	public static void main(String[] args) {
		new response();
	}

}
