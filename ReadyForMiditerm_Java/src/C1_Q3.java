
public class C1_Q3 {
	public static int getOccurence(String s, String sub) {
		int count = 0;
		for(int i = 0; i <= s.length() - sub.length(); i++) {
			if (sub.equals(s.substring(i, i + sub.length()))) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(getOccurence("abcd ab", "ab"));
		System.out.println(getOccurence("bbbb", "bb"));
	}
}
