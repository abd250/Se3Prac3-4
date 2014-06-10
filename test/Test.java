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
    
    @org.junit.Test
    public void testRotateTop(){
        Board board = new Board();
        board.setCellValue(3, 0, 2);
        board.rotateTop();
        assertEquals(board.getCellValue(0, 0), 2);
        assertEquals(board.getCellValue(1, 0), 0);
        assertEquals(board.getCellValue(2, 0), 0);
        assertEquals(board.getCellValue(3, 0), 0);
        
    }
    
    @org.junit.Test
    public void testRotateDown(){
        Board board = new Board();
        board.setCellValue(0, 0, 2);
        board.rotateDown();
        assertEquals(board.getCellValue(0, 0), 0);
        assertEquals(board.getCellValue(1, 0), 0);
        assertEquals(board.getCellValue(2, 0), 0);
        assertEquals(board.getCellValue(3, 0), 2);
        
    }
    
    @org.junit.Test
    public void testLeftMerge(){
        Board board = new Board();
        board.setCellValue(0, 0, 2);
        board.setCellValue(0, 1, 2);
        board.leftMerge();
        assertEquals(board.getCellValue(0, 0), 4);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 0);
        
    }
    
}