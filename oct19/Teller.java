public class Teller {
	public static void main(String[] args) {
      BankAccount sketchy = new BankAccount();

      sketchy.SetAcctInfo("my mom","nunyazbiz",4295,379572759,100);
      sketchy.DepositMoney(34.08);
      sketchy.WithdrawMoney(3624);
      /*System.out.println("account holder: "+sketchy.acctHolder);
      System.out.println("password: "+sketchy.password);
      System.out.println("pin: "+sketchy.pin);
      System.out.println("account number: " +sketchy.accountNum);
      if (sketchy.bal==1) {
          System.out.println("balance: "+sketchy.bal+" dollar");
      } else {
          System.out.println("balance: "+sketchy.bal+ " dollars");
      }*/
      System.out.println(sketchy.authenticate(379572759,"nunyazbiz"));
      System.out.println(sketchy.authenticate(462627485,"heyya"));
    }
    }
    
    // couldn't test because instance variables are private and can't be called outside of the class file
    // make a method to return/print the information to avoid this issue
    // <>.authenticate needed
    // if conditional is wonky because the authenticate method tests to see whether the values inputed match the instance of BankAccount named myCopyDuck instead of the actual account information for each instance
    // can not test as we can not print information afterwards to see the changes that we've made
