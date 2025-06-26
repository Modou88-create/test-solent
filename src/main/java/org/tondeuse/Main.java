package org.tondeuse;

public class Main {
    public static void main(String[] args) {
        try {
            TondeuseController.executerDepuisFichier("src/main/resources/instructions.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}