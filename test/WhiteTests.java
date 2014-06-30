
import org.junit.Test;
import static org.junit.Assert.*;

public class WhiteTests {
    
    @Test
    public void testRotateLeftPath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(0, 1, 2);
        board.setCellValue(0, 2, 0);
        board.setCellValue(0, 3, 0);
        board.rotateLeft();
        assertEquals(board.getCellValue(0, 0), 2);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 0);
    }
    
    @Test
    public void testRotateRightPath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(0, 1, 2);
        board.setCellValue(0, 2, 0);
        board.setCellValue(0, 3, 0);
        board.rotateRight();
        assertEquals(board.getCellValue(0, 0), 0);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 2);
    }
    
    @Test
    public void testRotateTopPath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(1, 0, 2);
        board.setCellValue(2, 0, 0);
        board.setCellValue(3, 0, 0);
        board.rotateTop();
        assertEquals(board.getCellValue(0, 0), 2);
        assertEquals(board.getCellValue(1, 0), 0);
        assertEquals(board.getCellValue(2, 0), 0);
        assertEquals(board.getCellValue(3, 0), 0);
    }
    
    @Test
    public void testRotateDownPath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(1, 0, 2);
        board.setCellValue(2, 0, 0);
        board.setCellValue(3, 0, 0);
        board.rotateDown();
        assertEquals(board.getCellValue(0, 0), 0);
        assertEquals(board.getCellValue(1, 0), 0);
        assertEquals(board.getCellValue(2, 0), 0);
        assertEquals(board.getCellValue(3, 0), 2);
    }
    
    @Test
    public void testRotateIsGameOverPath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(1, 0, 2);
        board.setCellValue(2, 0, 4);
        board.setCellValue(3, 0, 0);
        board.setCellValue(0, 1, 4);
        board.setCellValue(1, 1, 8);
        board.setCellValue(2, 1, 0);
        board.setCellValue(3, 1, 0);
        board.setCellValue(0, 2, 0);
        board.setCellValue(1, 2, 16);
        board.setCellValue(2, 2, 0);
        board.setCellValue(3, 2, 0);
        board.setCellValue(0, 3, 0);
        board.setCellValue(1, 3, 32);
        board.setCellValue(2, 3, 0);
        board.setCellValue(3, 3, 0);
        assertFalse(board.isGameOver());
    }
    
    @Test
    public void testRotateIsGameOverPath2(){
        Board board = new Board();
        board.setCellValue(0, 0, 16);
        board.setCellValue(1, 0, 2);
        board.setCellValue(2, 0, 4);
        board.setCellValue(3, 0, 8);
        board.setCellValue(0, 1, 4);
        board.setCellValue(1, 1, 8);
        board.setCellValue(2, 1, 32);
        board.setCellValue(3, 1, 64);
        board.setCellValue(0, 2, 2);
        board.setCellValue(1, 2, 16);
        board.setCellValue(2, 2, 4);
        board.setCellValue(3, 2, 8);
        board.setCellValue(0, 3, 4);
        board.setCellValue(1, 3, 32);
        board.setCellValue(2, 3, 2);
        board.setCellValue(3, 3, 4);
        assertTrue(board.isGameOver());
    }
    
    @Test
    public void testLeftMergePath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 2);
        board.setCellValue(0, 1, 2);
        board.setCellValue(0, 2, 0);
        board.setCellValue(0, 3, 0);
        board.leftMerge();
        assertEquals(board.getCellValue(0, 0), 4);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 0);
    }
    
    @Test
    public void testRightMergePath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(0, 1, 0);
        board.setCellValue(0, 2, 2);
        board.setCellValue(0, 3, 2);
        board.rightMerge();
        assertEquals(board.getCellValue(0, 0), 0);
        assertEquals(board.getCellValue(0, 1), 0);
        assertEquals(board.getCellValue(0, 2), 0);
        assertEquals(board.getCellValue(0, 3), 4);
    }
    
    @Test
    public void testTopMergePath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(1, 0, 2);
        board.setCellValue(2, 0, 2);
        board.setCellValue(3, 0, 0);
        board.topMerge();
        assertEquals(board.getCellValue(0, 0), 4);
        assertEquals(board.getCellValue(1, 0), 0);
        assertEquals(board.getCellValue(2, 0), 0);
        assertEquals(board.getCellValue(3, 0), 0);
    }
    
    @Test
    public void testDownMergePath1(){
        Board board = new Board();
        board.setCellValue(0, 0, 0);
        board.setCellValue(1, 0, 2);
        board.setCellValue(2, 0, 2);
        board.setCellValue(3, 0, 0);
        board.downMerge();
        assertEquals(board.getCellValue(0, 0), 0);
        assertEquals(board.getCellValue(1, 0), 0);
        assertEquals(board.getCellValue(2, 0), 0);
        assertEquals(board.getCellValue(3, 0), 4);
    }
    
}
