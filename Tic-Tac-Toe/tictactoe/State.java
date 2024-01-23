package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    
    public int getGameState() {
        return this.gameState;
    }
    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    public String getOName() {
        return this.oName;
    }
    public void setOname(String oName) {
        this.oName = oName;
    }
    public String getXName() {
        return this.xName;
    }
    public void setXname(String xName) {
        this.xName = xName;
    }
    public int getWhoseMove() {
        return this.whoseMove;
    }
    public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }
    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }
    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }
    public boolean isWinner() {
        boolean isWinner = false;
        int gridTally;
        if (IntStream.of(board).sum() != 0) {
            
        }
        for (int i = 0; i <= 2; i++) {
            gridTally = 0;
            for (int j = 0; j <= 2; j++) {
                gridTally += board[i][j];
            }
            if (gridTally == 3 || gridTally == -3) {
                isWinner = true;
            }
        }
        for (int i = 0; i <= 2; i++) {
            gridTally = 0;
            for (int j = 0; j <= 2; j++) {
                gridTally += board[j][i];
            }
            if (gridTally == 3 || gridTally == -3) {
                isWinner = true;
            }
        }
        for (int i = 0; i <= 2; i++) {
            gridTally = 0;
            gridTally += board[i][i];
            if (gridTally == 3 || gridTally == -3) {
                isWinner = true;
            }
        }
        for (int i = 0; i <= 2; i++) {
            gridTally = 0;
            gridTally += board[i][-i+2];
            if (gridTally == 3 || gridTally == -3) {
                isWinner = true;
            }
        }
        return isWinner;
    }
    public boolean isTie
}

