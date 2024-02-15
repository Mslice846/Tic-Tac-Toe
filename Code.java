//                                      TICTACTOE WITH BOX
package com.company;

import java.util.Scanner;
import static java.lang.System.exit;
import static java.lang.System.setOut;

class Tictactoe {
    protected String [][] board=new String[3][3];
    Tictactoe() {
        System.out.println("\n                    Welcome to Tic Tac toe !....I'm Sure You Know How to Play It...So lets get started \n");
    }
    void start() {}
}
class gameplay extends Tictactoe {
    private int h=3,x=3,g=0,f=0;
    gameplay() {}
    void console() {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                board[i][j]="";
            }
        }
        for (int i=0;i<2;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print("      |\t\t|\n");
                System.out.print("-------------------\n");
            }
        }
    }

    Scanner s1=new Scanner(System.in);
    String a="O",b="X";
    protected int u=0,n=0,firstC,secondC;
    void gameStart() {
        System.out.println("");
            while(n<15) {
                while (u < 15) {
                    if ((u + n) % 2 == 0) {
                        System.out.println("It is Player " + b + "'s turn");
                        System.out.print(" Enter the 1st position in which u want to place your symbol : ");
                        firstC = s1.nextInt();
                        s1.nextLine();
                        System.out.print(" Enter the 2nd position in which u want to place your symbol : ");
                        secondC = s1.nextInt();
                        s1.nextLine();
                        System.out.println("");
                        while (board[firstC][secondC].equals(a) || board[firstC][secondC].equals(b)) {
                            if (board[firstC][secondC].equals(a)) {
                                System.out.println(" Sorry that place is already occupied by " + a);
                                System.out.print(" Enter the 1st position in which u want to place your symbol : ");
                                firstC = s1.nextInt();
                                s1.nextLine();
                                System.out.print(" Enter the 2nd position in which u want to place your symbol : ");
                                secondC = s1.nextInt();
                                s1.nextLine();
                                System.out.println("");
                            } else if (board[firstC][secondC].equals(b)) {
                                System.out.println("Sorry that place is already occupied by " + b);
                                System.out.println(" Enter the 1st position in which u want to place your symbol : ");
                                firstC = s1.nextInt();
                                s1.nextLine();
                                System.out.println(" Enter the 2nd position in which u want to place your symbol : ");
                                secondC = s1.nextInt();
                                s1.nextLine();
                                System.out.println("");
                            }

                        }
                        board[firstC][secondC] = b;
                        for (int i=0;i<3;i++) {
                            for (int j=0;j<3;j++) {
                                System.out.print(board[f][g]);
                                if(j!=2)
                                    System.out.print("   |    ");
                                g++;
                            }
                            System.out.print("\n-------------------\n");
                            g=0;
                            f++;
                        }
                        g=0;
                        f=0;
                    }
                    else {
                        System.out.println("It is player " + a + "'s turn");
                        System.out.print(" Enter the 1st position in which u want to place your symbol : ");
                        firstC = s1.nextInt();
                        s1.nextLine();
                        System.out.print(" Enter the 2nd position in which u want to place your symbol : ");
                        secondC = s1.nextInt();
                        s1.nextLine();
                        System.out.println("");
                        while (board[firstC][secondC].equals(a) || board[firstC][secondC].equals(b)) {
                            if (board[firstC][secondC].equals(a)) {
                                System.out.println(" Sorry that place is already occupied by " + a);
                                System.out.print(" Enter the 1st position in which u want to place your symbol : ");
                                firstC = s1.nextInt();
                                s1.nextLine();
                                System.out.print(" Enter the 2nd position in which u want to place your symbol : ");
                                secondC = s1.nextInt();
                                s1.nextLine();
                                System.out.println("");
                            } else if (board[firstC][secondC].equals(b)) {
                                System.out.println("Sorry that place is already occupied by " + b);
                                System.out.print(" Enter the 1st position in which u want to place your symbol : ");
                                firstC = s1.nextInt();
                                s1.nextLine();
                                System.out.print(" Enter the 2nd position in which u want to place your symbol : ");
                                secondC = s1.nextInt();
                                s1.nextLine();
                                System.out.println("");
                            }
                        }
                        board[firstC][secondC]=a;

                        for (int i=0;i<3;i++) {
                            for (int j=0;j<3;j++) {
                                System.out.print(board[f][g]);
                                if(j!=2)
                                System.out.print("   |    ");
                                g++;
                            }
                            System.out.print("\n-------------------\n");
                            g=0;
                            f++;
                        }
                        g=0;
                        f=0;
                    }
                    if ((board[0][0].equals(a) && board[1][1].equals(a) && board[2][2].equals(a)) || (board[0][2].equals(a) && board[1][1].equals(a) && board[2][0].equals(a)) || (board[0][0].equals(a) && board[0][1].equals(a) && board[0][2].equals(a)) || (board[1][0].equals(a) && board[1][1].equals(a) && board[1][2].equals(a)) || (board[2][0].equals(a) && board[2][1].equals(a) && board[2][2].equals(a)) || (board[0][0].equals(a) && board[1][0].equals(a) && board[2][0].equals(a)) || (board[0][2].equals(a) && board[1][2].equals(a) && board[2][2].equals(a)) || (board[0][1].equals(a) && board[1][1].equals(a) && board[2][1].equals(a))) {
                        System.out.println(" Congrats...the winner is player " + a);
                        exit(0);
                    } else if ((board[0][0].equals(b) && board[1][1].equals(b) && board[2][2].equals(b)) || (board[0][2].equals(b) && board[1][1].equals(b) && board[2][0].equals(b)) || (board[0][0].equals(b) && board[0][1].equals(b) && board[0][2].equals(b)) || (board[1][0].equals(b) && board[1][1].equals(b) && board[1][2].equals(b)) || (board[2][0].equals(b) && board[2][1].equals(b) && board[2][2].equals(b)) || (board[0][0].equals(b) && board[1][0].equals(b) && board[2][0].equals(b)) || (board[0][2].equals(b) && board[1][2].equals(b) && board[2][2].equals(b)) || (board[0][1].equals(b) && board[1][1].equals(b) && board[2][1].equals(b))) {
                        System.out.println(" Congrats....the winner is " + b);
                        exit(0);
                    }
                    u++;
                }
                n++;
            }
            System.out.println(" THE GAME HAS ENDED IN A DRAW");
            exit(0);
        }

    }

public class Main {
    public static void main(String[] args) {
        gameplay g1=new gameplay();
        g1.console();
        g1.gameStart();

    }
}
