/***
 * PAUTRIO -- Joseph Othman, Oscar Breen, and Lindsay Phung
 * APCS
 * HW 65 -- How Many Queens Can a Thinker Place, If a Thinker Can Place Queens... / placement of 
 *          queens on a chess board
 * 2022-02-16
 * 
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve()
  {
    if(solveH(0) == true) {
      System.out.println("There is a solution!");
      printSolution();
      return true;
    }
    else {
      System.out.println("There is no solution.");
      return false;
    }
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col )
  {
    if (col >= _board.length) {
      return true;
    }
    else {
      for(int row = 0; row < _board.length; row++) {
        if (addQueen(row,col)) {
          addQueen(row, col);
          if (solveH(col + 1)) {
            return true;
          }
          else {
            removeQueen(row, col);
          }
        }
      }
    }
    return false;
  }


  public void printSolution()
  {
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    String[][] boardRep = new String[_board.length][_board.length];
    for(int i = 0; i < _board.length; i++) {
      for(int j = 0; j < _board.length; j++) {
        if( _board[i][j] == 1) {
          boardRep[i][j] = "Q";
        }
        else {
          boardRep[i][j] = "_";
        }
      }
    }

    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board.length; c++ ) {
        ans += boardRep[r][c]+"\t";
      }
      ans += "\n";
    }
    System.out.println(ans);
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * <General description>
   * precondition:
   * postcondition:
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition:
   * postcondition:
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition:
   * postcondition:
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board.length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */

    b.solve();

    QueenBoard c = new QueenBoard(8);
    c.solve();

  }

}//end class
