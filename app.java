public class TicTacToe {
    // 2D Array - Board representation
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe UC1");
        
        initializeBoard(); // UC1 Flow: Program initializes board
        displayBoard();    // UC1 Flow: Program prints empty board
    }

    /**
     * Initialization Logic: Fills all cells with '-'
     */
    private static void initializeBoard() {
        // Nested loops to iterate through each cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    /**
     * Console Output Formatting: Prints the board clearly
     */
    private static void displayBoard() {
        System.out.println("\nCurrent Empty Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Print cell value followed by space for visibility
                System.out.print(board[i][j] + " ");
            }
            // New line after each row
            System.out.println();
        }
    }
}
