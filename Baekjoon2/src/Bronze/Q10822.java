package Bronze;

import java.util.Scanner;

public class Q10822 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str=sc.next();
		String[] arr = str.split(",");
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			int cnt=Integer.parseInt(arr[i]);
			sum+=cnt;
		}
		System.out.println(sum);
	}

}