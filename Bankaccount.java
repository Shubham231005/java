public class BankAccount{
   double balance;
   void deposited(double amount)
   {
      balance+=amount;
      System.out.println("The Deposited amount is:"+amount);

   }
   void Withdraw(double amount){
    if(balance>=amount)
    {
        balance-=amount;
        System.out.println("The Remaining balance is="+balance);
    }
    else{
        System.out.println("Insufficient balance");

    }
   }
   void checkbalance()
  {
    System.out.println("The amount="+balance);
  }
  void interest(double rate)
  {
    balance= balance+(balance*rate/100);
    System.out.println("Total balance after interest="+balance);
  }
  void transfer(double amount,BankAccount anotheraccount){
    if(balance>=amount){
        balance-=amount;
        anotheraccount.balance+=amount;
        System.out.println("Transfered :  "  +amount+  " To   AnotherAccount");
        System.out.println("Amount left :  "  +balance);
        
    }
    else
    {
        System.out.println("Insufficient balance");
    }
  }
   public static void main(String[] args)
   {
   BankAccount myAccount =new BankAccount();
   BankAccount anotheraccount = new BankAccount();
    myAccount.deposited(500);
    myAccount.Withdraw(200);
    myAccount.checkbalance();
    myAccount.transfer(100,anotheraccount);
   }
}