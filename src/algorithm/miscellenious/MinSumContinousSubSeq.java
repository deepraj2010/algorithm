package algorithm.miscellenious;

import java.util.Scanner;

public class MinSumContinousSubSeq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Integer requestCount = input.nextInt();
		int[][] arr = new int[requestCount][];
		for(int i = 0 ; i < requestCount; i++) {
			int array[] = new int[input.nextInt()];
			
			String inputStr = input2.nextLine();
			String[] strArry = inputStr.split(" ");
			int j = 0;
			for(String str : strArry) {
				if(str.length() > 0 && j < array.length) {
					array[j++] = Integer.parseInt(str);
				}
			}
			arr[i] = array;
		}
		for(int[] array : arr) {
			System.out.println(minSum(array));
		}
		input2.close();
		input.close();
//		int array[] = {1, 1, -2, -1, 2, 4, 2, 1, 0, -7};
//		System.out.print(minSum(array));

	}
	
	public static int minSum(int[] array) {
		int minValueSoFar = Integer.MAX_VALUE;
		int minSoFar = Integer.MAX_VALUE;
		int sum = 0;
		for(int i = 0 ; i < array.length; i++) {
			if(minValueSoFar < array[i]) {
				minValueSoFar = array[i];
			}
			sum = sum+array[i];
			if(sum < minSoFar) {
				minSoFar = sum;
			}
			if(sum > 0) {
				sum = 0;
			}
		}
		if(sum < minValueSoFar) {
			return sum;
		}
		return minValueSoFar;
	}

}
