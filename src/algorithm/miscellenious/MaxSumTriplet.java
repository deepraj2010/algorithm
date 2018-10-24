package algorithm.miscellenious;

public class MaxSumTriplet {

	public static void main(String[] args) {
		 int arr[] = { 60, 30, 3, 50, 6, 200 };
		 int array[] = maxSumTriplet(arr);
		 for(int i : array) {
			 System.out.print(i);
			 System.out.println();
		 }
	}
	
	private static int[] maxSumTriplet(int[] array) {
		if(array.length < 3) {
			return new int[0];
		}
		int max1 = Math.max(array[0], Math.max(array[1], array[2]));
		int max3 = Math.min(array[0], Math.min(array[1], array[2]));
		int max2 = array[0] + array[1] + array[2] - max1 - max3;
		
		for(int i = 3; i < array.length; i++) {
			if(array[i] > max1) {
				if(max3 < max2) {
					max3 = max2;
				}
				max2 = max1;
				max1 = array[i];
			} else if(array[i] < max1 && array[i] > max2) {
				max3 = max2;
				max2 = array[i];
			} else if(array[i] > max3) {
				max3 = array[i];
			}
		}
		int returnArray[] = {max1, max2, max3};
		return returnArray;
	}

}
