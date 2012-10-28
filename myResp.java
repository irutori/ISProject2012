package eliza;

import java.util.Random;

public class myResp {

	private myResp() {
		System.out.println(hoge("no"));
	}

	private String hoge(String str) {
		Random rnd = new Random();
		String[] strAry = str.split(" ");

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equalsIgnoreCase("hello")) {
				return "hello";
			}
			if (strAry[i].equals("why")) {
				if (strAry[i + 1].equals("don't")) {
					if (strAry[i + 2].equals("you")) {
						return rf_whydontyou(rnd.nextInt(3),connect(strAry, i));
					}
				}
			}
			if (strAry[i].equalsIgnoreCase("yes")) {
				return rf_yes(rnd.nextInt(3));
			}
			if (strAry[i].equalsIgnoreCase("no")) {
				return rf_no(rnd.nextInt(3));
			}
			if (strAry[i].equals("someone")) {
				return "Can you be more specific?";
			}
			if (strAry[i].equals("everyone")) {
				return rf_everyone(rnd.nextInt(4));
			}
			if (strAry[i].equals("always")) {
				return rf_always(rnd.nextInt(4));
			}
			if (strAry[i].equals("what")) {
				return rf_what(rnd.nextInt(5));
			}
			if (strAry[i].equals("perhaps")) {
				return "You do not seem quite certain";
			}
			if (strAry[i].equals("are")) {
				return rf_are(rnd.nextInt(2),connect(strAry, i));
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

	private String rf_whydontyou(int i,String str){
		String ret="Should you " + str + " yourself?";
		if(i==0){
			ret="Should you " + str + " yourself?";
		}else if(i==1){
			ret="Do you believe I don't "+ str;
		}else if(i==2){
			ret="Perhaps I will "+str+"in good time";
		}
		return ret;
	}
	
	private String rf_yes(int i) {
		String ret = "I understand";
		if (i == 0) {
			ret = "You are sure";
		} else if (i == 1) {
			ret = "I understand";
		} else if (i == 2) {
			ret = "You seem quite positive";
		}
		return ret;
	}

	private String rf_no(int i) {
		String ret = "Why not?";
		if (i == 0) {
			ret = "Why not?";
		} else if (i == 1) {
			ret = "You are being a bit negative";
		} else if (i == 2) {
			ret = "Are you saying 'NO' just to be negative?";
		}
		return ret;
	}

	private String rf_everyone(int i) {
		String ret = "Who for example?";
		if (i == 0) {
			ret = "surely not everyone";
		} else if (i == 1) {
			ret = "Can you think of anyone in particular";
		} else if (i == 2) {
			ret = "Who for example?";
		} else if (i == 3) {
			ret = "You are thinking of special person";
		}
		return ret;
	}

	private String rf_always(int i) {
		String ret = "When?";
		if (i == 0) {
			ret = "Can you think of a specific example";
		} else if (i == 1) {
			ret = "When?";
		} else if (i == 2) {
			ret = "what incident are you thinking of?";
		} else if (i == 3) {
			ret = "Really--always";
		}
		return ret;
	}

	private String rf_what(int i) {
		String ret = "Why do you ask?";
		if (i == 0) {
			ret = "Why do you ask?";
		} else if (i == 1) {
			ret = "Does that question interest you?";
		} else if (i == 2) {
			ret = "What is it you really want to know?";
		} else if (i == 3) {
			ret = "What do you think?";
		} else if (i == 4) {
			ret = "What comes to your mind when you ask that";
		}
		return ret;
	}

	private String rf_are(int i, String str) {
		String ret = "Possibly they are " + str;
		if (i == 0) {
			ret = "Did you think they might not be " + str;
		} else if (i == 1) {
			ret = "Possibly they are " + str;
		}
		return ret;
	}

	public static void main(String[] args) {
		new myResp();
	}

}
