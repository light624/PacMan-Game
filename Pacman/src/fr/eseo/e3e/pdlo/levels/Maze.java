package fr.eseo.e3e.pdlo.levels;

public class Maze {
    private Cell[][] cells;

    public Maze(int rows, int columns) {
        cells = new Cell[rows][columns];
        initializeMaze();
    }

    private void initializeMaze() {
    }

    public Cell getCell(int row, int column) {
        return cells[row][column];
    }

    public void setCell(int row, int column, Cell cell) {
        cells[row][column] = cell;
    }

}
