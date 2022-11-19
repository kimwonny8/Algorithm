package Bronze;

import java.util.Scanner;

public class Q13458 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		long cnt=0;
		int total=sc.nextInt();
		int sub=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			arr[i]-=total;
			cnt++;
			
			if(arr[i]<=0) continue;
			// 부감독 필요한 경우
			else {
				cnt+=arr[i]/sub;
				
				// 나머지가 0보다 크면 부감독 추가
				if(arr[i]%sub > 0) cnt++;
			}
		}
		System.out.println(cnt);
	}
}