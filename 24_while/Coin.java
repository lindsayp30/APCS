/*
Home-coming -- Ariel Fuchs / Lindsay Phung
APCS
HW 24 -- Get It While You Can
2021-10-26
time spent: 1

DISCO
- this() is in red
QCC
- reviewed BigSib and Greet work
- supposedly compiles but takes forever to run
*/

public class Coin {

  //essentially the same -- attributes aka instance variables
  public double value;
  public String upFace, name;
  public int flipCtr, headsCtr, tailsCtr;
  public double bias = .5;

  //sets standard upFace to heads and the standard bias to 0.5
  public Coin() {
    reset("heads", 0.5);
  }

  //this() calls for constructor with similar parameters
  public Coin(String s) {
    this();
    name = s;
    assignValue(s);
  }

  public Coin(String s, String nowFace) {
    this(s);
    upFace = nowFace;
  }

  //if the names are the same, the value is assigned
  private double assignValue (String s) {
    if (name.equals("penny"))             {value = 0.01; }
    else if (name.equals("nickel"))       {value = 0.05; }
    else if (name.equals("dime"))         {value = 0.1; }
    else if (name.equals("quarter"))      {value = 0.25; }
    else if (name.equals("half dollar"))  {value = 0.5; }
    else if (name.equals("dollar"))       {value = 1; }
    return value;
  }

  //essentially the same -- resets coin stats
  public void reset (String s, double d) {
    flipCtr = 0;
    tailsCtr = 0;
    headsCtr = 0;
    upFace = s;
    bias = d;
  }

  //essentially the same but better placement of the flipCtr += 1
  public String flip() {
    double randDbl = Math.random();
    if (randDbl < bias) {
      upFace = "heads";
      headsCtr += 1;
    }
    else {
      upFace = "tails";
      tailsCtr += 1;
    }
    flipCtr += 1;
    return upFace;
  }

  //built in method of java language
  public boolean equals(Coin other) {
    return upFace.equals(other.upFace);
  }

  //built in method of java language
  public String toString() {
    return "" + name + "--" + upFace;
  }
}
