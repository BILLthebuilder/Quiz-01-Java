// This returns only the largest value in an array of integers
import java.util.*;
public class Largest {

    public int largest(int values[], int n) {
        {
            Arrays.sort(values);
            return values[n - 1];
        }
    }
 public static void main(String args[]) {
     Largest big = new Largest();
     int[] numbers = { 1, 2, 3, 98, 908089, 23232, 0 };
     int n = numbers.length;
     System.out.println("The biggest number is:"+" "+big.largest(numbers,n)); 
 }
}
