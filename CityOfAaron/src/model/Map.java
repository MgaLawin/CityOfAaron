package model;

import java.io.Serializable;

/**
 *
 * @author chelseawaite
 */
public class Map implements Serializable {

    private Location[][] locations;
    private Point currentLocation;

    public Map() {
        // empty constructor for Javabeans
    }

    public Location[][] getLocation() {
        return locations;
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point point) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Map{"
            + "locations" + locations
            + ", currentLocation" + currentLocation
            + "}";
    }

}
