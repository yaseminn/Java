public class TicTacToe {

    class Counters {
        int[] rowCounters;
        int[] colCounters;
        int diagonalCounter;
        int reverseDiagonalCounter;

        Counters(int size) {
            rowCounters = new int[size];
            colCounters = new int[size];
        }
    }

    char[][] board;
    Counters xCounters;
    Counters oCounters;

    public TicTacToe(int size) {
        board = new char[size][size];
        xCounters = new Counters(size);
        oCounters = new Counters(size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 0) {
                    sb.append(board[i][j]);
                } else {
                    sb.append('-');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

// O(n)
public boolean moveOn(char player, int row, int col) {
    board[row][col] = player;
    int count = 0;
    // Check horizontal
    for (int i = 0; i < board.length; i++) {
      if (board[row][i] != player) {
        break;
      }
	count++;
    }
    if (count == board.length) {
	return true;
    }
    count = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][col] == player) {
		break;
      }
      count++;
    }
    if (count == board.length) {
	return true;
    }
    // I omitted diagonal checks for simplicity.
      
    return false;
  }


    // O(1), but requires size * 4 counters.
    public boolean moveO1(char player, int row, int col) {
        board[row][col] = player;
        Counters c = player == 'x' ? xCounters : oCounters;
        c.colCounters[col]++;
        c.rowCounters[row]++;
        if (row == col) {
            c.diagonalCounter++;
        }
        if (row == board.length - 1 - col) {
            c.reverseDiagonalCounter++;
        }
        if ( c.colCounters[col] == board.length ||
                c.rowCounters[row] == board.length ||
                c.diagonalCounter == board.length ||
                c.reverseDiagonalCounter == board.length
                ) {
            return true;
        }
        return false;
    }

    void simulateMoves(char[][] initialState) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (initialState[i][j] != '-') {
                    moveO1(initialState[i][j], i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe(3);
        ttt.simulateMoves(new char[][]{
                {'x', 'o', '-'},
                {'x', '-', 'o'},
                {'-', '-', 'o'}
        });
        if (ttt.moveO1('x', 2, 0)) {
            System.out.println("x won.");
        }

        ttt = new TicTacToe(3);
        ttt.simulateMoves(new char[][]{
                {'x', 'o', '-'},
                {'-', '-', 'o'},
                {'-', '-', 'o'}
        });
        if (!ttt.moveO1('x', 2, 0)) {
            System.out.println("x did not win.");
        }
    }

}

