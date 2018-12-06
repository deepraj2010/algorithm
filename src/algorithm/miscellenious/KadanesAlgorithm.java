package algorithm.miscellenious;

public class KadanesAlgorithm {
	
	public static void main(String args[]) {
		int [] a = {-2, -3, -4, -1, -2, -1, -5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
        		kadenesAlgo(a)); 
	}
	
	public static int kadenesAlgo(int[] array) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		
		for(int i = 0; i < array.length; i++) {
			max_ending_here = max_ending_here + array[i];
			if(max_ending_here < 0) {
				max_ending_here = 0;
			}
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}
		return max_so_far;
	}

}
