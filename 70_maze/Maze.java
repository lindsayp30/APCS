// KdawgL -- Kosta Dubovskiy and Lindsay Phung
// APCS pd7
// HW70 -- AThinkers of the Corn / maze solving (blind, depth-first)
// 2022-03-07
// time spent: 1 hr

/***
 * SKEELTON for
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 *
 * USAGE:
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 * - First check if hero is randomly spawned on the exit. If so, then we exit out.
 * - Then check if hero is randomly spawned not on the path. If it is not, then
 *   the hero checks to see if there is a path above, to the right, down, and to
 *   the left. The hero goes in that direction, backtracking to the last fork and
 *   changing the @ to . if the road is a dead end. This way, the hero knows not to 
 *   go down that (.) path again.
 * - Once reaching the exit, we exit out.
 *
 * DISCO
 * - fully visualize scenario before working on it
 * QCC
 * - encountered an out of bound error that can be resolved with a "one space
 *   buffer around the maze" (piazza)
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  // NESW
  final private int FRAME_DELAY = 50;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/


  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if ( _maze[x][y] == EXIT ) {
	     _solved = true;
       System.exit(0);
    }
    //other base cases
    else if (!onPath(x,y)) {
      return;
    }
    // else if ( _maze[y - 1][x] == EXIT ) {
	  //   _maze[y][x] = HERO;
    //   solve(y - 1, x);
    // }
    // else if ( _maze[y][x + 1] == EXIT ) {
	  //   _maze[y][x] = HERO;
    //   solve(y, x + 1);
    // }
    // else if ( _maze[y + 1][x] == EXIT ) {
	  //   _maze[y][x] = HERO;
    //   solve(y + 1, x);
    // }
    // else if ( _maze[y][x - 1] == EXIT ) {
	  //   _maze[y][x] = HERO;
    //   solve(y, x - 1);
    // }
    //otherwise, recursively solve maze from next pos over,
    //after marking current location
    else {
      _maze[x][y] = HERO;
      System.out.println( this ); //refresh screen
      solve(x, y - 1);
      solve(x + 1, y);
      solve(x, y + 1);
      solve(x - 1, y);
      _maze[x][y] = VISITED_PATH;
      System.out.println( this ); //refresh screen
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
    if (_maze[x][y] == PATH) {
      return true;
    } else {
      return false;
    }
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    ms.solve( 4, 3 );

    //drop our hero into maze at random location on path
    // int startX = (int)(w * Math.random());
    // int startY = (int)(h * Math.random());
    // ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
