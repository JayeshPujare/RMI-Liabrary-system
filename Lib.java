import java.rmi.*;
public interface Lib extends Remote
{
	public String issue(int st,int book) throws RemoteException;
	public String ret(int st,int book) throws RemoteException;
	public String[] names() throws RemoteException;
	public int[] details() throws RemoteException;
	public int[][] studetails() throws RemoteException;
}
