package chap2;
import java.util.Scanner;

// �迭 ��� �� ���
public class quiz3 {

	static int sumOf(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt(); // ��ڼ� �Է°�
		
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		
		System.out.println("��� �հ�� = " + sumOf(a));
		
	}

}
