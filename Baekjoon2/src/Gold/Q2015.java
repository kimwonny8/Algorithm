package Gold;

import java.util.HashMap;
import java.util.Scanner;

public class Q2015 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		int n=sc.nextInt(), k=sc.nextInt();
		int [] arr=new int[n+1];
		int [] sum=new int[n+1];
		for(int i=1; i<n+1; i++) {
			arr[i]=sc.nextInt();
			sum[i]=sum[i-1]+arr[i];
		}
		
		HashMap<Integer, Integer> map=new HashMap<>();
		map.put(0, 1);
		long cnt=0;
		for(int i=1; i<n+1; i++) {
			// key값에 해당하는 값이 있다면 해당 값을 반환하며, 없다면 0을 반환
			cnt+=map.getOrDefault(sum[i]-k, 0);
			map.put(sum[i], map.getOrDefault(sum[i], 0)+1);
		}
		System.out.println(cnt);
	}
}
