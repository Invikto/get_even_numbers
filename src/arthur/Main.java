package arthur;

import arthur.utils.ArrayFilter;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int[] input_arr = new int[100];
    for (int i = 0; i < 100; i++) {
      input_arr[i] = i + 1;
    }

    System.out.printf("An input array is:\n%s\n", Arrays.toString(input_arr));

    System.out.println("\nPlease, choose a filter mode:");
    Scanner console = new Scanner(System.in);
    String mode = console.nextLine();

    ArrayFilter arrayFilter = new ArrayFilter(input_arr);
    arrayFilter.getEvenNumbers(mode);
  }
}
