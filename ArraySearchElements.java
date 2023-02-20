/*
Write a java program to search the numbers in a given array is present or not.If present print the index of a number.*/
class ArraySearchElements 
{
	public static void main(String[] args) 
	{
		int []arr = {10,50,3,6,150,88,111};
		int num=111, index=0;
		for(int i=0; i<arr.length; i++){
			if(num==arr[i]){
				index = arr[i];
				System.out.println("Search number : " +num +"\nIndex position of a given search number in an array is : "+i);
			}
		}
		if(num!=index){
			System.out.println("Search number : "+num+"\nNumber not found");
		}
	}
}
