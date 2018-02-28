package rmi;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServant extends UnicastRemoteObject implements HelloService{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;

	public HelloServant() throws RemoteException {
		super();
	}
	
	public int add(int a, int b) throws RemoteException {
  	  int result=a+b;
  	  return result;
    }

}
