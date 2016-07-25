import static org.junit.Assert.assertEquals;
import org.junit.Test;

import intro.Triangle;

public class TriangleTest {
  @Test
  public void asteriskLineOneAsterisk() {
    String line = Triangle.asteriskLine(1, 0);
    assertEquals(line, "*\n");
  }

  @Test
  public void asteriskLineOnePad() {
    String line = Triangle.asteriskLine(0, 1);
    assertEquals(line, " \n");
  }

  @Test
  public void asteriskLineTwoPadThreeAsterisk() {
    String line = Triangle.asteriskLine(3, 2);
    assertEquals(line, "  ***\n");
  }

  @Test
  public void verticalLineHeightOne() {
    String vline = Triangle.verticalLine(1);
    assertEquals(vline, "*\n");
  }

  @Test
  public void verticalLineHeightThree() {
    String vline = Triangle.verticalLine(3);
    assertEquals(vline, "*\n*\n*\n");
  }

  @Test
  public void rightTriangleHeightOne() {
    String triangle = Triangle.rightTriangle(1);
    assertEquals(triangle, "*\n");
  }

  @Test
  public void rightTriangleHeightThree() {
    String triangle = Triangle.rightTriangle(3);
    assertEquals(triangle, "*\n**\n***\n");
  }
}