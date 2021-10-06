/*
BJLT -- Jason Yang (Bob)/ Lindsay Phung (Tommy)
APCS
HW12 -- On ELder Individiuality and the Elimination of Radio Fuzz / implementation of instance variables
2021-10-06

DISCOVERIES
- though not entirely sure about 'new' in < BigSib richard = new BigSib() >, I have the understanding that richard.greet("") would have the same output as BgSib.greet("")
UNRESOLVED QUESTIONS
- error: cannot find symbolS
- need a bit more clarification on instance variables

aided by Andrew P
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    greeting = (richard.setHelloMsg( "Word up" ) + " " + richard.greet( "freshman" ));
    System.out.println( greeting );

    BigSib mark = new BigSib();
    greeting = (mark.setHelloMsg( "Salutations" ) + " " + mark.greet( "Dr. Spaceman" ));
    System.out.println( greeting );

    BigSib farihah = new BigSib();
    greeting = (farihah.setHelloMsg( "Hey ya" ) + " " + farihah.greet( "Kong Fooey" ));
    System.out.println( greeting );

    BigSib brad = new BigSib();
    greeting = (brad.setHelloMsg( "Sup" ) + " " + brad.greet( "mom" ));
    System.out.println( greeting );
  }
}
