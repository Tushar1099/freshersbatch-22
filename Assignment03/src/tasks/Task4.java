package tasks;

public class Task4 {

	public static void main(String[] args) {
		String str1 = "StringBuffer";
		String str2 = " is a peer of String";
		String str3 = " that provides much of";
		String str4 = " the functionality of strings";
		StringBuffer sbuf = new StringBuffer();
		String[] str = {str1,str2,str3,str4};
		for (int i = 0; i < str.length; i++) {
			sbuf.append(str[i]);
		}		
		System.out.println(sbuf);
	}

}
