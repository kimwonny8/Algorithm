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
		// �׷� �Է� �ޱ�
		while(N-->0) {
			String group=sc.next();
			int num=sc.nextInt();
			
			while(num-->0) {
				String name=sc.next();
				map.put(name, group);
			}
		}
		// ���� �κ�
		while(M-->0) {
			StringBuilder sb=new StringBuilder();
			String str=sc.next();
			int num2=sc.nextInt();
			
			// 1�̸� �׷� �̸� ���, 0�̸� �Ҽӵ� ��� �����ؼ� ���
			if(num2==1) System.out.println(map.get(str));
			
 			else {
 				for(Map.Entry<String, String> i : map.entrySet()) { // value������ Ű�� ��������
 					if(i.getValue().equals(str)) sb.append(i.getKey()+"\n");
 				}
 				System.out.print(sb);
			}
			
		}
	}
}