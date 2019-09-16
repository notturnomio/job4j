package ru.job4j.array;

/**
 * Program checks winning layout in Sokoban Game.
 *
 * @author Rustem Mukazhanov (r.mukazhanov@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MatrixCheck {
    /**
     * Method finds X character in rows and columns.
     *
     * @param board matrix size.
     * @return winning or not.
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                if (board[row][0] == 'X') {
                    result = true;
                    for (int i = 0; i < board.length; i++) {
                        if (board[row][i] != 'X') {
                            result = false;
                            break;
                        }
                    }
                }
                if (board[0][cell] == 'X') {
                    result = true;
                    for (int i = 0; i < board.length; i++) {
                        if (board[i][cell] != 'X') {
                            result = false;
                            break;
                        }
                    }
                }
            }
            System.out.println();
        }
        return result;
    }


    /**
     * Main method prints out various layouts of the game.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println("A board has a winner: " + win);
        System.out.println();
        char[][] hasWinHorizontal = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHorizontal);
        System.out.println("A board has a winner : " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', 'X', '_', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println("A board has a winner : " + lose);
    }
}
