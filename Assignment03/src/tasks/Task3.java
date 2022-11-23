package tasks;

public class Task3 {

	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		String str1 = "java string pool refers to collection of strings which are stored in heap memory";
		String str2 = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('a', '$'));
		System.out.println(str.contains("collection"));
		System.out.println(str.matches(str1));
//		System.out.println(str.compareTo(str2));
//		System.out.println(str.compareToIgnoreCase(str2));
//		System.out.println(str.contentEquals(str1));
//		System.out.println(str.contentEquals(str1));
		System.out.println();
	}

}
