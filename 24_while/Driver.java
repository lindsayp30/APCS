/*
Home-coming -- Ariel Fuchs / Lindsay Phung
APCS
HW 24 -- Get It While You Can
2021-10-26
time spent: 1

DISCO
- this() is in red
QCC
- reviewed BigSib and Greet work
- supposedly compiles but takes forever to run
*/

public class Driver {

  public static void main( String[] args ) {
    Coin mine = new Coin();
    Coin yours = new Coin( "quarter" );

    int x = 5;
    int y = 10;
    int numHEADS = 0;
    int numMATCHES = 0;

    while (numHEADS < x) {
      mine.flip();
    }

    while (numMATCHES < y) {
      mine.flip();
      yours.flip();
      if (mine.equals(yours)) {
        numMATCHES += 1;
      }
    }

    while ((numMATCHES < 65536) && (numMATCHES % 2005 != 0))  {
      mine.flip();
      yours.flip();
      if (mine.equals(yours)) {
        numMATCHES += 1;
      }
    }
    System.out.println("number of heads: " + numHEADS);
    System.out.println("number of matches : " + numMATCHES);
  }
}
