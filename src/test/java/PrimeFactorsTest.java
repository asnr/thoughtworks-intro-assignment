import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.ArrayList;

import intro.PrimeFactors;

public class PrimeFactorsTest {
  @Test
  public void generate1() {
    ArrayList<Integer> factors = PrimeFactors.generate(1);
    assertArrayEquals(factors.toArray(new Integer[factors.size()]),
      new Integer[]{});
  }

  @Test
  public void generate12() {
    ArrayList<Integer> factors = PrimeFactors.generate(12);
    assertArrayEquals(factors.toArray(new Integer[factors.size()]),
      new Integer[]{2, 2, 3});
  }
}
