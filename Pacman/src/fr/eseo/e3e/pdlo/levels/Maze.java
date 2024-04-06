package fr.eseo.e3e.pdlo.levels;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import fr.eseo.e3e.pdlo.utils.CellType;

public class Maze {
    private CellType[][] maze;
    private int rows;
    private int columns;

    public Maze(String baseMapPath, String wallMapPath) {
        List<String> baseMap = loadMapFile(baseMapPath);
        List<String> wallMap = loadMapFile(wallMapPath);
        rows = baseMap.size();
        columns = baseMap.get(0).length();
        maze = new CellType[rows][columns];
        combineMaps(baseMap, wallMap);
    }

    private void combineMaps(List<String> baseMap, List<String> wallMap) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                char baseChar = baseMap.get(row).charAt(col);
                char wallChar = wallMap.get(row).charAt(col);
                
                if (wallChar == '1') {
                    maze[row][col] = CellType.WALL;
                } else if (baseChar == '1') {
                    maze[row][col] = CellType.PATH;
                } else {
                    maze[row][col] = CellType.EMPTY; 
            }
        }
        }
    }

    public List<String> loadMapFile(String filePath) {
        try {
            return Files.lines(Paths.get(filePath)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load map file: " + filePath, e);
        }
    }

 
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

   
    public CellType getCellType(int row, int col) {
        if (row < 0 || col < 0 || row >= rows || col >= columns) {
            throw new IndexOutOfBoundsException("Row or column is out of the maze's bounds.");
        }
        return maze[row][col];
    }
}

  
