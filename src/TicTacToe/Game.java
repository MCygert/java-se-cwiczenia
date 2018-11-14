package TicTacToe;

public class Game {
    private Player playerX;
    private Player playerY;
    private Player activePlayer;
    private GameBoard gameBoard;
    private ConsoleReader scanner;
    private boolean activeGame = true;

    public Game() {
        gameBoard = new GameBoard(3);
        scanner = new ConsoleReader();
    }

    public void play() {
        initPlayer();
        activePlayer = playerX;
        while (activeGame) {
            System.out.println("Give coordinates of player " + activePlayer.getMark());
            int coordinateX = scanner.ReadInteger();
            int coordinateY = scanner.ReadInteger();

            gameBoard.setMark(coordinateX, coordinateY, activePlayer.getMark());
            System.out.println(gameBoard.toString());
            if (gameBoard.isWin(activePlayer.getMark())) {
                System.out.println("Player: " + activePlayer + " won");
                activeGame = false;
                break;

            } else if (gameBoard.isFull()) {
                System.out.println("Draw");
                activeGame = false;
                break;
            } else {
                activePlayer = (activePlayer == playerX) ? playerY : playerX;
            }

        }
    }

    //Initializing players
    private void initPlayer() {
        System.out.println("Give name player X");
        String playerXname = scanner.ReadString();
        playerX = new Player(playerXname, Mark.X);

        System.out.println("Give name player O");
        String playerYname = scanner.ReadString();
        playerY = new Player(playerYname, Mark.O);
    }
}
