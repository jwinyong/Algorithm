package chap01;
import java.util.Scanner;

public class quiz1 {
	// �ִ� ���ϱ�
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		// System.out.println("max4(33, 55, 66, 77) = " + max4(33, 55, 66, 77));
	
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;

		System.out.println("�� ������ �ִ��� ���մϴ�.");
		
		System.out.print("a�� ����");
		a = stdIn.nextInt();
		
		System.out.print("b�� ����");
		b = stdIn.nextInt();
		
		System.out.print("c�� ����");
		c = stdIn.nextInt();
		
		System.out.print("d�� ����");
		d = stdIn.nextInt();

		int max = max4(a, b, c, d); 	// a, b, c, d�� �ִ�

		System.out.println("�ִ��� " + max + "�Դϴ�.");
	}

}
