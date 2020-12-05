//https://www.youtube.com/watch?v=2-wpqsIH1HI
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Adder extends Remote {  //1. extends Remote
    public int add(int n1, int n2) throws RemoteException; //2.Create one interface method
}
                                                          //3. Clean and build creating interface JAR file
