/*
Write a java Program to find the sum of even and odd numbers in an array.Display the sum value.*/
class SumOfEvenOdd 
{
	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4,5,6};
		int evenSum = 0, oddSum = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				evenSum += arr[i];
			}
			else{
				oddSum += arr[i];
			}
		}
		System.out.println("Sum of Even Numbers are : "+evenSum);
		System.out.println("Sum of Odd Numbers are : "+oddSum);
	}
}
