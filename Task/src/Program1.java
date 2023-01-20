import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		new Program1().validExpression();
	}

	public String validExpression() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression");
		String exp = scanner.next();
		scanner.close();
		int parenthesis = 0;
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '(')
				parenthesis++;
			else if (exp.charAt(i) == ')')
				parenthesis--;
		}
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) >= 'a' && exp.charAt(i) <= 'z' && (i + 1 < exp.length())) {
				if ((exp.charAt(i + 1) == ')' || exp.charAt(i + 1) == '+' || exp.charAt(i + 1) == '-'
						|| exp.charAt(i + 1) == '*' || exp.charAt(i + 1) == '/' || exp.charAt(i + 1) == '%')) {
					i++;
					continue;
				} else {
					System.out.println("InValid");
					return "InValid";
				}
			}
		}
		if (parenthesis != 0) {
			System.out.println("InValid");
			return "InValid";
		}
		System.out.println("Valid");
		return "Valid";
	}
}