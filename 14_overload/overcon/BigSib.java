/*
BJLT -- Jason Yang (Bob)/ Lindsay Phung (Tommy)/ Paul Serbanescu
APCS
HW14 -- Customize Your Creation / altered HW13 such with the addition of a overloaded constructor
2021-10-07

DISCOVERIES
-
UNRESOLVED QUESTIONS
-
*/

public class BigSib {
    public BigSib() {
        setHelloMsg("Word up");
    }
    private String helloMsg;
    public void setHelloMsg ( String msg ) {
      helloMsg = msg;
    }
    public String greet( String x ) {
        return (helloMsg + " " + x);
    }
}
