package arthur;

import arthur.utils.ArrayCreator;
import arthur.utils.ArrayFilter;

import java.util.Arrays;
import java.util.Scanner;

public class BaseSteps {

  public int[] createArray() {
    System.out.println("Please, enter an array length:");
    Scanner console = new Scanner(System.in);
    while (!console.hasNextInt()) {
      System.out.println("Please, enter an integer.");
      console = new Scanner(System.in);
    }
    int arrayLength = console.nextInt();

    ArrayCreator arrayCreator = new ArrayCreator();
    int[] array = arrayCreator.getSequenceOfNumbersFromOneTo(arrayLength);
    System.out.printf("\nAn input array is:\n%s\n", Arrays.toString(array));

    return array;
  }

  public void getEvenNumbersFrom(int[] array) {
    while (true) {
      System.out.println("\nPlease, choose a filter mode ('for', 'forEach' or 'stream'):");
      Scanner console = new Scanner(System.in);
      String mode = console.nextLine();
      ArrayFilter arrayFilter = new ArrayFilter(array);
      try {
        System.out.printf("\nEven numbers of the array are:\n%s\n", arrayFilter.getEvenNumbersBy(mode).toString());
        break;
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}
