package chap2;
import java.util.Scanner;
import java.util.Random; // ���� ����

// �迭 ��Ҹ� ������ �����Ͽ� �ִ� ��Ÿ����
public class maxOfArrayRand {
	
	static int maxOfArrayRand(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Random rand = new Random(); // ���� ����
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� �� : ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90); // ��Ұ��� ������ ����
			System.out.println("height[" + i + "] : " + height[i]);
		}
		System.out.println("�ִ��� " + maxOfArrayRand(height) + " �Դϴ�.");
	}

}
