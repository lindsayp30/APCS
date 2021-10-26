/*
Home-coming -- Ariel Fuchs / Lindsay Phung
APCS
HW 23 -- What Does Equality Look Like? / First Driver + Navigator Work Via Coins
2021-10-24
time spent: 1.1

DISCO
(Josiah Moltz's contribution)
- precond is what is needed to run a method
- postcond is what happens after running a method

- accessors ... take no parameters and have a return statement... give value of the accessed variable
- accessors vs. mutators ... the former accesses data while the latter alters the data
- = vs. == ... the former acts as an operator that ASSIGNS a value to the variable while the latter compares the two variables to see if their values are the same or not

- Math.random returns a floating number between 0.0 and 1.0
QCC
- is the only efficient way to stimulate a coin flip the usage of Math.random?
*/


/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin

    //test default constructor
    Coin mine = new Coin();

    //test 1st overloaded constructor
    Coin yours = new Coin( "quarter" );

   //test 2nd overloaded constructor
    Coin wayne = new Coin( "dollar", "heads" );

   //test toString() methods of each Coin
    System.out.println("mine: " + mine);
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test flip() method
    System.out.println("\nAfter flipping...");
    yours.flip();
    wayne.flip();
    System.out.println("yours: " + yours);
    System.out.println("wayne: " + wayne);

    //test equals() method
    if ( yours.equals(wayne) ) {
      System.out.println( "Matchee matchee!" );
    }
    else {
      System.out.println( "No match. Firestarter you can not be." );
    }
    /*===================TOP==========================
    ====================BOTTOM======================*/

  } //end main()

} //end class
