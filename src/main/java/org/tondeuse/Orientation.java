package org.tondeuse;

public enum Orientation {
    N, E, S, W;

    public Orientation turnLeft() {
        return values()[(this.ordinal() + 3) % 4];
    }

    public Orientation turnRight() {
        return values()[(this.ordinal() + 1) % 4];
    }
}
