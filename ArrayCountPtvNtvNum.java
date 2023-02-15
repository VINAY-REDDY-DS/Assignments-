/*
Write a java program to count the positive , negative and zero numbers in a given array.*/
class ArrayCountPtvNtvNum 
{
	public static void main(String[] args) {
		int arr[]= {1,3,-8,0,-15,6,14,0};
		int ptvCount=0, ntvCount=0, zeroCount=0;

		for(int i=0; i<arr.length; i++){
			if(arr[i] > 0){
				ptvCount += 1;
			}
			else if(arr[i] < 0){
				ntvCount += 1;
			}
			else if(arr[i] == 0){
				zeroCount += 1;
			}
		}
		System.out.println("Positive Count in a given Array : "+ptvCount);
		System.out.println("Negative Count in a given Array : "+ntvCount);
		System.out.println("Zero Count in a given Array : "+zeroCount);
	}
}
