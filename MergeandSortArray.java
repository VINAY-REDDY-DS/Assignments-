/*Program to merge two arrays and sort them*/
class MergeandSortArray  
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3};
		int arr2[] = {-1,-2,-3};
		int arr3[] = new int [arr1.length + arr2.length];
		
		int j=0;
		//merging
		for(int i=0; i<arr1.length; i++){
				arr3[j] = arr1[i];
				j++;
		}
		for(int i=0; i<arr2.length; i++){
				arr3[j] = arr2[i];
				j++;
		}
		System.out.print("Result of two Merged Array : [");
		for(int i=0; i<arr3.length; i++){
				System.out.print(arr3[i]+",");
		}
		System.out.println("]");
		//sorting
		for(int i=0; i<arr3.length; i++){
			for(int k=i+1 ; k<arr3.length; k++){
				if(arr3[i]>arr3[k]){
					int temp = arr3[i];
					arr3[i] = arr3[k];
					arr3[k] = temp;
				}
			}
		}
			System.out.print("Result of Sorted Array : [");
			for(int l=0; l<arr3.length; l++){
				System.out.print(arr3[l]+",");
			}
			System.out.println("]");

	}
}
