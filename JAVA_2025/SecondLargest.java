import java.util.Arrays;
import java.util.List;
public class SecondLargest{
    public static int findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) throw new IllegalArgumentException("List must contain at least two numbers.");
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest; largest = num; 
            }
            else if (num > secondLargest) secondLargest = num;
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        System.out.println(findSecondLargest(Arrays.asList(12, 35, 1, 10, 34, 1, 0,-1)));
    }
}