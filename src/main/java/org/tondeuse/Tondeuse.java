package org.tondeuse;

public class Tondeuse {
    private Position tondeusePosition;
    private final int maxX, maxY;

    public Tondeuse(Position positionInitiale, int maxX, int maxY) {
        this.tondeusePosition = positionInitiale;
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public void processInstructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'A':
                    avancer();
                    break;
                case 'G':
                    tondeusePosition.orientation = tondeusePosition.orientation.turnLeft();
                    break;
                case 'D':
                    tondeusePosition.orientation = tondeusePosition.orientation.turnRight();
                    break;
            }
        }
    }

    private void avancer() {
        int x = tondeusePosition.x;
        int y = tondeusePosition.y;

        switch (tondeusePosition.orientation) {
            case N:
                y= y+1;
                break;
            case S:
                y= y-1;
                break;
            case E:
                x =x+1;
                break;
            case W :
                x =x-1;
            default:
                System.out.println("Orientation non reconnue.");
                break;
        }

        if (x >= 0 && x <= maxX && y >= 0 && y <= maxY) {
            tondeusePosition.x = x;
            tondeusePosition.y = y;
        }
    }
    public Position getTondeusePosition() {
        return tondeusePosition;
    }
}
