import java.util.Scanner;
import java.util.Stack;

public class ReverseUsingStack {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		System.out.println(reverse(s));
		in.close();

	}

	public static char[] reverse(String s) {
		char a[]=new char[s.length()];
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<a.length;i++) {
			st.push(s.charAt(i));
		}
		int i=0;
		while(!st.isEmpty()) {
			a[i++]=st.pop();
		}
		return a;
	}

}
