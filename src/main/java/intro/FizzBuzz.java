package intro;

public class FizzBuzz {

  public static String fizzBuzz(int finalNum) {
    StringBuilder fizzBuzz = new StringBuilder();
    for (int lineNum = 1; lineNum <= finalNum; lineNum++) {
      fizzBuzz.append(fizzBuzzLine(lineNum));
      fizzBuzz.append('\n');
    }
    return fizzBuzz.toString();
  }

  public static String fizzBuzzLine(int lineNum) {
    if (lineNum % 3 == 0 && lineNum % 5 == 0) {
      return "FizzBuzz";
    } else if (lineNum % 3 == 0) {
      return "Fizz";
    } else if (lineNum % 5 == 0) {
      return "Buzz";
    } else {
      return Integer.toString(lineNum);
    }
  }
}
