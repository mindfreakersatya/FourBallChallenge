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
    public static int ballOneSpeed = 1;
    public static int ballTwoSpeed = 2;
    public static int ballThreeSpeed = 3;
    public static int ballFourSpeed = 4;
    Ball ballOne;
    Ball ballTwo;
    Ball ballThree;
    Ball ballFour;

    public static void main(String...args) {
        PApplet.main("BallGame", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ballOne = new Ball(ballOneYCoordinate, ballOneSpeed);
        ballTwo = new Ball(ballTwoYCoordinate, ballTwoSpeed);
        ballThree = new Ball(ballThreeYCoordinate, ballThreeSpeed);
        ballFour = new Ball(ballFourYCoordinate, ballFourSpeed);
    }

    @Override
    public void draw() {
        drawCircle(ballOne);
        drawCircle(ballTwo);
        drawCircle(ballThree);
        drawCircle(ballFour);
    }

    private void drawCircle(Ball ball) {
        ellipse(ball.xCoordinate, ball.yCoordinate, ball.diameter, ball.diameter);
        ball.moveRight();
    }

}
