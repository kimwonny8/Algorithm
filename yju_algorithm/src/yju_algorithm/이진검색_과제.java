package yju_algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhyscData {
	String name;
	int height;
	double vision;

	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	public String toString() {
		return name + " " + height + " " + vision;
	}
}

class nameComparator implements Comparator<PhyscData> {
	public int compare(PhyscData d1, PhyscData d2) {
		return (d1.name.compareTo(d2.name));
	} // compareTo 같으면 0 반환

}

public class 이진검색_과제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = { // 이름 오름차순으로 정렬
				new PhyscData("고건호", 162, 0.3), new PhyscData("김정원", 168, 0.4), new PhyscData("김선미", 160, 0.8),
				new PhyscData("박순범", 171, 1.5), new PhyscData("유원규", 173, 0.7), new PhyscData("진솔미", 158, 1.2),
				new PhyscData("하영수", 175, 2.0), 
				};

		System.out.print("이름이 어떤 사람을 찾고 있나요? ");
		nameComparator n = new nameComparator();
		String key = sc.next();

		int idx = Arrays.binarySearch(x, new PhyscData(key, 0, 0.0), n);
		System.out.println((idx<0)? "값이 없습니다." : key+": x["+idx+"]에 있습니다.");
	}
}
