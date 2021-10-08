/*
BJLT -- Jason Yang (Bob)/ Lindsay Phung (Tommy)/ Paul Serbanescu
APCS
HW14 -- Customize Your Creation / altered HW13 such with the knowledge of overloaded constructors
2021-10-07

DISCOVERIES
- constructor BigSib requires String
UNRESOLVED QUESTIONS
-
*/

public class BigSib {
    private String helloMsg;
    public BigSib( String msg ) {
      helloMsg = msg;
    }
    public String greet( String x ) {
        return (helloMsg + " " + x);
    }
}
