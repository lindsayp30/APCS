// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW77 -- Insert|Remove
// 2022-03-16m
// time spent: 0.5 hr
//
// DISCO
// - Tracing is very helpful when visualizing how to go about a method
// - Use System.out.println() sparingly to see what's going wrong
// QCC
// - "LLNode can not be converted to String" reminder that String != getNext();
// - How can we add to the end of the LLNode like Scheme does with lists?
// ALGO ADD
// 1. If we're trying to add to the zeroth index aka the front of the list, use
//    the regular add method.
// 2. If not, add everything before the index in a temporary LLNode.
// 3. Create another LLNode that adds the newVal at the index specified then
//    stores the nodes after the index.
// 4. Connect the two LLNodes, resulting in an LLNode that has all the nodes
//    and the newVal at the right index.
// 5. Increase size by 1.
// ALGO REM
// 1. If we're trying to remove the zeroth index aka the front of the list,
//    get everything after the car.
// 2. If not, add everything before the index to a temporary LLNode.
// 3. When getting to the index that should be removed, skip it, and continue
//    adding everything after.
// 4. Decrease size by 1.


/***
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 **/

public class LLNode
{
  //instance vars
  private String _cargo;
  private LLNode _nextNode;

  // constructor
  public LLNode( String value, LLNode next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public String getCargo()
  {
    return _cargo;
  }

  public LLNode getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public String setCargo( String newCargo )
  {
    String foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode setNext( LLNode newNext )
  {
    LLNode foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo;
  }


  //main method for testing
  public static void main( String[] args )
  {

    //Below is an exercise in creating a linked list...

    //Create a node
    LLNode first = new LLNode( "cat", null );

    //Create a new node after the first
    first.setNext( new LLNode( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new LLNode( "cow", null ) );

    /* A naive list traversal, has side effects.... ??
       while( first != null ) {
       System.out.println( first );
       first = first.getNext();
       }
    */

    //Q: when head ptr moves to next node in list, what happens to the node it just left?
    //A: garbage collector reclaims that memory

    //  so, better: (w/o moving first)

    LLNode temp = first;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }


  }//end main

}//end class LLNode
