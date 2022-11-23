package tasks;

public class Task5 {

	public static void main(String[] args) {
		String str = "It is used to _ at the specified index position";
		String str1 = "insert text";
		StringBuffer sbuf = new StringBuffer(str);
//		System.out.println(sbuf.insert(14, str1));
		sbuf.replace(14, 15, str1);
		System.out.println(sbuf);
	}

}
