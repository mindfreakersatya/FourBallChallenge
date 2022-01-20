public class Ball {
    public int xCoordinate = 1;
    public final int diameter = 10;
    public final int yCoordinate;
    public final int speed;

    public Ball(int yCoordinate, int speed) {
        this.yCoordinate = yCoordinate;
        this.speed = speed;
    }

    public void moveRight() {
        this.xCoordinate+=speed;
    }
}
