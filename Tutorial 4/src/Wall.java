import javafx.geometry.Point2D;

public class Wall extends StationaryObject{
    //private Point2D     location;
    private int		    width;
    private int		    height;

    public Wall(Point2D loc, int w, int h) {
        super(loc);
        location = loc;
        width = w;
        height = h;
    }

    // The get/set methods
    //public Point2D getLocation() { return location; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    //public void setLocation(Point2D newLocation) { location = newLocation; }

    public String toString() {
        return "Wall" + " at (" + (int)location.getX() + "," + (int)location.getY() + ") with width " +
                width + " and height " + height;
    }
}