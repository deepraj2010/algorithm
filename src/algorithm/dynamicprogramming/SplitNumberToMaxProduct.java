package algorithm.dynamicprogramming;

public class SplitNumberToMaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static int[] splitNumber(int num) {
		int[] maxProd = new int[num+1];
		for(int i = 2; i < maxProd.length; i++) {
			maxProd[i] = Integer.MIN_VALUE;
		}
		maxProd[0] = 0;
		maxProd[1] = 0;
		maxProd[2] = 1;
	}

}
