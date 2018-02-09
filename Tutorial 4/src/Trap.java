import javafx.geometry.Point2D;

public class Trap extends StationaryObject implements Harmful{
    //private Point2D     location;

    public Trap(Point2D loc) {
        super(loc);
    }

    // The get method
    //public Point2D getLocation() { return location; }

    public int getDamageAmount() {

        return -50;

    }

    public String toString() {
        return "Trap" + " at (" + (int)location.getX() + "," + (int)location.getY() + ")";
    }
}