package algorithm.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = {3,6,5,4,2,3,6,9,6,4,2,13,45,7,9,56};
		sort(a, 0 , a.length-1);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
	
	private static void sort( int[] array, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			
			sort(array, start, mid);
			sort(array, mid+1, end);
			merge(array, start, mid, end);
		}
	}
	
	private static void merge(int[] array, int start, int mid, int end) {
		 int lArrayLength = mid - start + 1;
		 int rArrayLength = end - mid;
		 
		 int[] lArray = new int[lArrayLength];
		 int[] rArray = new int[rArrayLength];
		 
		 for(int i = 0; i < lArrayLength; i++) {
			 lArray[i] = array[start + i];
		 }
		 
		 for(int j = 0; j < rArrayLength; ++j) {
			 rArray[j] = array[mid +1 + j];
		 }
		 
		 int i = 0, j = 0, k = start;
		 while(i < lArrayLength && j < rArrayLength) {
			 if(lArray[i] <= rArray[j]) {
				 array[k] = lArray[i];
				 i++;
			 } else {
				 array[k] = lArray[j];
				 j++;
			 }
			 k++;
		 }
		 
		 while(i < lArrayLength) {
			 array[k] = lArray[i];
			 i++;
			 k++;
		 }
		 
		 while(j < rArrayLength) {
			 array[k] = lArray[j];
			 j++;
			 k++;
		 }
	}

}
