
public class Compare {
	public static void main(String[] args) {
		Student a = new Student(17, 2); // 17살 2반
		Student b = new Student(18, 1); // 18살 1반

		int isBig = a.compareTo(b); // a자기자신과 b객체를 비교한다.

		if (isBig > 0)
			System.out.println("a객체가 b객체보다 큽니다.");
		else if (isBig == 0)
			System.out.println("두 객체의 크기가 같습니다.");
		else
			System.out.println("a객체가 b객체보다 작습니다.");

	}
}

// Comparable -> compareTo 구현
// 자기 자신과 매개변수 비교
class Student implements Comparable<Student> {

	int age; // 나이
	int classNumber; // 학급

	Student(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
		// this는 a객체 자신을 의미하고, o는 b객체를 의미
	}
}
