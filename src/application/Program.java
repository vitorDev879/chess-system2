package application;

import boardgame.Board;
import chess.ChessMatch;

import javax.swing.text.Position;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
