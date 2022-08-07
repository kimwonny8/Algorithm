package Bronze;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q25305 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), k=sc.nextInt();
		Integer [] score=new Integer[N];
		
		for(int i=0; i<N; i++) score[i]=sc.nextInt();
		Arrays.sort(score, Collections.reverseOrder());
		
		System.out.println(score[k-1]);
	}
}