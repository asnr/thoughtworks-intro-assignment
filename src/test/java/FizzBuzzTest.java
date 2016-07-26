import static org.junit.Assert.assertEquals;
import org.junit.Test;

import intro.FizzBuzz;

public class FizzBuzzTest {
  @Test
  public void fizzBuzzLine1() {
    String line = FizzBuzz.fizzBuzzLine(1);
    assertEquals(line, "1");
  }

  @Test
  public void fizzBuzzLine3() {
    String line = FizzBuzz.fizzBuzzLine(3);
    assertEquals(line, "Fizz");
  }

  @Test
  public void fizzBuzzLine5() {
    String line = FizzBuzz.fizzBuzzLine(5);
    assertEquals(line, "Buzz");
  }

  @Test
  public void fizzBuzzLine15() {
    String line = FizzBuzz.fizzBuzzLine(15);
    assertEquals(line, "FizzBuzz");
  }

  @Test
  public void fizzBuzz1() {
    assertEquals(FizzBuzz.fizzBuzz(1), "1\n");
  }

  @Test
  public void fizzBuzz15() {
    assertEquals(FizzBuzz.fizzBuzz(15),
      "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n");
  }
}

