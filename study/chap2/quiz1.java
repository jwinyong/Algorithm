package chap2;
import java.util.*;

// ������� �������� �����ϱ�
public class quiz1 {

	static int arr(int[] a) {
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		
		int num = 1 + rand.nextInt(20);
		System.out.println("Ű �ִ��� ���մϴ�.");
		
		System.out.println("������� :" + num);
		
		int height[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("heigt[" + i + "] : " + height[i]);
			
		}
		System.out.println("�ִ��� " + arr(height) + " �Դϴ�.");
	}

}
