/***
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
   * interface List
   * subset of actual Java List interface
   * Specifies actions a List must be able to perform.
   *
   * If placed in current working dir, will be consulted instead of
   *  built-in Java library interface.
   *
   * new in version 2.0:
   * REMOVE-AT-INDEX
   * ADD-AT-INDEX
   **/

  public interface List
  {
    //add node to list, containing input String as its data
    public boolean add( String x );

    //insert at specified index
    public void add( int index, String newVal );

    //remove node from list, return its data
    public String remove( int index );

    //return data in element at position i
    public String get( int i );

    //overwrite data in element at position i
    public String set( int i, String x );

    //return length of list
    public int size();

  }//end interface
