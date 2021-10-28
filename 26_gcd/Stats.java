public class Stats {

  public static int gcd( int a, int b ) {
    int count = 1;
    int answer = a;
    if (a == b) {
      return a;
    }
    else if (a > b) {
      while (count < b) {
        if ((a % count == 0) && (b % count == 0)) {
          answer = count;
        }
        count += 1;
      }
    }
    else {
      while (count < a) {
        if ((a % count == 0) && (b % count == 0)) {
          answer = count;
        }
        count += 1;
      }
    }
    return answer;
  }

  public static int gcdER( int a, int b ) {
    if (a == b) {
      return a;
    }
    else if (a > b) {
      return gcd(a-b,b);
    }
    else {
      return gcd(b-a, a);
    }
  }

  public static int gcdEW( int a, int b ) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
    }
  }
    return a;
}

  public static void main(String[] args) {
    System.out.println(gcd(9, 21));
    System.out.println(gcd(12, 12));
    System.out.println(gcd(15, 5));

    System.out.println(gcdER(9, 21));
    System.out.println(gcdER(12, 12));
    System.out.println(gcdER(15, 5));

    System.out.println(gcdEW(9, 21));
    System.out.println(gcdEW(12, 12));
    System.out.println(gcdEW(15, 5));
  }
}
