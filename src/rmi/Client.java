package rmi;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public static void main( String[] args) throws NotBoundException, MalformedURLException,RemoteException{
		HelloService service = (HelloService) Naming.lookup("rmi://localhost:9999/hello");
		int result=service.add(9,10);
		System.out.println("Result is :"+result);
	}

}
