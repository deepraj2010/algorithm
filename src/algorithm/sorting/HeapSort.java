package algorithm.sorting;

public class HeapSort {

	public static void main(String[] args) {
		int array[] = {5,3,27,-8,-6,14};
		sort(array);
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
	
	private static void sort(int[] array) {
		buildHeap(array);
		int heapSize = array.length -1 ;
		
		for(int i = heapSize; i >=0; i--) {
			exchange(array, 0, i);
			heapSize--;
			heapify(array, 0 , heapSize);
		}
	}
	
	private static void buildHeap(int[] array) {
		for(int i = array.length-1/2; i >=0; i--) {
			heapify(array, i , array.length -1);
		}		
	}
	
	private static void heapify(int[] array, int i, int size) {
		int left = 2*i+1;
		int right = 2*i+2;
		int max;
		 
		if(left <= size && array[left] > array[i]){
			 max=left;
		} else {
			 max=i;
		}
		
		if(right <= size && array[right] > array[max]) {
			 max=right;
		}
		
		if(max!=i) {
			exchange(array,i, max);
			heapify(array, max,size);
		}
	}
	
	public static void exchange(int[] arr,int i, int j) {
		int t = arr[i];
	    arr[i] = arr[j];
	    arr[j] = t;
	}
	

}
