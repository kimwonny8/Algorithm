package Gold;

import java.util.Scanner;

public class DNF_Q1068 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),cnt=0;
		int [] arr=new int[n];
		int [] arr2=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		arr[sc.nextInt()]=-2; //받은 수는 -2로 지운다!
		for(int i=n-1; i>=0; i--) {
			int tmp = i;
			while(true) {
				arr2[tmp]=1;
				if(arr[tmp]<0) {
					break;
				}
				tmp=arr[tmp];
			}
		}
		System.out.println(cnt);
	}
}
