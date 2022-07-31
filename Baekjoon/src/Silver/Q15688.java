package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q15688 {
	public static void main(String[] args) throws Exception {
		// 메모리 초과때문에 버퍼리더 사용
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		for(int i=0; i<n; i++) sb.append(arr[i]).append("\n");
		System.out.println(sb);
	}
}