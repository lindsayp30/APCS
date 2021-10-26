/*
Home-coming -- Ariel Fuchs / Lindsay Phung
APCS
HW 23 -- What Does Equality Look Like? / First Driver + Navigator Work Via Coins
2021-10-24
time spent: 1.1

DISCO
(Josiah Moltz's contribution)
- precond is what is needed to run a method
- postcond is what happens after running a method

- accessors ... take no parameters and have a return statement... give value of the accessed variable
- accessors vs. mutators ... the former accesses data while the latter alters the data
- = vs. == ... the former acts as an operator that ASSIGNS a value to the variable while the latter compares the two variables to see if their values are the same or not

- Math.random returns a floating number between 0.0 and 1.0
QCC
- is the only efficient way to stimulate a coin flip the usage of Math.random?
*/


public class Coin {

  //attributes aka instance vars
  private double value;
	private String upFace = "heads";
	private String name;
	private int flipCtr;
	private int headsCtr;
	private int tailsCtr;
	private double bias;


  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {

  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
   ***/
  public Coin( String s ) {
      if ( s == "penny" ) {
        name = s;
      }
      if ( s == "nickel" ) {
        name = s;
      }
      if ( s == "dime" ) {
        name = s;
      }
      if ( s == "quarter" ) {
        name = s;
      }
      if ( s == "half dollar" ) {
        name = s;
      }
      if ( s == "dollar") {
      name = s;
      }
    }


  /***
      Coin(String,String) --
      precond:
      postcond:
   ***/
  public Coin( String s, String nowFace ) {
    name = s;
    upFace = nowFace;
  }


  // Accessors...
 // ----------------------------
 public String getUpFace() {
   return upFace;
 }

 public int getFlipCtr() {
   return flipCtr;
 }

 public double getValue() {
   return value;
 }

 public int getHeadsCtr() {
   return headsCtr;
 }

 public int getTailsCtr() {
   return tailsCtr;
 }
 // ----------------------------


 /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {
    if (s == "penny") {
      value = 0.01;
    }
    if (s == "nickel") {
      value = 0.05;
    }
    if (s == "dime") {
      value = 0.1;
    }
    if (s == "quarter") {
      value = 0.25;
    }
    if (s == "half dollar") {
      value = 0.5;
    }
    if (s == "dollar") {
      value = 1;
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
   ***/
  public void reset( String s, double d ) {
	  value = 0;
    upFace = s;
	  flipCtr = 0;
	  headsCtr = 0;
	  tailsCtr = 0;
    bias = d;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    bias = 0.5;
    if (Math.random() < bias)  {
      flipCtr += 1;
      tailsCtr += 1;
      upFace = "tails";
    }
    else {
      flipCtr += 1;
      headsCtr += 1;
      upFace = "heads";
    }
    return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {
    if (upFace == other.upFace) {
      return true;
    }
    else {
      return false;
    }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
   public String toString() {
     return (name + "--" + upFace);
   }

} //end class
