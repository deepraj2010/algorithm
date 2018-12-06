package algorithm.miscellenious;

import java.util.HashSet;
import java.util.Set;

public class PossibleWordsFromPhoneKeypad {

	public static void main(String[] args) {
		printWord("ABC", "DEF", "GHI");
	}
	
	public static Set<String> permute(String string) {
		Set<String> set = new HashSet<>();
		permute("", string, set);
		return set;
	}
	
	
	public static void permute(String prefix, String string, Set<String> set) {
		int n = string.length();
		if(n == 0) {
			set.add(prefix);
		}
		for(int i = 0; i < n; i++) {
			permute(prefix+string.charAt(i), string.substring(0, i) + string.substring(i+1, n), set);
		}
	}
	
	public static void printWord(String first, String second, String third) {
		for(int i = 0; i < first.length();i++)
			for(int j = 0; j < second.length(); j++)
				for(int k = 0; k < third.length(); k++)
					System.out.println(""+first.charAt(i)+second.charAt(j)+third.charAt(k));
	}

}
