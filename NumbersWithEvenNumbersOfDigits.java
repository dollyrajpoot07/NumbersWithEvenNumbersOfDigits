// You are given an array count numbers having even size.

import java.util.*;

public class NumbersWithEvenNumbersOfDigits {
    public static int numOfDigits(int num) {
        int count = 1;
        while (num / 10 >= 1) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int evenSizedNumbers(int[] array, int size) {
        int noOfEvenSizedDigits = 0;
        for (int i = 0; i < size; i++) {
            int countDigits = numOfDigits(array[i]);
            if (countDigits % 2 == 0) {
                noOfEvenSizedDigits++;
            }
        }
        return noOfEvenSizedDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int result = evenSizedNumbers(array, size);
        System.out.println("Result: " + result);
        sc.close();
    }
}
