class CompareEqualAndEqualsMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "vinay";
		String s2 = "vinay";
		String s3 = new String("vinay");
		String s4 = new String("vinay");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
	}
}
