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
            if(validUserInput(userInput)){
                if(userInput.equalsIgnoreCase("L")){
                    board.rotateLeft();
                }
                else if(userInput.equalsIgnoreCase("R")){
                    board.rotateRight();
                }
                else if(userInput.equalsIgnoreCase("T")){
                    board.rotateTop();
                }
                else if(userInput.equalsIgnoreCase("D")){
                    board.rotateDown();
                }
                setRandomCellValue();
            }
            else{
                print("Invalid input, please enter l, r, t, d, or x.\n");
            }
            
        }while(!userInput.equalsIgnoreCase("X") && !board.isGameOver());
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

    private static boolean validUserInput(String userInput) {
        if( userInput.equalsIgnoreCase("L") ||
            userInput.equalsIgnoreCase("R") ||
            userInput.equalsIgnoreCase("T") ||
            userInput.equalsIgnoreCase("D") ||
            userInput.equalsIgnoreCase("X")){
            return true;
        }
        return false;
    }

}
