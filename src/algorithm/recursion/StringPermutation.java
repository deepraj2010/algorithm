package algorithm.recursion;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.print(permute("pooja"));
	}
	
	public static Set<String> permute(String str) {
		Set <String> set = new HashSet<>();
		permute("", str, set);
		return set;
	}
	
	public static void permute(String prefix, String remaining, Set<String> permutationSet) {
		
		int n= remaining.length();
		if(n == 0) permutationSet.add(prefix);
		for(int i = 0; i < remaining.length(); i++) {
			permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1, n), permutationSet);
		}
	}

}
