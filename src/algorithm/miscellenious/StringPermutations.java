package algorithm.miscellenious;

import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
	static Set<String> set = new HashSet<>();
	public static void main(String args[]) {
		String a = "aaabc";
		permute(a);
		System.out.println(set);
		System.out.print(set.size());
	}
	
	public static void permute(String str) { 
	    permute("", str, set); 
	}
	
	private static void permute(String prefix, String str, Set<String> hashSet) {
	    int n = str.length();
	    if (n == 0) {
	    	hashSet.add(prefix);
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), hashSet);
	    }
	}
}
