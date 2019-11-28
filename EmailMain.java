package sampleswing;

import java.util.Scanner;

public class EmailMain {
public static void main(String args[]) {
String name;
String address;
Long contactno;
String emailid;
String proof;
String proofid;
String a;
do
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
     name=s.next();
System.out.println("Enter your address");
address=s.next();
System.out.println("Enter your Contact Number");
    contactno=s.nextLong();
System.out.println("Enter your E-Mail ID");
emailid=s.next();
System.out.println("Enter your proof type");
proof=s.next();
System.out.println("Enter your proof ID");
proofid=s.next();
//Email obj=new Email(name,address,contactno,emailid,proof,proofid);
a=Email.register();

}
while(a.equals("yes"));
Email obj=new Email(name,address,contactno,emailid,proof,proofid);
obj.emailupdate();
obj.display();

}
}
