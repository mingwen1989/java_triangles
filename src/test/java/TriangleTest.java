import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(4, 4, 4);
    assertEquals(true, testTriangle instanceof Triangle);
  }
}
