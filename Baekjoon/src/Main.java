import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();

		int T=sc.nextInt();
		while(T-->0) {
			HashSet<Integer> set=new HashSet<>();
			// 테스트케이스마다 세트 초기화 해줘야 함!!!
			
			int N=sc.nextInt();
			for(int i=0; i<N; i++) {
				int tmp=sc.nextInt();
				set.add(tmp);
			}
			int M=sc.nextInt();
			for(int i=0; i<M; i++) {
				int tmp=sc.nextInt();
				if(set.contains(tmp)) sb.append("1\n");
				else sb.append("0\n");
			}
		}
		System.out.println(sb);
	}
}