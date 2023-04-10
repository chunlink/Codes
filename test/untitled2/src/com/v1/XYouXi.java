package com.v1;

import java.util.Scanner;

public class XYouXi {
    char[][] area;
    char player1 = 'X';
    char player2 = 'O';
    public XYouXi(){
        area = new char[3][3];
    }
    public void play(){
        Scanner scanner = new Scanner(System.in);

        int p1x,p1y,p2x,p2y;
        int p;
        do{
            System.out.println("玩家1输入落子的位置（如：0，0）。。。。。。");
            String str = scanner.next();
            String[] t = str.split(",");
            p1x = Integer.parseInt(t[0]);
            p1y = Integer.parseInt(t[1]);
            area[p1x][p1y] = player1;
            print();
            if(jiShu(p1x,p1y)) {
                System.out.println("玩家1赢！。。。");
                break;
            }

            System.out.println("玩家2输入落子的位置（如：0，0）。。。。。。");
            str = scanner.next();
            t = str.split(",");
            p2x = Integer.parseInt(t[0]);
            p2y = Integer.parseInt(t[1]);
            area[p2x][p2y] = player2;
            print();
            if(jiShu(p2x,p2y)) {
                System.out.println("玩家2赢！。。。");
                break;
            }
        }while (true);
    }
    private  void print(){
        for (int i = 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(area[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    private boolean jiShu(int x,int y) {
        if (x == 0) {
            if (area[0][1] == player1 && player1 == area[0][2] && area[0][0] == player1) {
//                System.out.println("玩家1赢！。。。");
                return true;
            }
            if (y == 0) {
                if (player1 == area[1][0] && player1 == area[2][0] && area[0][0] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }
            if (y == 1) {
                if (player1 == area[1][1] && player1 == area[2][1] && area[0][1] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }
            if (y == 2) {
                if (player1 == area[1][2] && player1 == area[2][2] && area[0][2] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }
        } else if (x == 2) {
            if (area[2][1] == player1 && player1 == area[2][2] && area[2][0] == player1) {
                //                System.out.println("玩家1赢！。。。");
                return true;
            }
            if (y == 0) {
                if (player1 == area[2][0] && player1 == area[1][0] && area[0][0] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }
            if (y == 1) {
                if (player1 == area[2][1] && player1 == area[1][1] && area[0][1] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }
            if (y == 2) {
                if (player1 == area[2][2] && player1 == area[1][2] && area[0][2] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }
        } else {
            if (player1 == area[1][0] && player1 == area[1][2] && area[1][1] == player1) {
                //                System.out.println("玩家1赢！。。。");
                return true;
            }
            if (y == 0) {
                if (player1 == area[1][0] && player1 == area[2][0] && area[0][0] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            } else if (y == 2) {
                if (player1 == area[1][2] && player1 == area[2][2] && area[0][2] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            } else {
                if (player1 == area[0][0] && player1 == area[1][1] && area[2][2] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
                if (player1 == area[0][2] && player1 == area[1][1] && area[2][0] == player1) {
                    //                System.out.println("玩家1赢！。。。");
                    return true;
                }
            }

        }
        return false;
    }
}
