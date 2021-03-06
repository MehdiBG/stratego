package be.ac.umons.stratego.board;

import be.ac.umons.stratego.pawn.Cell;
import be.ac.umons.stratego.pawn.Direction;

/**
 * Created by marco on 11/05/15.
 */

/**
 * this class determines if someone win and who win
 */
public class Victory {

    /**
     * This method determines if the flag of a squad has been token
     * @param squad represents the squad thaht we want to analyse
     * @param plateau represents the game board
     * @return Whether the flag is not taken by the over squad
     */
    public static boolean FlagDisponible ( String squad,BaseBoard plateau){
        if (squad.equals("Friend")){
             for (int i = 8;i<10;i++) { // regarde si le drapeau est toujours présent
                 for (int j=0;j<10;j++) {
                     Cell cell = plateau.board[i][j];
                     if (cell!=null  && cell.getThispiece().toString().equals("FLAG")) // on ne regarde pas l'équipe car le flag est toujours soit en haut soit en bas
                             return true;
                 }
             }
            return false;
        }
        else {
            for (int i = 0;i<4;i++) { // regarde si le drapeau est toujours présent
                for (int j=0;j<10;j++) {
                    Cell cell = plateau.board[i][j];
                    if (cell!=null && cell.getThispiece().toString().equals("FLAG"))
                        return true;
                }
            }
            return false;
        }
    }

    /**
     * this method analyse if one of the friend pawns(player squad) can move
     * @param plateau represents the game board
     * @return Whether one pawn can move in the player squad
     */
    public static boolean MyPawnsCanMoves( BaseBoard plateau){

        for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                Cell cell = plateau.board[i][j];
                if ((cell!=null) &&  cell.getThisriverpiece()==null && (cell.getThispiece().getSquad().equals("Friend")) &&
                        (cell.getThispiece().deplacementPossible(Direction.NORTH, plateau, 1)
                            || cell.getThispiece().deplacementPossible(Direction.SOUTH, plateau, 1)
                            || cell.getThispiece().deplacementPossible(Direction.EAST, plateau, 1)
                            || cell.getThispiece().deplacementPossible(Direction.WEST, plateau, 1)))  
                	return true;
              }
        }
        return false;
    }

    /**
     * this method analyse if one of the Ennemy pawns(computer squad) can move
     * @param plateau represents the game board
     * @return Whether one pawn can move in the player squad
     */
    public static boolean ComputerPawnsCanMoves( BaseBoard plateau) {
    	for (int i=0;i<10;i++) {
            for (int j=0;j<10;j++) {
                Cell cell = plateau.board[i][j];
                if ((cell!=null) &&  cell.getThisriverpiece()==null && (cell.getThispiece().getSquad().equals("Friend")) &&
                        (cell.getThispiece().deplacementPossible(Direction.NORTH, plateau, 1)
                                || cell.getThispiece().deplacementPossible(Direction.SOUTH, plateau, 1)
                                || cell.getThispiece().deplacementPossible(Direction.EAST, plateau, 1)
                                || cell.getThispiece().deplacementPossible(Direction.WEST, plateau, 1)))
                    return true;
            }
    	}
    	return false;
    }
}
