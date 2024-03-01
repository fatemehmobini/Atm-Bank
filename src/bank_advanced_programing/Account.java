package bank_advanced_programing;


import java.util.Date;
import java.util.Scanner;

public class Account {
//variables
int balance;
int prevTransaction;
String customerName;
String customerId;
Account(String cname,String cid)
{
	customerName=cname;
	customerId=cid;
 }

void deposit(int amount) {

if(amount!= 0 && amount>0) {	
balance=balance+amount;
prevTransaction=amount;
}
                                 }
void withdraw(int amount) {
if(amount!=0) {
balance=balance-amount;
prevTransaction=-amount;
 }
    }
void getPrevTransaction() {
if(prevTransaction>0) {
System.out.println("deposited: "+ prevTransaction);
}else if(prevTransaction<0){
System.out.println("withdraw: " + Math.abs(prevTransaction));
}else {
System.out.println("NO Transaction accured !");	}
}
void showdate() {
	Date today  = new Date();
	System.out.printf("%1$s %2$tB %2$td %2$tY", "Date of Today : ",  today);
}
void showMenu(){
char option='\0';
Scanner scanner=new Scanner(System.in);
System.out.println("welcome , "+customerName + "!");	
System.out.println("your ID is:"+ customerId);	
System.out.println();
System.out.println("what would you like to do?(❁´◡`❁)");
System.out.println();
System.out.println("A.check your balance");
System.out.println("B.Make a deposit");
System.out.println("C.Make a withdraw");
System.out.println("D.View prevTransaction");
System.out.println("E.Exit");


do {
System.out.println();
System.out.println("please enter an option:");	
char option1 =scanner.next().charAt(0);
option=Character.toUpperCase(option1);
switch(option) {
case'A':
	System.out.println("========================");
System.out.println("balance= $"+balance);
    System.out.println("========================");
break;
case'B':
	System.out.println("Enter an amount to deposit:");
	int amount=scanner.nextInt();
	deposit(amount);
	break;
case'C':
System.out.println("Enter an amount to withdraw:");	
int amount2=scanner.nextInt();	
withdraw(amount2);
break;
case'D':
System.out.println("============================");	
getPrevTransaction();
System.out.println("============================");	
break;
case'E':
showdate();	
break;	
case'F':
System.out.println("============================");	
break;
default:
	System.out.println("Error:invalid option.please Enter A,B,C,D,E");
break;
}
}
while(option!='F');
System.out.println("Thank You For Using ATM");

}

   }
 

	