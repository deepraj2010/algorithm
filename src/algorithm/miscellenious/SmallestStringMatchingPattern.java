package algorithm.miscellenious;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// TODO Incomplete
public class SmallestStringMatchingPattern {

	public static void main(String[] args) {
		char[] arr = {'x','y','z'};
		String str = "axyyzyzyxdsdsfs";
		String s = getShortestUniqueSubstring(arr, str);
		System.out.print(s);
	}
	
	private static String getShortestUniqueSubstring(char[] arr, String str) {
	    if(str.length() < arr.length) {
	      return "";
	    }
	    Set<Character> arrSet = new HashSet<Character>();
	    for(char ch : arr) {
	    	arrSet.add(ch);
	    }
	    Map<Character, Integer> strMap = new HashMap<Character, Integer>();
	    char[] chArray = str.toCharArray();
	    for(char ch : chArray) {
	    	if(strMap.containsKey(ch)) {
	    		strMap.put(ch, strMap.get(ch)+1);
	    	} else {
	    		strMap.put(ch, 1);
	    	}
	    }
	    int strLength = str.length();
	    int i = 0;
	    int first = -1;
	    int last = -1;
	    while(i < strLength && !arrSet.isEmpty()) {
	    	if(arrSet.contains(chArray[i])) {
	    		if(first == -1) {
	    			first = i;
	    		}
	    		if(last == -1) {
	    			last = i;
	    		} else {
	    			last++;
	    		}
	    	}
	    	i++;
	    }
	    
	    String solution = str.substring(first, last+1);
	    int f = 0;
	    int l = 0;
	    while(true) {
	    	 Set<Character> solSet = new HashSet<Character>(arrSet);
	    	 break;
	    }
	    return "";
	    
	}

}
