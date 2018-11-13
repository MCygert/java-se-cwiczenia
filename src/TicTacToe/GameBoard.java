package TicTacToe;

public class GameBoard {
    private char[][] array;


    public GameBoard(int height) {
        if (height < 3) {
            this.array = new char[3][3];
            this.array = emptyGameBoard(array);
        }
        this.array = new char[height][height];
        this.array = emptyGameBoard(array);
    }

    public char[][] getArray() {
        return array;
    }

    public void setArray(char[][] array) {
        this.array = array;
    }

    private char[][] emptyGameBoard(char[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard.length; j++) {
                gameBoard[i][j] = '?';
            }
        }
        return gameBoard;
    }

}
