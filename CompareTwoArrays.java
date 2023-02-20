/*Compare two arrays and print the same values present in it using for loop*/
class CompareTwoArrays 
{
	public static void main(String[] args) 
	{
		int arr1[] = {2,5,7,1,6,9};
		int arr2[] = {3,7,9,5,2};
		System.out.print("The Elements which are present in both arrays : [ ");
		for(int i=0; i<arr1.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr1[i] == arr2[j]){
					System.out.print(arr2[j]+" ");
				}
			}
		}
		System.out.println("]");
	}
}
