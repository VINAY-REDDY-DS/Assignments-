/*
Write a program to print the repeating elements in a given array*/
class ArrayRepeatingElements 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 5, 20, 15, 25, 20, 10, 5};

		//Array Elements before task
		System.out.println("Elements present in an Array is : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
    
			// Finding the first repeating element
			for (int i = 0; i < arr.length; i++) {
			  for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
				  System.out.println("\nFirst repeating element: " + arr[i]);
				  System.out.println("Index of first repeating element: " + i);
				}
			  }
			}
	}
}
