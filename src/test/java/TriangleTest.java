import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly_true() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_testSidemethod_Equalateral() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals("Equilateral", testTriangle.testSide());
  }

  @Test
  public void newTriangle_testSidemethod_Isosceles() {
    Triangle testTriangle = new Triangle(4, 4, 1);
    assertEquals("Isosceles", testTriangle.testSide());
  }

  @Test
  public void newTriangle_testSidemethod_Scalene() {
    Triangle testTriangle = new Triangle(4, 3, 2);
    assertEquals("Scalene", testTriangle.testSide());
  }

  @Test
  public void newTriangle_testSidemethod_NotTriangle() {
    Triangle testTriangle = new Triangle(4, 3, 100);
    assertEquals("Not a triangle", testTriangle.testSide());
  }
}
