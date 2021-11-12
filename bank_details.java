import Aachi_1817101.*; 
import java.util.Scanner;

//creatin Import

public class bank_details {

String heading;

// create

bank_details()
{

heading = "Bank_details";
}

public static void main(String[] args)

{

bank_details Obj = new bank_details();

System.out.println("\n" +Obj.heading +"\n"); 
System.out.println("Enter number of times access:"); 
Scanner number = new Scanner(System.in);

int input = number.nextInt();

System.out.println("\noptions:");

System.out.println("1-Deposit"); 
System.out.println("2 - Withdraw");
System.out.println("3 - Balance");

for(int i=0; i<input; i++)
{
deposit object = new deposit();
object.main();
}
deposit object = new deposit();
object.withdraw_amount();

deposit object1= new savings();

object1.deposit_amount();

}

}
//call main method of deposit

class deposit implements withdraw

{

public static int total = 0;

public int withdraw_amount(int total)

{
try

{

System.out.println("enter withdraw amount");

Scanner input = new Scanner(System.in);

int amount = input.nextInt();
 if(amount <=total)
{
System.out.println("withdraw amount = "+amount); 
total=total- amount;
}
else
{
System.out.println("your balance is only:" +total);

System.out.println("you can't withdraw "+amount);

}
}
catch(Exception e)

{

System.out.println("Error: enter valid input");

Scanner input = new Scanner(System.in); 
int amount = input.nextInt();

if(amount <=total)
{
System.out.println("withdraw amount = "+amount);

total= total -amount;

}

else
{
System.out.println("your balance is only: "+total);
System.out.println("you can't withdraw "+amount);
}
}
return total;
}

public void withdraw_amount()
{


System.out.println("method overloading ");
}

public int deposit_amount()
{

System.out.println("\nEnter amount for deposit:");

Scanner value = new Scanner(System.in);

int deposit_amount = value.nextInt(); 
if(deposit_amount>0)
{
System.out.println("Deposit amount="+deposit_amount); 
total = total + deposit_amount;

} 
else {

System.out.println("enter valid amount");
Scanner value1= new Scanner(System.in);

int Deposit_amount = value1.nextInt(); 
System.out.println("Deposit amount =" +Deposit_amount);

total = total + Deposit_amount;
}
return total;


}

 public static int main()
{

System.out.println("\nChoose one option"); 
Scanner input = new Scanner(System.in);

int option= input.nextInt();

deposit obj = new deposit(); //create object for deposit class

switch(option) {

case 1: total= obj.deposit_amount();
           break;

case 2: total= obj.withdraw_amount(total); 
           break;

case 3: savings money= new savings();
           money.balance();
           break;
}

return total;
}
}
class savings extends deposit
{

public void balance()
{

System.out.println("Your Account Balance = "+this.total);
}

public int deposit_amount()
{

//create same method name and same

System.out.println("\nmethod overriding-subclass");
 return 0;
}
}

