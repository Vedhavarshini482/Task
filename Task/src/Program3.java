import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		new Program3().findingSubstrings();
	}

	public void findingSubstrings() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String size");
		int size1 = scanner.nextInt();
		System.out.println("Enter the second String size");
		int size2 = scanner.nextInt();
		String X[] = new String[size1];
		String Y[] = new String[size2];
		System.out.println("Enter the first string array elements");
		for (int i = 0; i < size1; i++)
			X[i] = scanner.next();
		System.out.println("Enter the second string array elements");
		for (int i = 0; i < size2; i++)
			Y[i] = scanner.next();
		scanner.close();
		int numberOfSubstrings = 0;
		for (int i = 0; i < Y.length; i++) {
			String string1 = Y[i];
			int count = 0;
			for (int j = 0; j < X.length; j++) {
				String string2 = X[j];
				count += stringEqual(string1, string2);
			}
			if (count == Y.length)
				numberOfSubstrings++;
		}
		System.out.println(numberOfSubstrings);
	}

	public static int stringEqual(String s1, String s2) {
		int equal = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++)
				if (s1.charAt(i) == s2.charAt(j)) {
					equal++;
					break;
				}
		}
		if (equal == s1.length())
			return 1;
		else
			return 0;
	}
}