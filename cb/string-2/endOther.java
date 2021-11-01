public class endOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
    }

    /**
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */
    public static boolean endOther(String a, String b) {
      a = a.toLowerCase();
      b = b.toLowerCase();

      if (a.length() > b.length()) {
        String something = a.substring(a.length() - b.length(), a.length());
        if (something.equals(b)) {
          return true;
        } else {
          return false;
        }
      } else {
        String something = b.substring(b.length() - a.length(), b.length());
        if (something.equals(a)) {
          return true;
        } else {
          return false;
        }
      }
    }
}
