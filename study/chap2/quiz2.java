package chap2;
import java.util.Scanner;

// ���İ����� ��Ÿ����!
public class quiz2 {

	// ����
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	
	// ���
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
	}
	
	// �������� ����
	static void reverse(int[] a) {
		print(a);
		for (int i = 0; i < a.length / 2; i++) {			
			System.out.println("a[" + i + "] �� a[" + (a.length - i - 1) + "] �� ��ȯ�մϴ�.");
			swap(a, i, a.length - i - 1);
			print(a);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt(); // ��ڼ� �Է°�
		
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x); // �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		
	}

}
