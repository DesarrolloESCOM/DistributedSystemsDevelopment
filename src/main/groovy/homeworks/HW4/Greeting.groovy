package homeworks.HW4

/**
 * Created by alberto on 4/16/15.
 */
interface Greeting extends java.rmi.Remote {
    public String sayHello(def name) throws java.rmi.RemoteException;
}