public class Rectangle {

  private int mLength;
  public int getWidth;

  public Rectangle(int length, int width) {
    mLength = length;
    getWidth = width;
  }

  public int getLength(){
    return mLength;
  }

  public boolean isSquare() {
    return mLength == getWidth;
  }
}
