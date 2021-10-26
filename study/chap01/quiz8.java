package chap01;

public class quiz8 {
	
	static int sumof(int a, int b) {
		
		// 어떤 수가 더 큰지 파악
		int max;
		int min;
		
		
		if(a > b) 
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}

		// 합구하기
		int sum= 0;
		for(int i = min; i <= max; i++) 
		{
			sum += i;	
		}	
		return sum;
	
		
	}

	public static void main(String[] args) {
		System.out.println(sumof(3, 5));
		System.out.println(sumof(5, 3));

	}

}
