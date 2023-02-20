/*Find given String is Pallindrome or not*/
class StringPallindrome 
{
	public static void main(String[] args) 
	{
		String s = "tenet";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--){
			char ch = s.charAt(i);
			rev = rev+ch;
		}
		if(rev.equals(s)){
			System.out.println(s+" is a Pallindrome");
		}
		else{
			System.out.println(s+" is not a pallindrome");
		}
	}
}
