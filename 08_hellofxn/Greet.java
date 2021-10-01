/*
Lindsay Phung
APCS
HW08 -- Refactor Freshie Zero / updated greeting message last HW to a function that greets 3 people
2021-10-01

DISCOVERIES
- I created a different file named <Greet02.java> which had the same code as <Greet.java>. I encountered the error
"class Greet is public, should be declared in a file named Greet.java"
which I now know means that I should have kept working on the <Greet.java> since the class name and the filename has to match
- I previously just typed in <public static void greet(String)> without typing in an identifier
- I need to remember to add semicolons
- I remembered that concantenation occurs when using operator <+> with Strings

UNRESOLVED QUESTIONS
- Is it just semicolons at the end of each line if the line ends with a parentheses (not including lines with brackets at the end)?
*/

public class Greet {
	public static void main(String [] args) {
		greet("Rando");
		greet("Person01");
		greet("Person02");
	}

	public static void greet(String x) {
		System.out.println(x + ", are you okay?");
	}
}
