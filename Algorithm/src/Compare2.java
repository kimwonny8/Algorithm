import java.util.Comparator;

public class Compare2 {
	public static void main(String[] args) {

		Students a = new Students(17, 2); // 17�� 2��
		Students b = new Students(18, 1); // 18�� 1��
		Students c = new Students(15, 3); // 15�� 3��

		// a��ü�ʹ� ��� ���� b�� c��ü�� ���Ѵ�.
		int isBig = a.compare(b, c);

		if (isBig > 0)
			System.out.println("b��ü�� c��ü���� Ů�ϴ�.");
		else if (isBig == 0)
			System.out.println("�� ��ü�� ũ�Ⱑ �����ϴ�.");
		else
			System.out.println("b��ü�� c��ü���� �۽��ϴ�.");
	}
}

// Comparator -> compare ����
//���������� �Ű������� �Ѱ��� �� ��ü�� ��
class Students implements Comparator<Students> {

	int age; // ����
	int classNumber; // �б�

	Students(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compare(Students o1, Students o2) {
		return o1.classNumber - o2.classNumber;
	}
}