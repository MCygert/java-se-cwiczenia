
package TicTacToe;

public class GameBoard {
    private Mark[][] array;


    public GameBoard(int height) {
        //If user gives too small gameboard it makes default 3x3
        if (height < 3) {
            height = 3;
        }

        this.array = new Mark[height][height];
        emptyGameBoard();
    }

    public Mark[][] getArray() {
        return array;
    }

    public void setArray(Mark[][] array) {
        this.array = array;
    }

    //Creating emptygameboard filled with enums Mark.EMPTY
    private void  emptyGameBoard() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Mark.EMPTY;
            }
        }

    }


    @Override
    public String toString() {
        String boardString = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                switch (array[i][j]) {
                    case O:
                        boardString += 'O';
                        break;
                    case X:
                        boardString += 'X';
                        break;
                    case EMPTY:
                        boardString += '?';
                        break;
                }
            }
            boardString += '\n';
        }
        return boardString;
    }

    public boolean isEmpty(int X, int O) {
        if (array[X][O] != Mark.EMPTY) {
            return false;
        } else {
            return true;
        }

    }

    public void setMark(int X, int O, Mark mark) {
        if (isEmpty(X, O)) {
            array[X][O] = mark;
        }

    }

    public boolean isWin(Mark mark) {
        return winConditions(mark);
    }

    private boolean winConditions(Mark mark) {
        boolean ifWin = true;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //X dimension win
                if (array[j][i] != mark) {
                    ifWin = false;
                    break;
                    //Y dimension win
                } else if (array[i][j] != mark) {
                    ifWin = false;
                    break;
                    //Angle dimension win
                } else if (array[i][i] != mark) {
                    ifWin = false;
                    break;
                }
            }
        }
        return ifWin;
    }


    public boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == Mark.EMPTY) ;
                isFull = false;
                break;
            }
        }
        return isFull;
    }
}
