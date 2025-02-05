import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindMaxMin {
    public static void findMaxMin(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        
        int max = numbers.get(0);
        int min = numbers.get(0);
        int secondMax = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > max) {
                secondMax = max;
                max = number;
            } else if (number > secondMax && number < max) {
                secondMax = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Second largest number: " + (secondMax == Integer.MIN_VALUE ? "N/A" : secondMax));
        System.out.println("Minimum number: " + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        findMaxMin(numbers);
        scanner.close();
    }
}
