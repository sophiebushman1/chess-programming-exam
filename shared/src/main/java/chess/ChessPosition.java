package chess;
import java.util.*;

/**
 * Represents a single square position on a chess board
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPosition {
    private final int row;
    private final int column;

    public ChessPosition(int row, int col) {
    //check if argument is good
        if (row>8 || row<1){
            throw new IllegalArgumentException("row value must be between 1 and 8");
        }
        if (col>8 || col<1){
            throw new IllegalArgumentException("column value must be between 1 and 8");
        }
        this.row = row;
        this.column = col;
    }

    /**
     * @return which row this position is in
     * 1 codes for the bottom row
     */
    public int getRow() {
        return row;
    }

    /**
     * @return which column this position is in
     * 1 codes for the left row
     */
    public int getColumn() {
        return column;
    }
}
