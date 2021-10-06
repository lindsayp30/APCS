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

public class BigSib {
    public String helloMsg;
    public static String setHelloMsg( String helloMsg ) {
        return helloMsg;
    }
    public static String greet( String x ) {
        return x;
    }
}
