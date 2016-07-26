import static org.junit.Assert.assertEquals;
import org.junit.Test;

import intro.Diamond;

public class DiamondTest {
  @Test
  public void isoscelesTriangleHeightOne() {
    String triangle = Diamond.isoscelesTriangle(1, 0);
    assertEquals(triangle, "*\n");
  }

  @Test
  public void isoscelesTriangleLeftPadOne() {
    String triangle = Diamond.isoscelesTriangle(0, 1);
    assertEquals(triangle, "");
  }

  @Test
  public void isoscelesTriangleHeightThreeLeftPadTwo() {
    String triangle = Diamond.isoscelesTriangle(3, 2);
    assertEquals(triangle, "    *\n   ***\n  *****\n");

  }

  @Test
  public void reversedIsoscelesTriangleHeightOne() {
    String triangle = Diamond.reversedIsoscelesTriangle(1, 0);
    assertEquals(triangle, "*\n");
  }

  @Test
  public void reversedIsoscelesTriangleLeftPadOne() {
    String triangle = Diamond.reversedIsoscelesTriangle(0, 1);
    assertEquals(triangle, "");
  }

  @Test
  public void reversedIsoscelesTriangleHeightThreeLeftPadTwo() {
    String triangle = Diamond.reversedIsoscelesTriangle(3, 2);
    assertEquals(triangle, "  *****\n   ***\n    *\n");
  }

  @Test
  public void diamondHeightOne() {
    String diamond = Diamond.diamond(1);
    assertEquals(diamond, "*\n");
  }

  @Test
  public void diamondHeightThree() {
    String diamond = Diamond.diamond(3);
    assertEquals(diamond, "  *\n ***\n*****\n ***\n  *\n");
  }

  @Test
  public void namedDiamondHeightOne() {
    String diamond = Diamond.namedDiamond("foo", 1);
    assertEquals(diamond, "foo\n");
  }

  @Test
  public void namedDiamondShortNameHeightThree() {
    String diamond = Diamond.namedDiamond("ab", 3);
    assertEquals(diamond, " *\n***\nab\n***\n *\n");
  }

  @Test
  public void namedDiamondLongNameHeightFour() {
    String diamond = Diamond.namedDiamond("foobarbaz", 4);
    assertEquals(diamond,
      "    *\n   ***\n  *****\nfoobarbaz\n  *****\n   ***\n    *\n");
  }
}
