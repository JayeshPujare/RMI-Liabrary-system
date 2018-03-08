import java.rmi.Naming;
import java.util.*;
public class Libclient
{
	public static void main(String args[])
	{
		try
		{
			Lib ai=(Lib)Naming.lookup("//localhost/Libimplement");

			Scanner s= new Scanner(System.in);
			System.out.println("\n\nPlease provide your details to Login");
String booknames[]=new String[10];
int qty[]=new int[10];
int info[][]=new int[15][5];
String msg1,msg2;
booknames=ai.names();
//qty=ai.details();
//info=ai.studetails();


	System.out.println("1.Show Books");
	System.out.println("2.Issue Books");
	System.out.println("3.Return Books");
	System.out.println("4.Studebt Details");
	System.out.println("5.Exit");
	int ch,l,st,b;
do
{
System.out.println("Enter your choice(i.e 1 or 2 or 3 or 4or 5)");
ch=s.nextInt();
switch(ch)
	{
	 case 1:
qty=ai.details();
 for(l=0;l<booknames.length;l++)
{
	System.out.println(l+":"+booknames[l]+"------>    Availavle quantity----->"+qty[l]);
}
	break;

	case 2: System.out.println("Enter the student id:");
st=s.nextInt();
System.out.println("which book? Enter the book number:");
b=s.nextInt();
msg1=ai.issue(st,b);
System.out.println(msg1);				break;

case 3:
 System.out.println("Enter the student id:");
st=s.nextInt();
System.out.println("which book do you want to return? Enter the book number:");
b=s.nextInt();
msg2=ai.ret(st,b);
System.out.println(msg2);				break;

case 4:
info=ai.studetails();
for(l=0;l<5;l++)
{
System.out.println("Student"+info[l][0]+" ------>total book issued="+info[l][1]+"------->book no--->  "+info[l][2]+", " +info[l][3]+", " +info[l][4]);
}
break;
case 5: System.out.println(" thank You!!!!\n");
							break;
				}
			}while(ch!=5);
		}
		catch(Exception e)
		{
			System.out.println("Client Exception: "+e);
		}
}

}
