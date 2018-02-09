import javafx.geometry.Point2D;

public class Ball extends MovableObject implements Harmful{
    //private Point2D     location;

    private boolean 	isBeingHeld;

    public Ball(Point2D loc) {
        super(0,0, loc);
        isBeingHeld = false;
    }

    // The get/set methods

    public int getDirection() { return direction; }
    public int getSpeed() { return speed; }
    public boolean isBeingHeld() { return isBeingHeld; }

    public void setDirection(int newDirection) { direction = newDirection; }
    public void setSpeed(int newSpeed) { speed = newSpeed; }
    public void setIsBeingHeld(boolean newHoldStatus) { isBeingHeld = newHoldStatus; }

    public void draw() {

        System.out.println("Ball is at (" + this.location.getX() + ", " + this.location.getY() + ") facing " + this.direction + " degrees and moving at " + this.speed + " pixels per second");


    }

    public void update () {

        moveForward();

        if (this.speed >= 1) {

            this.speed--;

        }

        draw();

    }

    public int getDamageAmount() {

        return -200;

    }
/*
    public String toString() {
        return "Ball" + " at (" + (int)location.getX() + "," + (int)location.getY() + ") facing " + direction +
                " degrees going " + speed + " pixels per second";
    }
    */
}