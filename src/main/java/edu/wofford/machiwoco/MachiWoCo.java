package edu.wofford.machiwoco;


/**
 * This is a class built to represent the MachiWoco game.
 * 
 * @author Eric Craft
 * @author Ivan Gu
 * @author Bennett Joyce
 */

public class MachiWoCo {

    /**
     * Selects which phase of the game to play based on console input.
     * @param args a String array representing the user's console arguments.
     */

    public static void main(String[] args) {

        if (args[0].equals("phase0")) {
            Establishment.main(args);
        } else if (args[0].equals("phase1")) {
            TwoPlayersPhase1.main(args,2);
        } else if (args[0].equals("phase2")) {
            Feature4.main(args);
        } else if (args[0].equals("phase3")) {
            Feature5.main(args);
        } else if (args[0].equals("phase4")) {
            Feature6.main(args);
        }

    }
}

