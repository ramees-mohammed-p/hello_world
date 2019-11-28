package sampleswing;


import java.util.Scanner;
public class Email {
static Scanner sc = new Scanner(System.in);
String name;
String address;
Long contactno;
String emailid;
String proof;
String proofid;
static int reg=0;
Email(String name,String address,Long contactno,String emailid,String proof,String proofid)
{
this.name=name;
this.address=address;
this.contactno=contactno;
this.emailid=emailid;
this.proof=proof;
this.proofid=proofid;
}
   static String register() {

    String a;
System.out.println("Registered Successfully"+"Register Number is :"+ ++reg);
System.out.println("Do you want to continue(yes/no)");
a=sc.next();

return a;

}
void emailupdate() {
Scanner sc = new Scanner(System.in);
System.out.println("Do you want to edit email(yes/no)");

String a=sc.next();
if(a.equals("yes")) {
System.out.println("edit your E-Mail ID");
this.emailid=sc.next();
//System.out.println("your  E-Mail ID is : "+this.emailid);
}

}
void display() {
System.out.println("your name is : "+name);
System.out.println("your address is : "+address);
System.out.println("your Contact Number is : "+contactno);
System.out.println("your  E-Mail ID is : "+emailid);
System.out.println("your proof type is : "+proof);
System.out.println("your proof ID is : "+proof);

}
}
