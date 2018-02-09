import javafx.geometry.Point2D;

public abstract class GameObject {


    protected Point2D location;

    public GameObject (Point2D location) {

        this.location = location;


    }

    public Point2D getLocation() { return location; }
    public void setLocation(Point2D newLocation) { location = newLocation; }


    public abstract void update();

    public String toString () {

        return this.getClass().toString() + "is at (" + this.location.getX() + ", " + this.location.getY() + ")";


    }


}
