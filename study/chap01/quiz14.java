package chap01;
import java.util.Scanner;
// 4������ �����ﰢ�� ������� ��Ÿ��

public class quiz14 {
	// ���� �Ʒ��� ������ �̵�ﰢ���� ���
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= i; j++) 			// i���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 					// ����(�ٺ�ȯ)
		}
	}

	// ���� ���� ������ �̵�ﰢ���� ���
	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 					// ����(�ٺ�ȯ)
		}
	}

	// ������ ���� ������ �̵�ﰢ���� ���
	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println();					// ����(�ٺ�ȯ)
		}
	}

	// ������ �Ʒ��� ������ �̵�ﰢ���� ���
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) { 				// i�� (i = 1, 2, �� ,ln)
			for (int j = 1; j <= n - i; j++) 		// n-i���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= i; j++) 			// i���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 					// ����(�ٺ�ȯ)
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("�ﰢ�� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��� ��");
			n = stdIn.nextInt();
		} while (n <= 0);

		System.out.println("���� �Ʒ��� ������ �ﰢ��");
		triangleLB(n); // ���� �Ʒ��� ������ �̵�ﰢ��

		System.out.println("���� ���� ������ �ﰢ��");
		triangleLU(n); // ���� ���� ������ �̵�ﰢ��

		System.out.println("������ ���� ������ �ﰢ��");
		triangleRU(n); // ������ ���� ������ �̵�ﰢ��

		System.out.println("������ �Ʒ��� ������ �ﰢ��");
		triangleRB(n); // ������ �Ʒ��� ������ �̵�ﰢ��
	}
}