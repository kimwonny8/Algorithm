import java.util.Comparator;

public class Compare2 {
	public static void main(String[] args) {

		Students a = new Students(17, 2); // 17살 2반
		Students b = new Students(18, 1); // 18살 1반
		Students c = new Students(15, 3); // 15살 3반

		// a객체와는 상관 없이 b와 c객체를 비교한다.
		int isBig = a.compare(b, c);

		if (isBig > 0)
			System.out.println("b객체가 c객체보다 큽니다.");
		else if (isBig == 0)
			System.out.println("두 객체의 크기가 같습니다.");
		else
			System.out.println("b객체가 c객체보다 작습니다.");
	}
}

// Comparator -> compare 구현
//독립적으로 매개변수로 넘겨진 두 객체를 비교
class Students implements Comparator<Students> {

	int age; // 나이
	int classNumber; // 학급

	Students(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compare(Students o1, Students o2) {
		return o1.classNumber - o2.classNumber;
	}
}