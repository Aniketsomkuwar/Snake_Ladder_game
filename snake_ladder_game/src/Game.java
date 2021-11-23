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
                if (p1.getPlayerPosition() == board[i][j] && p1.getPlayerPosition() > 1) {
                    System.out.print(board[i][j] + "<-P ");
                } else if (p2.getPlayerPosition() == board[i][j] && p1.getPlayerPosition() > 1) {
                    System.out.print(board[i][j] + "<-C ");
                } else {
                    System.out.print(board[i][j] + "    ");
                }
            }
            System.out.println();
        }
    }

    public static void IncreasePosition(int dice, Player p) {
        p.setPlayerPosition(p.getPlayerPosition() + dice);
    }

    public static void DecreasePosition(int data, Player p) {
        p.setPlayerPosition(data);
        System.out.println("Opps snake swallon " + p.getPlayerName());
    }


    public static void main(String[] args) {


        int[][] board = Board();
        int turn = 1;
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("welcome to Snake and Ladder Game");
            System.out.println("enter player name");

            Player player1 = new Player(sc.next(), 'P');
            Player player2 = new Player("Computer", 'C');
            while (player1.getPlayerPosition() != 100 && player2.getPlayerPosition() != 100) {
                int Dice = rollDice();
                if (turn == 1) {

                    System.out.println(Dice + " came <- " + player1.getPlayerName());

                    IncreasePosition(Dice, player1);
                    if (player1.getPlayerPosition() + Dice > 100) {
                        System.out.println("opps number excedded ! play in next turn ");
                        turn = 0;
                        continue;

                    }
                    if (player1.getPlayerPosition() == 4) {
                        player1.setPlayerPosition(14);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 9) {
                        player1.setPlayerPosition(31);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 20) {
                        player1.setPlayerPosition(38);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 28) {
                        player1.setPlayerPosition(84);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 40) {
                        player1.setPlayerPosition(59);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 51) {
                        player1.setPlayerPosition(67);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 63) {
                        player1.setPlayerPosition(81);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 71) {
                        player1.setPlayerPosition(91);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (player1.getPlayerPosition() == 17) {
                        DecreasePosition(7, player1);
                    } else if (player1.getPlayerPosition() == 62) {
                        DecreasePosition(19, player1);
                    } else if (player1.getPlayerPosition() == 87) {
                        DecreasePosition(24, player1);
                    } else if (player1.getPlayerPosition() == 64) {
                        DecreasePosition(60, player1);
                    } else if (player1.getPlayerPosition() == 54) {
                        DecreasePosition(34, player1);
                    } else if (player1.getPlayerPosition() == 93) {
                        DecreasePosition(73, player1);
                    } else if (player1.getPlayerPosition() == 97) {
                        DecreasePosition(76, player1);
                    }
                    turn = 0;
                } else {
                    System.out.println(Dice + " came <- " + player2.getPlayerName());
                    if (player2.getPlayerPosition() + Dice > 100) {
                        System.out.println("opps number excedded !");
                        turn = 1;
                        continue;
                    }

                    IncreasePosition(Dice, player2);

                    if (player2.getPlayerPosition() == 4) {
                        player2.setPlayerPosition(14);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 9) {
                        player2.setPlayerPosition(31);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 20) {
                        player2.setPlayerPosition(38);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 28) {
                        player2.setPlayerPosition(84);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 40) {
                        player2.setPlayerPosition(59);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 51) {
                        player2.setPlayerPosition(67);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 63) {
                        player2.setPlayerPosition(81);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 71) {
                        player2.setPlayerPosition(91);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (player2.getPlayerPosition() == 17) {
                        DecreasePosition(7, player2);
                    } else if (player2.getPlayerPosition() == 62) {
                        DecreasePosition(19, player2);
                    } else if (player2.getPlayerPosition() == 87) {
                        DecreasePosition(24, player2);
                    } else if (player2.getPlayerPosition() == 64) {
                        DecreasePosition(60, player2);
                    } else if (player2.getPlayerPosition() == 54) {
                        DecreasePosition(34, player2);
                    } else if (player2.getPlayerPosition() == 93) {
                        DecreasePosition(73, player2);
                    } else if (player2.getPlayerPosition() == 97) {
                        DecreasePosition(76, player2);
                    }
                    turn = 1;
                }

                DisplayBoard(board, player1, player2);
                System.out.println();

            }
            if (player1.getPlayerPosition() == 100) {
                System.out.println("hoorah you Won!!!!!!");
            } else {
                System.out.println("you lose");
            }

            System.out.println("do you want to play again  Y <--YES  And N <--NO ");
            char decision = sc.next().charAt(0);
            if (decision == 'Y' || decision == 'y') {
                flag = true;

            } else if (decision == 'N' || decision == 'n') {
                flag = false;
                System.out.println("Thankyou for playing");
            } else {
                flag = false;
                System.out.println("Invalid Entry");
            }

        }

    }
}
