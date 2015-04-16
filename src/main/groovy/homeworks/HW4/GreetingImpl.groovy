package homeworks.HW4

import java.rmi.RemoteException
import java.rmi.server.UnicastRemoteObject

/**
 * Created by alberto on 4/16/15.
 */
class GreetingImpl extends UnicastRemoteObject implements Greeting {

    public GreetingImpl() throws RemoteException{
        super()
    }

    @Override
    String sayHello(def Object name) throws RemoteException {
        "Hello ${name} from RMI using Groovy!"
    }
}
