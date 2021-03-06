/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game2048f;

/**
 *
 * @author Dell
 */








public class Board {
    
    private int[][] values = new int[4][4];
    
    public Board(){
        for(int r=0; r<4; r++){
            for(int c=0; c<4; c++){
                values[r][c]=0;
            }
        }
    }
    
    @Override
    public String toString() {
        String board = "";
        for(int r=0; r<4; r++){
            for(int c=0; c<4; c++){
                if(values[r][c]<10){
                    System.out.print("[   "+values[r][c]+"]");
                } else if(values[r][c]<100){
                    System.out.print("[  "+values[r][c]+"]");
                }
                else if(values[r][c]<1000){
                    System.out.print("[ "+values[r][c]+"]");
                }
                else{
                    System.out.print("["+values[r][c]+"]");
                }
                if(c==3){
                    System.out.print("\n");
                }
            }
        }
        return board;
    }
    
    public void setCellValue(int r,int c, int value){
        values[r][c] = value;
    }
    
    public int getCellValue(int r, int c){
        return values[r][c];
    }
   
    public boolean isGameOver(){
        boolean gameOver = true;
        for(int r=0; r<4; r++){
            for(int c=0; c<4; c++){
                if(values[r][c]==0){
                    gameOver = false;
                }
            }
        }
        return gameOver;
    }
    
    public void rotateLeft(){
        for(int r=0; r<4; r++){
            for(int c=2; c>=0; c--){
                if(values[r][c]==0){
                    for(int i=c+1; i<4; i++){
                        values[r][i-1] = values[r][i];
                        values[r][i] = 0;
                    }
                }
            }
        }
    }
    
    public void rotateRight(){
        for(int r=0; r<4; r++){
            for(int c=1; c<=3; c++){
                if(values[r][c]==0){
                    for(int i=c-1; i>=0; i--){
                        values[r][i+1] = values[r][i];
                        values[r][i] = 0;
                    }
                }
            }
        }
    }
    
    public void rotateTop(){
        for(int r=0; r<4; r++){
            for(int c=2; c>=0; c--){
                if(values[c][r]==0){
                    for(int i=c+1; i<4; i++){
                        values[i-1][r] = values[i][r];
                        values[i][r] = 0;
                    }
                }
            }
        }
    }
    
    public void rotateDown(){
        for(int r=0; r<4; r++){
            for(int c=1; c<=3; c++){
                if(values[c][r]==0){
                    for(int i=c-1; i>=0; i--){
                        values[i+1][r] = values[i][r];
                        values[i][r] = 0;
                    }
                }
            }
        }
    }
    
    public void leftMerge(){
        for(int r=0; r<4; r++){
            for(int c=0; c<3; c++){
                if(values[r][c] == values[r][c+1]){
                    values[r][c] = values[r][c]+values[r][c+1];
                    Main.USER_SCORE += values[r][c];
                    values[r][c+1] = 0;
                    rotateLeft();
                }
            }
        }
    }
    
    public void rightMerge(){
        for(int r=0; r<4; r++){
            for(int c=3; c>0; c--){
                if(values[r][c] == values[r][c-1]){
                    values[r][c] = values[r][c]+values[r][c-1];
                    Main.USER_SCORE += values[r][c];
                    values[r][c-1] = 0;
                    rotateRight();
                }
            }
        }
    }
    
    public void topMerge(){
        for(int r=0; r<4; r++){
            for(int c=0; c<3; c++){
                if(values[c][r] == values[c+1][r]){
                    values[c][r] = values[c][r]+values[c+1][r];
                    Main.USER_SCORE += values[c][r];
                    values[c+1][r] = 0;
                    rotateTop();
                }
            }
        }
    }
    
    public void downMerge(){
        for(int r=0; r<4; r++){
            for(int c=3; c>0; c--){
                if(values[c][r] == values[c-1][r]){
                    values[c][r] = values[c][r]+values[c-1][r];
                    Main.USER_SCORE += values[c][r];
                    values[c-1][r] = 0;
                    rotateDown();
                }
            }
        }
    }
    
}
