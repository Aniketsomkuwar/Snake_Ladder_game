import java.util.Scanner;

public class Game {

    public static int rollDice() {
        int n = (int) (Math.random() * 7);
        return (n == 0 ? 1 : n);

    }

    public static int[][] Board() {
        int[][] board = new int[10][10];

        int count = 100;
        for (int i = 0; i < board.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = count--;
                }
            } else {
                for (int j = board.length - 1; j > -1; j--) {
                    board[i][j] = count--;
                }
            }
        }
        return board;
    }

    public static void DisplayBoard(int[][] board, Player p1, Player p2) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (p1.getPlayerPosition() == p2.getPlayerPosition() && p1.getPlayerPosition() > 1) {
                    System.out.println(board[i][j] + "<- both ");
                    continue;
                }
                if (p1.getPlayerPosition() == board[i][j] && p1.getPlayerPosition() > 1) {
                    System.out.print(board[i][j] + "<-P ");
                } else if (p2.getPlayerPosition() == board[i][j] && p1.getPlayerPosition() > 1) {
                    System.out.print(board[i][j] + "<-C ");
                } else {
                    System.out.print(board[i][j] + "   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Snake and Ladder Game");
//        System.out.println("enter player name");

        Player player1 = new Player("Aniket", 'P');
        Player player2 = new Player("Computer", 'C');

        int[][] board = Board();
        player1.setPlayerPosition(20);
        player2.setPlayerPosition(47);
        DisplayBoard(board, player1, player2);
//       while(player1.getPlayerPosition()!=100 && player2.getPlayerPosition()!=100){
//
//
//       }


    }
}
