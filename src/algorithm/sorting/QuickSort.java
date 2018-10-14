package algorithm.sorting;

public class QuickSort {
	
	public static void main(String args[]) {
		
		int[] array = {5,7,2,6,4};
		quickSort(array, 0, array.length-1);
		for(int i = 0 ; i < array.length; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
	
	static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } 
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
}
