package chap01;
import java.util.*;

// �Է��� ���� �� ������ �ϴ� ���簢���� * ��ȣ�� ���
public class quiz13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("���簢�� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��£�");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}
		/*
		System.out.println("�簢���� ����մϴ�.");

		System.out.print("�ܼ� : ");
		int dan = stdIn.nextInt();
		
		for(int i = 1; i <= dan; i++) {
			for(int j = 1; j <= dan; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}

}
