//Program to find the number of unique characters in a given String
import java.util.Scanner;
class NumberOfUniqueCharactersinString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println("The Number of Unique Character in a given String is : ");
		int i = 0, count = 0;
		while (i<s.length())
		{
				char c = s.charAt(i);
				if(s.indexOf(c) == s.lastIndexOf(c))
				{
					count++;
				}
				i++;
		}
		System.out.println(count);
	}
}
