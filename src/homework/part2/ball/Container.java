package homework.part2.ball;

import java.util.Objects;

public class Container {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return (x2-x1);
    }

    public int getHeight() {
        return (y2-y1);
    }

    public boolean collides(Ball ball) {
        return (ball.getX() + ball.getRadius() <= x2 &&
                ball.getX() - ball.getRadius() >= x1 &&
                ball.getY() - ball.getRadius() >= y1 &&
                ball.getY() + ball.getRadius() <= y2 );
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Container)) {
            return false;
        }

        Container container = (Container) o;

        return  this.x1 == container.x1 &&
                this.y1 == container.y1 &&
                this.x2 == container.x2 &&
                this.y2 == container.y2;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result +this.x1;
        result = 31 * result + this.y1;
        result = 31 * result + this.x2;
        result = 31 * result + this.y2;
        return result;
    }
}
