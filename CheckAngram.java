public class ChackAnagram {

	public static void main(String args[]) {
		String s1 = "apple";
		String s2 = "APPLE";
		if (s1.length() != s2.length())
			System.out.println("not anagram");
		else {
			if (anagram(s1, s2)) {
				System.out.println("Anagram");
			} else
				System.out.println("Not Anagram");

		}
	}

	private static boolean anagram(String s1, String s2) {
		int temp[] = new int[256];
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		for (int i = 0; i < s3.length(); i++) {
			for (int j = 0; j < s4.length(); j++) {
				temp[s3.charAt(i)]++;
				temp[s4.charAt(j)]--;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0)
				return false;

		}
		return true;
	}

}
