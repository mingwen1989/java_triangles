public class Triangle {

  private int side1;
  private int side2;
  private int side3;

  public Triangle(int inSide1, int inSide2, int inSide3) {
    side1 = inSide1;
    side2 = inSide2;
    side3 = inSide3;
  }

  public String testSide(){
    System.out.println(side1);
    if(side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2){ //if any two sides are less than the third)
      return "Not a triangle";
    }


    if (side1 == side2 && side2 == side3){
      return "Equilateral";
    }
    else if (side1 == side2 || side2 == side3 || side3 == side1) {
      return "Isosceles";
    }
    else {
      return "Scalene";
    }

  }

}
