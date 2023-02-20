/*
Write a java program to sort an Array.*/
public class ArraySorting 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,-1,-2,-3};
		//Array Elements before soting
		System.out.println("Elements present in an Array is : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}

		//Sorting the Array
		for(int i=0; i<arr.length; i++){
			for(int j=i; j<arr.length; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//Printing the sorted Elements
		System.out.println("\nSorted Elements of an Array : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
