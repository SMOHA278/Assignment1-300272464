/**
 * This class represents a point in polar coordinates (rho, theta).
 * It extends the original PointCP class.
 */
public class PointCP2 extends PointCP {

    // Instance variables
    private double rho; // Distance from origin
    private double theta; // Angle in radians

    // Constructors

    /**
     * Constructs a PointCP2 instance with the given polar coordinates.
     * @param rho The distance from the origin (rho)
     * @param theta The angle in radians (theta)
     */
    public PointCP2(double rho, double theta) {
        super('P', rho, theta);
        this.rho = rho;
        this.theta = theta;
    }

    // Methods to handle polar coordinates

    /**
     * Returns the distance from the origin (rho).
     */
    @Override
    public double getRho() {
        return rho;
    }

    /**
     * Returns the angle in radians (theta).
     */
    @Override
    public double getTheta() {
        return theta;
    }

    /**
     * Converts polar coordinates to Cartesian coordinates and returns the x-coordinate.
     */
    @Override
    public double getX() {
        return (Math.cos(theta) * rho);
    }

    /**
     * Converts polar coordinates to Cartesian coordinates and returns the y-coordinate.
     */
    @Override
    public double getY() {
        return (Math.sin(theta) * rho);
    }

    /**
     * Returns a string representation of the point.
     */
    @Override
    public String toString() {
        return String.format("Polar Coordinate (rho=%f, theta=%f radians)", rho, theta);
    }

}
