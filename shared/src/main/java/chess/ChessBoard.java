package chess;

/**
 * A chessboard that can hold and rearrange chess pieces.
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessBoard {
    private final ChessPiece[][] board;

    public ChessBoard() {
        board = ChessPiece[8][8];
        //or chessboard?
    }

    /**
     * Adds a chess piece to the chessboard
     *
     * @param position where to add the piece to
     * @param piece    the piece to add
     */
    public void addPiece(ChessPosition position, ChessPiece piece) {

        board[position.getRow()-1][position.getColumn()-1]= piece;

    }

    /**
     * Gets a chess piece on the chessboard
     *
     * @param position The position to get the piece from
     * @return Either the piece at the position, or null if no piece is at that
     * position
     */
    public ChessPiece getPiece(ChessPosition position) {

        return board[position.getRow()-1][position.getColumn()-1];
    }

    /**
     * Sets the board to the default starting board
     * (How the game of chess normally starts)
     */
    public void resetBoard() {

        //reset board, remember its col = 0; col<8, col++
        for (int row=0; row<8; row++){
            for (int col=0; col<8; row++){
                board[row][col] = null;
            }

        }
        //add pawns to front row (white and 2, black and 7)
        for (int col = 1; col<=8; col++){
            addPiece(new ChessPosition(2,col), new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN));
            addPiece(new ChessPosition(7,col), new ChessPiece(ChessGame.TeamColor.BLACK, ChessPiece.PieceType.PAWN));
        }

        //define back row
        ChessPiece.PieceType[] backRow = {
            ChessPiece.PieceType.ROOK,
            ChessPiece.PieceType.KNIGHT,
            ChessPiece.PieceType.BISHOP,
            ChessPiece.PieceType.QUEEN,
            ChessPiece.PieceType.KING,
            ChessPiece.PieceType.BISHOP,
            ChessPiece.PieceType.KNIGHT,
            ChessPiece.PieceType.ROOK
        };
        //add back row (w1 and b8)
        for (int col = 1; col<=8; col++){
            addPiece(new ChessPosition(1,col), new ChessPiece(ChessGame.TeamColor.WHITE, backRow[col -1]));
            addPiece(new ChessPosition(8,col), new ChessPiece(ChessGame.TeamColor.BLACK, backRow[col -1]));
        }
    }
}
