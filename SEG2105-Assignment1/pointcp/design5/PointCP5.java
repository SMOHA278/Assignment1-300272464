/**
 * Abstract class PointCP5 serves as a common interface for PointCP2 and PointCP3.
 * It provides abstract methods for getX(), getY(), getRho(), getTheta(),
 * convertStorageToPolar(), and convertStorageToCartesian().
 * 
 * @author [Your Name]
 * @version [Date]
 */
public abstract class PointCP5 {

    /**
     * Returns the x-coordinate or rho value depending on the coordinate system.
     * 
     * @return The x-coordinate (for Cartesian) or rho value (for Polar).
     */
    public abstract double getX();

    /**
     * Returns the y-coordinate or theta value depending on the coordinate system.
     * 
     * @return The y-coordinate (for Cartesian) or theta value (for Polar).
     */
    public abstract double getY();

    /**
     * Returns the rho value or x-coordinate depending on the coordinate system.
     * 
     * @return The rho value (for Polar) or x-coordinate (for Cartesian).
     */
    public abstract double getRho();

    /**
     * Returns the theta value or y-coordinate depending on the coordinate system.
     * 
     * @return The theta value (for Polar) or y-coordinate (for Cartesian).
     */
    public abstract double getTheta();

    /**
     * Converts the point from Cartesian to Polar coordinates.
     */
    public abstract void convertStorageToPolar();

    /**
     * Converts the point from Polar to Cartesian coordinates.
     */
    public abstract void convertStorageToCartesian();

    // You can add other abstract methods or constants here if needed
}
