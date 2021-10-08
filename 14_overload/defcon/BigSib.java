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
    public BigSib(String x) {
      helloMsg = x;
    }
    private String helloMsg;
    public String greet( String x ) {
        return (helloMsg + " " + x);
    }
}
