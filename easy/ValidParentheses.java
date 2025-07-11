import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	/*
	* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	* An input string is valid if:
	*	* Open brackets must be closed by the same type of brackets.
	*	* Open brackets must be closed in the correct order.
	*	* Every close bracket has a corresponding open bracket of the same type.
  */
	public static void main(String[] args) {
		System.out.println(isValid("(]"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("([])"));
	}

	public static boolean isValid(String s) {
		Map<Character, Character> map = Map.of(
				'(', ')',
				'{', '}',
				'[', ']'
		);

		Stack<Character> stack = new Stack<Character>();

		for(int i=0; i < s.length(); i++){
			var letter = s.charAt(i);
			if(map.containsKey(letter)){
				stack.push(letter);
			}else if(map.containsValue(letter)){
				if(stack.isEmpty()){
					return false;
				}
				char topo = stack.peek();
				if(map.get(topo) == letter) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();

	}
}
