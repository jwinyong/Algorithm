package chap01;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner stdIN = new Scanner(System.in);

		System.out.println("�� ������ �ִ��� ����");

		System.out.print("a�� �� : ");
		int a = stdIN.nextInt(); // Ű����� �Է��� �� �� ������ ��!
		
		System.out.print("b�� �� : ");
		int b = stdIN.nextInt();
		
		System.out.print("c�� �� : ");
		int c = stdIN.nextInt();
		
		// a, b, c�� �ִ��� ���Ͽ� max�� ����
		int max = a;
		
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		
		System.out.println("�ִ��� " + max);
	}

}
