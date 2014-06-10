/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import game2048f.Board;

/**
 *
 * @author Dell
 */




import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void testRotateLeft(){
        Board board = new Board();
        board.setCellValue(0, 3, 2);
        board.rotateLeft();
        assertEquals(board.getCellValue(0, 0), 2);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 0);
        
    }
    
    @org.junit.Test
    public void testRotateRight(){
        Board board = new Board();
        board.setCellValue(0, 0, 2);
        board.rotateRight();
        assertEquals(board.getCellValue(0, 0), 0);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 2);
        
    }
    
}