package chap01;

public class quiz4 {
	
	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else
			return b;
				
	}

	public static void main(String[] args) {
		System.out.println("med3(1, 2, 3) = " + med3(1, 2, 3)); // [1]
		System.out.println("med3(4, 6, 5) = " + med3(4, 6, 5)); // [2]
		System.out.println("med3(8, 7, 9) = " + med3(7, 8, 9)); // [3]
		System.out.println("med3(1, 2, 2) = " + med3(1, 2, 2)); // [4]
		System.out.println("med3(2, 2, 2) = " + med3(2, 2, 2)); // [5]
		System.out.println("med3(12, 34, 56) = " + med3(12, 34, 56)); // [6]
		System.out.println("med3(99, 88, 66) = " + med3(99, 88, 66)); // [7]
		System.out.println("med3(124, 452, 231) = " + med3(124, 452, 231)); // [8]
		System.out.println("med3(77, 66, 55) = " + med3(77, 66, 55)); // [9]
		System.out.println("med3(10, 12, 11) = " + med3(10, 12, 11)); // [10]
		System.out.println("med3(33, 22, 11) = " + med3(33, 22, 11)); // [11]
		System.out.println("med3(1, 52, 44) = " + med3(1, 52, 44)); // [12]
		System.out.println("med3(0, 0, 1) = " + med3(0, 0, 1)); // [13]
		
	}

}
