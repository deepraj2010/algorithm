package algorithm.miscellenious;

public class NegativeNumberToLeft {

	public static void main(String[] args) {
		int[] a = {1,-2,4, -3, -5, 7,1,9};
		shiftToLeft(a);
		for(int i: a) {
			System.out.println(i);
		}
	}
	
	private static void shiftToLeft(int[] array) {
		int j = array.length -1;
		for(int i = 0; i < array.length; i++) {
			if(array[j] < 0 && array[i] > 0 && i <= j) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				j--;
			}
			
		}
	}

}
