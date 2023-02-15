/*
Write a program to copy elements of one array to another array*/ 
class CopyArrayElements 
{
	public static void main(String[] args) 
	{	
		int actArr [] = {1,2,3,4,5};
		
		System.out.print("Actual Array is : [");
		for(int i=0; i<actArr.length; i++){
		System.out.print(actArr[i]+" ");
		}
		System.out.println("]");

		int copArr[] = new int[actArr.length];

		int i=0;
		while(i<actArr.length){
			copArr[i] = actArr[i];
			i++;
		}

		System.out.print("Copied Array is : [");
		for(int j=0; j<copArr.length; j++){
		System.out.print(copArr[j]+" ");
		}
		System.out.println("]");
	}
}
