/*Insert a value at a specified index using array*/
class InsertValueAtSpecifiedIndex 
{
	public static void main(String[] args) 
	{
		int arr[] = new int [6];
		arr[0] = 1;arr[1] = 2;arr[2] = 3;arr[3] = 4;arr[4] = 5;arr[5] = 6;
		//Actual Array
		System.out.print("Actual array : [ ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		//Value insertion at specified index
		arr[1] = 10;arr[3] = 30;arr[5] = 50;

		//Resulted Array
		System.out.print("Resulted array : [ ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
}
