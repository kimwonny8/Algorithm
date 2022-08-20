
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		int [] arr= new int[100];
		
		for(int i=0; i<100; i++) {
			Random rd = new Random();
			arr[i]=rd.nextInt(101);
		}
		sortArray(arr);
		printArray(arr);
	}
	public static void sortArray(int []arr) {
		int tmp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) {			
			if(arr[j]>arr[j+1]) {
				tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
			}
			}
		}
	}
	
	public static void printArray(int []arr) {
		for(int i=0; i<100; i++) {
			if(i%10==0) System.out.println();
			System.out.print(arr[i]+" ");
		}
	}
}