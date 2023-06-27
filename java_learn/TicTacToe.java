import java.util.Scanner;

public class TicTacToe { 
    private static final char PLAYER_X = 'X'; 
    private static final char PLAYER_O = 'O'; 
    private static final char EMPTY_SPACE = ' '; 
    private static char[][] board = new char[3][3]; 
    private static Scanner scanner = new Scanner(System.in);

// 初始化棋盘
public static void initBoard() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = EMPTY_SPACE;
        }
    }
}

// 打印棋盘
public static void printBoard() {
    System.out.println("-------------");
    for (int i = 0; i < 3; i++) {
        System.out.print("| ");
        for (int j = 0; j < 3; j++) {
            System.out.print(board[i][j] + " | ");
        }
        System.out.println();
        System.out.println("-------------");
    }
}

// 玩家下棋
public static void playerMove(char player) {
    boolean validInput = false;
    do {
        if (player == PLAYER_X) {
            System.out.println("Player 'X', enter your move (row[1-3] column[1-3]): ");
        } else {
            System.out.println("Player 'O', enter your move (row[1-3] column[1-3]): ");
        }
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY_SPACE) {
            board[row][col] = player;
            validInput = true;
        } else {
            System.out.println("Move invalid. Please try again...");
        }
    } while (!validInput);
}

// 检查游戏是否结束
public static boolean checkGameOver() {
    // 检查横向
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != EMPTY_SPACE) {
            return true;
        }
    }
    // 检查纵向
    for (int i = 0; i < 3; i++) {
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != EMPTY_SPACE) {
            return true;
        }
    }
    // 检查对角线
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != EMPTY_SPACE) {
        return true;
    }
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != EMPTY_SPACE) {
        return true;
    }
    return false;
}

public static void main(String[] args) {
    initBoard();
    printBoard();
    while (true) {
        playerMove(PLAYER_X);
        printBoard();
        if (checkGameOver()) {
            System.out.println("Player 'X' won!");
            break;
        }
        if (checkDraw()) {
            System.out.println("Draw!");
            break;
        }
        playerMove(PLAYER_O);
        printBoard();
        if (checkGameOver()) {
            System.out.println("Player 'O' won!");
            break;
        }
        if (checkDraw()) {
            System.out.println("Draw!");
            break;
        }
    }
}

// 检查和棋
public static boolean checkDraw() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == EMPTY_SPACE) {
                return false;
            }
        }
    }
    return true;
}
}