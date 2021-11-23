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
                if (p1.getPlayerPosition() == p2.getPlayerPosition() && p1.getPlayerPosition() == board[i][j]) {
                    System.out.print(" C->" + board[i][j] + "<-P ");

                } else if (p1.getPlayerPosition() == board[i][j] && p1.getPlayerPosition() > 1) {
                    System.out.print(board[i][j] + "<-P ");
                } else if (p2.getPlayerPosition() == board[i][j] && p2.getPlayerPosition() > 1) {
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

            Player player1 = new Player(sc.next());
            Player player2 = new Player("Computer");
            while (player1.getPlayerPosition() != 100 && player2.getPlayerPosition() != 100) {
                int Dice = 0;
                if (turn == 1) {
                    System.out.println("press 1 to roll the dice");
                    if (sc.nextInt() == 1) {

                        Dice = rollDice();
                    } else {
                        System.out.println("roll Dice again");
                        continue;
                    }
                }
                if (turn == 1) {

                    System.out.println(Dice + " came <- " + player1.getPlayerName());

                    int playerpos = player1.getPlayerPosition();
                    if (playerpos + Dice > 100) {
                        System.out.println("opps number excedded ! play in next turn ");
                        turn = 0;
                        continue;

                    }
                    IncreasePosition(Dice, player1);
                    if (playerpos == 4) {
                        player1.setPlayerPosition(14);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 9) {
                        player1.setPlayerPosition(31);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 20) {
                        player1.setPlayerPosition(38);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 28) {
                        player1.setPlayerPosition(84);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 40) {
                        player1.setPlayerPosition(59);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 51) {
                        player1.setPlayerPosition(67);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 63) {
                        player1.setPlayerPosition(81);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 71) {
                        player1.setPlayerPosition(91);
                        System.out.println("ohh " + player1.getPlayerName() + " took the ladder");
                    } else if (playerpos == 17) {
                        DecreasePosition(7, player1);
                    } else if (playerpos == 62) {
                        DecreasePosition(19, player1);
                    } else if (playerpos == 87) {
                        DecreasePosition(24, player1);
                    } else if (playerpos == 64) {
                        DecreasePosition(60, player1);
                    } else if (playerpos == 54) {
                        DecreasePosition(34, player1);
                    } else if (playerpos == 93) {
                        DecreasePosition(73, player1);
                    } else if (playerpos == 97) {
                        DecreasePosition(76, player1);
                    }
                    turn = 0;
                } else {
                    Dice = rollDice();
                    System.out.println(Dice + " came <- " + player2.getPlayerName());

                   
                    int playerpos = player2.getPlayerPosition();
                    if (playerpos + Dice > 100) {
                        System.out.println("opps number excedded ! play in next turn ");
                        turn = 1;
                        continue;

                    } IncreasePosition(Dice, player2);
                    if (playerpos == 4) {
                        player2.setPlayerPosition(14);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 9) {
                        player2.setPlayerPosition(31);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 20) {
                        player2.setPlayerPosition(38);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 28) {
                        player2.setPlayerPosition(84);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 40) {
                        player2.setPlayerPosition(59);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 51) {
                        player2.setPlayerPosition(67);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 63) {
                        player2.setPlayerPosition(81);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 71) {
                        player2.setPlayerPosition(91);
                        System.out.println("ohh " + player2.getPlayerName() + " took the ladder");
                    } else if (playerpos == 17) {
                        DecreasePosition(7, player2);
                    } else if (playerpos == 62) {
                        DecreasePosition(19, player2);
                    } else if (playerpos == 87) {
                        DecreasePosition(24, player2);
                    } else if (playerpos == 64) {
                        DecreasePosition(60, player2);
                    } else if (playerpos == 54) {
                        DecreasePosition(34, player2);
                    } else if (playerpos == 93) {
                        DecreasePosition(73, player2);
                    } else if (playerpos == 97) {
                        DecreasePosition(76, player2);
                    }
                    turn = 1;
                    if(player1.getPlayerPosition()==100 || player2.getPlayerPosition()==100){
                        break;
                    }
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
