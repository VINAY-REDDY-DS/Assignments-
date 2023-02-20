/*
Write a Java Program to find the sum of prime Numbers for a given range.*/
class AddPrime 
{
	public static void main(String[] args) {

		int first=15, last = 30, sum=0;
		
		System.out.println(" Prime Number are\n");
		for(int i=first; i<=last; i++){

			int count = 0;
			for(int j=1; j<=i; j++){
				if(i%j==0){
					count++;	
				}
			}
			if(count==2){
					System.out.print(i+"  ");
					sum=sum+i;
				}	
		}
		System.out.println("\n\n Total sum of Prime Numbers Between 15 to 30 = "+sum);		
	}
}
