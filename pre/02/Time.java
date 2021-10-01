public class Time{
      public static void main(String[] args){
          int hour = 21;
          int minute = 10;
          int second = 5;
          int sincemidnight = (hour * 60 + minute) * 60 + second;
          int total = 24 * 60 * 60;
          int percent = sincemidnight * 100 / total;
          System.out.println(percent);
      }
}
