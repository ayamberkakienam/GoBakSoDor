package game;

/**
 * Created by Diki Ardian W (13515092) on 4/24/17.
 */
public class Point {
  private int x;
  private int y;

  public Point() {
    x = 0;
    y = 0;
  }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public boolean isEqual(Point p) {
    return x == p.x && y == p.y;
  }

  public boolean isEqual(int x, int y) {
    return this.x == x && this.y == y;
  }
}