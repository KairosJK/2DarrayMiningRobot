package com.company;

import static com.company.ProjConstants.*;

public class MapRobot {
    private int mapSize = INVALID;

    private int[][] mapped;

    int StartX = 0;
    int StartY = 0;

    public MapRobot() {
        mapped = new int[MAX_XY][MAX_XY];
        mapSize = MAX_XY;
    }

    public MapRobot(int arraySize) {

        mapped = new int[arraySize][arraySize];
        mapSize = arraySize;

    }

    public boolean mappingDone() {
        return false;
    }

    public void setStartPosition(int x, int y) {
        // main- sets where to start
    }

    public int nextX() {

        int x = 0;

        if (x == x) {
            x = x + 1;
        }

        return 1;
    }

    public int nextY() {

        int y = 0;

        if (y == y) {
            y = y + 1;
        }


        return 1;
    }

    public int[][] AltiudeMap() {

        return mapped;
    }

    public void DisplayAltitudeMap() {

        for (int r = 0; r < mapSize; r++) {
            for (int c = 0; c < mapSize; c++) {

                if (mapped[r][c] != 0) {
                    System.out.print(" " + mapped[r][c]);
                } else {
                    System.out.print(" X");
                }
            }
            System.out.println();
        }
    }

    public int getnumberOfPeaks() {
        return 1;
    }

    public int getPeakX(int peakID) {
        return 1;
    }

    public int getPeakY(int peakID) {
        return 1;
    }

    public int getAllPeakPositions() {
        return 1;
    }


}


