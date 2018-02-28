package rmi;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ApplicationServer {
	
	public static void main( String[] args ) throws RemoteException {
		Registry registry = java.rmi.registry.LocateRegistry.createRegistry(9999);
		registry.rebind("hello", new HelloServant());
	}
}
