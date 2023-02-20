/*
Write a java program to print the reverse of a given array*/
class ArrayReverse 
{
	public static void main(String[] args) 
	{
		 int[] arr = {10, 5, 20, 15, 25};

		 //Array Elements before reversing
		System.out.println("Elements present in an Array is : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
    
		// Reversing the array
		for (int i = 0, j = arr.length -1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
    
		// Printing the reversed array
		System.out.println("\nReversed Array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
