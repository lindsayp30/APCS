// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa)
// APCS pd7
// HW77 -- Insert|Remove
// 2022-03-16m
// time spent:  hr
//
// DISCO
// -
// QCC
// - "LLNode can not be converted to String" reminder that String != getNext();
// ALGO ADD
// - The base case takes into account if we're looking for the first index.
//   If this is so, the program goes to the next node and assigns that as the
//   head. For any other index, we have an LLNode that stores the nodes prior
//   to the index of the node we want to add. We have another LLNode that adds
//   the value at the index and then stores the nodes after the index of the
//   node we want to add. We connect the two LLNodes, creating an LLNode that
//   has all the nodes and the value at the right index.
// ALGO REM
// - The base case takes into account if we're removing the first index. If
//   this is so, the program looks at the next node. We used a for loop such
//   that we would String the car's for each node after.


/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public void add( int index, String newVal )
  {
    if (index == 0) {
      LLNode tmp = new LLNode( newVal, _head );
      _head = tmp;
    } else {
      LLNode tmp = _head;
      for( int i=0; i < index-1; i++ ) {
        tmp = tmp.getNext();
      }
      LLNode tmp2 = new LLNode( newVal, tmp.getNext() );
      // _head = tmp2;
      tmp.setNext(tmp2);
    }
    _size++;
  }


  public String remove( int index )
  {
    LLNode tmp = _head;
    String retVal = "";
    if (index == 0) {
      tmp = tmp.getNext();
      for (int o = 1; o < _size; o++) {
        retVal += " " + tmp.getCargo();
        tmp = tmp.getNext();
      }
    } else {
      for (int i = 0; i < index-1; i++) {
        tmp = tmp.getNext();
        retVal += " " + tmp.getCargo();
      }
      _head = tmp.getNext();
      String here = _head.getCargo();
      LLNode tmp2 = new LLNode( here, tmp.getNext());
      for (int j = index + 1; j < _size-1; j++) {
        tmp2 = tmp2.getNext();
        retVal += " " + tmp2.getCargo();
      }
    }
    _size--;
    return retVal;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    james.add(0, "crazy");
    System.out.println("adding as the 1st word..." + james);

    james.add(3, "boop");
    System.out.println("adding as the 3rd word..." + james);

    System.out.println("removing the 1st word... " + james.remove(0));

    System.out.println("removing the 3rd word... " + james.remove(2));
  }

}//end class LList
