package Bronze;

import java.util.Scanner;

public class Q12790 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[8];
		int hp=0, mp=0, a=0, d=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[j]=sc.nextInt();
			}
			hp=(arr[0]+arr[4]);
			mp=(arr[1]+arr[5]);
			a=(arr[2]+arr[6]);
			d=2*(arr[3]+arr[7]);
			
			if((hp*=1)<1) hp=1;
			if((mp*=5)<1) mp=5;
			if((a*=2)<0) a=0;
			System.out.println(hp+mp+a+d);
		}

	}
}
