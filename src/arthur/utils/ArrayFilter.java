package arthur.utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayFilter {

  private final int[] arr;

  public ArrayFilter(int[] arr) {
    this.arr = arr;
  }

  public void getEvenNumbers(String mode) {
    System.out.println("\nEven numbers of the array are:");

    switch (mode) {
      case "for":
        for (int i = 0; i < 100; i++) {
          if (arr[i] % 2 == 0) {
            System.out.println(arr[i]);
          }
        }
        break;
      case "forEach":
        for (int i : arr) {
          if (i % 2 == 0) {
            System.out.println(i);
          }
        }
        break;
      case "stream":
        IntStream stream = Arrays.stream(arr);
        stream.filter(i -> i % 2 == 0).forEachOrdered(System.out::println);
        break;
      default:
        throw new IllegalStateException(String.format("Unexpected value: %s", mode));
    }
  }

}
