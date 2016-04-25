public class Triangle {

    private int side1;
    private int side2;
    private int side3;

  public Triangle(int side1, int side2, int side3) {
    side1 = side1;
    side2 = side2;
    side3 = side3;
  }

  public String testSide(){
    if (side1 == side2 && side2 == side3){
      return "Equilateral";
    }
    else if (side1 == side2 || side2 == side3 || side3 == side1) {
      return "Isosceles";
    }
    else if (side1 + side2 > side3 || side2 + side3 > side1 || side3 + side1 > side2){ //if any two sides are greater than the third
      return "Scalene";
    }
    else {
      return "Not a triangle";
    }
  }

}
