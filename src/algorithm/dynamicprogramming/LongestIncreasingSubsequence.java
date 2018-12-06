package algorithm.dynamicprogramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] array = {11,23,10,37,121};
		System.out.print(longestIncreasingSubsequence(array));
	}
	
	private static int longestIncreasingSubsequence(int[] array) {
		
		int size = array.length;
		
		int maxLength = 0;
		int[] lis = new int[size];
		
		for(int i = 1 ; i < array.length; i++) {
			lis[i] = 1;
		}
		
		for(int i = 0 ; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(array[i] > array[j] && lis[i] < lis[j]+1) {
					lis[i] = lis[j] + 1;
				}
			}
		}
		
		for(int i = 0 ; i < array.length; i++) {
			if(maxLength < lis[i]) {
				maxLength = lis[i];
			}
		}
		return maxLength;
		
	}

}
