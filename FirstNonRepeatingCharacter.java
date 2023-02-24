//Program to find the First non-repeating character in a given String
import java.util.Scanner;
class FirstNonRepeatingCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("The First Non-Repeating Character in a given String is : ");
		for (int i=0; i<s.length() ;i++ )
		{
			char c = s.charAt(i);
			if(s.indexOf(c) == i && s.lastIndexOf(c) == i)
			{
				System.out.println(c);
				break;
			}
		}
	}
}
