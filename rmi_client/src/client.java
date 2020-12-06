
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author Christo
 */

public class client 
{
    public static void main(String[] args)
    {
        client c = new client();    
        c.connectServer();             
    }
    private void connectServer() 
    {
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost", 1022); 
            Adder a = (Adder)reg.lookup("server");           
            System.out.println("Addition is: " + a.add(10, 20));
        }catch(Exception e)
        {
            System.out.println(e);
        }      
    }
}
