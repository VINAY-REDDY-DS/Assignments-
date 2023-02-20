class CountVowelsConsonants 
{
	public static void main(String[] args) 
	{
		String s = "vinay";
		
		int vow = 0;
		int con = 0;

		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vow++;
			}
			else if(ch >= 'a' && ch <= 'z'){
				con++;
			}
		}
		System.out.println("The count of vowels : " +vow);
		System.out.println("The count of consonanta : "+con);
	}
}
