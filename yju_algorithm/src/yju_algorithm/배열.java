package yju_algorithm;

import java.util.Arrays;
import java.util.Random;

public class 배열 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		
		int n=7;
		int []arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=rand.nextInt(100); // 0~99
		}
		System.out.print(Arrays.toString(arr));
		System.out.println("\n가장 큰 수: "+maxOf(arr));
		System.out.println("\n요소 순서를 역순으로 출력");
		reverse(arr);
		System.out.println("합계: "+sumOf(arr)+"\n");
		
		int []arr2=new int[arr.length];
		copy(arr, arr2);
		
		System.out.println("\n배열 모든 요소를 역순으로 출력");
		rcopy(arr, arr2);
	}
	
	public static int maxOf(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) max=arr[i];
		}
			return max;
	}
	
	public static void reverse(int[] arr) {
		for(int i=0; i<arr.length/2; i++) {
			int j=arr.length-i-1; // 바꿔야 할 요소
			System.out.println(Arrays.toString(arr));
			swap(arr, i, j);
		}
		System.out.println("정렬 완료: "+Arrays.toString(arr)+"\n");
	}
	
	public static void swap(int []arr, int i, int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

	public static int sumOf(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	public static void copy(int []arr, int []arr2) {
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("arr2: "+Arrays.toString(arr2));
	}
	
	public static void rcopy(int []arr, int []arr2) {
		copy(arr, arr2);
		reverse(arr2);
		System.out.println("arr2: "+Arrays.toString(arr2));
	}

}
