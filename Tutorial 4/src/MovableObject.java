import javafx.geometry.Point2D;

public abstract class MovableObject extends GameObject {

    protected int			direction;
    protected int 		speed;

    public MovableObject (int d, int s, Point2D loc) {

        super(loc);
        this.direction = d;
        this.speed = s;


    }

    public abstract void draw();

    public void update() {
        moveForward();
        draw();
    }

    public void moveForward() {
        if (speed > 0)
            location = location.add((int) (Math.cos(Math.toRadians(direction)) * speed),
                    (int) (Math.sin(Math.toRadians(direction)) * speed));
    }

    public String toString() {

        return super.toString() + ") facing " + this.direction + " degrees and moving at " + this.speed + " pixels per second";

    }

}
