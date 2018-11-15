package model;

import java.io.Serializable;

/**
 *
 * @author chelseawaite
 */
public class Point implements Serializable {

    private int row;
    private int column;

    public Point() {
        // empty constructor for Javabeans
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Point{"
                + "row" + row
                + ", column" + column
                + "}";
    }

}
