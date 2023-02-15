/*
Write a java program to find the minimum amd maximum of a given array.*/
class ArrayMinMax 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,60};
		int minNumber = arr[0], maxNumber = arr[0];

		for(int i=0; i<arr.length; i++){
			if(arr[i]<minNumber){
				minNumber = arr[i];
			}
			else{
				maxNumber = arr[i];
			}
		}
		System.out.println("Minimum Number in a given Array : "+minNumber);
		System.out.println("Maximum Number in a given Array : "+maxNumber);
	}
}
