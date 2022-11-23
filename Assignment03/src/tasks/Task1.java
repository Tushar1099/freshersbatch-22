package tasks;

public class Task1 {

	public static void main(String[] args) {
		String str = "Hello World";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
				count++;
		}
		System.out.println("Length of a String without using String Method :"+count);
		System.out.println("Length of a String by using String Method : "+str.length());
	}
}
