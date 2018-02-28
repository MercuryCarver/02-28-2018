import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Put in a sentence.");
Scanner string = new Scanner(System.in);
String sentence = string.nextLine();
System.out.println("your sentence is " + sentence.length());
int length = sentence.length()-1;
System.out.println(sentence.charAt(length));
	}

}
