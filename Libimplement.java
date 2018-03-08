import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class Libimplement extends UnicastRemoteObject implements Lib
{
	int i,c=0;	
	//private static String books[]={"OS","CGVR","MES","ADBMS","SWS","SHALA","LOVE BIRDS","FRIENDS","THE_SHIVAJI","GEETA"};
	private static int quantity[]={20,5,12,21,2,50,11,8,9,4};
	private static int student[][]=new int[][]{{0,0,99,99,99},{1,0,99,99,99},{2,0,99,99,99},{3,0,99,99,99},{4,0,99,99,99}};
/*for(i=0;i<5;i++)
{
student[i][0]=i;
student[i][1]=0;
student[i][2]=99;
student[i][3]=99;
student[i][4]=99;
}
*/

public Libimplement() throws RemoteException
	{
	}

public String issue(int st,int book)
{
if(quantity[book]>0)
{
if(student[st][1]<3)
{
for(i=2;i<=4;i++)
{
if(student[st][i]==99)
{
student[st][i]=book;
quantity[book]--;
student[st][1]++;
break;
}
}
}
else
return "student can isssue maximum 3 books";
}
else
return "not enough books";
return "";
}

public String ret(int st,int book)
{
if(student[st][1]>0)
{
for(i=2;i<=4;i++)
{
if(student[st][i]==book)
{
student[st][i]=99;
quantity[book]++;
student[st][1]--;
break;
}
}
}
else
return "no book is issued";
return"";
}

public String[] names()
{
String books[]=new String[]{"OS","CGVR","MES","ADBMS","SWS","SHALA","LOVE BIRDS","FRIENDS","THE_SHIVAJI","GEETA"};
return books;
}
public int[] details()
{
return quantity;
}
public int[][] studetails()
{
return student;
}

}
