package java_project;

import java.util.Stack;

public class bracketProblem {

	public void checkValidStringWithBrackets(String str) {

		int count = 0;
		int max = 0;

		if (str == null || str.isEmpty()) {
			System.out.println("String is empty");
		}

		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					System.out.println("String is empty");
				 break;
				}
				char open = stack.pop();
				if (((open == '(' && ch == ')') || (open == '{' && ch == '}') || (open == '[' && ch == ']'))) {
					count = count + 2;
					max=count;
				} else {
					max = count;
					count = 0;
				}

			}
		}

		System.out.println("Total valid brackets" + max);

	}

	public static void main(String args[]) {
		bracketProblem obj = new bracketProblem();
		String str = "(()[])";
		obj.checkValidStringWithBrackets(str);

	}
}
