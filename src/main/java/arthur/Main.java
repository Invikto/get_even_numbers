package arthur;

public class Main {

  public static void main(String[] args) {
    BaseSteps steps = new BaseSteps();
    int[] array = steps.createArray();
    steps.getEvenNumbersFrom(array);
  }

}
