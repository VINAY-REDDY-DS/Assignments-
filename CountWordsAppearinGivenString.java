//Program to find the number of times a word appears in a String
import java.util.Scanner;
class CountWordsAppearinGivenString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();

		String [] words = s.split(" ");
		
		// Count the number of times the word Appears
		System.out.println("The Words that Appear Number of times in a Given Array are : ");
       
        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i+1 ; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    // mark the repeated word as duplicate.
                    words[j] = "";
                }
            }
            if (!words[i].equals("")) {
                System.out.println(words[i] + " : " + count);
            }
        }
	}
}
