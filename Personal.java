mport java.util.Scanner;
class Personal
{    void Name( String firstname,String Lastname)
    {  
        System.out.println("The Name of the Applicant is:"+firstname+"  "+Lastname);
    }
    void Age(int age)
    {
        System.out.println("The age of the Applicant is:"+age);
    }
    void Mobile(long mobile)
    {
        System.out.println("The phone no is:"+mobile);
    }
    void Address(String address)
    {
        System.out.println("The Address of the applicant:"+address);
    }

   public static void main(String args[])
   {   
    Personal user = new Personal();
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Nanme of the applicant:");
    String fname = sc.nextLine();
    String Lname  = sc.nextLine();
    System.out.println("Enter the age:");
    int age= sc.nextInt();
    System.out.println("Enter the phone no:");
    long mobile = sc.nextLong();
    sc.nextLine();
    System.out.println("Enter the address:");
    String address = sc.nextLine();
    sc.close();
    user.Name(fname, Lname);
    user.Age(age);
    user.Mobile(mobile);
    user.Address(address);
       
   }