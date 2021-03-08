package arthur.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayFilter {

  private final int[] array;

  public ArrayFilter(int[] array) {
    this.array = array;
  }

  public ArrayList<Integer> getEvenNumbersBy(String mode) {
    ArrayList<Integer> arrayOfEvenNumbers = new ArrayList<>();
    switch (mode) {
      case "for":
        for (int i = 0; i < array.length; i++) {
          if (array[i] % 2 == 0) {
            arrayOfEvenNumbers.add(array[i]);
          }
        }
        break;
      case "forEach":
        for (int i : array) {
          if (i % 2 == 0) {
            arrayOfEvenNumbers.add(i);
          }
        }
        break;
      case "stream":
        IntStream stream = Arrays.stream(array);
        stream.filter(i -> i % 2 == 0).forEachOrdered(arrayOfEvenNumbers::add);
        break;
      default:
        throw new IllegalStateException(String.format("Unexpected value: %s.", mode));
    }

    return arrayOfEvenNumbers;
  }

}
