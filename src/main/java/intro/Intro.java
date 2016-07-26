package intro;

public class Intro {

  public static void main(String[] args) {

    System.out.println("Triangle exercises");
    System.out.println("------------------");

    System.out.println(Triangle.asteriskLine(1, 0));

    System.out.println(Triangle.asteriskLine(8, 0));

    System.out.println(Triangle.verticalLine(3));

    System.out.println(Triangle.rightTriangle(3));

    System.out.println("Diamond exercises");
    System.out.println("-----------------");

    System.out.println(Diamond.isoscelesTriangle(3, 0));

    System.out.println(Diamond.diamond(3));

    System.out.println(Diamond.namedDiamond("Andres", 3));

    System.out.println("FizzBuzz");
    System.out.println("--------");

    System.out.println(FizzBuzz.fizzBuzz(100));

    System.out.println("Prime Factors");
    System.out.println("-------------");

    System.out.println("Prime factors of 1:  " + PrimeFactors.generate(1).toString());
    
    System.out.println("Prime factors of 30: " + PrimeFactors.generate(30).toString());
  }

}