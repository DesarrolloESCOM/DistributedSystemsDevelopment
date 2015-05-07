package exercises.EX4.rmi.remoteclient

import exercises.EX4.rmi.interfaces.Configuration
import exercises.EX4.rmi.interfaces.RemoteInterface

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by alberto on 5/6/15.
 */
public class Client {

    static String connect(params) {
        Registry reg;
        try {
            reg = LocateRegistry.getRegistry(Configuration.REMOTE_HOST, Configuration.REMOTE_PORT);

            RemoteInterface rmiInterface = (RemoteInterface) reg.lookup(Configuration.REMOTE_ID);
            String response = rmiInterface."$params.operation"(params.params)
            System.out.println("RMI returns:" + response);
            return response;

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
