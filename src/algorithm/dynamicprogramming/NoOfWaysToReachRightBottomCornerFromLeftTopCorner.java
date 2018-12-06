package algorithm.dynamicprogramming;

public class NoOfWaysToReachRightBottomCornerFromLeftTopCorner {

	public static void main(String[] args) {
		int m = 4;
		int n = 3;
		numOfWays(m,n);
		System.out.println();
	}
	
	private static int numOfWays(int m, int n) {
		
		int[][] mn = new int[m][n];
		
		for(int i = 0; i < mn.length; i++) {
			mn[i][n-1] = 1; 
		}
		
		for(int i = 0; i < mn[0].length; i++) {
			mn[m-1][i] = 1; 
		}
		
		for(int i = m-2; i >=0;i--) {
			for(int j = n-2; j >=0; j--) {
				mn[i][j] = mn[i][j+1] + mn[i+1][j];
			}
		}
		for(int i = 0 ; i < mn.length; i++) {
			for(int j = 0;j < mn[0].length; j++) {
				System.out.print(mn[i][j] + " ");
			}
			System.out.println();
		}
		return mn[0][0];
	}

}
