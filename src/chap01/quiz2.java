package chap01;
import java.util.Scanner;

public class quiz2 {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// System.out.println("min(11, 22, 33) = " + min3(11, 22, 33));
	
		Scanner stdIN = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("�� ������ �ּڰ��� ���մϴ�.");
		
		System.out.print("a �� : ");
		a = stdIN.nextInt();
		
		System.out.print("b �� : ");
		b = stdIN.nextInt();
		
		System.out.print("c �� : ");
		c = stdIN.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("�ּڰ��� : " + min + " �Դϴ�.");
		
	}

}
