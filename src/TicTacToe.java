
/**
 * Created by yasemin on 7/31/14.
 */

public class TicTacToe {
    private char[][] table;

    TicTacToe() {
    }

    TicTacToe(int size) {
        table = new char[size][size];

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                table[i][j] = '-';
            }
        }
    }

    TicTacToe(char[][] initialState) {
        this.table = initialState;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < table.length; ++i) {
            for (int j = 0; j < table.length; ++j) {
                result += table[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public int move(Character choice, int row, int col) {
        if ((col > table.length) || (row > table.length)) {
            throw new IllegalArgumentException("Col or row is bigger than size");
        }

        table[row][col] = choice;
        int win = 1;
        int over = -1;
        int result = over;

        if (row == col) {
            if (checkDiagonal('x') || checkDiagonal('o')) {
                result = win;
            }
        }

        if (table.length - 1 - row == col) {
            if (checkReverseDiagonal('x') || checkReverseDiagonal('o')) {
                result = win;
            }
        }

        if (checkHorizontal('x', row) || checkHorizontal('o', row)) {
            result = win;
        }
        if (checkvertical('x', col) || checkvertical('o', col)) {
            result = win;
        }

        return result;
    }

    boolean checkHorizontal(char c, int row) {
        int horizontalCount = 0;
        boolean result = false;

        int size = table.length;

        for (int j = 0; j < table.length; ++j) {
            if (table[row][j] != c) {
                break;
            } else {
                horizontalCount++;
            }
        }
        if (horizontalCount == table.length) {
            result = true;
        }

        return result;
    }

    boolean checkvertical(char c, int column) {
        int verticalCount = 0;
        boolean result = false;

        for (int i = 0; i < table.length; ++i) {
            if (table[i][column] != c) {
                break;
            } else {
                verticalCount++;
            }
        }
        if (verticalCount == table.length) {
            result = true;
        }
        return result;
    }

    boolean checkDiagonal(char c) {
        int diagonalCount = 0;
        boolean result = false;

        for (int i = 0; i < table.length; ++i) {
            if (table[i][i] == c) {
                diagonalCount++;
            }
            if (diagonalCount == table.length) {
                result = true;
                break;
            }
        }

        return result;
    }

    boolean checkReverseDiagonal(char c) {
        int reverseDiagonalCount = 0;
        boolean result = false;
        int j = table.length - 1;

        for (int i = 0; i < table.length; ++i) {
            if (table[i][j] == c) {
                reverseDiagonalCount++;
            }
            if (reverseDiagonalCount == table.length) {
                result = true;
                break;
            }
            j--;
        }

        return result;
    }

    int test() {
        TicTacToe t = new TicTacToe(new char[][]{
                {'x', '-', 'x'},
                {'-', '-', '-'},
                {'x', '-', 'x'}
        });

        System.out.println(t.toString());
        int result = t.move('x', 1, 0);
        System.out.println(t.toString());

        return result;
    }

    int test2() {
        TicTacToe t = new TicTacToe(new char[][]{
                {'x', '-', 'x'},
                {'-', 'x', '-'},
                {'x', '-', 'x'}
        });

        System.out.println(t.toString());
        int result = t.move('x', 1, 2);
        System.out.println(t.toString());

        return result;
    }

    int test3() {
        TicTacToe t = new TicTacToe(new char[][]{
                {'x', '-', 'x'},
                {'-', '-', '-'},
                {'x', '-', 'x'}
        });

        System.out.println(t.toString());
        int result = t.move('x', 1, 1);
        System.out.println(t.toString());

        return result;
    }

    int test4() {
        TicTacToe t = new TicTacToe(new char[][]{
                {'x', '-', 'x', '-'},
                {'-', '-', '-', '-'},
                {'x', '-', 'x', '-'},
                {'x', '-', 'x', '-'},
        });

        System.out.println(t.toString());
        int result = t.move('x', 1, 1);
        System.out.println(t.toString());

        return result;
    }

    int test5() {
        TicTacToe t = new TicTacToe(new char[][]{
                {'x', '-', 'x', '-'},
                {'-', '-', '-', '-'},
                {'x', '-', 'x', '-'},
                {'x', '-', 'x', '-'},
        });

        System.out.println(t.toString());
        int result = t.move('x', 3, 1);
        System.out.println(t.toString());

        return result;
    }

    void testAllCases() {
        TicTacToe t = new TicTacToe(3);
        System.out.println(t.toString());
        /*
        System.out.println(t.move('x', 0, 0));
        System.out.println(t.move('x', 0, 1));
        System.out.println(t.move('x', 0, 2));
        */
        /*
        System.out.println(t.move('x', 1, 0));
        System.out.println(t.move('x', 1, 1));
        System.out.println(t.move('x', 1, 2));
        */
        /*
        System.out.println(t.move('x', 2, 0));
        System.out.println(t.move('x', 2, 1));
        System.out.println(t.move('x', 2, 2));
        */
        /*
        System.out.println(t.move('x', 0, 0));
        System.out.println(t.move('x', 1, 0));
        System.out.println(t.move('x', 2, 0));
        */
        /*
        System.out.println(t.move('x', 0, 1));
        System.out.println(t.move('x', 1, 1));
        System.out.println(t.move('x', 2, 1));
        */
        /*
        System.out.println(t.move('x', 0, 2));
        System.out.println(t.move('x', 1, 2));
        System.out.println(t.move('x', 2, 2));
        */
        /*
        System.out.println(t.move('x', 0, 0));
        System.out.println(t.move('x', 1, 1));
        System.out.println(t.move('x', 2, 2));
        */
        /*
        System.out.println(t.move('x', 0, 2));
        System.out.println(t.move('x', 1, 1));
        System.out.println(t.move('x', 2, 0));
        */
        System.out.println(t.toString());
    }

    public static void main(String args[]) {
        TicTacToe t = new TicTacToe();
        t.testAllCases();
        /*System.out.println(t.test());
        System.out.println(t.test2());
        System.out.println(t.test3());
        System.out.println(t.test4());*/
        System.out.println(t.test5());
    }
}