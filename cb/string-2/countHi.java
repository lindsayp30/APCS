public class countHi {
    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     */
    public static int countHi(String str) {
      int count = 0;
      for (int i=0; i < str.length()-1; i++) {
        if ((str.charAt(i) == 'h') && (str.charAt(i+1) == 'i')) {
          count += 1;
        }
      }
      return count;
    }
}
