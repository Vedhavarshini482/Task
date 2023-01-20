import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		new Program5().characterCount();
	}

	public void characterCount() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = scanner.nextLine();
		inputString = inputString.toLowerCase();
		System.out.println("Enter the reference String");
		String refString = scanner.nextLine();
		refString = refString.toLowerCase();
		char refStringArray[] = refString.toCharArray();

		// to remove duplicates in reference String
		for (int i = 0; i < refStringArray.length; i++) {
			for (int j = i + 1; j < refStringArray.length; j++)
				if (refStringArray[i] == refStringArray[j])
					refStringArray[j] = ' ';
		}
		scanner.close();

		int stringCount[] = new int[refStringArray.length];
		for (int i = 0; i < refStringArray.length; i++) {
			int count = 0;
			for (int j = 0; j < inputString.length(); j++) {
				if (refStringArray[i] != ' ' && refStringArray[i] == inputString.charAt(j))
					count++;
			}
			stringCount[i] = count;
		}
		for (int i = 0; i < refString.length(); i++)
			if (refStringArray[i] != ' ')
				System.out.println(refStringArray[i] + ":" + stringCount[i]);
	}
}