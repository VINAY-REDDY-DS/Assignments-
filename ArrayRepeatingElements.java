/*
Write a program to print the repeating elements in a given array*/
class ArrayRepeatingElements 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 12, 20, 15, 25, 20, 1, 5};

		//Array Elements before task
		System.out.println("Elements present in an Array is : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
    
		// Finding the first repeating element
		System.out.println("\nFirst Repeating Element in a given Integer Array with its Index are : ");
		End:
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
				  System.out.println("Element: " + arr[i]+" Index "+i);
				  break End;
				}
			 }
		}
	}
}
