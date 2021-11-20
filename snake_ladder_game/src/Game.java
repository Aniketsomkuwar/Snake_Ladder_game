
public class Game {

    public static int rollDice() {
        return (int) (Math.random() * 7);
    }


    public static void main(String[] args) {

        int[][] board = new int[10][10];

        int count = 1;
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                board[i][j] = count++;
            }
        }


        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
