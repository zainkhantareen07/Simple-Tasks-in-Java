import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char player = 'X';
        int moves = 0;

        while (true) {

            printBoard();

            System.out.println("Player " + player + "'s Turn");
            System.out.print("Enter row (0-2): ");
            int row = input.nextInt();

            System.out.print("Enter column (0-2): ");
            int col = input.nextInt();

            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid Position! Try Again.");
                continue;
            }

            if (board[row][col] != ' ') {
                System.out.println("Cell Already Occupied! Try Again.");
                continue;
            }

            board[row][col] = player;
            moves++;

            if (checkWinner(player)) {
                printBoard();
                System.out.println("🎉 Player " + player + " Wins!");
                break;
            }

            if (moves == 9) {
                printBoard();
                System.out.println("🤝 Match Draw!");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        input.close();
    }

    public static void printBoard() {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");

                if (j < 2)
                    System.out.print("|");
            }

            System.out.println();

            if (i < 2)
                System.out.println("---+---+---");
        }

        System.out.println();
    }

    public static boolean checkWinner(char player) {

        // Check Rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Check Columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }

        // Check Diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        // Check Anti-Diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }
}