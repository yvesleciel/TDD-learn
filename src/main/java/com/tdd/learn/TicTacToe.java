package com.tdd.learn;

public class TicTacToe {
    int[][] tab = new int[3][3];

    String lastPlayer;

    public void play(int i, int i1) {
       checkAxis(i);
       checkAxis(i1);
       moveTo(i, i1);
       lastPlayer = nextPlayer();
    }

    public String nextPlayer(){
        if(lastPlayer == "X"){
            return "O";
        }
        return "X";
    }

    public void checkAxis(int x){
        if(x>3 || x<1){
            throw new RuntimeException();
        }
    }

    public void moveTo(int x, int y){
        if(tab[x-1][y-1] == 1){
            throw new RuntimeException();
        }
        tab[x-1][y-1] = 1;
    }
}
