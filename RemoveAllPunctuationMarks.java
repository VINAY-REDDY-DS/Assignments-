//Program to Remove All punctuation Marks in a given String
import java.util.Scanner;
class RemoveAllPunctuationMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String befStr = sc.nextLine();
		String aftStr = befStr.replaceAll("\\p{Punct}","");
		System.out.println("After Removing Punctuation ");
		System.out.println(aftStr);
	}
}
