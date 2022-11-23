package tasks;

public class Task8 {

	public static void main(String[] args) {
		String str = "It is used to _ at the specified index position";
		String str1 = "insert text";
		StringBuilder sbul = new StringBuilder(str);
		sbul.replace(14,15, str1);
//		sbul.insert(14, str1);
		System.out.println(sbul);
	}

}
