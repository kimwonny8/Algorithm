package Silver;

import java.util.HashMap;
import java.util.Scanner;

public class Q2002 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		HashMap<String, Integer> map=new HashMap<>(); 
		int [] arr=new int[N];
		int cnt=0;
		
		// 들어오는 차 순서 저장
		for(int i=0; i<N; i++) map.put(sc.next(), i);
		// 나가는 차 순서 저장
		for(int i=0; i<N; i++) arr[i]=map.get(sc.next());
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i]>arr[j]) { 
					cnt++;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
