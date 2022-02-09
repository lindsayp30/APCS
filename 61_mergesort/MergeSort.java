/***
  LPs (Lior Polischouk and Lindsay Phung)
  APCS
  HW 61 -- Instructions so Simple... / merge and sort array of ints
  2022-02-08
  time spent: 1 hr
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm:
  *Algorithm runs through both arrays until it reaches the end of one of them, or full array is completed
  *Smaller element of the two initial arrays is added to final, and that array increments by 1
  *If end of one of initial arrays is reached, the rest of other array is added to final
  
  DISCO:
  *We can use three separate variables; "i" in a for loop to run through each element of full array, 
    "j" to increment through first array (a), and "k" to increment through second array (b). Doing so allows
    us to easily track when we have reached the end of one of the input arrays.
  *
  
  QCC:
  *Is there a shorter way to do the merge method without using multiple variables?
  *
  
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] full = new int[a.length + b.length];
    int i = 0;
    int j = 0;
    int k = 0;
    for (;i < full.length && j != a.length && k != b.length; i++) {
      if (a[j] > b[k]) {
        full[i] = b[k];
        k ++;
      }
      else {
        full[i] = a[j];
        j ++;
      }
    }
    for (int l = i; l < full.length; l++) {
      if (j == a.length) {
        full[l] = b[k];
        k ++;
      }
      else if (k == b.length) {
        full[l] = a[j];
        j ++;
      }
    }
    return full;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if (arr.length <= 1) {
      return arr;
    }
    int middle = arr.length / 2;
    int[] left = new int[middle];
    int[] right = new int[arr.length - middle];
    for (int i = 0; i < middle; i ++) {
      left[i] = arr[i];
    }
    for (int j = 0; j < right.length; j ++) {
      right[j] = arr[middle + j];
    }
    left = sort(left);
    right = sort(right);
    return merge(left, right);
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {0,9,17,23,42,63,512};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
