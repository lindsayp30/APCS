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

public class BigSib {
    private String helloMsg;
    public BigSib() {
        setHelloMsg( "Word up" );
    }
    public BigSib( String y ) {
        setHelloMsg( y );
    }
    public void setHelloMsg( String msg ) {
        helloMsg = msg;
    }
    public String greet( String x ) {
        return (helloMsg + " " + x);
    }
}
