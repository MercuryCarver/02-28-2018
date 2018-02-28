import java.util.Scanner;
public class MethodChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Put in a word");
Scanner words = new Scanner(System.in);
String word = words.nextLine();
System.out.println(Sentence(word));



	}
public static String Sentence(String words) {
	char second = words.charAt(words.length()-2);
	char letter = words.charAt(0);
	return letter + " " + second;
}
}
