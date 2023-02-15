/*
Program to find the average number in a given array and the Numbers Greater than an average Number.*/
class ArrayAverage 
{
	public static void main(String[] args) 
	{
		int []arr = {10,20,30,40,50};
		int sum=0;

		System.out.println("The length of an array : "+arr.length);
		//calculate sum of an array
		for(int i=0;i<arr.length; i++){
			sum+=arr[i];
		}

		//calculate the average of an array
		int average = sum/arr.length;

		System.out.println("Average of an given array : "+average);

		//find the numbers greater than an average
		System.out.println("Numbers greater than average : ");
		for(int i=0; i<arr.length; i++){
			if(arr[i] > average){
				System.out.println(arr[i]);
			}
		}

		/**find the largest number in a given array
		int largest = arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		System.out.println("Largest number in a given array : "+largest);
		**/
		
		

	}
}
