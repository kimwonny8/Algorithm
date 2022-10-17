package Gold;

import java.util.Arrays;
import java.util.Scanner;

public class Q1253 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		Arrays.sort(arr);

		int cnt=0;
		for(int i=0; i<n; i++) {
			int left=0, right=n-1;
			while(left < right) {
				if(arr[left]+arr[right] == arr[i]) {
					if(left != i && right != i) { // 자기자신은 포함 X
						cnt++;
						break;
					} 
					else if(left == i) left++;
					else if(right == i) right--;
				} 
				else if(arr[left] + arr[right] > arr[i]) right--;
				else left++;
			}
		}

		System.out.println(cnt);
	}
}