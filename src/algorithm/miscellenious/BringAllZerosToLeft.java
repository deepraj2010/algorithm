package algorithm.miscellenious;

public class BringAllZerosToLeft {

	public static void main(String[] args) {
		int[] array = {0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,1,1,1,1,1,0,0,1,0,0,1,0,1,0,1,0};
		//int[] array = {1,1,1,1,1,1};
		//int[] array = {0,0,0,0,0,0,0,0,0};
		int zeroCount = 0;
		int oneCount = 0;
		for(int i : array) {
			if(i == 0) {
				zeroCount++;
			} else {
				oneCount++;
			}
		}
		System.out.println(zeroCount + " " + oneCount);
		bringZeroToLeft(array);
		for(int i : array) {
			System.out.print(i + " ");
			
		}
	}
	
	private static void bringZeroToLeft(int[] array) {
		int j = -1;
		for(int i = 0; i < array.length; i++)
			if(array[i] == 0 )
				exchange(array, ++j, i);
	}
	
	private static void exchange(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
