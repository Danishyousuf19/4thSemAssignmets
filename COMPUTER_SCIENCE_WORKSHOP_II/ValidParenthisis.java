import java.util.Stack;

public class ValidParenthisis {
	public static boolean IsValid(String s) {
		int n = s.length();
		if (n == 0)
			return true;
		if (n == 1)
			return false;
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		for (int i = 1; i < n; i++) {
			char c = st.peek();
			if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
				st.push(s.charAt(i));

			} else if (c == '(' && s.charAt(i) == ')' || c == '[' && s.charAt(i) == ']'
					|| c == '{' && s.charAt(i) == '}') {
				st.pop();
			} else if (c == '(' && s.charAt(i) != ')' || c == '[' && s.charAt(i) != ']'
					|| c == '{' && s.charAt(i) != '}') {
				return false;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(IsValid("(({}{[]}))"));
	}

}
