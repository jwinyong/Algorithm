package chap2;
import java.util.Scanner;

// �迭 ����� �ִ��� ��Ÿ��
public class maxOfArray {

	static int maxOf(int[] a) {
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt(); // �迭�� ��Ҹ� �Է� �ް�
		
		int[] height = new int[num]; // �迭 ����

		for (int i = 0; i < num; i++) {
			System.out.print("height [" + i + "] :");
			height[i] = stdIn.nextInt();
		}
		System.out.println("�ִ��� " + maxOf(height) + " �Դϴ�.");
		
	}

}
