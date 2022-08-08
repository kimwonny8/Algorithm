package Silver;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Q16165 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		
		TreeMap<String, String> map=new TreeMap<>();
		// 그룹 입력 받기
		while(N-->0) {
			String group=sc.next();
			int num=sc.nextInt();
			
			while(num-->0) {
				String name=sc.next();
				map.put(name, group);
			}
		}
		// 문제 부분
		while(M-->0) {
			StringBuilder sb=new StringBuilder();
			String str=sc.next();
			int num2=sc.nextInt();
			
			// 1이면 그룹 이름 출력, 0이면 소속된 사람 정렬해서 출력
			if(num2==1) System.out.println(map.get(str));
			
 			else {
 				for(Map.Entry<String, String> i : map.entrySet()) { // value값으로 키값 가져오기
 					if(i.getValue().equals(str)) sb.append(i.getKey()+"\n");
 				}
 				System.out.print(sb);
			}
			
		}
	}
}