package tasks;

public class Task7 {
	public static void main(String[] args) {
		String str1 = "StringBuilder";
		String str2 = " is a peer of String";
		String str3 = " that provides much of";
		String str4 = " the functionality of strings";
		String[] str = {str1,str2,str3,str4};
		StringBuilder sbul = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sbul.append(str[i]);
		}
		System.out.println(sbul);
	}
}
