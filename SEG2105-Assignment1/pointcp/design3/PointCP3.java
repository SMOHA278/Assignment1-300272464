/**
 * This class contains instances of coordinates in Cartesian format.
 * It provides methods to retrieve and manipulate these coordinates.
 * It extends the abstract class PointCP, implementing its abstract methods.
 * 
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP3 extends PointCP {

    // Instance variables
    private double x;
    private double y;

    // Constructors

    /**
     * Constructs a PointCP3 instance.
     * 
     * @param x The Cartesian x-coordinate.
     * @param y The Cartesian y-coordinate.
     */
    public PointCP3(double x, double y) {
        super('C', x, y);
        this.x = x;
        this.y = y;
    }

    // Overridden abstract methods from PointCP

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getRho() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    @Override
    public void convertStorageToPolar() {
        // No need to convert; already in Cartesian format
    }

    @Override
    public void convertStorageToCartesian() {
        // No need to convert; already in Cartesian format
    }

    // Other methods

    /**
     * Returns information about the coordinates.
     * 
     * @return A String containing information about the coordinates.
     */
    public String toString() {
        return "Stored as Cartesian  (" + getX() + "," + getY() + ")";
    }
}
