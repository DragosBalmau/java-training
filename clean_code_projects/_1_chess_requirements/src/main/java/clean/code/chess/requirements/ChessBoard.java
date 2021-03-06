package clean.code.chess.requirements;

import javax.sql.XAConnection;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int MIN_BOARD_HEIGHT = 0;
    public static int MIN_BOARD_WIDTH = 0;

    private Pawn[][] pieces;

    public ChessBoard() {

        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

<<<<<<< HEAD
        if (pieceColor == PieceColor.BLACK) {
            if ((xCoordinate == 6 || xCoordinate == 7) && IsLegalBoardPosition(xCoordinate, yCoordinate)) {
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
            }
        }
        else{
            if((xCoordinate == 0 || xCoordinate == 1) && IsLegalBoardPosition(xCoordinate,yCoordinate)){
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
=======
        if(!IsLegalBoardPosition(xCoordinate,yCoordinate)){
            pawn.setYCoordinate(-1);
            pawn.setXCoordinate(-1);
        }
        else{
            if((pieceColor == PieceColor.BLACK && xCoordinate == 6) || (pieceColor == PieceColor.WHITE && xCoordinate == 1)){
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
            }
            else{
                pawn.setYCoordinate(-1);
                pawn.setXCoordinate(-1);
>>>>>>> 8e40822823be5d14bb437fef49df0dcd56f4940c
            }
        }
    }

<<<<<<< HEAD

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate){
=======
    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
>>>>>>> 8e40822823be5d14bb437fef49df0dcd56f4940c

        if(xCoordinate > MAX_BOARD_HEIGHT || yCoordinate > MAX_BOARD_WIDTH || xCoordinate < MIN_BOARD_HEIGHT || yCoordinate < MIN_BOARD_WIDTH)
            return false;
        return true;
    }
}
