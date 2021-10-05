/*
Mangos -- Andrew Piatetsky (Burnt Peanut)/ Lindsay Phung (Tommy)/ Joseph Othman (Po)
APCS
HW10 -- Refactor Big Sib One / updated HW09 such that now Greet.java prints the output instead of BigSib.java
2021-10-05

DISCOVERIES
- String cannot be converted to String[] --> data type change from void to String
- since Greet.java already has the System.out.println, we don't have to include it in this file? --> change to return
UNRESOLVED QUESTIONS
- 'void' type not allowed here
*/

public class BigSib {
    public static String greet( String x ) {
        return (x + ", are you okay?");
    }
}
