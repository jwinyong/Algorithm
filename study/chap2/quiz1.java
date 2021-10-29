package chap2;
import java.util.*;

// 사람수도 랜덤으로 생성하기
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
		System.out.println("키 최댓값을 구합니다.");
		
		System.out.println("사람수는 :" + num);
		
		int height[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("heigt[" + i + "] : " + height[i]);
			
		}
		System.out.println("최댓값은 " + arr(height) + " 입니다.");
	}

}
