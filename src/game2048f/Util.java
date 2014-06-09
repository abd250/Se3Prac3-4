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


public class Util {
    
    public static int getRandomCellNumber(){
        return (int)(Math.random() * 4);
    }
    
    public static int getRandomValue(){
        if ((int)(Math.random() * 2) ==0 ){
            return 2;
        }
        return 4;
    }
}

