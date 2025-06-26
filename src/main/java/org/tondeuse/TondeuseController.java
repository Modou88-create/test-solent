package org.tondeuse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TondeuseController {
    public static void executerDepuisFichier(String chemin) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(chemin));
        String[] dimensions = reader.readLine().split(" ");
        int maxX = Integer.parseInt(dimensions[0]);
        int maxY = Integer.parseInt(dimensions[1]);

        String line;
        while ((line = reader.readLine()) != null) {
            String[] start = line.split(" ");
            int x = Integer.parseInt(start[0]);
            int y = Integer.parseInt(start[1]);
            Orientation orientation = Orientation.valueOf(start[2]);

            Position position = new Position(x, y, orientation);
            Tondeuse tondeuse = new Tondeuse(position, maxX, maxY);

            String instructions = reader.readLine();
            tondeuse.processInstructions(instructions);

            System.out.println(tondeuse.getTondeusePosition());
        }

        reader.close();
    }
}
