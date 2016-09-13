package models;

import interfaces.Board;

/**
 * Created by PC2 on 9/3/2016.
 */
public class BoardImpl implements Board, Comparable<Board> {

    private String height;
    private String width;
    private String depth;

    public BoardImpl(String height, String width, String depth) {
        this.setHeight(height);
        this.setWidth(width);
        this.setDepth(depth);
    }

    public String getHeight() {
        return this.height;
    }

    public String getWidth() {
        return this.width;
    }

    public String getDepth() {
        return this.depth;
    }

    private void setHeight(String height) {
        if (Integer.valueOf(height) <= 0 ||
                (Integer.valueOf(height) % 25 != 0)) {
            throw new IllegalArgumentException("Invalid height!");
        }

        this.height = height;
    }

    private void setWidth(String width) {
        if (Integer.valueOf(width) <= 0 ||
                (Integer.valueOf(width) % 25 != 0)) {
            throw new IllegalArgumentException("Invalid width!");
        }

        this.width = width;
    }

    private void setDepth(String depth) {
        if (Integer.valueOf(depth) <= 0 ||
                (Integer.valueOf(depth) % 25 != 0)) {
            throw new IllegalArgumentException("Invalid depth!");
        }

        this.depth = depth;
    }

    @Override
    public String toString() {
        return String.format("Height(%s) / Width(%s) / Depth(%s)", this.width, this.height, this.depth);
    }


    public int compareTo(Board board) {
        return this.toString().compareTo(board.toString());
    }
}
