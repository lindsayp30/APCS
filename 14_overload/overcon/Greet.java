/*
BJLT -- Jason Yang (Bob)/ Lindsay Phung (Tommy)/ Paul Serbanescu
APCS
HW14 -- Customize Your Creation / altered HW13 such with the knowledge of overloaded constructors
2021-10-07

DISCOVERIES
- BigSib() will not compile if not given a string
UNRESOLVED QUESTIONS
-
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib();
    BigSib grizz = new BigSib("Cheese");
    BigSib dotCom = new BigSib();
    BigSib tracy = new BigSib();
    greeting = richard.greet( "freshman" );
    System.out.println( greeting );
    greeting = tracy.greet( "Dr. Spaceman" );
    System.out.println( greeting );
    greeting = grizz.greet( "Kong Fooey" );
    System.out.println( greeting );
    greeting = dotCom.greet( "mom" );
    System.out.println( greeting );
  }
}
