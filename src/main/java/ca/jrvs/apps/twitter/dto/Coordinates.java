package ca.jrvs.apps.twitter.dto;

public class Coordinates {
    private float[] coordinates;
    private String type;

    public float[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(float[] coordinates) {
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
