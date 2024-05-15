package fr.eseo.e3e.pdlo.levels;

public class Maze {
    public static final int BLOCK_SIZE = 24;
    public static final int N_BLOCKS = 15;
    public static final int SCREEN_SIZE = N_BLOCKS * BLOCK_SIZE;
    private final short[] screenData;

   
    public Maze(short[] screenData) {
        this.screenData = screenData;
    }

    public int getBlockSize() {
        return BLOCK_SIZE;
    }

    public int getNBlocks() {
        return N_BLOCKS;
    }

    public short[] getScreenData() {
        return screenData;
    }
}
