
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Christo
 */
public class client 
{
    public static void main(String[] args) //Create main method
    {
        client c = new client();    //9.
        c.connectServer();          //10.      
    }
    private void connectServer() //
    {
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost", 1022); //11
            Adder a = (Adder)reg.lookup("server");           //12
            System.out.println("Addition is: " + a.add(10, 20));
        }catch(Exception e)
        {
            System.out.println(e);
        }
    //13 Add JAR file as follows: Properties>Libraries>Add JAR>rmi_Interface>dist folder>select       
    }
}
