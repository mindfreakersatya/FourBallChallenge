import processing.core.PApplet;
public class BallGame extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int TOP = HEIGHT / 5;
    public static final int ballOneYCoordinate = TOP;
    public static final int ballTwoYCoordinate = 2 * TOP;
    public static final int ballThreeYCoordinate = 3 * TOP;
    public static final int ballFourYCoordinate = 4 * TOP;
    public static int ballOneXCoordinate = 1;
    public static int ballTwoXCoordinate = 1;
    public static int ballThreeXCoordinate = 1;
    public static int ballFourXCoordinate = 1;

    public static void main(String...args) {
        PApplet.main("BallGame", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() { }

    @Override
    public void draw() {
        drawCircle(ballOneXCoordinate, ballOneYCoordinate);
        drawCircle(ballTwoXCoordinate, ballTwoYCoordinate);
        drawCircle(ballThreeXCoordinate, ballThreeYCoordinate);
        drawCircle(ballFourXCoordinate, ballFourYCoordinate);
        ballOneXCoordinate+=1;
        ballTwoXCoordinate+=2;
        ballThreeXCoordinate+=3;
        ballFourXCoordinate+=4;
    }

    private void drawCircle(int xCoordinate, int yCoordinate) {
        ellipse(xCoordinate, yCoordinate, DIAMETER, DIAMETER);
    }
}
