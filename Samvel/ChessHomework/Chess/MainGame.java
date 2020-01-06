package Chess;
import java.util.*;

import Figures.*;


public class MainGame {

    public static void main(String[] args) {
        GameSetup gameSetup = new GameSetup();
        boolean gameOver = false;
        String currentPlayer = "player1";
        Scanner scanner = new Scanner(System.in);
        String input;

        Position newLocation;
        Figure currentPiece;
        King king;

        while(!gameOver){
            try {
                System.out.println(gameSetup.getBoard().toString());
                System.out.println(currentPlayer + "'s Turn:");
                System.out.println("M - Move a piece");
                System.out.println("Q - Quit game");
                System.out.println("R - Reset the game");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("Q") || input.equalsIgnoreCase("QUIT")) {
                    gameOver = true;
                    System.out.println("===== GAME HAS ENDED =====");
                    continue;
                } else if (input.equalsIgnoreCase("R") || input.equalsIgnoreCase("RESTART")) {
                    gameSetup = new GameSetup();
                    System.out.println("===== GAME RESTARTED =====");
                    continue;
                } else if (input.equalsIgnoreCase("M") || input.equalsIgnoreCase("MOVE")) {

                    if (currentPlayer.equals("player1")) {
                        king = gameSetup.getPlayer1King();
                    } else {
                        king = gameSetup.getPlayer2King();
                    }
                    Figure danger = king.check();
                    if (danger != null) {
                        System.out.println("Your King is in Check from piece at: (" + danger.getPosition().getRow() + ", " + danger.getPosition().getCol() + ").");
                    }

                    currentPiece = getCurrentPiece(gameSetup, currentPlayer);
                    newLocation = getNewLocation();

                    if (currentPiece.moveTo(newLocation)) {
                        currentPlayer = (currentPlayer.equalsIgnoreCase("player1")) ? "player2": "player1";
                    } else {
                        System.out.println("Move was invalid, try again.");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
                System.out.println("Couldn't parse input.");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("NullPointerException :(, GL Debugging");
                e.printStackTrace();
            }
        }
    }

    private static Figure getCurrentPiece(GameSetup gameSetup, String currentPlayer) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Position currentLocation;
        Figure currentPiece;

        while (true) {
            System.out.println("Move from: row, col");
            input = scanner.nextLine();
            currentLocation = createChessLocation(input);
            if (!Board.locationInBounds(currentLocation)) {
                System.out.println("Location not on board, try again.");
                continue;
            }
            currentPiece = gameSetup.getBoard().getFigureAt(currentLocation);
            if (currentPiece == null) {
                System.out.println("Invalid piece selected, out of bounds.");
            } else if (currentPiece.getOwner().equalsIgnoreCase(currentPlayer)) {
                return currentPiece;
            } else {
                System.out.println("Invalid piece selected, not your piece.");
            }
        }
    }

    private static Position getNewLocation() {
        Scanner scanner = new Scanner(System.in);
        String input;

        Position newLocation;

        while (true) {
            System.out.println("Move to: row, col");
            input = scanner.nextLine();
            newLocation = createChessLocation(input);
            if (!Board.locationInBounds(newLocation)) {
                System.out.println("Invalid location selected, out of bounds.");
            } else {
                return newLocation;
            }
        }
    }

    private static Position createChessLocation(String input) {
        int row = Integer.parseInt(input.split(",")[0].trim());
        int col = Integer.parseInt(input.split(",")[1].trim());
        return new Position(row, col);
    }
}
