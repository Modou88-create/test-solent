package org.tondeuse;

public class Position {
    public int x, y;
    public Orientation orientation;

    public Position(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + orientation;
    }

}
