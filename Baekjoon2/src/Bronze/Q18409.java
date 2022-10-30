package Bronze;

import java.util.Scanner;

public class Q18409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		char[] arr=sc.next().toCharArray();
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='o' || arr[i]=='i' || arr[i]=='u') cnt++;
		}
		System.out.println(cnt);
	}
}