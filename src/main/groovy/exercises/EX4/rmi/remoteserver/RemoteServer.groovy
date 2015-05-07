package exercises.EX4.rmi.remoteserver

import exercises.EX4.rmi.interfaces.Configuration
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


/**
 * Created by alberto on 5/6/15.
 */

public class RemoteServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {

        RMIImplementation rmiImplementation = new RMIImplementation();
        Registry registry = LocateRegistry.createRegistry(Configuration.REMOTE_PORT);
        registry.bind(Configuration.REMOTE_ID, rmiImplementation);

    }

}
