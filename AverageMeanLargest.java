import java.util.*;

public class AverageMeanLargest {
    Scanner scanner = new Scanner(System.in);
    
    public void average() {
        System.out.println("Calculating the average....");
        int[] numbers = new int[4];
        double totals = 0;
        double average = 0;
        int largest;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
            totals = totals + numbers[i];
            average = totals / numbers.length;
        }
        largest = largest(numbers, numbers.length);
        System.out.println("The average is:" + " " + average);
        System.out.println("The mean is:" + " " + average);
        System.out.println("The largest number is:" + " " + largest);
    }
    
    public int largest(int values[], int n) {
        {
            Arrays.sort(values);
            return values[n - 1];
        }
    }

    public static void main(String args[]) {
        AverageMeanLargest av = new AverageMeanLargest();
        av.average();
    }
}
