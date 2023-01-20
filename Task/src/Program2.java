import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		new Program2().equalSumSubArray();
	}

	public void equalSumSubArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		int mid = 0;
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			mid += array[i];
		}
		scanner.close();
		mid = (mid + 1) / 2;
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < array.length;) {
			List<Integer> subArray = new ArrayList<Integer>();
			int sum = 0, j = i;
			while (mid != sum && j < array.length) {
				sum += array[j];
				subArray.add(array[j]);
				j++;
				i++;
			}
			if (subArray.size() != 0)
				list.add(subArray);
		}
		System.out.println(list);
	}
}