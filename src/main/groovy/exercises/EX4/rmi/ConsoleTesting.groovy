package exercises.EX4.rmi

import java.rmi.Naming
import java.rmi.RMISecurityManager

/**
 * Created by alberto on 4/25/15.
 */
class ConsoleTesting {
    static void main(String[] args){
        /*String host = (args.length < 1) ? null : args[0];

        Registry registry;
        try{
            registry = LocateRegistry.getRegistry();
            RMI_Operations stub;
            try{
                System.currentTimeMillis();
                stub = (RMI_Operations)registry.lookup("RMI_Operations");
                String response = stub.sum([1,2,3]);
                println("response:" + response);
            } catch (NotBoundException e){
                println("Client exception:" + e.toString());
                e.printStackTrace();
            }
        } catch (RemoteException e) {
            System.err.println("Server exception:" + e.toString());
            e.printStackTrace();
        }*/
        System.setSecurityManager(new RMISecurityManager())
        RMI_Operations operations = (RMI_Operations)Naming.lookup("//127.0.1.1/RMI_Operations")
        String response = operations.sum([1,2,3]);
        println("response:" + response);
    }
}
