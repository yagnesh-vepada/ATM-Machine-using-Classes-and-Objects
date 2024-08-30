import java.util.*;
public class ATM {
    Scanner sc = new Scanner(System.in);
    int pin=1234,Balance=5000;
    public void checkpin(){
        System.out.println("enter pin:");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else
        {
            System.out.println("entered invalid pin");
        }
    }
     public void menu(){
            System.out.println("1.Check A/C Balance");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("4.EXIT");
            System.out.println("Enter your Choice:");
            Scanner sc=new Scanner(System.in);
            int Choice=sc.nextInt();
            switch(Choice){
                case 1:
                checkbalance();
                break;
                case 2:
                withdrawMoney();
            	break;
            	case 3:
            	despositMoney();
            	break;
             	case 4:
           	exit();
            	break;
             	default:
             	System.out.println("Invalid Choice Entered :(");
		break;
            }
        }
    public void checkbalance(){
        System.out.println("Your Balance is:"+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter the withdrawal Amount:");
        int amount=sc.nextInt();
        if(amount==Balance){
            Balance=Balance-amount;
            System.out.println("Collect Your Cash"+amount);
            menu();
        }
        else if(amount<Balance){
            Balance=Balance-amount;
            System.out.println("Collect Your Cash "+amount);
            menu();
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void despositMoney(){
        System.out.println("Enter Amount to be deposited:");
        int deposit=sc.nextInt();
        System.out.println("Place the Cash :)");
        Balance=Balance+deposit;
        System.out.println("Amount Deposited :)");
        menu();
    }
    public void exit(){
        System.exit(0);
    }        
}
public class ATMmachine{
    public static void main(String args[]){
        ATM a = new ATM();
        a.checkpin();
    }
}