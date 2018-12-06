package algorithm.miscellenious;

public class CompressString {

	public static void main(String[] args) {
		System.out.print(compressString("aabcccccaaa"));
	}
	
	public static String compressString(String string) {
		
		StringBuilder result = new StringBuilder();
		char current = string.charAt(0);
		int count = 1;
		for(int i = 1; i < string.length(); i++) {
			char ch = string.charAt(i);
			if(ch == current) {
				count++;
			}else {
				result = result.append(current).append(count);
				count = 1;
				current = ch;
			}
		}
		result.append(current).append(count);
		return result.toString();
	}

}
