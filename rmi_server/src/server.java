import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Christo
 */

public class server extends UnicastRemoteObject implements Adder 
{ 
    
    public server() throws RemoteException 
    {
        super();                         
    }
    
public int add(int n1, int n2) throws RemoteException 
{
    return n1 + n2;
}

    public static void main(String[] args) throws RemoteException 
    {
        try
        {
            Registry reg = LocateRegistry.createRegistry(1022); 
            reg.rebind("server", new server());                 
            System.out.println("Server is running");
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }  
}
