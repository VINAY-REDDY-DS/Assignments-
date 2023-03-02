package Programmimg;

public class FirstRepeatingElementinIntegerArray {

	public static void main(String[] args) {
		int arr[] = {1,0,3,9,5,4,6,3,2,10};
		task(arr);
	}
	
	public static void task(int [] a) {
		System.out.println("\nThe First Repeating Element is : ");
		outer :
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]+" -at index- ["+i+"]");
					break outer;
				}
			}
		}
	}
}
