/*
BJLT -- Jason Yang (Bob)/ Lindsay Phung (Tommy)
APCS
HW13 -- Where do BigSibs Come From? / altered HW12 with the addition of a constructor
2021-10-06

DISCOVERIES
- when an instance variable is created, a constructor can be used to initialize objects; only stating it once is sufficient --> eliminates redundancy; conductor doesn't have a return type; unlike a method, a constructor has to have the same name as the class name
- instance variable is declared outside a method whilst in a class while a local variable is declared inside a method/constructor whilst in a class
UNRESOLVED QUESTIONS
- private conductors?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    greeting = richard.greet( "freshman" );
    System.out.println( greeting );

    BigSib mark = new BigSib();
    greeting = mark.greet( "Dr. Spaceman" );
    System.out.println( greeting );

    BigSib farihah = new BigSib();
    greeting = farihah.greet( "Kong Fooey" );
    System.out.println( greeting );

    BigSib brad = new BigSib();
    greeting = brad.greet( "mom" );
    System.out.println( greeting );
  }
}
