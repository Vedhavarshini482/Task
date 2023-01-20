import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		new Program4().combinathionsOfCoins();
	}

	public void combinathionsOfCoins() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total amount");
		int amount = scanner.nextInt();
		System.out.println("Enter the size of how many coins you have");
		int size = scanner.nextInt();
		scanner.close();
		int array[] = new int[size];
		System.out.println("Enter the coin collection");
		for (int i = 0; i < array.length; i++)
			array[i] = scanner.nextInt();
		int coins = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		int collection = 0;
		for (int i = 0; i < array.length; i++) {
			int j = 1;
			for (j = 1; collection < amount; j++)
				collection = j * array[i];
			coins += j - 1;
			amount = amount - (coins * array[i]);
		}
		System.out.println(coins);
	}
}