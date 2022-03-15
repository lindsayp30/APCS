// Rowing Lemurs and Leopards (Ruby Friedman, Lindsay Phung, Lawrence Joa Special Guest Anjini Katari)
// APCS pd7
// HW76 -- We Got a Little Ol' Convoy
// 2022-03-15m
// time spent: 0.5 hr
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
	_head = new LLNode("", null);
	_size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    if (_head == null) {
      _head = new LLNode(newVal, null);
    } else {

      LLNode temp = _head;
      while (temp.getNext() != null) {
        temp = temp.getNext();
      }
      temp.setNext( new LLNode(newVal, null) );

    }
    _size += 1;
    return true;
  }


  public String get( int index )
  {
	LLNode temp = _head;
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

	int counter = 0;
	while (counter != index) {
		temp = temp.getNext();
		counter += 1;
	}
	return temp.getCargo();
  }


  public String set( int index, String newVal )
  {
        LLNode temp = _head;
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

        int counter = -1;
        while (counter != index) {
                temp = temp.getNext();
                counter += 1;
        }
	return temp.setCargo(newVal);
  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    LLNode temp = _head;
    String foo = "(";
    while(temp != null) {
        foo += temp.getCargo();
        foo += " ";
        temp = temp.getNext();
    }
	foo += ")";
    return foo;
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
  }

}//end class LList
