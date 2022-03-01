import java.util.*;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date DateCreated;

    public GeometricObject() {
        this.color = "white";
        this.filled = false;
        this.DateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.DateCreated = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return DateCreated;
    }

    public String toString() {
        return "created on " + this.DateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

}