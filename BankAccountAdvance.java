import java.util.Scanner;
class BankAccountAdvance
{
    String Name;
    long AccountNo=23458900;
    double balance;
    int Pin;
    void CreateAccount(String name,int pin,double amount)
    {
        Name=name;
        AccountNo++;
        balance=amount;
        Pin=pin;
        System.out.println("Account Successfully Created\n");
        System.out.println("Your Account no is :"+AccountNo);
    }
    void ShowAccountDetails(int pin)
    {   if(Pin==pin){
        System.out.println("The Details of the Accountholder:\n");
        System.out.println("Name of the holder:"+Name);
        System.out.println("AccountNumber:"+AccountNo);
        System.out.println("Balance:"+balance);}
        else
        {
            System.out.println("Invalid PIN");
        }
    }
    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("The Amount"+amount+"deposited Succesfully");
    }
    void WithDraw(double amount)
    {
        if(balance>=amount && amount >0)
        {
            balance-=amount;
            System.out.println("Amount Successfully withdrawn! ThankYou for Using SBI Bank!");
        }
        else
        {
            System.out.println("Amount Cannot be Withdrawn due to insuffient balance");
        }
        
    }
    void Checkbalance()
    {
       System.out.println("The Total Balance"+balance); 
    }
    
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Hey,Welcome to SBI bank!\n");
        System.out.println("Are you a New holder or SBIian?if new holder Say YES,if not then Say NO");
        String option = sc.nextLine();
        BankAccountAdvance account1 = new BankAccountAdvance();
        System.out.println("Enter the Name:");
        String name = sc.nextLine();
        System.out.println("Enter the PIN for the Account:");
        int pin = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Amount to be Intially Deposited\n");
        double IntialDeposit = sc.nextInt();
        account1.CreateAccount(name,pin,IntialDeposit);
        System.out.println("Enter the choice from the MENU\n");
        System.out.println("1.AccountDetails\n 2.Withdraw\n 3.Deposit\n 4.Checkbalance\n 5.Exit");
        int choice;
        do
        { System.out.println("Enter the choice:\n");
         choice = sc.nextInt();
         switch(choice){
         case 1:
         System.out.println("Enter the PIN");
         int userpin = sc.nextInt();
         account1.ShowAccountDetails(userpin);
         break;
         case 2:
         System.out.println("Enter the Amount to be withdrawn\n");
         double amount = sc.nextInt();
         account1.WithDraw(amount);
         break;
         case 3:
         System.out.println("Enter the Amount to be deposited\n");
         double deposit = sc.nextInt();
         account1.deposit(deposit);
         break;
         case 4:
         account1.Checkbalance();
         break;
        }}while(choice!=5);
         
 sc.close();   } 
}
    

