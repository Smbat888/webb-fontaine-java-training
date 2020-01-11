package Chess;

import Figures.*;

public class GameSetup {

    private Board board;
    private King player1King;
    private King player2King;

    GameSetup() {
        board = new Board();
        setupTeam(0, "player1");
        setupTeam(7, "player2");
    }

    private void setupTeam(int side, String player) {
        int one = (side > 0) ? -1: 1;
        int colIncerment = 0;

        Figure rook1 = new Rook(player, new Position(side, colIncerment), this);
        Figure rook2 = new Rook(player, new Position(side, 7-colIncerment), this);
        colIncerment += 1;

        Figure horse1 = new Horse(player, new Position(side, colIncerment), this);
        Figure horse2 = new Horse(player, new Position(side, 7-colIncerment), this);
        colIncerment += 1;

        Figure bishop1 = new Bishop(player, new Position(side, colIncerment), this);
        Figure bishop2 = new Bishop(player, new Position(side, 7-colIncerment), this);
        colIncerment += 1;

        if (player.equalsIgnoreCase("player1")) {
            player1King = new King(player, new Position(side, colIncerment), this);
        } else {
            player2King = new King(player, new Position(side, colIncerment), this);
        }

        Figure queen = new Queen(player, new Position(side, 7-colIncerment), this);

        for (int i = 0; i < 8; i++) {
            Figure pawn = new Peshka(player, new Position(side + one, i), this);
        }
    }

    public Board getBoard() {
        return board;
    }

    King getPlayer1King() {
        return player1King;
    }

    King getPlayer2King() {
        return player2King;
    }
}
