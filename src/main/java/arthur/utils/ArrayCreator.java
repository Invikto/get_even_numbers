package arthur.utils;

import java.util.stream.IntStream;

public class ArrayCreator {

  public int[] getSequenceOfNumbersFromOneTo(int i) {
    return IntStream.range(0, i).map(j -> j + 1).toArray();
  }

}
