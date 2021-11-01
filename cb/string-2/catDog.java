public class catDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times
     * in the given string.
     */
    public static boolean catDog(String str) {
      int catcount = 0;
      int dogcount = 0;
      for (int i=0; i < str.length()-2; i ++) {
        if (str.substring(i, i+3).equals("cat")) {
          catcount += 1;
        }
        if (str.substring(i, i+3).equals("dog")) {
          dogcount += 1;
        }
      }
      if (catcount == dogcount) {
        return true;
      }
      return false;
    }
  }
