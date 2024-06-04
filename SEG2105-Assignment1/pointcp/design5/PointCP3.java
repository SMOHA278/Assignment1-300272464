/**
 * This class contains instances of coordinates in Cartesian format.
 * It extends PointCP5 and implements its abstract methods.
 * 
 * @author [Your Name]
 * @version [Date]
 */
public class PointCP3 extends PointCP5 {

    // Instance variables
    private double x;
    private double y;

    // Constructor

    public PointCP3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Implemented abstract methods from PointCP5

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
}
