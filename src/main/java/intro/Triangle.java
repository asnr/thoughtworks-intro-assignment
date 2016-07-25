package intro;

public class Triangle {
  
  public static String asteriskLine(int numAsterisks, int leftPad) {

    StringBuilder line = new StringBuilder();
    for (int padIdx = 0; padIdx < leftPad; padIdx++) {
      line.append(' ');
    }
    for (int asteriskIdx = 0; asteriskIdx < numAsterisks; asteriskIdx++) {
      line.append('*');
    }
    line.append('\n');
    return line.toString();
  }

  public static String verticalLine(int height) {
    StringBuilder verticalLine = new StringBuilder();
    for (int idx = 0; idx < height; idx++) {
      verticalLine.append(asteriskLine(1, 0));
    }
    return verticalLine.toString();
  }

  public static String rightTriangle(int height) {
    StringBuilder triangle = new StringBuilder();
    for (int lineIdx = 0; lineIdx < height; lineIdx++) {
      triangle.append(asteriskLine(lineIdx + 1, 0));
    }
    return triangle.toString();
  }
}