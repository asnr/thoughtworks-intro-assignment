package intro;

public class Diamond {

  public static String isoscelesTriangle(int height, int leftPad) {
    StringBuilder triangle = new StringBuilder();
    for (int lineIdx = 0; lineIdx < height; lineIdx++) {
      for (int padIdx = 0; padIdx < leftPad; padIdx++) {
        triangle.append(' ');
      }
      triangle.append(Triangle.asteriskLine(2*lineIdx + 1, height - lineIdx - 1));
    }
    return triangle.toString();
  }

  public static String reversedIsoscelesTriangle(int height, int leftPad) {
    StringBuilder triangle = new StringBuilder();
    for (int lineIdx = 0; lineIdx < height; lineIdx++) {
      for (int padIdx = 0; padIdx < leftPad; padIdx++) {
        triangle.append(' ');
      }
      triangle.append(Triangle.asteriskLine(2*(height - lineIdx - 1) + 1, lineIdx));
    }
    return triangle.toString();
  }

  public static String diamond(int height) {
    if (height == 1) {
      return Triangle.asteriskLine(1, 0);
    }

    StringBuilder diamond = new StringBuilder();
    diamond.append(isoscelesTriangle(height, 0));
    diamond.append(reversedIsoscelesTriangle(height - 1, 1));
    return diamond.toString();
  }

  public static String namedDiamond(String name, int height) {
    if (height == 1) {
      return name + "\n";
    }

    int triangleBaseWidth = 2*(height - 1) - 1;
    int triangleLeftPad = Math.max(0, (name.length() - triangleBaseWidth) / 2);

    StringBuilder diamond = new StringBuilder();
    diamond.append(isoscelesTriangle(height - 1, triangleLeftPad));
    diamond.append(name);
    diamond.append('\n');
    diamond.append(reversedIsoscelesTriangle(height - 1, triangleLeftPad));

    return diamond.toString();
  }
}