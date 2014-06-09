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



import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);
    static Board board = new Board();
    
    public static void main(String[] args) {
        
        String userInput;

        setRandomCellValue();
        setRandomCellValue();
        do{
            print(board.toString());
            
            print("Next move? ");
            
            userInput = console.nextLine();
            
        }while(!userInput.equalsIgnoreCase("X"));
    }
    
    static void print(String str){
        System.out.print(str);
    }

    public static void setRandomCellValue() {
        int r,c;
        do{
            r = Util.getRandomCellNumber();
            c = Util.getRandomCellNumber();
        }while(board.getCellValue(r, c)!=0);
        
        int value = Util.getRandomValue();
        board.setCellValue(r, c, value);
    }

}
